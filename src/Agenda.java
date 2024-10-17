import java.util.ArrayList;

public class Agenda {
    private ArrayList<Consulta> consultasRealizadas;
    private ArrayList<Medico> medicos;
    
    public void listarMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("Não há médicos cadastrados.");
        } else {
            System.out.println("==> Lista de Médicos <==");
            for (int i = 0; i < medicos.size(); i++) {
                Medico medico = medicos.get(i);
                System.out.println((i + 1) + ". Nome: " + medico.getNome() +
                        ", Especialidade: " + medico.getEspecialidade() +
                        ", Horário de Atendimento: " + medico.getHorarioInicio() + " - " + medico.getHorarioFim());
            }
        }
    }
    

    public Agenda() {
        consultasRealizadas = new ArrayList<>();
        medicos = new ArrayList<>();
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void agendarConsulta(Paciente paciente, Medico medico, String data) {
        Consulta consulta = new Consulta(paciente, medico, data);
        consultasRealizadas.add(consulta);
        System.out.println("Consulta agendada para " + paciente.getNome() + " com " + medico.getNome() + " em " + data);
    }

    public void listarConsultas() {
        if (consultasRealizadas.isEmpty()) {
            System.out.println("Nenhuma consulta foi agendada ainda.");
            return;
        }
        for (Consulta consulta : consultasRealizadas) {
            System.out.println(consulta);
        }
    }

    public void buscarPaciente(String cpf) {
        boolean encontrado = false;
        for (Consulta consulta : consultasRealizadas) {
            if (consulta.getPaciente().getCpf().equals(cpf)) {
                System.out.println("Consulta encontrada:");
                System.out.println(consulta);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum paciente encontrado com o CPF " + cpf);
        }
    }

    public void gerarRelatorioConsultas() {
        System.out.println("==> Relatório de Consultas Realizadas <==");
        if (consultasRealizadas.isEmpty()) {
            System.out.println("Não há consultas realizadas.");
            return;
        }
        for (Consulta consulta : consultasRealizadas) {
            System.out.println(consulta);
        }
    }
}
