package test;

public class Test {
    public static void borders (double a, double b){
        if ( a > b){
            throw new IllegalArgumentException("границы перепутаны местами");
        }

    }
    public static void step (double h){

        if ( h < 0){
            throw new IllegalArgumentException("введён отрицательный шаг");

        }
    }
}
