package com.xe.adapter;

public class AdapterClass extends AdapteeClass implements TargetInterface{

	@Override
	public void request() {
		performRequest();
	}

}
