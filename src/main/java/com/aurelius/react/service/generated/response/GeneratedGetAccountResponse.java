package com.aurelius.react.service.generated.response;

import java.util.List;

import com.aurelius.react.service.generated.GeneratedAccount;
import com.aurelius.react.service.generated.GeneratedPortfolio;

public class GeneratedGetAccountResponse {
	private GeneratedAccount account;
	private String responseStatus;
	private List<GeneratedPortfolio> portfolios;

	public GeneratedAccount getAccount() {
		return account;
	}
	public void setAccount(GeneratedAccount account) {
		this.account = account;
	}
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	public List<GeneratedPortfolio> getPortfolios() {
		return portfolios;
	}
	public void setPortfolios(List<GeneratedPortfolio> portfolios) {
		this.portfolios = portfolios;
	}
}
