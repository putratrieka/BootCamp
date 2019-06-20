package assignment.oop.main;

import assignment.oop.Activity;
import assignment.oop.Human;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		Activity activity = new Activity();
		
		human.setName("Bambang");
		human.setAge(23);
		human.setEyeColor("Coklat");
		human.setSkinColor("Sawo Matang");	
		
		activity.speaking(human);	
		System.out.println(activity.getSpeak());
		System.out.println("============================");
		System.out.println(human.walk());
		
	}
}
