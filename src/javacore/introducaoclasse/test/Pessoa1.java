package javacore.introducaoclasse.test;

import javacore.introducaoclasse.domain.Pessoa;

public class Pessoa1 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Elaine");
        pessoa.setSexo('F');
        pessoa.setIdade(36);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getSexo());
        System.out.println(pessoa.getIdade());

    }
}
