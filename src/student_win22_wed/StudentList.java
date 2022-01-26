
package student_win22_wed;


public class StudentList {
    
     public static void main(String[] args){
        Student[] studentList = new Student[3];
        studentList[0] = new Student("1","Andrei Agetano");
        studentList[1] = new Student("2","John Doe");
        studentList[2] = new Student("3","abc");
        
         for (Student studentList1 : studentList) {
             System.out.println(studentList1.getStudentName());
         }
        
    }
}

    
    
    
    
    
    
    
    

