

import java.util.HashMap;
import java.util.Map;


public class Encomenda {

    
    int codigoUser;
    String transportadoraNome;
    String Dimensao;// tamanho da emcomenda.
    double PreçoF;
    //double TaxaSatisfacao;
    /*com a taxa
    de satisfação de serviço de 0,5 € por cada artigo novo e de 0,25€ por cada artigo usado e ainda os custos
    de expedição (que serão dependentes de transportadora para transportadora). */
    int Criacao;
    Map<String,Artigo> artigos;
    

    public Encomenda() {
        this.codigoUser=-1;
        this.PreçoF=-1;
        this.Criacao = 2023 ;
        this.artigos= new HashMap<String,Artigo>(); 
    }

    public Encomenda(int codigoUser, String transportadoraNome, String Dimensao, double PreçoF, int Criacao, Map<String,Artigo> artigos) {
        this.codigoUser = codigoUser;
        this.transportadoraNome = transportadoraNome;
        this.Dimensao = Dimensao;
        this.PreçoF = PreçoF;
        this.Criacao = Criacao;
        this.artigos = artigos;
    }

    public Encomenda(Encomenda E) {
        this.codigoUser = getCodigoUser();
        this.transportadoraNome = getTransportadoraNome();
        this.Dimensao = getDimensao();
        this.PreçoF = getPreçoF();
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

    public double getPreçoF() {
        return this.PreçoF;
    }

    public void setPreçoF(double PreçoF) {
        this.PreçoF = PreçoF;
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
        return (this.codigoUser == E.getCodigoUser() && this.transportadoraNome == E.getTransportadoraNome() && this.Dimensao == E.getDimensao() && this.PreçoF == E.getPreçoF() && this.Criacao == E.getCriacao() && this.artigos == E.getArtigos());
    }


    public double precoFinalTotal(double peq,double med,double gra, Map<String,Artigo> artigos){
        double PreçoF=0;
        //artigo novo paga 0.5 e usado 0.25
        for (var entry : artigos.values()) {
            switch(entry.getId()):
                case"Tshirt":
                break;
                case "Mala":
                break;
                case"Sapatilha":
                break;
                default:
            
        }

        return PreçoF;
    }

}
