package segundatarefa;

import java.util.Scanner;
import java.util.ArrayList;

public class ClassMain {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        ArrayList<Cidade> listaDeCidades = new ArrayList();
        Cidade cidade  = new Cidade();
        int menu = 0;

        System.out.println("Digite 1 para inserir cidades ou 0 para sair!");
        menu = read.nextInt();
        read.nextLine();
            
        while(menu != 0){
            System.out.println("Bem vindo ao sistema de cadastros de cidades!");
            System.out.println("Digite o nome da cidade: ");
            cidade.setNome(read.nextLine());

            System.out.println("Digite o nome do estado: ");
            cidade.setUf(read.nextLine());

            System.out.println("Digite a população dessa cidade: ");
            cidade.setPopulacao(read.nextFloat());

            listaDeCidades.add(cidade);
            cidade = new Cidade();

            System.out.println("Digite 1 para cadastrar usuários ou 0 para sair!");
            menu = read.nextInt();
            read.nextLine();
       
        }
        
        System.out.println("As cidades cadastradas foram:");
        
        for (int i=0; i< listaDeCidades.size();i++){
            cidade = listaDeCidades.get(i); 
            System.out.println("Cidade: "+cidade.getNome()+"\t"+"Estado: "+cidade.getUf()+"\t"+"População: "+cidade.getPopulacao()+"\t");
        }
        
    }   
}