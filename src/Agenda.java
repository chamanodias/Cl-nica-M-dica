import java.util.ArrayList;
public class Agenda {
    private String data;
    private ArrayList<Paciente> pacientes;
    private Medico medico;

    public Agenda(Medico medico){
        pacientes = new ArrayList<Paciente>();
        data = "";
        this.medico = medico; 

    }
    public void adicionar(Paciente p){
        pacientes.add(p);
    }
    public void remover(String cpf){
        for (int i=0; i<pacientes.size(); i++){
            if(pacientes.get(i).getCpf().equals(cpf)){
                System.out.println(pacientes.get(i).getNome()+"foi removido com sucesso");
            }
        }
    }

    public void pesquisar(String cpf){
        for (int i=0; i<pacientes.size(); i++){
            if(pacientes.get(i).getCpf().equals(cpf)){
                System.out.println(pacientes.get(i).getNome());
                System.out.println(pacientes.get(i).getTelefone());
                System.out.println(pacientes.get(i).getIdade());
                i = pacientes.size();

            }
        }
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public ArrayList<Paciente> gPacientes(){
        return pacientes;
    }
    public void setPacientes(ArrayList<Paciente> pacientes){
        this.pacientes = pacientes;
    }
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    public void apresentarListaDePacientes() {
        System.out.println("Data do atendimento: " + data + ", Médico: " + medico.getNome()+", "+medico.getEspecialidade());
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente p = pacientes.get(i);
            System.out.println((i + 1) + ", " + p.getNome() + ", " + p.getTelefone() + ", " + p.getCpf() + ", " + p.getIdade());
        }
    }
    
}
