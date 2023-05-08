import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class TMB implements Serializable{

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

    public static Artigo createArtigo(){
        

        
        View.showInsercao("o id do artigo: ");
        String id = Input.lerString();

        View.showInsercao("o artigo foi usado: ");
        boolean usado = Input.lerBoolean();

        View.showInsercao("a avaliacao do artigo: ");
        String avaliacao = Input.lerString();

        View.showInsercao("numero de donos previos: ");
        int numDonosPrevios = Input.lerInt();
        
        View.showInsercao("Preco original do artigo: ");
        double precoBase = Input.lerDouble();
        
        
        View.showInsercao("a descricao do artigo: ");
        String descricao = Input.lerString();
        
        View.showInsercao("a marca do artigo: ");
        String marca = Input.lerString();

        View.showInsercao("o artigo de premium: ");
        Boolean premium = Input.lerBoolean();
        
        View.showInsercao("ano de producao/venda do artigo: ");
        int ano = Input.lerInt();

        View.showInsercao("o tamanho do artigo: ");
        String tamanho = Input.lerString();
        
        View.showInsercao("Valorizacao do artigo: ");
        double valorizacao= Input.lerDouble();

        double precoOG = precoBase;
        double precoAPagar =precoOG;
    
        //Calcular o preço a pagar na loja
        if(id.equals("Tshirt")){
              precoAPagar = precoAPagar/2.00;
            }
        else if(usado == true && premium == true){
            precoAPagar = precoOG + (precoOG*((2023-ano)/2023)* valorizacao)/2;
        }
        else if(usado == false && premium == true){
            precoAPagar = precoOG + precoOG*((2023-ano)/2023)* valorizacao;
        }
        else if(usado == true && premium == false){
            precoAPagar = precoOG - precoOG*((2023-ano)/2023)* valorizacao;
        }
        else {
            precoAPagar= -1;
        }
        double precoF = precoAPagar;
     
        Artigo artigo = new Artigo(id, usado, avaliacao, numDonosPrevios,  precoBase, precoF,  descricao,  marca, premium, ano, tamanho, valorizacao);

        return artigo;
    }
}
