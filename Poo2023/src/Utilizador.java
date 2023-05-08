import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class Utilizador implements Serializable {

    int Codigo;/*fornecido automaticamente pelo sistema) */
    String Email;
    String Nome;
    String Morada;
    int NFiscal;
    Map<String,Artigo> HistoricoVendido;
    Map<String,Artigo> HistoricoComprado; 

    public Utilizador(int Codigo, String Email,String Nome, String Morada, int NFiscal,Map<String,Artigo> HistoricoVendido,Map<String,Artigo> HistoricoComprado) {
        this.Codigo = Codigo;
        this.Email = Email;
        this.Nome = Nome;
        this.Morada = Morada;
        this.NFiscal = NFiscal;
        this.HistoricoVendido = HistoricoVendido;
        this.HistoricoComprado = HistoricoComprado;
    
    }

    public Utilizador() {
        this.Codigo = -1;
        this.Email = null;
        this.Nome = null;
        this.Morada = null;
        this.NFiscal = -1;
        this.HistoricoVendido = new HashMap<String,Artigo>(); 
        this.HistoricoComprado = new HashMap<String,Artigo>(); 
    }

    public Utilizador(Utilizador U) {
        this.Codigo = U.getCodigo();
        this.Email = U.getEmail();
        this.Nome = U.getNome();
        this.Morada = U.getMorada();
        this.NFiscal = U.getNFiscal();
        this.HistoricoVendido = U.getHistoricoVendido();
        this.HistoricoComprado=U.getHistoricoComprado();
    }

    public int getCodigo() {
        return this.Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMorada() {
        return this.Morada;
    }

    public void setMorada(String Morada) {
        this.Morada = Morada;
    }

    public int getNFiscal() {
        return this.NFiscal;
    }

    public void setNFiscal(int NFiscal) {
        this.NFiscal = NFiscal;
    }

    public Map<String,Artigo>getHistoricoVendido() {
        return this.HistoricoVendido;
    }

    public void setHistoricoVendido(Map<String,Artigo> HistoricoVendido) {
        this.HistoricoVendido = HistoricoVendido;
    }

    public Map<String,Artigo> getHistoricoComprado() {
        return this.HistoricoComprado;
    }

    public void setHistoricoComprado(Map<String,Artigo> HistoricoComprado) {
        this.HistoricoComprado = HistoricoComprado;
    }

 

    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Utilizador U = ( Utilizador ) o ;
        return (this.Codigo == U.getCodigo() && this.Email == U.getEmail() && this.Nome == U.getNome() && this.Morada == U.getMorada() && this.NFiscal == U.getNFiscal() && this.HistoricoVendido == U.getHistoricoVendido() && this.HistoricoComprado==U.getHistoricoComprado());
    }

    public Utilizador clone () {
        return new Utilizador ( this ) ;
        }
    
}
