import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws ParseException {

      //instanciação
         Academia c = new Academia("Academia das Super Poderosas", "Avenida céu rua anjos", "777");
         Academia c2 = new Academia("Academia do Ursinho", "Avenida samba in paris", "999");
         
         Scanner teclado = new Scanner(System.in);

       //exibindo dados das academias 
       System.out.println(c.CtoString());
       System.out.println(c2.CtoString());

       //academia 01
       System.out.println("\nDigite os dados do aluno para a "+c.getNome()+ ":");

       System.out.println("Digite o nome: ");
       String nome = teclado.nextLine();

       System.out.println("Digite o nivel: ");
       String nivel = teclado.nextLine();

       System.out.println("Digite a data de nascimento: ");
       String dataNascimento = teclado.nextLine();

       Aluno aluno1 = new Aluno(nome, nivel, dataNascimento);
       c.getAlunos().add(aluno1);


       //academia 02
       System.out.println("\nDigite os dados do aluno para a  "+c2.getNome()+ ":");

       System.out.println("Digite o nome: ");
       String nome2 = teclado.nextLine();

       System.out.println("Digite o nivel: ");
       String nivel2 = teclado.nextLine();

       System.out.println("Digite a data de nascimento: ");
       String dataNascimento2 = teclado.nextLine();

       Aluno aluno2 = new Aluno(nome2, nivel2, dataNascimento2);
       c2.getAlunos().add(aluno2);


      //imprimindo o estado dos dados e os alunos  
         System.out.println(c.CtoString());
         for (Aluno aluno : c.getAlunos()) {
            System.out.println(aluno.AtoString());
         }
         
         System.out.println(c2.CtoString());

         for (Aluno aluno : c2.getAlunos()) {
            System.out.println(aluno.AtoString());
         }

    }
}