class Student{
     String name;
     int rollNumber;
     char grade;
public void displayDetails(){
     System.out.println("Name: "+name);
     System.out.println("RollNumber: "+rollNumber);
     System.out.println("Grade: "+grade);
}
}
public class Main {
      public static void main(String[] args) {
        Student student = new Student();
        student.name="Ellen";
        student.rollNumber=100;
        student.grade='B';
        student.displayDetails();
    }
}
