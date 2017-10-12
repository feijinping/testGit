package com.fjp.task;

import java.util.Set;

/**
 * Hello world!
 *
 */
public interface ITask 
{
    int getScore();
    void setScore(int score);
    
	ITactics getStrategy();
	void setStrategy(ITactics tactics);
	
	String getName();
	void setName(String name);
	
	Set<String> getLabel();
	void setLabel(Set<String> label);
	
	int getStep();
	void setStep(int step);
}
