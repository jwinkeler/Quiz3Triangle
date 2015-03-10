
public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
		
	}
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	public double getArea(){
		double sideA = this.side1;
		double sideB = this.side2;
		double sideC = this.side3;
		double midStep= (sideA+sideB+sideC)/2;
		return(Math.sqrt(midStep*(midStep-sideA)*(midStep-sideB)*(midStep-sideC)));
	}
	public double  getPerimeter(){
		double sideA = this.side1;
		double sideB = this.side2;
		double sideC = this.side3;
		return(sideA+sideB+sideC);
	}
	@Override
	public String toString(){
		String sideA =Double.toString(this.side1);
		String sideB = Double.toString(this.side2);
		String sideC = Double.toString(this.side3);
		return("The triangle has sides of lengths"+sideA+sideB+sideC); 
	}
	
			

}
