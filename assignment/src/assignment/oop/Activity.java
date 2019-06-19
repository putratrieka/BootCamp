package assignment.oop;

public class Activity {
	private String work;
	private String eat;
	private String speak = "";
	
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public void speaking(Human human) {
		speak = speak +"My Name is "+ human.getName()+"\n";
		speak = speak +"I`m "+ human.getAge() + " years old"+"\n";
		speak = speak + "and I have a "+human.getEyeColor() + " eyes color";
	}
	public String getSpeak() {
		return speak;
	}
	
	

}
