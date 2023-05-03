public class Shirt extends Artigos {

    String Tipo;
    String Tamanho;
    String Padrao;
    double PrecoBaseT;
    boolean Usado;

    public Shirt(String Tipo, String Tamanho, String Padrao, double PrecoBaseT, boolean Usado){
        this.Tipo = Tipo;
        this.Tamanho = Tamanho;
        this.Padrao = Padrao;
        this.PrecoBaseT = PrecoBaseT;
        this.Usado = Usado;
    }

    public Shirt() {
    }
    
    public Shirt ( Shirt T ) {
        this.Tipo = T.getTipo();
        this.Tamanho = T.getTamanho();
        this.Padrao = T.getPadrao();
        this.PrecoBaseT = T.getPrecoBaseT();
        this.Usado = T.getUsado();
        }
        

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }


    public boolean isUsado() {
        return this.Usado;
    }

    public boolean getUsado() {
        return this.Usado;
    }

    public void setUsado(boolean Usado) {
        this.Usado = Usado;
    }

    public String getTamanho() {
        return this.Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }

    public String getPadrao() {
        return this.Padrao;
    }

    public void setPadrao(String Padrao) {
        this.Padrao = Padrao;
    }

    public double getPrecoBaseT() {
        return this.PrecoBaseT;
    }

    public void setPrecoBaseT(double PrecoBaseT) {
        this.PrecoBaseT = PrecoBaseT;
    }


    @Override
    public String toString() {
        return "{" +
            " Tipo='" + getTipo() + "'" +
            ", Tamanho='" + getTamanho() + "'" +
            ", Padrao='" + getPadrao() + "'" +
            ", PrecoBaseT='" + getPrecoBaseT() + "'" +
            ", Usado='" + isUsado() + "'" +
            "}";
    }
    //equals 
    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Shirt T = ( Shirt ) o ;
        return ( this.Tipo == T.getTipo() && this.Tamanho == T.getTamanho() && this.Padrao == T.getPadrao() && this.PrecoBaseT == T.getPrecoBaseT() && this.Usado == T.getUsado() ) ;
        }
           
        // clone
    public Shirt clone () {
        return new Shirt ( this ) ;
        }
        
}
