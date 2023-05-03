public class Malas extends Artigos {

    String Tipo;
    String Tamanho;
    double PrecoBase;
    String Material;
    int Year;
    boolean Premium;
    double Valorizacao;

    public Malas(String Tipo, String Tamanho, double PrecoBase, String Material, int Year, boolean Premium, double Valorizacao) {
        this.Tipo = Tipo;
        this.Tamanho = Tamanho;
        this.PrecoBase = PrecoBase;
        this.Material = Material;
        this.Year = Year;
        this.Premium = Premium;
        this.Valorizacao = Valorizacao;
    }

    public Malas() {
    }

    public Malas(Malas M) {
        this.Tipo = M.getTipo();
        this.Tamanho = M.getTamanho();
        this.PrecoBase = M.getPrecoBase();
        this.Material = M.getMaterial();
        this.Year = M.getYear();
        this.Premium = M.getPremium();
        this.Valorizacao = M.getValorizacao();
    }


    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTamanho() {
        return this.Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }

    public double getPrecoBase() {
        return this.PrecoBase;
    }

    public void setPrecoBase(double PrecoBase) {
        this.PrecoBase = PrecoBase;
    }

    public String getMaterial() {
        return this.Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public int getYear() {
        return this.Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
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

    public double getValorizacao() {
        return this.Valorizacao;
    }

    public void setValorizacao(double Valorizacao) {
        this.Valorizacao = Valorizacao;
    }


    @Override
    public String toString() {
        return "{" +
            " Tipo='" + getTipo() + "'" +
            ", Tamanho='" + getTamanho() + "'" +
            ", PrecoBase='" + getPrecoBase() + "'" +
            ", Material='" + getMaterial() + "'" +
            ", Year='" + getYear() + "'" +
            ", Premium='" + isPremium() + "'" +
            ", Valorizacao='" + getValorizacao() + "'" +
            "}";
    }

    public Malas clone () {
        return new Malas ( this ) ;
        }

    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Malas M = ( Malas ) o ;
        return (this.Tipo == M.getTipo() && this.Tamanho == M.getTamanho() && this.PrecoBase == M.getPrecoBase() && this.Material == M.getMaterial() && this.Year == M.getYear() && this.Premium == M.getPremium() && this.Valorizacao == M.getValorizacao());
    }    
}
