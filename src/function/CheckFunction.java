package function;

import java.util.ArrayList;

public class CheckFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckFunction objCheckFunction = new CheckFunction();
		System.out.println(objCheckFunction.getStringFunction("Check"));
		System.out.println(objCheckFunction.getIntFunction(10));
		System.out.println(objCheckFunction.getBooleanFunction(true));
		System.out.println(objCheckFunction.getDoubleFunction(1.2));
		
	}
	
	public String getStringFunction(String data){
		return data;
	}
	
	public int getIntFunction(int i){
		return i;
	}
	
	public Boolean getBooleanFunction(Boolean bool){
		return bool;
	}
	
	public double getDoubleFunction(double data){
		return data;
	}
}
