package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        checkLessOrGreaterEqual(1,2);
        checkMultiply(10,5);
        checkPositiveNegative(-1);
    }

    //TODO ↓
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if(n1<n2){
            System.out.println("X es menor que Y");
        } else System.out.println("X es mayor o igual que Y");
    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es múltiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es múltiplo de Y
    public static void checkMultiply(int n1, int n2) {
        if (n1%n2 == 0){
            System.out.println("X es multiplo de Y");
        } else System.out.println("X no es multiplo de Y");
    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    public static void checkPositiveNegative(int num) {
        if (num<0){
            System.out.println("X es negativo.");
        } else System.out.println("X es positivo.");
    }
}
