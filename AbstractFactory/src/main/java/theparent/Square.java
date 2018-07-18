package theparent;

import javax.jws.Oneway;

public class Square implements Shape {

	private static Shape instance= new Square();

	private Square(){}

	public static Shape getInstance(){
		if(instance!=null)
			return instance;

		return null;
	}

	@Override
	public void draw() {
		System.out.println("square");
	}
}
