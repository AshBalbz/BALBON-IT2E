
package balbon.it2e;

import java.util.Scanner;

public class Fitness_Program {
    
    Fitness[] fp;
    
    public void getFitness(){
          Scanner sc = new Scanner(System.in);
      
          System.out.print("Enter number of Application: " );
          int na = sc.nextInt();
          fp = new Fitness[na];
          
          for(int i = 0; i < na; i++){
          
            System.out.println("\nEnter details of Application " + ( i + 1));

              
            System.out.print("\nID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("BMI: ");
            double bmi = sc.nextDouble();
          
            System.out.print("Fitness Goals: ");
            String fg = sc.nextLine();
            sc.nextLine();

            fp[i] = new Fitness(id, name, age, bmi, fg);
            System.out.println("");
            
          }
          
    }
    
    public void viewFitness(){
        System.out.printf("%-5s %-10s %-10s %-10s %-15s %-15s\n ",
                "ID", "Name", "Age", "BMI", "Fitness Goals", "Eligiblity Status" );
        
        for(Fitness fitness : fp){
            if(fitness != null){
                fitness.displayFitness();
                
                
            }
        }
       
    }
  
}
