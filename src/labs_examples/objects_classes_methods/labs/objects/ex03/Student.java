package labs_examples.objects_classes_methods.labs.objects.ex03;

public class Student {
    private String name;
    private Course course;  // Association: Student has a Course

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println(name + " is enrolled in " + course.getCourseName());
    }
}
