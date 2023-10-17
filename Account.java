package CodingMentorWeb;

import java.util.ArrayList;

public class Account {
	private String ID;
	private String password;
    private String name;
    private int failedAttempts;
    ArrayList <Course> enrolledCourses;
    
    public Account (String ID, String password, String name) {
    	this.ID = ID;
    	this.password = password;
    	this.name = name;
    	this.failedAttempts = 0;
    	this.enrolledCourses = new ArrayList<Course>();
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
    
    public ArrayList<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFailedAttempts() {
		failedAttempts++;
	}

	public int getFailedAttempts() {
        return failedAttempts;
    }
}
