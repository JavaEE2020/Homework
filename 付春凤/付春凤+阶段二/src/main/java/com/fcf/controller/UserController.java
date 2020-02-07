package com.fcf.controller;


import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fcf.exception.ExceptionEnum;
import com.fcf.exception.NoFoundExcepiton;
import com.fcf.model.User;
import com.fcf.service.UserService;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.liyan.model"})//添加的注解
public class UserController {

    @Autowired
    private UserService userService;


    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 根据员工工号，查询员工
     * @param userId 员工工号
     * @param httpServletResponse
     * @return  User
     * @throws Exception
     */
    @RequestMapping(value = "selectUser/{userId}",method = RequestMethod.GET)
    public  User selectUser(@PathVariable String userId, HttpServletResponse httpServletResponse) throws Exception {
        User user = userService.selectUser(userId);
        logger.info("访问selectUser/{userId}接口，参数userId = " + "userId");
        if (user == null) {
            logger.error("根据员工工号，查询员工异常：e=" + ExceptionEnum.ERROR_NOFOUND.getValue());
            throw new NoFoundExcepiton(ExceptionEnum.ERROR_NOFOUND.getValue());
        }
        return user;
    }

}
