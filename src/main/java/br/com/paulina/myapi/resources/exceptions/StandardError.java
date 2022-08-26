package br.com.paulina.myapi.resources.exceptions;

import java.time.LocalDateTime;

public class StandardError {
	
	private Integer status;
	private LocalDateTime timestamp;
	private String message;
	
	public StandardError() {
		super();
	}
	
	public StandardError(Integer status, LocalDateTime localDateTime, String message) {
		super();
		this.status = status;
		this.timestamp = localDateTime;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
