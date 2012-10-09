package me.blockcat.mobmania.utils;

import java.util.Random;

public class MobManiaChances {

	
	public static boolean chance(int chance){
		Random luck = new Random();
		
		int percent = luck.nextInt(100);
		if(percent <= chance){
			return true;
		}
		return false;
		
	}
}
