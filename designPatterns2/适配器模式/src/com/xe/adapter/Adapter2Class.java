package com.xe.adapter;

public class Adapter2Class implements TargetInterface{
	
    private AdapteeClass adapteeClass;
    
    public Adapter2Class(AdapteeClass adapteeClass) {
    	this.adapteeClass = adapteeClass;
    }

	@Override
	public void request() {
		adapteeClass.performRequest();
	}
    
}
