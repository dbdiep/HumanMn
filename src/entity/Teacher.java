package entity;

public class Teacher extends Person {

	private double coefficients; //coefficients of teacher
	private final double BASIC_PAY = 150;

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return coefficients * BASIC_PAY;
	}

}
