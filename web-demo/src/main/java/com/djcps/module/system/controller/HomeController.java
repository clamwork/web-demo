package com.djcps.module.system.controller;

import com.djcps.common.exception.BaseException;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chengw
 * @since 2017/10/27 10:07.
 */
@RestController
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/")
    String home() throws BaseException {
        return "Hello world";
    }
}
