/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input string 1:");
        String s1=sc.next();
        System.out.println("Input string 2:");
        String s2=sc.next();
        int f = 1;
        for(int i=s1.length()-1;i>=0;i--){
            f=1;
            char ch1=s1.charAt(i);
            for(int j=0;j<s2.length();j++){
                char ch2=s2.charAt(j);
                if(ch1!=ch2){
                   f=0;
                   break;
                }
            }
            if(f==0){
                System.out.println("Not palindrome");
                break;
            }
        }
        if(f==1){
            System.out.println("Its palindrome"); 
        }
        String s3=s1+s2;
        for(int i=0;i<s1.length()+s2.length();i++){
            char ch=s3.charAt(i);
            System.out.print(ch);
        }
    }
}
