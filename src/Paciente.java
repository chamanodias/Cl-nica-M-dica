public class Paciente {
    private String nome;
    private final String cpf;
    private int idade;
    private String telefone_cell;

    public Paciente(String nome, String cpf, int idade, String telefone_cell) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone_cell = telefone_cell;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone_cell;
    }
}
