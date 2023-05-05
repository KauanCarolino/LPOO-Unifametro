package Ex09;

public class AssistenteAdministrativo extends Assistente {
    String turno;
    double addNoturno;

    public AssistenteAdministrativo(int matricula, String turno){
        super(matricula);
        this.turno = turno;
        this.addNoturno = addNoturno;
    }

    @Override
    public double ganhoAnual() {
        if(turno.equals("Noturno")){
            return super.ganhoAnual()+(addNoturno*13);
        }
        return super.ganhoAnual();
    }
}
