package com.northgatecode.myblog.controllers;

import com.northgatecode.myblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qianl on 6/17/2016.
 */
@Controller
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String getPostList(ModelMap model) {
        model.addAttribute("title", "post list");
        model.addAttribute("posts", postService.getAll());
        return "post-list";
    }
}
