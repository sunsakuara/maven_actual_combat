package net.zhuruyi.Controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloController implements Controller {

    private static final Log logger = LogFactory.getLog(HelloController.class);


    /**
     * HandleRequest是Controller接口必须实现的方法 该方法的参数是对应请求HttpServletRequest和HttpServletResponse
     * 该方法必须放回一个包含视图名和模型的ModelAndView对象
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {

        logger.info("HandlerRequest被调用");
        //创建准备返回的ModelAndView对象，该对象通常包含了返回视图名/模型的名称以及模型的对象
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象
        modelAndView.addObject("message", "HelloWorld");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        modelAndView.setViewName("/WEB-INF/content/Welcome.jsp");
        //返回ModelAndView对象
        return modelAndView;

    }
}
