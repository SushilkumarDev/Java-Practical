Main.java

public class Main {
    public static void main (String[] args)
    {
   Student student1 = new Student("Manish","#123");
   Sessions FinalYear = new Sessions ("2021",student1);
   Floor ThirdFloor = new Floor(3,1000);
   Branch ECE = new Branch("Electronics",new Sessions("Prefinal",new Student("Atulya","#1234")));


   Library APJ = new Library("BestLibrary","2019",10000,ThirdFloor);
   College VITVellore = new College("VIT",APJ,ECE);
   University VIT = new University("VIT",VITVellore);


   VIT.getCollege().OpeningDate();
   VIT.getCollege().getLibrary().SearchaBook();
   VIT.getCollege().getLibrary().getFloor().Cleanthefloor();




    }
}

Library.java

public class Library {
    private String Name;
    private String YearOfBuild;
    private int NoofBooks;
    private Floor floor;
    public Library(String name, String yearOfBuild, int noofBooks, Floor floor) {
        Name = name;
        YearOfBuild = yearOfBuild;
        NoofBooks = noofBooks;
        this.floor = floor;
    }
    public String getName() {
        return Name;
    }
    public String getYearOfBuild() {
        return YearOfBuild;
    }
    public int getNoofBooks() {
        return NoofBooks;
    }
    public Floor getFloor() {
        return floor;
    }


    public void SearchaBook(){
        System.out.println("Searching for Book");
    }
   
}



Floor.java

public class Floor {
   
    private int floorNo;
    private double floorCapacity;

    public Floor(int floorNo, double floorCapacity) {
        this.floorNo = floorNo;
        this.floorCapacity = floorCapacity;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public double getFloorCapacity() {
        return floorCapacity;
    }


    public void Cleanthefloor(){
        System.out.println("Cleaning Process Initiated");
    }
   
}

Sessions.java

public class Sessions {
    private String SessionName;
    private Student student;


   
    public Sessions(String sessionName, Student student) {
        SessionName = sessionName;
        this.student = student;
    }




    public String getSessionName() {
        return SessionName;
    }




    public Student getStudent() {
        return student;
    }


   
   
}



College.java

public class College {
    private String CollegeName;
    private Library library;
    private Branch branch;








    public College(String collegeName, Library library, Branch branch) {
        CollegeName = collegeName;
        this.library = library;
        this.branch = branch;
    }








    public String getCollegeName() {
        return CollegeName;
    }








    public Library getLibrary() {
        return library;
    }








    public Branch getBranch() {
        return branch;
    }


    public void OpeningDate(){
        System.out.println("The Opening date is 20th JAN");
    }




   
   
}




University.java

public class University {
    private String Name;
    private College college;


   
    public University(String name, College college) {
        Name = name;
        this.college = college;
    }




    public String getName() {
        return Name;
    }




    public College getCollege() {
        return college;
    }






   
}




Branch.java

public class Branch {
    private String BranchName;
    private Sessions session;






    public Branch(String branchName, Sessions session) {
        BranchName = branchName;
        this.session = session;
    }






    public String getBranchName() {
        return BranchName;
    }






    public Sessions getSession() {
        return session;
    }


   






   
}




Student.java

public class Student {
    private String Name;
    private String RollNo;




    public Student(String name, String rollNo) {
        Name = name;
        RollNo = rollNo;
    }




    public String getName() {
        return Name;
    }




    public String getRollNo() {
        return RollNo;
    }


   


   
}

