package logica;

public class Aula08ArraysMultidimensionais {

    public static void main(String[] args) {
        int [][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;


        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[0].length; j++){
                System.out.println(dias [i][j]);
            }
        }
    }
}