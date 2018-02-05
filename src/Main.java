import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        double i ;
        double h ;
        double a ;
        double b ;
        double fx ;
        System.out.print("Введите левую границу: ");
        Scanner num = new Scanner(System.in);
        a = num.nextDouble();
        System.out.print("\nВведите правую границу: ");
        b = num.nextDouble();
        System.out.print("\nВведите шаг: ");
        h = num.nextDouble();
        i = a;
        while (i>=a && i<=b){

            fx = Math.tan(2*i)-3;
            System.out.println(i + ":   " + fx);
            i+=h;

        }
    }

}
