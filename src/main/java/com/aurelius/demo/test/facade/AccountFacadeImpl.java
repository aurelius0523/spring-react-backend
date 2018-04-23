package com.aurelius.demo.test.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aurelius.demo.test.facade.model.AccountVM;
import com.aurelius.demo.test.service.IAccountService;

@Component
public class AccountFacadeImpl implements IAccountFacade {
	@Autowired
	private IAccountService accountService;
	
	@Override
	public AccountVM getAccount() {
		AccountVM accountVM = new AccountVM();
		accountVM.setShouldShowHeader(false);
		accountVM.setData(
				AccountVM.Account.getDataFromSource(accountService.callMockRemoteService()));
		
		return accountVM;
	}
}
