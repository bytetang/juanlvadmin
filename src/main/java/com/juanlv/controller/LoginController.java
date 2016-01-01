package com.juanlv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tangjie on 15/12/31.
 */

@Controller
@RequestMapping("admin")
public class LoginController extends BaseController {

    @RequestMapping(value = "login")

    public ModelAndView doLogin() {
        ModelAndView modelAndView = new ModelAndView("admin/admin_index");
        return modelAndView;
    }
}
