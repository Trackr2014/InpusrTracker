package ssh.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ssh.entity.User;
import ssh.path.Path;
import ssh.service.UserService;

/**
 * @ClassName: UserAction积极拒绝
 * @Description: 用户动作的类懂了吧哈哈哈哈
 * @author wang.pengfei
 * @date 2017年9月28日上午11:10:36
 *
 */

@Controller
@RequestMapping(value = Path.USER)
public class UserAction {
	@Autowired
	private UserService userService;

	@RequestMapping(value = Path.LOGIN_INDEX)
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return Path.LOGIN_INDEX;
	}

	@RequestMapping(value = Path.LOGIN_OK, method = RequestMethod.POST)
	public String loginCheck(User user, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		User u = userService.selectUser(user);
		System.out.println("user is ------------------------ " + u);
		request.setAttribute("user", u);
		return "redirect:/user/index.do";
	}

	// 单个查询

	/**
	 * @Title: getUser @Description: TODO(这里用一句话描述这个方法的作用) @param @param
	 * id @param @param request @param @return @param @throws Exception
	 * 参数 @return String 返回类型 @throws
	 */

	@RequestMapping(value = Path.GET_USER)
	public String getUser(Integer id, HttpServletRequest request) throws Exception {
		request.setAttribute("user", userService.getUser(id));
		return Path.UPDATE_USER;
	}

	// 查询所有
	@RequestMapping(value = Path.INDEX)
	public String getAllUsers(HttpServletRequest request) throws Exception {
		request.setAttribute("userList", userService.getAllUsers());
		return Path.INDEX;
	}

	// 添加跳转方法

	/**
	 * @Title: toAddUser @Description: TODO(这里用一句话描述这个方法的作用) @param @return
	 * 参数 @return String 返回类型 @throws
	 */

	@RequestMapping(value = Path.TO_ADDUSER)
	public String toAddUser() {
		return Path.ADD_USER;
	}

	// 添加用户
	@RequestMapping(value = Path.ADD_USER)
	public String addUser(User user, HttpServletRequest request) throws Exception {
		System.out.println("用户名：======" + user.getName());
		userService.addUser(user);
		return "redirect:/user/index.do";
	}

	// 删除用户
	@RequestMapping(value = Path.DEL_USER)
	public String delUser(Integer id, HttpServletResponse response) throws Exception {
		userService.delUser(id);
		return "redirect:/user/index.do";
	}

	// 更新用户
	@RequestMapping(value = Path.UPDATE_USER)
	public String updateUser(User user, HttpServletRequest request) throws Exception {

		userService.updateUser(user);
		user = userService.getUser(user.getId());
		request.setAttribute("user", user);
		return "redirect:/user/index.do";

	}
}
