public class Shirt extends Artigo {


    String Padrao;

    public Shirt(String id, boolean usado, String avaliacao, int numDonosPrevios, double precoBase, double precoF, String descricao, String marca, Boolean premium, int ano,String tamanho,double valorizacao,String Padrao){
        
        super(id,usado,avaliacao, numDonosPrevios,  precoBase, precoF, descricao,  marca,  premium,  ano, tamanho, valorizacao);
        this.Padrao = Padrao;
        
    }

    public Shirt() {
        super();
    }
    
    public Shirt ( Shirt T ) {

        super(T);
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
        if (! super.equals(o)) return false;
        Shirt T = ( Shirt ) o ;
        return (this.Padrao == T.getPadrao() ) ;
        }
           
        // clone
    public Shirt clone () {
        return new Shirt ( this ) ;
        }
        
}
