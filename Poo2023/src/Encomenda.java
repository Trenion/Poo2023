
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class Encomenda implements Serializable {

    
    int codigoUser;
    String transportadoraNome;
    String Dimensao;// tamanho da emcomenda.
    double PrecoF;
    //double TaxaSatisfacao;
    /*com a taxa
    de satisfação de serviço de 0,5 € por cada artigo novo e de 0,25€ por cada artigo usado e ainda os custos
    de expedição (que serão dependentes de transportadora para transportadora). */
    int Criacao;
    Map<String,Artigo> artigos;
    

    public Encomenda() {
        this.codigoUser=-1;
        this.PrecoF=-1;
        this.Criacao = 2023 ;
        this.artigos= new HashMap<String,Artigo>(); 
    }

    public Encomenda(int codigoUser, String transportadoraNome, String Dimensao, double PrecoF, int Criacao, Map<String,Artigo> artigos) {
        this.codigoUser = codigoUser;
        this.transportadoraNome = transportadoraNome;
        this.Dimensao = Dimensao;
        this.PrecoF = PrecoF;
        this.Criacao = Criacao;
        this.artigos = artigos;
    }

    public Encomenda(Encomenda E) {
        this.codigoUser = getCodigoUser();
        this.transportadoraNome = getTransportadoraNome();
        this.Dimensao = getDimensao();
        this.PrecoF = getPrecoF();
        this.Criacao = getCriacao();
        this.artigos = getArtigos();
    }

    public int getCodigoUser() {
        return this.codigoUser;
    }

    public void setCodigoUser(int codigoUser) {
        this.codigoUser = codigoUser;
    }

    public String getTransportadoraNome() {
        return this.transportadoraNome;
    }

    public void setTransportadoraNome(String transportadoraNome) {
        this.transportadoraNome = transportadoraNome;
    }

    public String getDimensao() {
        return this.Dimensao;
    }

    public void setDimensao(String Dimensao) {
        this.Dimensao = Dimensao;
    }

    public double getPrecoF() {
        return this.PrecoF;
    }

    public void setPrecoF(double PrecoF) {
        this.PrecoF = PrecoF;
    }

 

    public int getCriacao() {
        return this.Criacao;
    }

    public void setCriacao(int Criacao) {
        this.Criacao = Criacao;
    }

    public Map<String,Artigo> getArtigos() {
        return this.artigos;
    }

    public void setArtigos(Map<String,Artigo> artigos) {
        this.artigos = artigos;
    }
    


    public Encomenda clone () {
        return new Encomenda ( this ) ;
        }

    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Encomenda E = ( Encomenda ) o ;
        return (this.codigoUser == E.getCodigoUser() && this.transportadoraNome == E.getTransportadoraNome() && this.Dimensao == E.getDimensao() && this.PrecoF == E.getPrecoF() && this.Criacao == E.getCriacao() && this.artigos == E.getArtigos());
    }


    public static double precoFinalTotal(double peq,double med,double gra,Boolean premium, Map<String,Artigo> artigos){
        double PrecoF=0;
        //artigo novo paga 0.5 e usado 0.25
        for (var entry : artigos.values()) {
            double low = 0.25;
            double high= 0.50;
            if(premium){
                low = 4* low;
                high = 4* high;
            }
            
                    if(entry.getUsado()==true){
                        PrecoF=PrecoF+low;
                    }else{
                        PrecoF=PrecoF+high;
                    }
                    if(entry.getTamanho()=="M" || entry.getTamanho()=="38"|| entry.getTamanho()=="39"|| entry.getTamanho()=="40"|| entry.getTamanho()=="41"){
                        PrecoF= PrecoF+ med + entry.precoNoBalcao(entry.getId(),entry.getUsado(),entry.getPremium(),entry.getPrecoBase(), entry.getValorizacao(), entry.getAno(), ((Shirt) entry).getPadrao());
                    }else if(entry.getTamanho()=="S" || entry.getTamanho()=="XS" || Double.valueOf(entry.getTamanho())<38){
                        PrecoF= PrecoF+ peq + entry.precoNoBalcao(entry.getId(),entry.getUsado(),entry.getPremium(),entry.getPrecoBase(), entry.getValorizacao(), entry.getAno(),((Shirt) entry).getPadrao());
                    }else{
                        PrecoF= PrecoF+ gra + entry.precoNoBalcao(entry.getId(),entry.getUsado(),entry.getPremium(),entry.getPrecoBase(), entry.getValorizacao(), entry.getAno(),((Shirt) entry).getPadrao());
                    }    
        }
        return PrecoF;
    }

}
