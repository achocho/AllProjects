
public class Circle extends ColordFigure {
private int size;
	Circle(String color, int size) {
		super(color, size);
		this.size=size;
	}

	
	public String GetName() {

		return "Circle";
	}


	public int GetArea() {
		
		return (int)Math.PI*(size*size);
	}

}
