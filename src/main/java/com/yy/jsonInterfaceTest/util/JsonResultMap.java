package com.yy.jsonInterfaceTest.util;

import java.util.HashMap;

public class JsonResultMap extends HashMap<String, Object> {
	private static final long serialVersionUID = -5414275822629694694L;

	public JsonResultMap set(String key, Object value) {
		put(key, value);
		return this;
	}
}