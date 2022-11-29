package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int studentNumber;
	private int attemptedCredits;
	private int passingCredits;
	private double qualityPoints;
	private double bearBucksBalance;
	
	//Constructor
	public Student(String first, String last, int ID) {
		firstName = first;
		lastName = last;
		studentNumber = ID;
		
	}
	//getter
	public String getFullName() {
		return firstName + " " + lastName;
	}
	public int getId() {
		return studentNumber;
	}
	public int getTotalAttemptedCredits() {
		return attemptedCredits;
	}
	public int getTotalPassingCredits() {
		return passingCredits;
	}
	public double calculateGradePointAverage() {
		return qualityPoints / attemptedCredits; 
	}
	
	/**
	 * Calculates a student's final grade point average
	 * @param grade
	 * @param credits
	 */
	public void submitGrade(double grade, int credits) {
		this.attemptedCredits += credits;
		if(grade >= 1.7) {
			this.passingCredits += credits;
		}
		qualityPoints = this.qualityPoints + (grade * credits); // not sure how to do gpa part
		calculateGradePointAverage();
	}
	public String getClassStanding() {
		if (passingCredits < 30) return "First Year";
		if (passingCredits >= 30 && passingCredits < 60) return "Sophomore";
		if (passingCredits >= 60 && passingCredits < 90) return "Junior";
		else return "Senior";
	}
	public boolean isEligibleForPhiBetaKappa() {
		if(passingCredits >= 98 && calculateGradePointAverage() >= 3.60) return true;
		if(passingCredits >= 75 && calculateGradePointAverage() >= 3.80) return true;
		else return false;
	}
	/**
	 * adds a specified amount to current bear bucks available
	 * @param amount
	 */
	public void depositBearBucks(double amount) {
		bearBucksBalance = bearBucksBalance + amount;
	}
	/**
	 * removes a specified amount from current bear bucks balance
	 * @param amount
	 */
	public void deductBearBucks(double amount) {
		bearBucksBalance = bearBucksBalance - amount;
	}
	public double getBearBucksBalance() {
		return this.bearBucksBalance;
	}
	public double cashOutBearBucks() {
		if(bearBucksBalance > 10) {
			double cashOut = bearBucksBalance - 10;
			bearBucksBalance = 0;
			return cashOut;
		}else {
			double cashOut = 0.0; 
			bearBucksBalance = 0;
			return cashOut;
		}
	}
	/**
	 * Creates a new legacy student with their first and lastname and student id
	 * and finds whether their last name is hyphenated. Also assigns student bear bucks from parents
	 * @param firstName
	 * @param otherParent
	 * @param isHypenated
	 * @param id
	 * @return
	 */
	public Student createLegacy(String firstName,Student otherParent, boolean isHypenated, int id) { 
		boolean isHyphen = isHypenated;
		String legacyLastName = ""; 
			if ( isHyphen == true) legacyLastName = this.lastName + "-" + otherParent.lastName;
			else legacyLastName =  this.lastName;
		
		Student legacy = new Student(firstName,legacyLastName,id);
		double legacyBearBucks = cashOutBearBucks() + otherParent.cashOutBearBucks();
		legacy.bearBucksBalance = legacyBearBucks;
	
		return legacy;
	}
	public String toString() {
		return firstName + " " + lastName + studentNumber;
	}
	

}
