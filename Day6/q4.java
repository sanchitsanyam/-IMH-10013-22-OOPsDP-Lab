


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
