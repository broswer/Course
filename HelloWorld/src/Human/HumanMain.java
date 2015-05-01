package Human;

public class HumanMain {

	public static void main(String[] args) {
		
		/*
		 * no constructor in use
		Human amanda = new Human();
		amanda.age = 6;
		amanda.name = "Amanda";
		amanda.introduce();
		Human a2 = new Human();
		a2.copy(amanda);
		a2.introduce();
		*/
		
		
		//using constructor
		Human amanda = new Human("amanda");
		amanda.introduce();
		amanda.change(10);
		amanda.introduce();
	}

}
