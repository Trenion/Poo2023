public class Mala extends Artigo {

 
    
    String Material;



    public Mala( String Material) {
        
        
        this.Material = Material;
      

    }

    public Mala() {
    }

    public Mala(Mala M) {
    
        
        
        this.Material = M.getMaterial();
       

    }


    public String getMaterial() {
        return this.Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }



    public Mala clone () {
        return new Mala ( this ) ;
        }

    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Mala M = ( Mala ) o ;
        return ( this.Material == M.getMaterial());
    }    
}
