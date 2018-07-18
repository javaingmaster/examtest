package theparent;

import java.util.List;

public interface AbstractFactory {
	public List<Shape> getShape(int number, String name);
}
