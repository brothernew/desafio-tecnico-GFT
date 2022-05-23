import desafios.Macaco;
import desafios.NumeroReverso;
import desafios.funcionarios.Consultor;
import desafios.funcionarios.Vendedor;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        //NumeroReverso.numeroReverso();
        //Macaco macaco1 = new Macaco();
        //Macaco macaco2 = new Macaco();

        //System.out.println("Macaco 1: ");
        //macaco1.comer("Banana");
        //macaco1.comer("Abacaxi");
        //macaco1.comer("Uva");
        //macaco1.digerir();

        //System.out.println("\nMacaco 2: ");
        //macaco2.comer("Banana");
        //macaco2.comer("Maça");

        //macaco2.digerir();

        Vendedor vendedor = new Vendedor("Thiago", 11234567890L, 10d, 5);
        System.out.println("Salário do Vendedor é:"+"\n"+"R$"+vendedor.calcularSalario());

        Consultor consultor = new Consultor("Adriana", 23456789123L, 100.5d, 10);
        System.out.println("Salário do Consultor é: "+"\n"+"R$"+consultor.calcularSalario());
    }
}