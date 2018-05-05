package overiding;

public class ChekOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape objShape = new Shape();
		objShape.Area();
		Triangle objTriangle = new Triangle();
		objTriangle.Area();
		Square objSquare = new Square();
		objSquare.Area();
		Shape objShapeTriangle = new Triangle();
		objShapeTriangle.Area();
		Shape objShapeSquare = new Square();
		objShapeSquare.Area();
	}

}
