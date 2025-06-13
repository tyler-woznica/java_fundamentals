package labs_examples.objects_classes_methods.labs.objects.ex03;

public class Controller {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java 201");
        Student student = new Student("Tyler");

        student.enrollInCourse(javaCourse);

        student.displayInfo();
    }
}
