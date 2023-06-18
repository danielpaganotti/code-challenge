package com.gilasw.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class MessageDTO {
	
	@NotEmpty
	private String message;
	
	@NotEmpty
	@Pattern(regexp = "Sports|Finance|Films")
	private String category;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
