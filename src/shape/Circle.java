package shape;

public class Circle extends Shape implements Drawble {
	
	private int radius;
	
	public int getR() {
		return radius;
	}

	public void setR(int r) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("원을 그렸습니다.");
	}

	@Override
	public double calculateArea() {
		return (double)radius*radius*Math.PI;
	}
}
