package theparent;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory implements AbstractFactory {
	private static List<Shape> list;
	private static Egg egg;
	static {
		list = new ArrayList<>();
		egg=new Egg();
	}

	@Override
	public List<Shape> getShape(int number, String name) {

		if(number>1){
			if(name.equals("egg")){
				for(int i=0;i<number;i++){
					try{
					list.add((Shape)(egg.clone()));
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				return list;
			}
			return list;
		}else{
			if(name.equals("circle")){
				list.add(Circle.getInstance());
				return list;
			}else if(name.equals("square")){
				list.add(Square.getInstance());
				return list;
			}
		}
		return null;
	}
}
