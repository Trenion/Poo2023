public class Sapatilha extends Artigo {

    int Tamanho;
    boolean Atacadores;
    String Color;
    


    public Sapatilha( int Tamanho, boolean Atacadores, String Color) {
 
        this.Tamanho = Tamanho;
        this.Atacadores = Atacadores;
        this.Color = Color;
        

    }

    public Sapatilha() {
        this.Atacadores = false;
        this.Tamanho= -1;
        
    }

    public Sapatilha(Sapatilha A) {

        this.Tamanho = A.getTamanho();
        this.Atacadores = A.getAtacadores();
        this.Color = A.getColor();
        

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





    public Sapatilha clone () {
        return new Sapatilha ( this ) ;
        }

    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Sapatilha A = ( Sapatilha ) o ;
        return ( this.Tamanho == A.getTamanho() && this.Atacadores == A.getAtacadores() && this.Color == A.getColor());
    }  

}
