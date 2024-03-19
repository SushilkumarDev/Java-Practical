
public class Methodchallenge {

    public static void main(String[] args) {
        String studentName = "Sushilkumar Yadav";
        int studentMarks = 84;
        char studGrade = gradeCalculator(studentMarks);
        displayDetails(studentName, studGrade);
    }

    public static char gradeCalculator (int Marks){
        char Grade;

        if (Marks > 90 && Marks <= 100){
            Grade = 'S';
        } else if (Marks > 80 && Marks <= 90){
            Grade = 'A';
        } else if (Marks > 70 && Marks <= 80){
             Grade = 'B';
    } else {
        Grade = 'F';
    }
    return Grade;
}

     public static void displayDetails(String Name, char studentGrade) {
        System.out.println("The Student Name is: " + Name + " He Scored a Grade: " + studentGrade);
}
}