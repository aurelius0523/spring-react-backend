package com.aurelius.react.facade.model;

import java.time.LocalDateTime;

import com.aurelius.react.service.generated.response.GeneratedGetAccountResponse;

public class AccountVM{
	private Account data;
	private boolean shouldShowHeader;

	public boolean isShouldShowHeader() {
		return shouldShowHeader;
	}
	public void setShouldShowHeader(boolean shouldShowHeader) {
		this.shouldShowHeader = shouldShowHeader;
	}
	public Account getData() {
		return data;
	}
	public void setData(Account data) {
		this.data = data;
	}


	public static class Account {
		private String firstName;
		private String lastName;
		private LocalDateTime createdAt;
		
		public static Account getDataFromSource(GeneratedGetAccountResponse response) {
			Account account = new Account();
			account.setFirstName(response.getAccount().getFirstName());
			account.setLastName(response.getAccount().getLastName());
			account.setCreatedAt(response.getAccount().getDateRegistered());
			
			return account;
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
	}
}
