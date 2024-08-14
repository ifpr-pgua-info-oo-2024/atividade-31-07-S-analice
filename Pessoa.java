import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {

    protected String nome;
    protected Date dataNascimento;
    protected String genero;
    protected double altura;
    protected double peso;

    public Pessoa (String nome, String dataNascimento, String genero, double altura, double peso) throws ParseException {

        //construtor
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = converterStringToDate(dataNascimento);
        this.altura = altura;
        this.peso = peso;
    } 

    //dados obrigatorios
    public Pessoa(String nome, String dataNascimento) throws ParseException {
        this(nome, dataNascimento," ", 0, 0);
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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

    //método de converção
    public static Date converterStringToDate (String dataNascimento) throws ParseException {

        //instancia
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(dataNascimento);
    }

    //método de converção
    public static String converterDateToString(Date dataNascimento) throws ParseException {

        //instancia
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(dataNascimento);
    }

    //método de calcular idade
    public static int calcularIdade (Date dataNascimento) throws ParseException{

        Date dataHoje = new Date();

        //calcula a diferença em milissigundos entre as duas datas   
        long diffInMillies = Math.abs(dataHoje.getTime() - dataNascimento.getTime());

        //calcula a diferença de milissegundos para dias
        long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        //calcula a diferença de dias para anos
        long diffInYears = diffInDays / 365; 

        return (int) diffInYears;
    } 


    public String PtoString() throws ParseException {

        String dataNascimento = "";

       
       dataNascimento = converterDateToString(this.dataNascimento);
      

        return "\nNome: " + nome +
               "\nIdade: " +dataNascimento+
               "\nGenero: " +genero+
               "\nAltura:" +altura+ 
               "\nPeso: " + peso;
    }

}