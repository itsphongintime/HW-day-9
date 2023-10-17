package CodingMentorWeb;

public class CourseService {
    private WebDatabase database;

    public CourseService(WebDatabase database) {
        this.database = database;
    }

    public void showCourseOptions () {
		System.out.println("----------------------");
		System.out.println("0. View my enrolled courses");
		for (int i = 0; i < database.getCourses().size(); i++) {
			if (database.getCourses().get(i).getIsEnrolled() == false) {
				Course currentCourse = database.getCourses().get(i);
				System.out.print((i + 1) + ". " + currentCourse.getName() + " - ");
				for (int j = 0; j < currentCourse.getMentors().size(); j++) {
				    if (j == currentCourse.getMentors().size() - 1) {
				        System.out.print(currentCourse.getMentors().get(j).getName());
				    } else {
				        System.out.print(currentCourse.getMentors().get(j).getName() + " - ");
				    }
				}
				System.out.println();
			}
		}
	}

    public void chosenCourseDetails (Course chosenCourse) {
		System.out.println("----------------------");
		System.out.println(chosenCourse.getName());
		System.out.println("From " + chosenCourse.getBeginDate());
		System.out.println("To " + chosenCourse.getEndDate());
		System.out.println("AUD " + chosenCourse.getFee());
		System.out.println("1. View course's mentors");
		System.out.println("2. Register");
		System.out.println("Enter any key to go back");
	}
}
