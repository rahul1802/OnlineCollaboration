package com.coll.OnlineCollaboration.model;

public class DomainResponse {
	int responeCode;
	String responseMessage;
	public DomainResponse()
	{
		super();
	}
	public DomainResponse(int responeCode, String responseMessage) {
		super();
		this.responeCode = responeCode;
		this.responseMessage = responseMessage;
	}
	public int getResponeCode() {
		return responeCode;
	}
	public void setResponeCode(int responeCode) {
		this.responeCode = responeCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	

}
