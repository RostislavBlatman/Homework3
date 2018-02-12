package Main;

import test.Test;
import java.util.Scanner;
import Logic.Logic;

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
        Test.borders( a, b );
        System.out.print("\nВведите шаг: ");
        h = num.nextDouble();
        Test.step( h );
        for ( i = a ; i>=a && i<=b; i+=h){

            fx = Logic.logic(i);
            System.out.println(i + ":   " + fx);

        }
    }

}
