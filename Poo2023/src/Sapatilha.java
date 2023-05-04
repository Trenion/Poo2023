public class Sapatilha extends Artigos {

    int Tamanho;
    boolean Atacadores;
    String Color;
    int Year;
    double PrecoBase;
    boolean Premium;
    boolean UsadoS;

    public Sapatilha(String Tipo, int Tamanho, boolean Atacadores, String Color,int Year, double PrecoBase, boolean Premium, boolean UsadoS) {
        this.Tipo = Tipo;
        this.Tamanho = Tamanho;
        this.Atacadores = Atacadores;
        this.Color = Color;
        this.Year = Year;
        this.PrecoBase = PrecoBase;
        this.Premium = Premium;
        this.UsadoS = UsadoS;

    }

    public Sapatilha() {
    }

    public Sapatilha(Sapatilha A) {
        this.Tipo = A.getTipo();
        this.Tamanho = A.getTamanho();
        this.Atacadores = A.getAtacadores();
        this.Color = A.getColor();
        this.Year = A.getYear();
        this.PrecoBase = A.getPrecoBase();
        this.Premium = A.getPremium();
        this.UsadoS = A.getUsadoS();
    }


    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getTamanho() {
        return this.Tamanho;
    }

    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }

    public boolean isAtacadores() {
        return this.Atacadores;
    }

    public boolean getAtacadores() {
        return this.Atacadores;
    }

    public void setAtacadores(boolean Atacadores) {
        this.Atacadores = Atacadores;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getYear() {
        return this.Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public double getPrecoBase() {
        return this.PrecoBase;
    }

    public void setPrecoBase(double PrecoBase) {
        this.PrecoBase = PrecoBase;
    }

    public boolean isPremium() {
        return this.Premium;
    }

    public boolean getPremium() {
        return this.Premium;
    }

    public void setPremium(boolean Premium) {
        this.Premium = Premium;
    }

    public boolean isUsadoS() {
        return this.UsadoS;
    }

    public boolean getUsadoS() {
        return this.UsadoS;
    }

    public void setUsadoS(boolean UsadoS) {
        this.UsadoS = UsadoS;
    }
    

    @Override
    public String toString() {
        return "{" +
            " Tipo='" + getTipo() + "'" +
            ", Tamanho='" + getTamanho() + "'" +
            ", Atacadores='" + isAtacadores() + "'" +
            ", Color='" + getColor() + "'" +
            ", Year='" + getYear() + "'" +
            ", PrecoBase='" + getPrecoBase() + "'" +
            ", Premium='" + isPremium() + "'" +
            ", UsadoS='" + isUsadoS() + "'" +
            "}";
    }

    public Sapatilhas clone () {
        return new Sapatilhas ( this ) ;
        }

    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Sapatilhas A = ( Sapatilhas ) o ;
        return (this.Tipo == A.getTipo() && this.Tamanho == A.getTamanho() && this.Atacadores == A.getAtacadores() && this.Color == A.getColor() && this.Year == A.getYear() && this.PrecoBase == A.getPrecoBase() && this.Premium == A.getPremium() && this.UsadoS == A.getUsadoS());
    }  

}
