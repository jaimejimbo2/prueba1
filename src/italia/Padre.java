package italia;

public class Padre {

	private String texto = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Padre(String texto){
		this.texto=texto;
	}
	
	public void print(){
		System.out.println(this.texto);
	}
}
