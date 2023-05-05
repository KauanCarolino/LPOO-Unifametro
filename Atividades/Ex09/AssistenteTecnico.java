package Ex09;

public class AssistenteTecnico extends Assistente {
    double bonus;

    public AssistenteTecnico(int matricula, double bonus){
        super(matricula);
        this.bonus = bonus;
    }

    public double ganhoAnual(){
        return super.ganhoAnual()+(bonus*13);

    }
}
