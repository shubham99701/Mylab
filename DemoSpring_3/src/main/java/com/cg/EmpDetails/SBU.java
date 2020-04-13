package com.cg.EmpDetails;

import org.springframework.stereotype.Component;

public class SBU {
	private String sbuCode;
	private String sbuHead;
	private String sbuName;
	
	public String getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	public SBU(String sbuCode, String sbuHead, String sbuName) {
		super();
		this.sbuCode = sbuCode;
		this.sbuHead = sbuHead;
		this.sbuName = sbuName;
	}
	public SBU() {
		
	}

}