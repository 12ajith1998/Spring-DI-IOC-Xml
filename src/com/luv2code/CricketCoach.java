package com.luv2code;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: setter method-setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: setter method-setTeam");
		this.team = team;
	}
	public CricketCoach(){
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: setter method-SetFortuneService");
	}


	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 minutes";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
