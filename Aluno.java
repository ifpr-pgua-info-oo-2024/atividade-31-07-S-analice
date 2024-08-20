import java.text.ParseException;

public class Aluno extends Pessoa {

    // atributos
    private String nivel;

    //construtor com todos os atributos
    public Aluno (String nome, String nivel, String dataNascimento, String genero, double altura, double peso) throws ParseException {
        super(nome, dataNascimento, genero, altura, peso);
        this.nivel = nivel;
    }

    //atributos obrigatorios
    public Aluno(String nome, String nivel, String dataNascimento) throws ParseException {
        this(nome, nivel, dataNascimento, "", 0, 0);
    }

    //get e set
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public String AtoString() throws ParseException {
        return super.toString() + "\nNivel: "+nivel;
    }

}