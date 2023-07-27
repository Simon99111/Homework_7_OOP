public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        InputOperation oper = new InputOperation();
        
        double a,b;
        char c;
        
        System.out.println("Введите значения a, b для первого числа (z = a + b * i):");
        a = input.in("a");
        b = input.in("b");
        ComplexNum z1 = new ComplexNum(a, b);


        System.out.println("Введите значения a, b для второго числа (z = a + b * i):");
        a = input.in("a");
        b = input.in("b");
        ComplexNum z2 = new ComplexNum(a, b);

        System.out.println("Введите действие (+, *, /)");
        c = oper.op("Операция");
        Complex complex = new Complex(z1, z2, c);
        complex.Operation();
    }
    
}
