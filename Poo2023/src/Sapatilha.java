public class Sapatilha extends Artigo {

  
    boolean Atacadores;
    String Color;
    


    public Sapatilha(  boolean Atacadores, String Color) {
 
        ;
        this.Atacadores = Atacadores;
        this.Color = Color;
        

    }

    public Sapatilha() {
        this.Atacadores = false;
        
        
    }

    public Sapatilha(Sapatilha A) {

        
        this.Atacadores = A.getAtacadores();
        this.Color = A.getColor();
        

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
        return (  this.Atacadores == A.getAtacadores() && this.Color == A.getColor());
    }  

}
