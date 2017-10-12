package com.fjp.bean;

import java.util.Set;

import com.fjp.task.ITactics;
import com.fjp.task.ITask;

public class CommonTask implements ITask {
	private int score;
	private int step;
	private String increasetype = "+";
	private ITactics strategy;
	private String name;
	private Set<String> label;
	public String getIncreasetype() {
		return increasetype;
	}

	public void setIncreasetype(String increasetype) {
		this.increasetype = increasetype;
	}
	public int getScore() {
		return score;
	}

	public ITactics getStrategy() {
		return strategy;
	}

	public String getName() {
		return name;
	}

	public Set<String> getLabel() {
		return label;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setStrategy(ITactics tactics) {
		this.strategy = tactics;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLabel(Set<String> label) {
		this.label = label;
		
	}
	@Override
	public String toString() {
		return "CommonTask [score=" + score + ", strategy=" + strategy + ", name=" + name + ", label=" + label + "]";
	}

	@Override
	public int getStep() {
		return step;
	}

	@Override
	public void setStep(int step) {
		this.step = step;
	}
}
