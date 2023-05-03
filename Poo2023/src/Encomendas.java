
import java.util.Date;
import java.util.ArrayList;

public class Encomendas {

    
    int codigoUser;
    String transportadoraNome;
    String Dimensao;// tamanho da emcomenda.
    double PreçoF;
    double TaxaSatisfacao;/*com a taxa
    de satisfação de serviço de 0,5 € por cada artigo novo e de 0,25€ por cada artigo usado e ainda os custos
    de expedição (que serão dependentes de transportadora para transportadora). */
    Date Criacao;
    ArrayList<Artigos> artigos= new ArrayList<Artigos>();
    

    public Encomendas() {
    }

    public Encomendas(int codigoUser, String transportadoraNome, String Dimensao, double PreçoF, double TaxaSatisfacao, Date Criacao, ArrayList<Artigos> artigos) {
        this.codigoUser = codigoUser;
        this.transportadoraNome = transportadoraNome;
        this.Dimensao = Dimensao;
        this.PreçoF = PreçoF;
        this.TaxaSatisfacao = TaxaSatisfacao;
        this.Criacao = Criacao;
        this.artigos = artigos;
    }

    public Encomendas(Encomendas E) {
        this.codigoUser = getCodigoUser();
        this.transportadoraNome = getTransportadoraNome();
        this.Dimensao = getDimensao();
        this.PreçoF = getPreçoF();
        this.TaxaSatisfacao = getTaxaSatisfacao();
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

    public double getTaxaSatisfacao() {
        return this.TaxaSatisfacao;
    }

    public void setTaxaSatisfacao(double TaxaSatisfacao) {
        this.TaxaSatisfacao = TaxaSatisfacao;
    }

    public Date getCriacao() {
        return this.Criacao;
    }

    public void setCriacao(Date Criacao) {
        this.Criacao = Criacao;
    }

    public ArrayList<Artigos> getArtigos() {
        return this.artigos;
    }

    public void setArtigos(ArrayList<Artigos> artigos) {
        this.artigos = artigos;
    }
    

    @Override
    public String toString() {
        return "{" +
            " codigoUser='" + getCodigoUser() + "'" +
            ", transportadoraNome='" + getTransportadoraNome() + "'" +
            ", Dimensao='" + getDimensao() + "'" +
            ", PreçoF='" + getPreçoF() + "'" +
            ", TaxaSatisfacao='" + getTaxaSatisfacao() + "'" +
            ", Criacao='" + getCriacao() + "'" +
            ", artigos='" + getArtigos() + "'" +
            "}";
    }
    public Encomendas clone () {
        return new Encomendas ( this ) ;
        }
    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Encomendas E = ( Encomendas ) o ;
        return (this.codigoUser == E.getCodigoUser() && this.transportadoraNome == E.getTransportadoraNome() && this.Dimensao == E.getDimensao() && this.PreçoF == E.getPreçoF() && this.TaxaSatisfacao == E.getTaxaSatisfacao() && this.Criacao == E.getCriacao() && this.artigos == E.getArtigos());
    }

}
