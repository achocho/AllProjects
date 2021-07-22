
public class Triangle extends ColordFigure{
private int size;
	Triangle(String color, int size) {
		super(color, size);
		this.size=size;
	}

	@Override
	public String GetName() {

		return "Triangle";
	}

	@Override
	public int GetArea() {
 
		int S=(int) (((size*size)*Math.sqrt(3))/4);
		return S;
	}

}
