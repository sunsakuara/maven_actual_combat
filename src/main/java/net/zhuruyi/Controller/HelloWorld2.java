package net.zhuruyi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 8:44 2017/9/15
 * @Modified By:
 */
@Controller
public class HelloWorld2 {

    @RequestMapping(value = "/hello")
    public ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "hello sakuar");
        modelAndView.setViewName("Welcome");
        return modelAndView;
    }
}
