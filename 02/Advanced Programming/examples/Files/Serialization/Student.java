package objectSerialization;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 2724937972241616654L;
	private int age;
	private String name;
	private String familyName;
	private double grade;

	private transient boolean legalAge;
	
	//private transient String password;

	public Student(int age, String name, String familyName, double grade) {
		this.age = age;
		this.name = name;
		this.familyName = familyName;
		this.grade = grade;
		calculateLegality();
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * @param familyName
	 *            the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * @return the grade
	 */
	public double getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(double grade) {
		this.grade = grade;
	}

	/**
	 * @return the legalAge
	 */
	public boolean isLegal() {
		
		return legalAge;
	}

	/**
	 *            the legalAge to set
	 */
	public void calculateLegality() {
		if (age >= 18)
			legalAge = true;
		else
			legalAge = false;
	}
	
	
}
