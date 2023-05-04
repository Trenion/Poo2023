public class Mala extends Artigo {

 
    String Tamanho;
    String Material;



    public Mala(String Tamanho, String Material) {
        
        this.Tamanho = Tamanho;
        this.Material = Material;
      

    }

    public Mala() {
    }

    public Mala(Mala M) {
    
        this.Tamanho = M.getTamanho();
        
        this.Material = M.getMaterial();
       

    }

    public String getTamanho() {
        return this.Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
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
        return (this.Tamanho == M.getTamanho() && this.Material == M.getMaterial());
    }    
}
