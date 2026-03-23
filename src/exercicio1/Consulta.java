package exercicio1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private float ValorConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, Medico medico, float valorConsulta, Paciente paciente) {
        this.data = data;
        this.medico = medico;
        ValorConsulta = valorConsulta;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public float getValorConsulta() {
        return ValorConsulta;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setValorConsulta(float valorConsulta) {
        ValorConsulta = valorConsulta;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString(){
        DateTimeFormatter formatobr = DateTimeFormatter.ofPattern("dd/MM/yyyy 'ás' HH'h'mm");
        return "Consulta{" +
                "data =" + data.format(formatobr) +
                ", ValorConsulta =" + ValorConsulta +
                ", medico =" + medico +
                ", paciente =" + paciente +
                '}';
    }
}