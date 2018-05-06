package com.aurelius.react.service.impl;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.aurelius.react.service.IUpdatingResponseService;
import com.aurelius.react.service.generated.GeneratedAccount;
import com.aurelius.react.service.generated.GeneratedPortfolio;
import com.aurelius.react.service.generated.response.GeneratedComplexResponse;

@Component
public class UpdatingResponseServiceImpl implements IUpdatingResponseService {

	@Override
	public GeneratedComplexResponse getComplexResponse() {
		GeneratedAccount account = new GeneratedAccount();
		account.setDateRegistered(LocalDateTime.now());
		account.setEmail("account@gmail.com");
		account.setFirstName("Kim Loong");
		account.setLastName("Tan");
		account.setLastLogin(LocalDateTime.now());
		account.setUsername("aurelius");

		GeneratedPortfolio portfolioOne = new GeneratedPortfolio();
		portfolioOne.setPortfolioId("001");
		portfolioOne.setPortfolioName("portfolioOne");

		GeneratedPortfolio portfolioTwo = new GeneratedPortfolio();
		portfolioTwo.setPortfolioId("002");
		portfolioTwo.setPortfolioName("portfolioTwo");

		GeneratedComplexResponse response = new GeneratedComplexResponse();
		response.setAccount(account);
		response.setNewUser(true);
		response.setCurrentDateTime(LocalDateTime.now());
		response.setPortfolios(Arrays.asList(portfolioOne, portfolioTwo));
		return response;
	}

}
