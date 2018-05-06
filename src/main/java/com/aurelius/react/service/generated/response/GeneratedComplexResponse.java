package com.aurelius.react.service.generated.response;

import java.time.LocalDateTime;
import java.util.List;

import com.aurelius.react.service.generated.GeneratedAccount;
import com.aurelius.react.service.generated.GeneratedPortfolio;

public class GeneratedComplexResponse {
	private LocalDateTime currentDateTime;
	private GeneratedAccount account;
	private List<GeneratedPortfolio> portfolios;
	private boolean isNewUser;

	public LocalDateTime getCurrentDateTime() {
		return currentDateTime;
	}

	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	public GeneratedAccount getAccount() {
		return account;
	}

	public void setAccount(GeneratedAccount account) {
		this.account = account;
	}

	public List<GeneratedPortfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(List<GeneratedPortfolio> portfolios) {
		this.portfolios = portfolios;
	}

	public boolean isNewUser() {
		return isNewUser;
	}

	public void setNewUser(boolean isNewUser) {
		this.isNewUser = isNewUser;
	}
}
