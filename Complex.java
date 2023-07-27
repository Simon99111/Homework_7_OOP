import java.io.BufferedWriter;
import java.io.FileWriter;

public class Complex implements InterfaceSumma, InterfaceMultiplication, InterfaceDivision {
    private ComplexNum z1;
    private ComplexNum z2;
    private char symbol;

    Complex(ComplexNum z1, ComplexNum z2, char symbol) {
        this.z1 = z1;
        this.z2 = z2;
        this.symbol = symbol;
    }

    public void Operation() {
        switch (symbol) {
            case '+':
                summa();
                break;
            case '*':
                multiplication();
                break;
            case '/':
                division();
                break;
            default:
                System.out.println("Ошибка! Введена некорректная операция.");
                return;
        }
    }

    

    @Override
    public void summa() {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            writer.write("Операция - сложение: ");
            writer.newLine();
        double x = z1.getX() + z2.getX();
        double y = z1.getY() + z2.getY();
        if (y < 0) {
            System.out.println("Сумма = " + x + "" + y + "i");
            writer.write(("(" + z1.getX()) + "+" + (z2.getX()) + "*i)" + "+" + "(" + z1.getY() + "+" + (z2.getY()) + "*i)" + " = " +  x + "" + y + "*i");
        }
        else
        {
            System.out.println("Сумма = " + x + " + " + y + "i");
            writer.write(("(" + z1.getX()) + "+" + (z2.getX()) + "*i)" + "+" + "(" + z1.getY() + "+" + (z2.getY()) + "*i)" + " = " +  x + "+" + y + "*i");
        }
    }
    catch (Exception e) {
        System.out.println("Ошибка");
    }
    }

    @Override
    public void multiplication() {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            writer.write("Операция - умножение: ");
            writer.newLine();
        double x = z1.getX() * z2.getX();
        double y = z1.getY() * z2.getY();
        if (y < 0) {
            System.out.println("Произведение = " + x + "" + y + "i");
            writer.write(("(" + z1.getX()) + "+" + (z2.getX()) + "*i)" + "*" + "(" + z1.getY() + "+" + (z2.getY()) + "*i)" + " = " +  x + "" + y + "*i");
        }
        else
        {
            System.out.println("Произведение = " + x + " + " + y + "i");
            writer.write(("(" + z1.getX()) + "+" + (z2.getX()) + "*i)" + "*" + "(" + z1.getY() + "+" + (z2.getY()) + "*i)" + " = " +  x + "+" + y + "*i");
        }
    }
    catch (Exception e) {
        System.out.println("Ошибка");
    }
    }

    @Override
    public void division() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            writer.write("Операция - Деление: ");
            writer.newLine();
        double x = z1.getX() / z2.getX();
        double y = z1.getY() / z2.getY();
        if (y < 0) {
            System.out.println("Частное = " + x + "" + y + "i");
            writer.write(("(" + z1.getX()) + "+" + (z2.getX()) + "*i)" + "/" + "(" + z1.getY() + "+" + (z2.getY()) + "*i)" + " = " +  x + "" + y + "*i");
        }
        else
        {
            System.out.println("Частное = " + x + " + " + y + "i");
            writer.write(("(" + z1.getX()) + "+" + (z2.getX()) + "*i)" + "/" + "(" + z1.getY() + "+" + (z2.getY()) + "*i)" + " = " +  x + "" + y + "*i");
        }
    }

    catch (Exception e) {
        System.out.println("Ошибка");
    }
}
}
