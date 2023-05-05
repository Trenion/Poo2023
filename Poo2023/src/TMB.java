import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class TMB {

    private Map<String, Utilizador> utilizadores;
    private Map<String, Transportadora> transportadoras;
    private Map<String, Artigo> artigos;
    private Map<String, Encomenda> encomendas;
//
    public TMB() {
        utilizadores = new TreeMap<>();
        artigos = new TreeMap<>();
        transportadoras = new TreeMap<>();;
        encomendas = new TreeMap<>();
    }
    

    public Map<String,Utilizador> getUtilizadores() {
        return this.utilizadores;
    }

    public void setUtilizadores(Map<String,Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }

    public Map<String,Transportadora> getTransportadoras() {
        return this.transportadoras;
    }

    public void setTransportadoras(Map<String,Transportadora> transportadoras) {
        this.transportadoras = transportadoras;
    }

    public Map<String,Artigo> getArtigos() {
        return this.artigos;
    }

    public void setArtigos(Map<String,Artigo> artigos) {
        this.artigos = artigos;
    }

    public Map<String,Encomenda> getEncomendas() {
        return this.encomendas;
    }

    public void setEncomendas(Map<String,Encomenda> encomendas) {
        this.encomendas = encomendas;
    }


    public void addTransportadora(Transportadora t) {
        transportadoras.put(t.getNome(), t);
    }

    public void addUtilizador(Utilizador u) {
        utilizadores.put(Integer.toString(u.getCodigo()), u);
    }

    public void addArtigo(Artigo a) {
        artigos.put(a.getId(), a);
    }

    public void addEncomenda(Encomenda e){encomendas.put(Integer.toString(e.getCodigoUser()), e);}
}
