package BlockCat.battlemc.ztv.utils;

import java.util.Random;

public class MobManiaChances {

	
	public boolean chance(int chance){
		Random luck = new Random();
		
		int percent = luck.nextInt(100);
		if(percent <= chance){
			return true;
		}
		return false;
		
	}
}
