//Inheritace
package assignment.oop;

public class Female extends Human {
	private boolean selfie;
	
	public String selfie(){
		selfie = true;
		return "cekrekk";
	}
	@Override
	public String walk() {
		if (selfie) {
			return super.walk();
		}else {
			return "------------";
		}
	}

}
