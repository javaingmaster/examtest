package theparent;

public class Mainthree {
	public static void main(String[] args) {
		Person person = new Person();
		Prop knife=new Knife();
		Prop sword=new Sword();
		person.showAttack(knife);
		person.showAttack(sword);

		Prop fireattack=new FireDecoration(knife);
		person.showAttack(fireattack);
	}
}
