package com.luv2code;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}
	public void doMyStartupStuff(){
		System.out.println("doMyStartupStuff");
	}
	public void doMyCleanupstuff(){
		System.out.println("doMyCleanupstuff");
	}

}
