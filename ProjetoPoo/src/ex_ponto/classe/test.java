package ProjetoPoo.src.ex_ponto.classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
     
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Residencial minhaCasa = new Residencial("Casa do Beto",true);
        // System.out.print("Digite o valor da casa: ");
        double valor = 1200;
        minhaCasa.setValor(valor);
        System.out.println("valor da residencia: " + minhaCasa.alterarValor());
        System.out.println("valor do desconto: " + minhaCasa.descontoVista());
        
        
        Comercial comercialElo = new Comercial();
        comercialElo.setValor(3000);
        System.out.println("valor da casa: " + comercialElo.alterarValor());
        System.out.println("valor do desconto: " + comercialElo.descontoVista());

        System.out.println(comercialElo.alterarValor());

        Comercial comercialBruno = new Comercial();
        Comercial comercialBeto = new Comercial();
        Comercial comercialAndre = new Comercial();
        Comercial comercialAna = new Comercial();


        List<Comercial> listaComercial = new ArrayList<Comercial>();
        listaComercial.add(comercialBruno);
        listaComercial.add(comercialBeto);
        listaComercial.add(comercialAndre);
        listaComercial.add(comercialElo);
        listaComercial.add(comercialAna);
         

        for(int i=0; i<listaComercial.size(); i++) {
            listaComercial.get(i).getValor();
        }

        

        for (Comercial c : listaComercial){
            c.getValor();
        }

    }
}
