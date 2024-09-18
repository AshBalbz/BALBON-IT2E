package balbon.it2e;

public class Fitness {
    int id, age;
    String name, fg;
    double bmi;
    
    public Fitness(int fid, String aname, int aage, double abmi, String afg ){
        
        this.id = fid;
        this.name = aname;
        this.age = aage;
        this.bmi = abmi;
        this.fg = afg;
        
    }
    
    public void displayFitness(){
        String status = (age < 65) ? "Eligible" : "Not Elgible (Age too high)";
        
        System.out.printf("%-5d %-10s %-10d %-10.2f %-15s %-15s\n ",
                id, name, age, bmi, fg, status );
        
       
    }
    
}
