public class Turista {
    //atributos

    private String nome;
    private String cpf;

    //Metodos

    public String viajar(){
        return "Viajando...";
    }

    //Construtor padrao

    Turista(){

    }

    //Sobrecarga de construtor personalizado

    Turista(String _nome){
        this.nome = _nome;

    }

    //Encapsulamento - Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
