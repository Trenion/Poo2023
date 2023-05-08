public class Mala extends Artigo {

 
    
    String Material;



    public Mala(String id, boolean usado, String avaliacao, int numDonosPrevios, double precoBase, double precoF, String descricao, String marca, Boolean premium, int ano,String tamanho,double valorizacao, String Material) {
        
        super(id,usado,avaliacao, numDonosPrevios,  precoBase, precoF, descricao,  marca,  premium,  ano, tamanho, valorizacao);
        this.Material = Material;
      

    }

    public Mala() {
        super();
    }

    public Mala(Mala M) {
    
        
        super(M);
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
        if (! super.equals(o)) return false;
        Mala M = ( Mala ) o ;
        return ( this.Material == M.getMaterial());
    }    
}
