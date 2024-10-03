public class Main {
    public static void main(String[] args) {
        Medico lucas = new Medico("Lucas", "Neurologista");
        Medico roberto = new Medico("Roberto", "Psiquiatria");

        Paciente p1 = new Paciente("João", "123123123", 20, "81943029423");
        Paciente p2 = new Paciente("Vinícius", "12312234", 32, "8792423987");
        Paciente p3 = new Paciente("Marcus", "14353465", 22, "8189238482");
        Paciente p4 = new Paciente("Marta", "54645654", 47, "8199874327");
        Paciente p5 = new Paciente("Joana", "65465452", 37, "8194227723"); 
        
        Agenda agenda1 = new Agenda(lucas);
        agenda1.setData("02/10/2024");
        agenda1.adicionar(p5);
        agenda1.adicionar(p4);
        agenda1.apresentarListaDePacientes();
        
        Agenda agenda2 = new Agenda(roberto);
        agenda2.setData("03/10/2024");
        agenda2.adicionar(p1);
        agenda2.adicionar(p2);
        agenda2.adicionar(p3);
        agenda2.apresentarListaDePacientes();
    }
}
