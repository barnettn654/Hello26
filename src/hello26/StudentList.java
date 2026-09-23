/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hello26;

/**
 *hi there and this is a change
 * @author Ronak
 */
public class StudentList {
    public static void main(String[] args) {
        Student[] studentList = new Student[3];
        
        Student s1 = new Student("1","Ronak","987v");
        studentList[0]=s1;
        studentList[1]=new Student("2","Alice","98");
        studentList[2]=new Student("3","Bob","87tyguhb");
        
        for(int i =0; i <studentList.length;i++){
            System.out.println(studentList[i].getsName());
        }
    }//end of main
}//end of class
