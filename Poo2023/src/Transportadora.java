public class Transportadora {

    String Nome;
    double Pequeno;
    double Medio;
    double Grande;

    public Transportadora(String Nome, double Pequeno, double Medio, double Grande) {
        this.Nome = Nome;
        this.Pequeno = Pequeno;
        this.Medio = Medio;
        this.Grande = Grande;
    }

    public Transportadora() {
    }

    public Transportadora(Transportadora K) {
        this.Nome = K.getNome();
        this.Pequeno = K.getPequeno();
        this.Medio = K.getMedio();
        this.Grande = K.getGrande();
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
    

    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            ", Pequeno='" + getPequeno() + "'" +
            ", Medio='" + getMedio() + "'" +
            ", Grande='" + getGrande() + "'" +
            "}";
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
        return (this.Nome == K.getNome() && this.Pequeno == K.getPequeno() && this.Medio == K.getMedio() && this.Grande == K.getGrande());
    }
}
