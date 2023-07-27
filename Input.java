import java.util.Scanner;

public class Input {

    Input(){
    
    }
    
    public double in(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str + " = ");
        double val = sc.nextDouble();
        return val;
    }
}

