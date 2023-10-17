package CodingMentorWeb;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Mentor> mentors;
	private String beginDate;
	private String endDate;
	private double fee;
	private boolean isEnrolled;
	
	public Course (String name, String beginDate, String endDate, double fee) {
		super();
		this.name = name;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.fee = fee;
		this.isEnrolled = false;
		this.mentors = new ArrayList<Mentor>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Mentor> getMentors() {
		return mentors;
	}

	public void setMentors(ArrayList<Mentor> mentors) {
		this.mentors = mentors;
	}
	
	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public boolean getIsEnrolled() {
		return isEnrolled;
	}

	public void setIsEnrolled(boolean isEnrolled) {
		this.isEnrolled = isEnrolled;
	}
}
