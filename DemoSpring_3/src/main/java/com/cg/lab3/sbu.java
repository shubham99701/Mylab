package com.cg.lab3;

public class sbu {
	private String sbuID;
	private String sbuName;
	private String sbuHead;
	
	

	public String getSbuID() {
		return sbuID;
	}

	public void setSbuID(String sbuID) {
		this.sbuID = sbuID;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
    public sbu(String sbuID , String sbuName, String sbuHead)
    {
    	super();
    	this.sbuID=sbuID;
    	this.sbuName=sbuName;
    	this.sbuHead=sbuHead;
    	
    }

}