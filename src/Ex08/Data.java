package Ex08;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) throws IllegalArgumentException{
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
      verificarDataValida();
    }

    public void verificarDataValida() throws IllegalArgumentException{
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            diasPorMes[1] = 29;
        }
        if(mes < 1 || mes > 12 || dia < 1 || dia > diasPorMes[mes - 1]){
            throw new IllegalArgumentException("Ex04.Data inválida");
        }
    }
}
