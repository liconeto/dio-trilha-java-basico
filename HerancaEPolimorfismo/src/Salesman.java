
public non-sealed class Salesman extends Employee{
	
	private double precentPerSold;

    public Salesman(String address, int age, String code, String name, double salary) {
        super(address, age, code, name, salary);
    }

	public double getPrecentPerSold() {
		return precentPerSold;
	}

	public void setPrecentPerSold(double precentPerSold) {
		this.precentPerSold = precentPerSold;
	}
	
	

}
