/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
class Bird{
    void fly(){
        System.out.println("hello i am flying");
    }    
}
class Parrot extends Bird{
    void showColor(){
        System.out.println(" Green color Bird");
    }
}
class Crow extends Bird{
    void showColor(){
        System.out.println(" Black color Bird");
    }
} 
public class Q2 {
    public static void main(String[] args) {
        Parrot t=new Parrot();
        t.fly();
        t.showColor();
        Crow c=new Crow();
        t.fly();
        c.showColor();
    }
    
}
