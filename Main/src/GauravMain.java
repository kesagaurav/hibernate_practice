
public class GauravMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimize("010011"));

	}
	
	public static String minimize(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.delete(2,4);
		return sb.toString();
	}

}
