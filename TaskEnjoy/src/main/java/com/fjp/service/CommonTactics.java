package com.fjp.service;

import com.fjp.task.ITactics;
import com.fjp.task.Type;


public class CommonTactics implements ITactics{
	
	private Type type = Type.COMMON;
	private int times = 0;
	
	public CommonTactics(Type type, int times) {
		super();
		this.type = type;
		this.times = times;
	}

	public Type getType() {
		return type;
	}

	public int getTimes() {
		return times;
	}

	@Override
	public void settype(Type type) {
		this.type = type;
	}

	@Override
	public void setTimes(int times) {
		this.times = times;
	}
}

