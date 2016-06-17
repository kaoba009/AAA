package com.northgatecode.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qianl on 6/17/2016.
 */

@Controller
public class BlogController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getBlogList(ModelMap model) {
        model.addAttribute("title", "blog list");
        return "blog-list";
    }
}
