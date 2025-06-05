package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExamples {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jashuu", 25));
        students.add(new Student("Dhana", 52));
        students.add(new Student("Srinu", 56));
        students.add(new Student("Mercy", 16));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }

}

class Student implements Comparable<Student> {

    private String name;
    private int grade;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "{"
                + " name='" + getName() + "'"
                + ", grade='" + getGrade() + "'"
                + "}";
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade, o.grade);
    }
}
