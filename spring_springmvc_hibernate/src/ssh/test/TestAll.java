package ssh.test;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ssh.dao.UserDao;
import ssh.entity.User;
import ssh.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-common.xml")
@Transactional
/**
 * 
 * @author hello
 *	说明：在这里 所有实例化的注解我都使用 @Autowrited (spring通用的)
 *						      也可以使用 @Resource   (J2EE通用的)
 *						      两者区别百度
 */
public class TestAll {
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * 测试sessionfactory
	 * 测试时 spring-common 不能存在 事物bean
	 * 					      不能存在 事物管理器 bean
	 * 					      不能存在dao
	 * 					      不能存在service
	 * 					      不能存在action
	 * 只是为了防止当其他内容写错时 sessionfactory也开启不了 除非是其他的bean没有错
	 */
	@Test
	public void testSf(){
		System.out.println("测试开启");
		System.out.println("   sessionfactory = "+sessionFactory);
		System.out.println("测试完成");
	}
	/**
	 * 测试UserDao
	 */
	@Autowired
	private UserDao userDao;
	@Test
	public void testUserDao() throws Exception{
		User u = new User();
		u.setName("王朋飞");
		u.setPassword("1");
		User user  = userDao.selectUser(u);
		System.out.println("user is "+user);
		userDao.addUser(u);
	}					
	/**
	 * 测试UserService
	 */
	@Autowired
	private UserService userService;
	@Test
	public void testUserService() throws Exception{
		User u = new User();
		u.setName("王朋飞");
		u.setPassword("1");
		User user = userService.selectUser(u);
		System.out.println("user is "+user);
	}
}
