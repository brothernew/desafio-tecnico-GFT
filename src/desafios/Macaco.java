package desafios;

/*
Classe Macaco:
Faça um programa e teste interativamente uma classe que modele um macaco com os
atributos “nome” e “bucho” (estômago) e os métodos “comer”, “verBucho” e “digerir”.
Regras:
a) Crie 2 macacos;
b) Considere que a quantidade máxima de alimentos é 3. Com isso, lembre-se de verificar o conteúdo do estômago
a cada refeição (método “comer”). Por fim, o método “digerir” deve esvaziar o bucho do Macaco;
c) Alimentos “digeríveis” devem ser do tipo String, garanta isso em seu código para que não
haja nenhum Macaco canibal 🙈.
 */

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    //atributos
    private String nome;
    private List<String> bucho = new ArrayList<>();

    //metodos
    //1 - comer
    //2 - digerir
    public void comer(String comida){
        if(bucho.size() == 3){
            System.out.println("Bucho cheio !!!");
        }else{
            bucho.add(comida);
        }
        System.out.println(bucho);
    }

    public void digerir(){
        if(bucho.isEmpty()){
            System.out.println("Bucho está vazio: ");
        }else {
            bucho.remove(bucho.get(0));

        }
        System.out.println(bucho);
    }
}
