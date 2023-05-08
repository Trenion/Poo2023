import java.io.Serializable;
/*A Vintage especializa-se em três tipos principais de artigos: sapatilhas, t-shirts e malas. Cada um destes
artigos pode ser novo ou usado, sendo neste último caso disponibilizado também uma avaliação do seu estado
e informação sobre o número de donos que já possuiram o artigo. Cada artigo contém uma descrição, uma
marca, um código alfanumérico e um preço base e ainda uma correcção de preço (normalmente um desconto)
que é definida em função de cada tipo de artigo e da sua condição particular.*/
public class Artigo implements Serializable {
    /*fazer Artigos ser uma super class e o resto ser sub-classes*/
    /*realizar aqui a aplicaçao de taxas e do preço final de cada produto na loja */
    //double PrecoComTaxa;/*preço a pagar do produto com as taxas da loja */

    private String id;
    //private int tipo; // 0 -> indefinido, 1 -> sapatilhas, 2 -> tshirts, 3 -> malas
    private boolean usado;
    private String avaliacao;
    private int numDonosPrevios;
    private double precoBase;
    private double precoF;
    private String descricao;
    private String marca;
    private Boolean premium;
    private int ano;
    private String tamanho;
    private double valorizacao;


    public Artigo(String id, boolean usado, String avaliacao, int numDonosPrevios, double precoBase, double precoF, String descricao, String marca, Boolean premium, int ano,String tamanho,double valorizacao) {
        this.id = id;
        this.usado = usado;
        this.avaliacao = avaliacao;
        this.numDonosPrevios = numDonosPrevios;
        this.precoBase = precoBase;
        this.precoF = precoF;
        this.descricao = descricao;
        this.marca = marca;
        this.premium = premium;
        this.ano = ano;
        this.tamanho=tamanho;
        this.valorizacao=valorizacao;
    }
    
    public Artigo(Artigo A) {
        this.id = A.getId();
        this.usado = A.getUsado();
        this.avaliacao = A.getAvaliacao();
        this.numDonosPrevios = A.getNumDonosPrevios();
        this.precoBase =A.getPrecoBase();
        this.precoF = A.getPrecoF();
        this.descricao = A.getDescricao();
        this.marca =A.getMarca();
        this.premium = A.getPremium();
        this.ano = A.getAno();
        this.tamanho=A.getTamanho();
        this.valorizacao=A.getValorizacao();
    }

    public Artigo () {
        this.numDonosPrevios= -1;
        this.premium = false;
        this.usado = false;
        this.precoBase = 0.00;
        this.precoF = 0.00;
        this.ano = 2023;
        this.valorizacao=0.00;
    }

    public double getValorizacao() {
        return this.valorizacao;
    }

    public void setValorizacao(double valorizacao) {
        this.valorizacao = valorizacao;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isUsado() {
        return this.usado;
    }

    public boolean getUsado() {
        return this.usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public String getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getNumDonosPrevios() {
        return this.numDonosPrevios;
    }

    public void setNumDonosPrevios(int numDonosPrevios) {
        this.numDonosPrevios = numDonosPrevios;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getPrecoF() {
        return this.precoF;
    }

    public void setPrecoF(double precoF) {
        this.precoF = precoF;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean isPremium() {
        return this.premium;
    }

    public Boolean getPremium() {
        return this.premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }



    public Artigo clone () {
        return new Artigo ( this ) ;
        }



    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Artigo A = ( Artigo ) o ;
        return ( this.id == A.getId() && this.usado == A.getUsado() && this.avaliacao == A.getAvaliacao() && this.numDonosPrevios == A.getNumDonosPrevios() && this.precoBase ==A.getPrecoBase() && this.precoF == A.getPrecoF() && this.descricao == A.getDescricao() && this.marca ==A.getMarca() && this.premium == A.getPremium() && this.ano == A.getAno()&& this.tamanho == A.getTamanho() && this.valorizacao == A.getValorizacao()  );
    }


    public static double precoNoBalcao(String id,boolean usado, boolean premium,double precoOG, double valorizacao, int ano){

        double precoAPagar =precoOG;

        if(id.equals("Tshirt")){
             precoAPagar = precoAPagar/2.00;
            }
        else if(usado == true && premium == true){
            precoAPagar = precoOG + (precoOG*((2023-ano)/2023)* valorizacao)/2;
        }
        else if(usado == false && premium == true){
            precoAPagar = precoOG + precoOG*((2023-ano)/2023)* valorizacao;
        }
        else if(usado == true && premium == false){
            precoAPagar = precoOG - precoOG*((2023-ano)/2023)* valorizacao;
        }
        else {
            precoAPagar= -1;
        }

        return precoAPagar;
    }




   
}
