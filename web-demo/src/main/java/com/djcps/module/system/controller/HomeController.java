package com.djcps.module.system.controller;

import com.djcps.common.exception.BaseException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chengw
 * @since 2017/10/27 10:07.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/")
@Api(value = "Home")
public class HomeController {

    @ApiOperation(value= "首页", notes= "")
    @RequestMapping(value= "/",method={RequestMethod.GET,RequestMethod.POST})
    public String home() throws BaseException {
        return "Hello world";
    }

    @ApiOperation(value= "登录接口", notes= "")
    @RequestMapping(value= "/login",method={RequestMethod.GET,RequestMethod.POST})
    public String login() throws BaseException {
        return "login error";
    }

}
