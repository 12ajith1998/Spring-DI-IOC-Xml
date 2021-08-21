package com.luv2code;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	String[] data={"great day_1","Best day_2","Happy day_3"};
	private Random random=new Random();
	@Override
	public String getFortune() {
		int index=random.nextInt(data.length);
		String val=data[index];
		return val;
	}

}
