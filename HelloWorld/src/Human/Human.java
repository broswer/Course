package Human;

public class Human {
	
	public static int numberOfHumans;
	public int age;
	public String name;
	public void introduce(){
		System.out.println("I'm " + name + " and I'm " + age + "years old.\n");
		
	}
	
	public void copy(Human original){
		age = original.age;
		name = original.name;
	}
	
	public Human(String givenName){
		age = 6;
		name = givenName;
		numberOfHumans++;
	}
	
	public void change(int age){
		String name = "Tom";
		this.age = age;
		this.name = name;
	}
}
