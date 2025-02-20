
public sealed abstract class Employee permits Manager, Salesman {
	
	private String code;
	private String name;
	private String address;
	private int age;
	private double salary;

    public Employee(String address, int age, String code, String name, double salary) {
        this.address = address;
        this.age = age;
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
