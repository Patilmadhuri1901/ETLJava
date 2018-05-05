package patterns;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern objPattern = new Pattern();
		objPattern.DiamondPattern(5);
//		objPattern.rightAngleTriangleRevDown(5);
//		objPattern.IsoselesTriangleRev(5);
//		objPattern.IsoselesTriangle(5);
//		objPattern.rightAngleTriangle(5);
//		objPattern.rightAngleTriangleRev(5);
	}


	/**
	 * @param limit
	 */
	public void rightAngleTriangle(int limit){
		for(int i=1;i<=limit;i++){
			for(int j=0;j<i;j++){
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void rightAngleTriangleRevDown(int limit) {
		for (int i = 0; i < limit; i++) {
			for (int j = limit; j > i; j--) {
				System.out.print("* ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void rightAngleTriangleRev(int limit) {
		for (int i = 0; i < limit; i++) {
			for (int j = limit-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void IsoselesTriangle(int limit) {
		for (int i = 0; i < limit; i++) {
			for (int j = limit-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void IsoselesTriangleRev(int limit) {
		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <limit; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void DiamondPattern(int limit) {
		for (int i = 0; i < limit; i++) {
			for (int j = limit-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <limit-1; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
