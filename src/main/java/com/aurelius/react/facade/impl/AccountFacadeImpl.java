package com.aurelius.react.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aurelius.react.facade.IAccountFacade;
import com.aurelius.react.facade.model.AccountVM;
import com.aurelius.react.service.IAccountService;

@Component
public class AccountFacadeImpl implements IAccountFacade {
    @Autowired
    private IAccountService accountService;

    public AccountVM getAccount() {
	AccountVM accountVM = new AccountVM();
	accountVM.setShouldShowHeader(false);
	accountVM.setData(AccountVM.Account.getDataFromSource(accountService.callMockRemoteService()));

	return accountVM;
    }
}
