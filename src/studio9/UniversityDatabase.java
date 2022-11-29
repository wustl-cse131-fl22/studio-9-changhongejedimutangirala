package studio9;

import assignment7.Student;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> universityDatabase;
	
	public UniversityDatabase(){
		this.universityDatabase =  new HashMap<>();
	}

	public void addStudent(String accountName, Student student) {
		// TODO
		universityDatabase.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return universityDatabase.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		if (universityDatabase.get(accountName) != null) {
			return universityDatabase.get(accountName).getFullName();
		} else {
			return null;
		}}

	public double getTotalBearBucks() {
		// TODO
		double b = 0;
		for(Entry<String, Student> pbEntry : universityDatabase.entrySet()) {
			b += pbEntry.getValue().getBearBucksBalance();
		}
		return b;
	}
}
