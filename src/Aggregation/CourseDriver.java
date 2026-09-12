package Aggregation;

public class CourseDriver {
    public static void main(String[] args){
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");

        Instructor instructor2 = new Instructor("Jane", "Smith", "8-101");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");

        Instructor[] instructors = {instructor1, instructor2
        };

        Textbook[] textbooks = {textbook1, textbook2
        };

        Course course = new Course("CS 3560 Object-Oriented Programming", instructors, textbooks);

        course.print();
    }
}


