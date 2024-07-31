public class Main {
    
    
    public static void main(String[] args) {

    //instanciação
       Academia c = new Academia("Academia das Super Poderosas", "Avenida céu rua anjos", "777");
       Academia c2 = new Academia("Academia do Ursinho", "Avenida samba in paris", "999");
      
    //immprimindo o estado dos dados
       System.out.println(c.toString());
       System.out.println(c2.toString());

       c.setNome ("Academia do Dean");
       c.setEndereco ("Rua do castiel");
       c.setNumero  ("111");

       c2.setNome ("Academia do Sam");
       c2.setEndereco ("Rua da ruby");
       c2.setNumero ("666");

    //imprimindo o estado dos dados alterados
       System.out.println(c.toString());
       System.out.println(c2.toString());
    }
 
}
