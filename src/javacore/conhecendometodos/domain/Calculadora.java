package javacore.conhecendometodos.domain;

public class Calculadora {

    public double somar(){
        return 10+30;
    }

    public double subtrair(){
        return 30-10;
    }

    public int multiplicar (int num1, int num2){
        return num1 *num2;
    }

    public double dividir(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double dividir2(double num1, double num2){
        if(num2 != 0){
            System.out.println(num1/num2);
            return num1 / num2;
        }else {
            System.out.println("Não existe divisão por zero!");
            return 0;
        }
    }
}
