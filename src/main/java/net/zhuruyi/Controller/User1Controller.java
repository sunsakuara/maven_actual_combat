package net.zhuruyi.Controller;


import net.zhuruyi.Entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 11:01 2017/9/15
 * @Modified By:
 */
@Controller
@RequestMapping(value = "/user")
public class User1Controller {

    private static final Log logger = LogFactory.getLog(User1Controller.class);

    @ModelAttribute
    public void userModel(String loginname, String password, Model model) {
        logger.info("userModel");

        //创建一个user对象，存储jsp页面传入的参数
        User user = new User();
        user.setLogginName(loginname);
        user.setPassword(password);
        //将User对象加入到model中
        model.addAttribute("user", user);
    }

    @RequestMapping(value = "loggin")
    public String loggin(Model model) {
        logger.info("loggin");
        //从model当中取出之前存入名为user的对象
        User user = (User) model.asMap().get("user");
        //在控制台中打印出user
        System.out.println("user:" + user);
        //设置对象的username
        user.setLogginName("测试");
        return "result";
    }
}
