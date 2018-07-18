package theparent;

public class Mainfour {
	public static void main(String[] args) {
		MathOperation addtion=(int a,int b) -> a + b;

		MathOperation subtration=(a,b)->a-b;

		MathOperation mul=(int a, int b)->{return a*b;};

		MathOperation div=(int a,int b)->a/b;

		GreetingService greetservice1=message -> System.out.println("hello1"+message);

		GreetingService greetservice2=message -> System.out.println("hello2"+message);

		greetservice1.sayMessage("runoob");

		Myrule rule1=(first, second) -> {
			System.out.println(first+second);
		};

		Myrule rule2=(first, second) -> {
			System.out.println(first+"**"+second);
		};
		rule1.rule("a","bb");
	}

	interface MathOperation {
		int operation (int a,int b);
	}
	interface GreetingService{
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a,b);
	}

	interface Myrule{
		void rule(String first,String second);
	}
}
