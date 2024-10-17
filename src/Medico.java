public class Medico {
    private String nome;
    private String especialidade;
    private String horarioInicio;
    private String horarioFim;

    public Medico(String nome, String especialidade, String horarioInicio, String horarioFim) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    @Override
    public String toString() {
        return "Dr. " + nome + " - " + especialidade + " (Atende das " + horarioInicio + " às " + horarioFim + ")";
    }
}
