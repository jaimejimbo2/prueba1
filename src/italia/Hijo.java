package italia;

public class Hijo extends Padre {

	private int num=0;
	
	Hijo(int num){
		super("Hijo");
		this.num = num;
	}
	
	//@overrides
	public void main(String[] args) {
		System.out.println(this.num);
		super.print();
	}

}
