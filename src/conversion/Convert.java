package conversion;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convert objConvert = new Convert();
		objConvert.convertIntToString(11);

	}
	
	public String convertIntToString(int number){
		System.out.println(number);
		return Integer.toString(number);
	}
	
	public int convertStringToInt(String number){
		return Integer.parseInt(number);
	}
	
	public float convertStringToFloat(String number){
		return Float.parseFloat(number);
	}
	
	public String convertSFloatToString(float number){
		return Float.toString(number);
	}
}
