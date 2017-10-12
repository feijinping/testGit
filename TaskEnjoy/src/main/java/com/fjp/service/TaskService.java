package com.fjp.service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fjp.bean.CommonTask;
import com.fjp.dao.TaskDao;
import com.fjp.dao.bean.TaskInfo;
import com.fjp.task.ITactics;
import com.fjp.task.ITask;
import com.fjp.util.TacticsFactory;

public class TaskService {
	TaskDao taskDao;
	public ITask addTask(Map<String,String> param) {
		CommonTask task = new CommonTask();
		Set<String> set = new HashSet<String>();
		for(String s : param.get("label").split(",")) {
			set.add(s);
		}
		ITactics strategy = TacticsFactory.getTactics(param.get("strategy"));
		task.setLabel(set);
		task.setName(param.get("name"));
		task.setScore(Integer.valueOf(param.get("score")));
		task.setStrategy(strategy);
		taskDao.insertTask(task);
		return task;
	}
	public int completeTask(int id) {
		ITask task = getTaskById(id);
		
		int score = task.getScore();
		
		ITactics ita = task.getStrategy();
		ita.setTimes(ita.getTimes() -1);
		
		TaskInfo taskinfo = selectMaxTaskInfo();
		LocalDate date = taskinfo.getDate();
		//应该转换为策略，避免客户新增不同需求
		switch (ita.getType()) {
		case DALIY:
			if(date.isBefore(LocalDate.now().minusDays(1))) {
				task.setScore(task.getScore() - task.getStep());
			}
			break;
		case WEEK:
			if(date.isBefore(LocalDate.now().minusWeeks(1))) {
				task.setScore(task.getScore() - task.getStep());
			}
			break;
		case COMMON:
		default:
			break;
		}
		
		//保存一条新纪录
		TaskInfo ti = new TaskInfo(task);
		saveBean(ti);
		
		return score;
	}
	private TaskInfo selectMaxTaskInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	private void saveBean(TaskInfo ti) {
		// TODO Auto-generated method stub
		
	}
	public ITask getTaskById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
