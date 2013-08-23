
public class TestBloodType {

	public static void main(String[] args) {
		// Declaring variables....
		BloodType arty = new BloodType("F", '-');
		BloodType ian = new BloodType();
		BloodType cj = new BloodType("DJ");
		BloodType morley = new BloodType('-');
		
		// Testing Constructor methods
		arty.setBloodType("D");
		arty.setRhFactor('-');
		
		// Displaying the output info of patients.
		System.out.println("Arty's blood type is" + arty.getBloodType() + arty.getRhFactor());
		System.out.println("Ian's blood type is " + ian.getBloodType() + ian.getRhFactor());
		System.out.println("CJ's blood type is " + cj.getBloodType() + cj.getRhFactor());
		System.out.println("Morley's blood type is " + morley.getBloodType() + morley.getRhFactor());
	}

}
