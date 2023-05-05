public class Shirt extends Artigo {


    String Padrao;

    public Shirt(String Padrao){
        
       
        this.Padrao = Padrao;
        
    }

    public Shirt() {
    }
    
    public Shirt ( Shirt T ) {

        
        this.Padrao = T.getPadrao();

        }
   
    

    public String getPadrao() {
        return this.Padrao;
    }

    public void setPadrao(String Padrao) {
        this.Padrao = Padrao;
    }


    //equals 
    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Shirt T = ( Shirt ) o ;
        return ( this.Padrao == T.getPadrao() ) ;
        }
           
        // clone
    public Shirt clone () {
        return new Shirt ( this ) ;
        }
        
}
