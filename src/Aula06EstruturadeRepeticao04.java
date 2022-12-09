public class Aula06EstruturadeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 50000;
        for (int parcela = 1; parcela < valorTotal; parcela++){
            double valorParcela = valorTotal/parcela;
            if (valorParcela <1000){
                break;
            } else{
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }
        }
    }
}
