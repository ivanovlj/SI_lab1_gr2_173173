import java.io.*;
import java.util.*;
class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer>grades=new ArrayList<>();

	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public double getAverage() {
		double prosek=0;
		for(int i=0;i<this.grades.size();i++){
			prosek+=this.grades.get(i);
		}
		prosek/=this.grades.size();
		return prosek;
	}

	public int ECTSCredits() {
		int polozeni=0;
		for (int i=0;i<this.grades.size();i++){
			if (this.grades.get(i)>=6){
				polozeni++;
			}
		}
		polozeni*=6;
		return polozeni;
	}
}