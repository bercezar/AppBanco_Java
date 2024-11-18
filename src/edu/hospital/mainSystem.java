package edu.hospital;


public class mainSystem {
    
    public static void main(String[] args){
        Base base = new Base();
        base.createDate();

        Paciente bernardo = new Paciente(1,98,1.98);
        Paciente joao = new Paciente(2,78,1.68);
        Paciente camila = new Paciente(3,78,1.75);

        bernardo.addPaciente(bernardo);
        camila.addPaciente(camila);
        joao.addPaciente(joao);

        joao.atualizarPaciente(2, 85, 1.79);
        camila.atualizarPaciente(3, 45, 1.55);
        camila.listarPacientes();
    }
}
