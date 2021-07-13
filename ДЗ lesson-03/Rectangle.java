class Rectangle {

	double a;
	double b;
	
	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	double square() {
		return a * b;
	}

	double perimeter() {
		return (a * 2) + (b * 2);
	}

	void show() {
		System.out.println("Rectangle " + a + "x" + b);
		System.out.println("square: " + square());
		System.out.println("perimeter: " + perimeter());
	}

	public static void main (String[] args) {
		Rectangle rect = new Rectangle(4,5);
		rect.show();
		Rectangle rect2 = new Rectangle(10,10);
		rect2.show();
		
	}

}
