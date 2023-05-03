import java.util.ArrayList;

public class Utilizadores {

    int Codigo;/*fornecido automaticamente pelo sistema) */
    String Email;
    String Nome;
    String Morada;
    int NFiscal;
    ArrayList<Artigos> HistoricoVendido = new ArrayList<Artigos>();
    ArrayList<Artigos> HistoricoComprado = new ArrayList<Artigos>();

    public Utilizadores(int Codigo, String Email,String Nome, String Morada, int NFiscal,ArrayList<Artigos> HistoricoVendido,ArrayList<Artigos> HistoricoComprado) {
        this.Codigo = Codigo;
        this.Email = Email;
        this.Nome = Nome;
        this.Morada = Morada;
        this.NFiscal = NFiscal;
        this.HistoricoVendido = HistoricoVendido;
        this.HistoricoComprado=HistoricoComprado;
    
    }

    public Utilizadores() {
    }

    public Utilizadores(Utilizadores U) {
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

    public ArrayList<Artigos> getHistoricoVendido() {
        return this.HistoricoVendido;
    }

    public void setHistoricoVendido(ArrayList<Artigos> HistoricoVendido) {
        this.HistoricoVendido = HistoricoVendido;
    }

    public ArrayList<Artigos> getHistoricoComprado() {
        return this.HistoricoComprado;
    }

    public void setHistoricoComprado(ArrayList<Artigos> HistoricoComprado) {
        this.HistoricoComprado = HistoricoComprado;
    }

    @Override
    public String toString() {
        return "{" +
            " Codigo='" + getCodigo() + "'" +
            ", Email='" + getEmail() + "'" +
            ", Nome='" + getNome() + "'" +
            ", Morada='" + getMorada() + "'" +
            ", NFiscal='" + getNFiscal() + "'" +
            ", HistoricoVendido='" + getHistoricoVendido() + "'" +
            ", HistoricoComprado='" + getHistoricoComprado() + "'" +
            "}";
    }

    public boolean equals ( Object o ) {
        if ( this == o )
            return true ;
        if (( o == null ) || ( this . getClass () != o . getClass () ) )
            return false ;
        Utilizadores U = ( Utilizadores ) o ;
        return (this.Codigo == U.getCodigo() && this.Email == U.getEmail() && this.Nome == U.getNome() && this.Morada == U.getMorada() && this.NFiscal == U.getNFiscal() && this.HistoricoVendido == U.getHistoricoVendido() && this.HistoricoComprado==U.getHistoricoComprado());
    }

    public Utilizadores clone () {
        return new Utilizadores ( this ) ;
        }
    
}
