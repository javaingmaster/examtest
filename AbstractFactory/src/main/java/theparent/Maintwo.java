package theparent;

import java.util.List;
import java.util.Scanner;

public class Maintwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name=scanner.next();
		int number=scanner.nextInt();

		AbstractFactory af=new ShapeFactory();
		List<Shape> list = af.getShape(number,name);
		if(list!=null&&list.size()>0){
			for(int j=0;j<list.size();j++){
				list.get(j).draw();
			}
		}
	}
}
