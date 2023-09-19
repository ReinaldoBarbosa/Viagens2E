public class Main {
    public static void main(String[] args) {

        //Clases Objeto Construtor
        Turista mechileiro = new Turista("Maia");

        //Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf("123");

        Turista mechileira = new Turista();
        mechileira.setNome("Ana");
        mechileira.setCpf("234");
        //Atribuição indireta

        String nome = JOptionPane.showInputDialog("Entre com o nome: ");
        mochileira.setNome(nome);
        System.out.println("Nome do objeto é: " + mochileira.getNome());
        //Fazer o mesmo para capturar o cpf deste objeto
        String cpf = JOptionPane.showInputDialog("Entre com o CPF: ");
        mochileira.setCpf(cpf);
        System.out.println("O CPF é: " + mochileira.getCpf());

        //Novo objeto
        nome = JOptionPane.showInputDialog("Qual o seu nome: ");
        // Criando objeto com construtor recebendo nome
        Turista outroTurista = new Turista(nome);
        System.out.println("O nome deste Turista é: " + outroTurista.getNome());
        // Fazer o  recebimento do cpf para este turista
        cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
        if(Validacao.cpf(cpf))
            outroTurista.setCpf(cpf);
        else
        outroTurista.setCpf(Validacao.cpf(cpf));
        System.out.println("O cpf digitado foi: " + cpf);
}