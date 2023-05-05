package Aula08;

public class Teste {

    public void fazerAnimalComer(Animal animal){
        animal.comer();
    }

    public static void main(String[] args){
        Teste t = new Teste();
        t.fazerAnimalComer(new Animal());
        t.fazerAnimalComer(new Cao());
        t.fazerAnimalComer(new Tigre());
        t.fazerAnimalComer(new Capivara());
    }
}
