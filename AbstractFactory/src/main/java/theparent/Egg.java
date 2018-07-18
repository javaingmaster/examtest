package theparent;

public class Egg implements Shape,Cloneable{

	public Egg(){}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void draw() {
		System.out.println("an egg");
	}
}
