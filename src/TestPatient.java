
public class TestPatient {

	public static void main(String[] args) {
		// Declaring methods and variables.
		BloodType artysBloodType = new BloodType("O",'+');
		Patient arty = new Patient(87799, 37, artysBloodType);
		Patient ian = new Patient();
		Patient cj = new Patient();
		Patient morley = new Patient();
		
		// Testing the constructor methods
		ian.setPatientAge(23);
		ian.setPatientIdNumber(148713);
		BloodType iansBloodType = new BloodType("A", '+');
		ian.setBloodType(iansBloodType);
		
		// Displays the output for Patients Info...		
		System.out.println("Arty's ID number is " + arty.getPatientIdNumber() + ", he is " + arty.getPatientAge()
				+ " years old. His blood type is " + arty.getBloodType());
		System.out.println("ian's ID number is " + ian.getPatientIdNumber() + ", he is " + ian.getPatientAge()
				+ " years old. His blood type is " + ian.getBloodType());
		System.out.println("cj's ID number is " + cj.getPatientIdNumber() + ", he is " + cj.getPatientAge()
				+ " years old. His blood type is " + cj.getBloodType());
		System.out.println("morley's ID number is " + morley.getPatientIdNumber() + ", he is " + morley.getPatientAge()
				+ " years old. His blood type is " + morley.getBloodType());
	
		
	}

}
