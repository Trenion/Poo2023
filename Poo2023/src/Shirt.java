public class Shirt extends Artigo {

    String Tamanho;
    String Padrao;

    public Shirt(String Tamanho, String Padrao){
        
        this.Tamanho = Tamanho;
        this.Padrao = Padrao;
        
    }

    public Shirt() {
    }
    
    public Shirt ( Shirt T ) {

        this.Tamanho = T.getTamanho();
        this.Padrao = T.getPadrao();

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


    //equals 
    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Shirt T = ( Shirt ) o ;
        return ( this.Tamanho == T.getTamanho() && this.Padrao == T.getPadrao() ) ;
        }
           
        // clone
    public Shirt clone () {
        return new Shirt ( this ) ;
        }
        
}
