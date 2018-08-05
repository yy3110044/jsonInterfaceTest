package com.yy.jsonInterfaceTest.po;

public class InterfaceUrl {
	private int id;
	private int projectId;
	private String url;
	private String method;
	private String description;
	public int getId() {
		return id;
	}
	public int getProjectId() {
		return projectId;
	}
	public String getUrl() {
		return url;
	}
	public String getMethod() {
		return method;
	}
	public String getDescription() {
		return description;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
