import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

    //instanciação
       Academia c = new Academia("Academia das Super Poderosas", "Avenida céu rua anjos", "777");
       Academia c2 = new Academia("Academia do Ursinho", "Avenida samba in paris", "999");

       Aluno aluno1 = new Aluno("Analice", "médio", "20/03/2008");
       Aluno aluno2 = new Aluno("Heloisa", "intermédiario", "17/03/2008");
       Aluno aluno3 = new Aluno("Bruna", "médio", "30/04/2007");

       Aluno aluno4 = new Aluno("Lyza", "superior", "14/04/2007");
       Aluno aluno5 = new Aluno("Loh", "médio", "04/10/2007");
       Aluno aluno6 = new Aluno("Aninha", "médio", "20/08/2007");
      
       //cadastrando alunos
       c.alunos.add(aluno1);
       c.alunos.add(aluno2);
       c.alunos.add(aluno3);

       c2.alunos.add(aluno4);
       c2.alunos.add(aluno5);
       c2.alunos.add(aluno6);

      //immprimindo o estado dos dados
         System.out.println(c.CtoString());
         System.out.println(c2.CtoString());

         c.setNome ("Academia do Dean");
         c.setEndereco ("Rua do castiel");
         c.setNumero  ("111");

         c2.setNome ("Academia do Sam");
         c2.setEndereco ("Rua da ruby");
         c2.setNumero ("666");

      //imprimindo o estado dos dados alterados e os alunos  
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
