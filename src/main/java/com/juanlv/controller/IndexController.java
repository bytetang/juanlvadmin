package com.juanlv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tangjie on 15/12/31.
 */

@Controller
public class IndexController extends BaseController {

    @RequestMapping("/")
    public String index(){
        return "/login";
    }
}
