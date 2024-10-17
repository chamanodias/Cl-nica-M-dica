import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("=====================================");
        System.out.println("  Bem-vindo ao Sistema de Consultas  ");
        System.out.println("=====================================");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar médico");
            System.out.println("2. Agendar consulta");
            System.out.println("3. Buscar paciente por CPF");
            System.out.println("4. Listar todas as consultas");
            System.out.println("5. Listar médicos");
            System.out.println("6. Gerar relatório de consultas realizadas");
            System.out.println("7. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner
            System.out.println("-------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println("==> Cadastro de Médico <==");
                    System.out.print("Nome do médico: ");
                    String nomeMedico = scanner.nextLine();
                    System.out.print("Especialidade do médico: ");
                    String especialidade = scanner.nextLine();
                    System.out.print("Horário de início do atendimento (HH:mm): ");
                    String horarioInicio = scanner.nextLine();
                    System.out.print("Horário de término do atendimento (HH:mm): ");
                    String horarioFim = scanner.nextLine();
                    Medico medico = new Medico(nomeMedico, especialidade, horarioInicio, horarioFim);
                    agenda.cadastrarMedico(medico);
                    System.out.println("Médico cadastrado com sucesso!");
                    System.out.println("-------------------------------------");
                    break;

                case 2:
                    System.out.println("==> Agendamento de Consulta <==");
                    if (agenda.getMedicos().isEmpty()) {
                        System.out.println("Não há médicos cadastrados. Cadastre um médico primeiro.");
                        System.out.println("-------------------------------------");
                        break;
                    }

                    agenda.listarMedicos();
                    System.out.print("Escolha o médico para a consulta (digite o número): ");
                    int medicoIndex = scanner.nextInt() - 1;
                    scanner.nextLine();  // Limpar o buffer

                    if (medicoIndex < 0 || medicoIndex >= agenda.getMedicos().size()) {
                        System.out.println("Opção inválida.");
                        System.out.println("-------------------------------------");
                        break;
                    }

                    Medico selectedMedico = agenda.getMedicos().get(medicoIndex);

                    System.out.print("Nome do paciente: ");
                    String nomePaciente = scanner.nextLine();
                    System.out.print("CPF do paciente: ");
                    String cpfPaciente = scanner.nextLine();
                    System.out.print("Idade do paciente: ");
                    int idadePaciente = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer
                    System.out.print("Telefone do paciente: ");
                    String telefonePaciente = scanner.nextLine();
                    Paciente paciente = new Paciente(nomePaciente, cpfPaciente, idadePaciente, telefonePaciente);

                    System.out.print("Data da consulta (dd/mm/yyyy): ");
                    String dataConsulta = scanner.nextLine();
                    
                    agenda.agendarConsulta(paciente, selectedMedico, dataConsulta);
                    System.out.println("Consulta agendada com sucesso!");
                    System.out.println("-------------------------------------");
                    break;

                case 3:
                    System.out.println("==> Buscar Paciente <==");
                    System.out.print("Digite o CPF do paciente para buscar: ");
                    String cpfBusca = scanner.nextLine();
                    agenda.buscarPaciente(cpfBusca);
                    System.out.println("-------------------------------------");
                    break;

                case 4:
                    System.out.println("==> Lista de Consultas <==");
                    agenda.listarConsultas();
                    System.out.println("-------------------------------------");
                    break;

                case 5:
                    System.out.println("==> Lista de Médicos <==");
                    agenda.listarMedicos();
                    System.out.println("-------------------------------------");
                    break;

                case 6:
                    System.out.println("==> Relatório de Consultas Realizadas <==");
                    agenda.gerarRelatorioConsultas();
                    System.out.println("-------------------------------------");
                    break;

                case 7:
                    System.out.println("Encerrando o sistema. Até mais!");
                    System.out.println("=====================================");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("-------------------------------------");
            }
        }
    }
}

