public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data;

    public Consulta(Paciente paciente, Medico medico, String data) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data: " + data +
                "\nMédico: " + medico.getNome() +
                " (" + medico.getEspecialidade() + ")" +
                "\nHorário de Atendimento: " + medico.getHorarioInicio() + " - " + medico.getHorarioFim() +
                "\nPaciente: " + paciente.getNome() +
                ", CPF: " + paciente.getCpf() +
                ", Idade: " + paciente.getIdade() +
                ", Telefone: " + paciente.getTelefone() + "\n";
    }
}
