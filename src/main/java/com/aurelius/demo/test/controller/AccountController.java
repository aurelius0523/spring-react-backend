package com.aurelius.demo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aurelius.demo.test.facade.IAccountFacade;

@Controller("/accounts")
@Scope
public class AccountController {
	
	@Autowired
	private IAccountFacade accountFacade;
	
	@GetMapping("/")
	public ModelAndView getAccounts() {
		ModelAndView modelAndView = new ModelAndView("accountPage");
		modelAndView.addObject("props", accountFacade.getAccount());
		return modelAndView;
	}
}
