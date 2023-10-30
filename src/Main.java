import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Turitsta 1

        //Clases Objeto Construtor

        Turista mochileiro = new Turista();

        //Definir formato do objeto
        mochileiro.setNome(JOptionPane.showInputDialog("Entre com o nome:"));
        System.out.println("Nome OK");
        mochileiro.setCpf(JOptionPane.showInputDialog("Entre com o CPF:"));
        if (Util.validaCPF(mochileiro.getCpf())) {
            System.out.println("CPF OK");
        } else {
            System.out.println("CPF Inválido!");
            mochileiro.setCpf("CPF Invalido Tente Novamente");
        }

        //Turista 2

        //Clases Objeto Construtor
        Turista mochileira = new Turista();

        mochileira.setNome(JOptionPane.showInputDialog("Entre com o nome:"));
        System.out.println("Nome OK");
        mochileira.setCpf(JOptionPane.showInputDialog("Entre com o CPF:"));
        if (Util.validaCPF(mochileira.getCpf())) {
            System.out.println("CPF OK");
        } else {
            System.out.println("CPF Inválido!");
            mochileira.setCpf("CPF Invalido Tente Novamente");
        }


        //Saida

        //Turista 1
        System.out.println("Turista 1");
        System.out.println("Nome : " + mochileiro.getNome());
        System.out.println("CPF : " + mochileiro.getCpf());

        //Turista 2
        System.out.println("Turista 2");
        System.out.println("Nome : " + mochileira.getNome());
        System.out.println("CPF : " + mochileira.getCpf());
    }
}