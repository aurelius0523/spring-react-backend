package com.aurelius.react.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {
    @GetMapping("/welcome")
    public ModelAndView getHome() {
	return new ModelAndView("welcome");
    }
}
