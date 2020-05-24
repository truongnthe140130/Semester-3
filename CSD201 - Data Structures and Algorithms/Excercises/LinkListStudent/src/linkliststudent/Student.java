/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkliststudent;

/**
 *
 * @author letha
 */
public class Student {

    String mssv;
    String name;
    double gpa;

    public Student() {
    }

    public Student(String mssv, String name) {
        this.mssv = mssv;
        this.name = name;
        this.gpa = 0;
    }
    
    

    public Student(String mssv, String name, double gpa) {
        this.mssv = mssv;
        this.name = name;
        this.gpa = gpa;
    }

    public String getMssv() {
        return mssv;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    
    
}
