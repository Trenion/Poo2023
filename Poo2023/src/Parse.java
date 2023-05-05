import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Parse {
    	
  public static void parse(TMB tmb){
    List<String> linhas = lerFicheiro("logs_20200416.txt");
    String[] linhaPartida;
    for (String linha : linhas) {
            linhaPartida = linha.split(":", 2);
            switch(linhaPartida[0]){
                case "Utilizador": {
                    Utilizador u = parseUtilizador(linhaPartida[1]);

                    /*ADICIONAR UTILIZADOR AO tmb*/
                    tmb.addUtilizador(u);
                    break;
                }

                

                case "Transportadora": {
                    Transportadora t = parseTransportadora(linhaPartida[1]);

                    /*ADICIONAR TRANSPORTADORA A LISTA*/
                    tmb.addTransportadora(t);

                    break;
                }

                case "Artigo": {
                    Artigo a = parseArtigo(linhaPartida[1]);

                    /*ADICIONAR artigo A LISTA*/
                    tmb.addArtigo(a);

                    break;
                }

                case "Encomenda": {
                    Encomenda enc = parseEncomenda(linhaPartida[1]);

                    /*Adiciona a encomenda ao sistema*/
                    tmb.addEncomenda(enc);

                    /*Dono da encomenda*/
                    //Utilizador u = tmb.getUtilizadores().get(enc.getCodigoUser());

                    /*Adiciona a encomenda ao utilizador*/
                    //u.addEncomenda(enc);

                    break;
                }


                default:
                    break;
            }

    }
}

public static Utilizador parseUtilizador(String input){
    String[] campos = input.split(",");

    int codUtilizador = Integer.valueOf(campos[0]);
    String email = campos[1];
    String nome = campos[2];
    String morada = campos[3];
    int numFiscal= Integer.valueOf(campos[4]);
    
    Map<String,Artigo> historicoVendido = new HashMap<String,Artigo>();
    Map<String,Artigo> historicoComprado = new HashMap<String,Artigo>();
//PROBLEM HERE
   
    String[] campos1 = campos[5].split(",");
    String[] campos2 = campos[6].split(",");

  for(int i = 0; i < campos1.length; i++){
    historicoVendido.put(campos1[i],parseArtigo(campos1[i]));
  }
  for(int i = 0; i < campos2.length; i++){
    historicoComprado.put(campos2[i],parseArtigo(campos2[i]));
  }

    return new Utilizador( codUtilizador,email,nome,morada,numFiscal,historicoVendido,historicoComprado);
}

 

public static Transportadora parseTransportadora(String input){
  String[] campos = input.split(",");

  String nome = campos[0];
  double peq= Double.parseDouble(campos[1]);
  double med = Double.parseDouble(campos[2]);
  double gra = Double.parseDouble(campos[3]);


  /*dar randomize ao peso*/
  return new Transportadora(nome,peq,med,gra);
}


public static Artigo parseArtigo(String input){
    String[] campos = input.split(",");

    String id = campos[0];
    
    boolean usado = Boolean.parseBoolean(campos[1]);
    String avaliacao = campos[2];
    int numDonosPrevios = Integer.valueOf(campos[3]);
    double precoBase = Double.parseDouble(campos[4]);
    double precoF = Double.parseDouble(campos[5]);
    String descricao = campos[6];
    String marca = campos[7];
    Boolean premium = Boolean.parseBoolean(campos[8]);
    int ano = Integer.valueOf(campos[9]);
    String tamanho = campos[10];
    double valorizacao = Double.parseDouble(campos[11]);

    return new Artigo(id,usado,avaliacao,numDonosPrevios,precoBase,precoF,descricao,marca,premium,ano,tamanho,valorizacao);
}





public static Encomenda parseEncomenda(String input){
  String[] campos = input.split(",");

  int codigoUser =Integer.valueOf(campos[0]);
  String transportadoraNome = campos[1];
  String Dimensao = campos[2];
  double PreçoF = Double.parseDouble(campos[3]);
 
  int Criacao=Integer.valueOf(campos[4]);


  Map<String,Artigo> artigos = new HashMap<String,Artigo>();
  String[] campos1 = campos[4].split(",");

  for(int i = 0; i < campos1.length; i++){
      artigos.put(campos1[i],parseArtigo(campos1[i]));
  }

  return new Encomenda(codigoUser,transportadoraNome,Dimensao,PreçoF,Criacao,artigos);
}
































public static String parseAceite(String input){
  String[] campos = input.split(",");

  String str = campos[0];

  return str;
}

public static List<String> lerFicheiro(String nomeFich) {
    List<String> lines = new ArrayList<>();
    BufferedReader br;

    try {
        br = new BufferedReader(new FileReader(nomeFich));
        String line = br.readLine();

        while(!line.equals("Dados de LOGS:")){
            line = br.readLine();
        }

        while(line != null) {
            lines.add(line);
            line = br.readLine();
        }

        br.close();
    }

    catch(IOException exc) {
        System.out.println(exc.getMessage());
    }

    return lines;
}

}
