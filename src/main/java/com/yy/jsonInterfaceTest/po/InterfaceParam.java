package com.yy.jsonInterfaceTest.po;

public class InterfaceParam {
	private int id;
	private int urlId;
	private String name;
	private String type;
	private String enumTypes;
	private boolean required;
	private String defaultValue;
	private String description;
	public int getId() {
		return id;
	}
	public int getUrlId() {
		return urlId;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public boolean isRequired() {
		return required;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public String getDescription() {
		return description;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUrlId(int urlId) {
		this.urlId = urlId;
	}
	public String getEnumTypes() {
		return enumTypes;
	}
	public void setEnumTypes(String enumTypes) {
		this.enumTypes = enumTypes;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
