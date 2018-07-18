package theparent;

public class FireDecoration implements Prop {
	private Prop prop;

	public FireDecoration(Prop p){
		this.prop=p;
	}
	@Override
	public void increaseAttack() {
		prop.increaseAttack();
		System.out.println("With fire!");
	}
}
