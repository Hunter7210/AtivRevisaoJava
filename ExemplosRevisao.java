package AtivRevisao1;

import java.util.Scanner;

public class ExemplosRevisao {
    Scanner sc = new Scanner(System.in); //Classe "nome do obj" = novo "Nome construtor/ msm nome da classe" (System.in) Para entrar os dados. 
    
    //Criar metodos da classe
    public void exemplo1(){ // fala oq ela é (no caso publica) void  Nome da classe
        //Criar um projeto para ler duas notas e a frequencia
        //Faça um algoritimo
        System.out.println("Digite a 1° nota do aluno: "); //Ler a primeira nota
        int nota1 = sc.nextInt();
        System.out.println("Digite a 2° nota do aluno: "); //Ler a segunda nota
        int nota2 = sc.nextInt();
        double media = (nota1+nota2)/2;  // Calcular a media das notas
        System.out.println("A media do aluno é " +media); //Mostar a media calculada
        System.out.println("Informe o total de aulas: "); //Informar o total de aulas
        int aulasDadas = sc.nextInt();
        System.out.println("Informe o n° de faltas do aluno");//Informar a quantidade de faltas do aluno
        int nfaltas = sc.nextInt();
        //Calcular a porcentagem de frequencia
        double frequencia = (aulasDadas-nfaltas)*100/aulasDadas;
        System.out.println("A frenquencia dele é de: " +frequencia+"%");
        //Verificar se (media>=50 e frequencia>=75%){  entao Aluno Aprovado    }     Senao {        entao aluno Reprovado    }
        if (media>=50 && frequencia>=75) 
        {
           System.out.println("Aluno está Aprovado"); 
        }
        else if(media<50 && frequencia>=75) {
            System.out.println("Aluno está em Recuperação");
        }
        else
        {
            System.out.println("Aluno está Reprovado"); 
        }
    }

}
