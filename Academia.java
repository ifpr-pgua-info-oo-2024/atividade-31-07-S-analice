import java.util.ArrayList;
import java.util.List;

public class Academia {

    //atributos privados
        private String nome;
        private String endereco;
        private String numero;

    // classe alunos
        List<Aluno> alunos;

    public Academia(String nome, String endereco, String numero ){

    //construtor
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;

    //inicializando a classe de aluno 
        alunos = new ArrayList<>();
    }

    //get (mostra) e set (atribui)
        public String getNome (){
            return this.nome;
        }

        public void setNome (String nome){
             this.nome = nome;
        }

        public String getEndereco (){
            return this.endereco;
        }

        public void setEndereco (String endereco){
             this.endereco = endereco;
        }

        public String getNumero (){
            return this.numero;
        }

        public void setNumero (String numero){
             this.numero = numero;
        }

        public List<Aluno> getAlunos () {
            return alunos;
        }

        public String CtoString(){
            String texto;
    
            texto = "\n Nome da academia: "+nome;
            texto += "\n Endereço da academia: "+endereco;
            texto += "\n Telefone da academia: "+numero;
    
            return texto;
        }

}