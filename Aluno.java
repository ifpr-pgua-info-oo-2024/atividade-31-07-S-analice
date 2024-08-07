// aula do dia 07/08

public class Aluno {

    // atributos
    private String nome;
    private String nivel;
    private String dataNascimento;
    private String genero;
    private double altura;
    private double peso;

    //construtor com todos os atributos
    public Aluno (String nome, String nivel, String dataNascimento, String genero, double altura, double peso) {
        this.nome = nome;
        this.nivel = nivel;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    //construtor só com os atributos obrigatorios
    public Aluno (String nome, String nivel, String dataNascimento) {
        this(nome, nivel, dataNascimento, "", 0, 0);
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String AtoString(){
        String texto;

        texto = "\n Nome do aluno: "+nome;
        texto += "\n Nível do aluno: "+nivel;

        return texto;
    }

}