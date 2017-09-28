package ssh.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssh.dao.UserDao;
import ssh.entity.User;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	//登录
	public User selectUser(User user) throws Exception {
		return userDao.selectUser(user);
	}
	
	//单个查询
	public User getUser(Integer id) throws Exception {
		return userDao.getUser(id);			
	}  
	//查询所有
	public List<User> getAllUsers() throws Exception {
		List<User> users = userDao.getAllUsers();		
		return users;
	}
	
	//添加用户
	public void addUser(User user) throws Exception {
		userDao.addUser(user);	
	}
	//删除用户
	
	public void delUser(Integer id) throws Exception {		 
		userDao.delUser(id);
	}
	//修改用户
	public void updateUser(User user) throws Exception {
		userDao.updateUser(user);		
	}  	
}
