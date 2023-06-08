/**
 * 
 * 
 * Package
 */
package labcodeinspection;

import java.util.Locale;

public class Email {

	private String m_firstName;
	private String m_lastName;
	private String password = "";
	private String department;
	private int defaultpasswordLength = 8;
	private String email;

	/**
	 * 
	 * 
	 * @method Email
	 */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	
	/**
	 * 
	 * 
	 * @method getM_firstName
	 */
	public String getM_firstName() {
		return m_firstName;
	}
	
	/**
	 * 
	 * 
	 * @method setM_firstName
	 */
	public void setM_firstName(String m_firstName) {
		this.m_firstName = m_firstName;
	}
	
	/**
	 * 
	 * 
	 * @method getM_lastName
	 */
	public String getM_lastName() {
		return m_lastName;
	}

	/**
	 * 
	 * 
	 * @method setM_lastName
	 */
	public void setM_lastName(String m_lastName) {
		this.m_lastName = m_lastName;
	}
	
	/*
	 * @method getPassword
	 */
	public String getPassword() {
		return password;
	}
	
	/*
	 * @method setPassword
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/*
	 * @method getDepartment
	 */
	public String getDepartment() {
		return department;
	}
	
	/*
	 * @method setDepartment
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/*
	 * @method getDefaultpasswordLength
	 */
	public int getDefaultpasswordLength() {
		return defaultpasswordLength;
	}
	
	/*
	 * @method setDefaultpasswordLength
	 */
	public void setDefaultpasswordLength(int defaultpasswordLength) {
		this.defaultpasswordLength = defaultpasswordLength;
	}
	
	/*
	 * @method getEmail
	 */
	public String getEmail() {
		return email;
	}
	
	/*
	 * @method setEmail
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * 
	 * @method showInfo
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	 * 
	 * 
	 * @method setDeparment
	 */
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "no selected yet";
			break;
		}
	}

	/*
	 * @method randomPassword
	 * 
	 * @param length
	 */
	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return String.valueOf(password);
	}

	/**
	 * 
	 * 
	 * @method generateEmail
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.getDefault()) + this.m_lastName.toLowerCase(Locale.getDefault()) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
