public class Academia {

    //atributos privados
        private String nome;
        private String endereco;
        private String numero;

    public Academia(String nome, String endereco, String numero ){

    //construtor
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
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

        public String toString(){
            String texto;
    
            texto = "\n Nome da academia: "+nome;
            texto += "\n Endereço da academia: "+endereco;
            texto += "\n Telefone da academia: "+numero;
    
            return texto;
        }
}