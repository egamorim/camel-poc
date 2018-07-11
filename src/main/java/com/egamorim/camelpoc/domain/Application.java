package com.egamorim.camelpoc.domain;

import static com.egamorim.camelpoc.util.JsonUtil.GSON;

public class Application {

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return GSON.toJson(this);
	}

}
