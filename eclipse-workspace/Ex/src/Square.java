
public class Square extends ColordFigure {
private int size;
	Square(String color, int size) {
		super(color, size);
	this.size=size;	
	}

	@Override
	public String GetName() {
	
		return "Square";
	}

	@Override
	public int GetArea() {
int S=size*size;
		return S;
	}

}
