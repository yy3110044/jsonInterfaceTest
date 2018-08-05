package com.yy.jsonInterfaceTest.po;

import java.util.Date;

public class Project {
	private int id;
	private String name;
	private String description;
	private String prefixUrl;
	private Date createTime = new Date();
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getPrefixUrl() {
		return prefixUrl;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrefixUrl(String prefixUrl) {
		this.prefixUrl = prefixUrl;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
