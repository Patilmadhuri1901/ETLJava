package overloading;

public class CheckOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckOverloading objOverloading = new CheckOverloading();
		System.out.println(objOverloading.add(2, 3));
		objOverloading.add(2, 3, 4);
		objOverloading.add(2, 3.5);
		objOverloading.add(3.5, 2);
	}
	
	public int add(int i, int j){
		int sum = i+j;
		return sum;		
	}
	public int add(int i, int j, int k){
		int sum = i+j+k;
		return sum;		
	}
	
	public double add(int i, double j){
		double sum = i+j;	
		return sum;
	}
	
	public double add(double i, int j){
		double sum = i+j;	
		return sum;
	}
}
