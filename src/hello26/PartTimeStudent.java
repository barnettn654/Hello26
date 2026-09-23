/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello26;

import Hello26.Student;

/**
 *
 * @author alot
 */
public class PartTimeStudent extends Student {
    private int numOfCourse;

    public PartTimeStudent(int numOfCourse, String sID, String sName, Object ) {
        super(sID, sName, <error>);
        this.numOfCourse = numOfCourse;
    }
    

    

    public int getNumOfCourse() {
        return numOfCourse;
    }

    public void setNumOfCourse(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }


}
