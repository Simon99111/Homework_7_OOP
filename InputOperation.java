import java.util.Scanner;

public class InputOperation {
    InputOperation(){
    
    }
    
    public char op(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str + ": ");
        char sym = sc.next().charAt(0);
        return sym;
    }
}
