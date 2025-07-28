/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package demo.array_list;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Array_list {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      ArrayList<String>names= new ArrayList<>();
      
     
      names.add("Lux");
      names.add("Anex");
      names.add("Sea");
      names.add("Nanka");       
      names.add("Anitha");
      names.add("Ruth");
      names.add("Matt");
           
      System.out.println("Names List");
      System.out.println(names);
      
      names.remove("Lux");
      names.remove("Matt");
      
      
      //method for removing names
        System.out.println("\nAfter removing 'Lux' : ");
        System.out.println("\nAfter removing 'Matt' : ");
            System.out.println(names);
    }
}

