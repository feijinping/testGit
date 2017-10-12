package com.fjp.util;

import com.fjp.service.CommonTactics;
import com.fjp.task.ITactics;
import com.fjp.task.Type;

public class TacticsFactory {

	public static ITactics getTactics(String str) {
		switch (str) {
		case "common":
			 return new CommonTactics(Type.COMMON, 1);
		default:
			break;
		} 
		return null;
	}

}
