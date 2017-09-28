package ssh.dao;
import java.util.List;
import ssh.entity.User;
public interface UserDao {
	//登录
	User selectUser(User user) throws Exception;
	//查询所有
	List<User> getAllUsers() throws Exception;
	//添加用户
	void addUser(User user) throws Exception;
	//删除用户
	void delUser(Integer id) throws Exception;
	//修改用户
	void updateUser(User user) throws Exception;
	//单个查询
	User getUser(Integer id) throws Exception ;
}
