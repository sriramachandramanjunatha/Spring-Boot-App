package com.spring.boot.application.domain;

import java.util.HashMap;
import java.util.Map;


public class DataModel {

	private String id;

    private String name;

    private String organization;

    private Map<String, String> properties = new HashMap<>();


    public DataModel() {
    	super();
    }

	public DataModel(String id, String name, String organization) {
		this.id=id;
		this.name=name;
		this.organization=organization;
	}

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

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
}