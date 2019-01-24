package studentinfo;
import java.util.Scanner;
public class StudentInfo {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student("","","");
        System.out.println("Pls Enter Number Of Students:");
        int x = Integer.parseInt(sc.nextLine());
        
        int[] a = new int[x];
        
        for(int i = 0 ; i < a.length ; i ++){
            
            System.out.println(i);
            System.out.println("Pls. Enter ID Number: ");
            student.setIdnumber(sc.nextLine());
            System.out.println("Pls Enter Student First name: ");
            student.setFirstname(sc.nextLine());
            System.out.println("LastName");
            
            
        }
        
            
                 
        Student student1 = new Student("CITCS","BSCS","Major"); 
        Student student2 = new Student("CITCS","BSCS","Major"); 
        Student student3 = new Student("CITCS","BSCS","Major"); 
        Student student4 = new Student("CITCS","BSCS","Major"); 
        Student student5 = new Student("CITCS","BSCS","Major"); 
        Student student6 = new Student("CITCS","BSCS","Major"); 
        
        student1.setIdnumber("18-6818-625");
        student1.setLastname("Bulatao");
        student1.setFirstname("Jesus");
        student1.year = "1st";
        student1.term = "2nd";
        student1.PrintInfo();
        
        student2.setIdnumber("00-0000-000");
        System.out.println(student2.getIdnumber());
        
        student3.setMajor("Minor");
        System.out.println(student3.getMajor());
        
        student4.term = "2nd";
        System.out.println(student4.term);
        
        
        
    }
    
}
