package com.timbuchalka.springdemo.domain.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VisitorData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5075218314653537512L;

	private String currentVisitorName;
	private String currentVisitorEmail;
	
	private List<Visitor> visitor = new ArrayList<Visitor>();
	
	public VisitorData() {
		
	}
	
	public VisitorData(String currentVisitorName, String currentVisitorEmail, List<Visitor> visitors) {
		super();
		this.currentVisitorName = currentVisitorName;
		this.currentVisitorEmail = currentVisitorEmail;
		this.visitor = visitors;
	}
	public String getCurrentVisitorName() {
		return currentVisitorName;
	}
	public void setCurrentVisitorName(String currentVisitorName) {
		this.currentVisitorName = currentVisitorName;
	}
	public String getCurrentVisitorEmail() {
		return currentVisitorEmail;
	}
	public void setCurrentVisitoEmail(String currentVisitorEmail) {
		this.currentVisitorEmail = currentVisitorEmail;
	}
	
	public List<Visitor> getVisitor() {
		return visitor;
	}
	public void setVisitor(List<Visitor> visitor) {
		this.visitor = visitor;
	}
	@Override
	public String toString() {
		return "VisitorData [currentVisitorName=" + currentVisitorName + ", currentVisitorEmail=" + currentVisitorEmail
				+ ", visitor=" + visitor + "]";
	}
}
