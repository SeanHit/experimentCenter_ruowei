package com.sean.backend.controller;


import com.sean.backend.Result.Result;
import com.sean.backend.service.userModuleService.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private LoginService loginService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(@RequestParam String id,
                        @RequestParam String password){
        return loginService.loginVerify(id, password);
    }
}
