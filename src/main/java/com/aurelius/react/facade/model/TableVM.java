package com.aurelius.react.facade.model;

import java.time.LocalDateTime;
import java.util.List;

public class TableVM {
	private List<TableData> datas;

	public List<TableData> getDatas() {
		return datas;
	}

	public void setDatas(List<TableData> datas) {
		this.datas = datas;
	}

	public class TableData {
		private String email;
		private String firstName;
		private String lastName;
		private LocalDateTime dateJoined;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
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

		public LocalDateTime getDateJoined() {
			return dateJoined;
		}

		public void setDateJoined(LocalDateTime dateJoined) {
			this.dateJoined = dateJoined;
		}
	}
}
