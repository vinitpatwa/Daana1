package com.prototype.dana.model;

import java.io.Serializable;

public class OrgResults implements Serializable{
	
	private String _org_icon;
	private String _num_events;
	
	public OrgResults(String image, String num) {
		super();
		this._org_icon = image;
		this._num_events = num;
	}
	
	public String getIcon() {
		return _org_icon;
	}
	public String getNumEvents() {
		return _num_events;
	}
}
