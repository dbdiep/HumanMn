package entity;

public class Worker extends Person {
	
	private double workingDay; //Day of working in month
	private final double BASIC_PAY = 250;

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return workingDay * BASIC_PAY;
	}

}
