package labs_examples.objects_classes_methods.labs.objects.ex03;

public class Controller {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java Programming");
        Student student = new Student("Tyler");

        student.enrollInCourse(javaCourse);  // Association happens here

        student.displayInfo();  // Output: Tyler is enrolled in Java Programming
    }
}
