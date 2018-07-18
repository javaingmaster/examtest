package theparent;

public class Circle implements Shape {

	private static Shape instance=new Circle();

	private Circle(){}

	public static Shape getInstance(){
		if(instance!=null){
			return instance;
		}
		return null;
	}

	@Override
	public void draw() {
		System.out.println("circle");
	}
}
