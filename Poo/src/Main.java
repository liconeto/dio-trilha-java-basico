
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var male = new Person();
		male.setName("João");
		male.setAge(12);
		
		var female = new Person();
		female.setName("Marcia");
		female.setAge(10);
		
		System.out.println("Male name " + male.getName() + " age: "+ male.getAge() );
		System.out.println("Female name " + female.getName() + " age: "+ female.getAge() );

	}

}
