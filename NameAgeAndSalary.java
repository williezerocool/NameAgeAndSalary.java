/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameageandsalary;
 import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class NameAgeAndSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        double salary;
        String name;
        
        System.out.print("Hello, whats your name?");
        name = keyboard.next();
        System.out.println(name);
        
        System.out.print(name + "! " + " How old are you?");
        age = keyboard.nextInt();
        System.out.println(age);
        
        System.out.print("So you're " + age + ", eh!" + " thats not old at all!\n" + "How much do you make " + name + "?"  );
        salary = keyboard.nextDouble();
        System.out.println(salary);
        
        System.out.println(salary + "!" + " I hope thats per hour and not per year! LOL!");
        
    }
    
}
