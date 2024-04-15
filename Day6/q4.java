/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
import java.util.Scanner;
class student2{
    String student_name;
    int student_roll;
    int student_fee;
    
    student2(String student_name,int student_roll,int student_fee){
      
        this.student_name=student_name;
        this.student_fee=student_fee;
        this.student_roll=student_roll;
    }
    student2(){
        
        this("Hero",1,0);
        
    }
     
//    void display(Object o){
//        System.out.println("student  name:"+this.student_name);
//        System.out.println("student  roll:"+this.student_roll);
//        System.out.println("student  fee:"+this.student_fee);
//       
//    }
    public Object  pass(Object o){
        return  this;
    }
    
        
}
public class q4 {
     public static void main(String[] args) {
        String s1;
        int r1;
        int f1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student1 name:");
        s1=sc.nextLine();
        System.out.println("Enter roll:");
        r1=sc.nextInt();
        System.out.println("Enter Fee");
        f1=sc.nextInt();
        student2 obj2=new student2();
        student2 obj1=new student2(s1,r1,f1);
        System.out.println(obj1.pass(obj1));
        System.out.println(obj2.pass(obj2));
    }
    
}


**************************************************************************************************************************import java.util.*;

class Studentss {
    String Student_name;
    int Student_roll;
    int Student_fee;

    Studentss() {
        this("Sanchit",10,1010);        
    }

    Studentss(String Student_name, int Student_roll, int Student_fee) {
        this.Student_name = Student_name;
        this.Student_roll = Student_roll ;
        this.Student_fee = Student_fee;
    }

    void Display(Studentss sss) {
        System.out.println(Show());
        System.out.println(this.Student_name);
        System.out.println(this.Student_roll);
        System.out.println(this.Student_fee);
    }

    Studentss Show() {
        return this;
    }

    void helper() {
        Display(this);
    }

    // Adding the main method here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ss = sc.next();
        int rr = sc.nextInt();
        int ff = sc.nextInt();
        Studentss obj2 = new Studentss(ss, rr, ff);
        Studentss obj1 = new Studentss();
        System.out.println("Student 1 Details are :");
        obj1.helper();
        System.out.println("Student 2 Details are :");
        obj2.helper();
    }
}
