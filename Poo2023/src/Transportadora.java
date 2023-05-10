import java.io.Serializable;
public class Transportadora implements Serializable {

    String Nome;
    double Pequeno;
    double Medio;
    double Grande;
    Boolean premium ;

    public Transportadora(String Nome, double Pequeno, double Medio, double Grande,Boolean premium ) {
        this.Nome = Nome;
        this.Pequeno = Pequeno;
        this.Medio = Medio;
        this.Grande = Grande;
        this.premium = premium;
    }

    public Transportadora() {
        this.Pequeno = -1;
        this.Medio = -1;
        this.Grande = -1;
        this.premium = false;
    }

    public Transportadora(Transportadora K) {
        this.Nome = K.getNome();
        this.Pequeno = K.getPequeno();
        this.Medio = K.getMedio();
        this.Grande = K.getGrande();
        this.premium = K.getPremium();
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


    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPequeno() {
        return this.Pequeno;
    }

    public void setPequeno(double Pequeno) {
        this.Pequeno = Pequeno;
    }

    public double getMedio() {
        return this.Medio;
    }

    public void setMedio(double Medio) {
        this.Medio = Medio;
    }

    public double getGrande() {
        return this.Grande;
    }

    public void setGrande(double Grande) {
        this.Grande = Grande;
    }
    


    public Transportadora clone () {
        return new Transportadora ( this ) ;
        }
    
    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Transportadora K = ( Transportadora ) o ;
        return (this.Nome == K.getNome() && this.Pequeno == K.getPequeno() && this.Medio == K.getMedio() && this.Grande == K.getGrande() && this.premium == K.getPremium());
    }
}
