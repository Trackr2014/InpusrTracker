package ssh.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ssh.entity.User;
@Repository
@SuppressWarnings("unchecked")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	//登录
	public User selectUser(User user) throws Exception {
		Query query = sessionFactory.getCurrentSession().createQuery("from User u where u.name=? and u.password=?");
		query.setString(0, user.getName());
		query.setString(1, user.getPassword());
		List<User> list = query.list();
		if(list==null||list.size()==0){
			throw new RuntimeException("查询失败");
		}
		return list.get(0);
	}
	
	//查询所有
	public List<User> getAllUsers() throws Exception {
		Query query = sessionFactory.getCurrentSession().createQuery("from User");
		List<User> list = query.list();
		return list;
	}
	
	//单个查询
	public User getUser(Integer id) throws Exception {
		return (User) sessionFactory.getCurrentSession().createQuery("from User u where u.id ="+id).uniqueResult();
	}

	//添加用户
	public void addUser(User user) throws Exception {
		System.out.println("11111111111111111"+user.getName());
		sessionFactory.getCurrentSession().save(user);
	}
	
	//删除用户
	public void delUser(Integer id) throws Exception {
		sessionFactory.getCurrentSession().createQuery("delete User u where u.id="+id).executeUpdate();	   	
		
	}
	
	//修改用户
	public void updateUser(User user) throws Exception {
		 Session session = sessionFactory.getCurrentSession();
		 session.beginTransaction();
		 String hql = ("update User u set u.name = ?,u.password = ?,u.loginDate = ? where u.id = ?");  
		 Query query = session.createQuery(hql);
		 query.setParameter(0, user.getName());
		 query.setParameter(1, user.getPassword());
		 query.setParameter(2, user.getLoginDate());
		 query.setParameter(3, user.getId());
		 query.executeUpdate();
		 session.getTransaction().commit(); 			
	}
}
