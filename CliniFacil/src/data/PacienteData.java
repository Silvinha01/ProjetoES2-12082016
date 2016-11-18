package data;

import java.util.ArrayList;
import java.util.List;
import model.Paciente;


public class PacienteData {
    private List<Paciente> listaPacientes = new ArrayList<>();
    
    public void add(Paciente paciente) {
        listaPacientes.add(paciente);
    }
}
