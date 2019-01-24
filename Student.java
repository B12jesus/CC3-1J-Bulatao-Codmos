package studentinfo;

public class Student {
    private String idnumber, firstname, lastname, academicprogram, college , major;
    String term,year;
    
    public Student(String college,String academicprogram, String major) {
        this.academicprogram = academicprogram;
        this.college = college;
        this.major = major;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAcademicprogram() {
        return academicprogram;
    }

    public void setAcademicprogram(String academicprogram) {
        this.academicprogram = academicprogram;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void PrintInfo(){
        System.out.println("University of the Cordilleras \n"
                + this.college+"\n"
                + this.term + " Term \n"
                + "SY "+ this.year+"\n"
                + "Student Info"+"\n"
                + "ID Number: "+ this.idnumber+"\n"
                + "Name: "+ this.lastname+", "+firstname+"\n"
                + "Academic Program: "+ this.academicprogram+" - "+ this.major);
        
        
    }
        
    
}
