package com.dbs.exception;

import java.util.Date;

public class ExceptionDetails {
	Date timestamp;
	String message;
	String details;
	public ExceptionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return String.format("ExceptionDetails [timestamp=%s, message=%s, details=%s]", timestamp, message, details);
	}
	
}
