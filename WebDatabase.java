package CodingMentorWeb;

import java.util.ArrayList;

public class WebDatabase {
    private ArrayList<Course> courses;
    private ArrayList<Account> accounts;
    private Account user;

    public WebDatabase() {
        this.courses = new ArrayList<Course>();
        this.accounts = new ArrayList<Account>();
        
        ArrayList <Mentor> course1mentors = new ArrayList<Mentor>();
        course1mentors.add(new Mentor("Dung")) ;
        
        Course course1 = new Course("BE5", "16/08/2023", "16/08/2024", 3000);
        course1.setMentors(course1mentors);
        
        ArrayList <Mentor> course2mentors = new ArrayList<Mentor>();
        course2mentors.add(new Mentor("Dung")) ;
        course2mentors.add(new Mentor("Hai")) ;

        Course course2 = new Course("Data 7", "01/01/2024", "01/01/2025", 3000);
        course2.setMentors(course2mentors);

        courses.add(course1);
        courses.add(course2);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }
}
