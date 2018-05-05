package abstrac;

public class Dog extends Animal {

	@Override
	public void getName() {
		System.out.println("Under Name Dog");
	}

	@Override
	public void getLegs() {
		System.out.println("Four Legs");
	}

	@Override
	public void getType() {
		System.out.println("Non Vegeterian");
	}
	
	public void getFoodType(){
		System.out.println("Food type is Vegeterian");
	}

}
