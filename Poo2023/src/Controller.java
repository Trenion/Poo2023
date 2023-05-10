import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;





public class Controller{

    TMB tmb = new TMB();

    public void start(){
        String option = "";
    
        TMB tmb = new TMB();

        Parse.parse(tmb);



    do{
        View.printMenu();
        View.showInsercao("uma opçao: ");

        option = Input.lerString();
        option = option.toUpperCase();


        switch(option) {

            /*registar um utilizador, um encomenda, uma transportadora e um artigo;*/
            case "1": {
                View.showOpcoesRegisto();

                View.showInsercao("uma opçao: ");

                String op = Input.lerString();

                switch(op) {
                    case "1": {
                        /*registar Utilizador*/
                        View.showInsercao("email do user: ");
                        String Email = Input.lerString();

                        View.showInsercao("nome do user: ");
                        String Nome = Input.lerString();

                        View.showInsercao("morada do user: ");
                        String Morada = Input.lerString();

                        View.showInsercao("numero fiscal do user: ");
                        int NFiscal = Input.lerInt();

                        int num = NFiscal, Codigo = 0;
                        // o codigo gerado pelo sistema é o inverso do NFiscal
                        for(;num != 0; num /= 10) {
                            int digit = num % 10;
                            Codigo = Codigo * 10 + digit;
                        }
                        int pain=0;
                        Map<String,Artigo> HistoricoVendido= new HashMap<String,Artigo>(); ;
                        Map<String,Artigo> HistoricoComprado= new HashMap<String,Artigo>(); ;
                        View.showInsercao("Histórico de vendas: ");
                        while(pain==0){
                            View.showInsercao("0 se for adicionar um artigo ");
                            View.showInsercao("1 se nao for adicionar um artigo ");
                            pain = Input.lerInt();
                            if (pain ==0){

                                Artigo art = TMB.createArtigo();
                                if (art !=null){
                                    HistoricoVendido.put(art.getId(),art);
                                }else{
                                    System.out.println("error creating artigo");
                                    }

                            }
                        }
                        pain=0;
                        View.showInsercao("Histórico de compras: ");
                        while(pain==0){
                            View.showInsercao("0 se for adicionar um artigo ");
                            View.showInsercao("1 se nao for adicionar um artigo ");
                            pain = Input.lerInt();
                            if (pain ==0){
                                
                                Artigo art = TMB.createArtigo();
                                if (art !=null){
                                    HistoricoComprado.put(art.getId(),art);
                                }else{
                                    System.out.println("error creating artigo");
                                    }
                            }
                        }
                        tmb.addUtilizador(new Utilizador(Codigo, Email, Nome, Morada, NFiscal,HistoricoVendido,HistoricoComprado));
                        break;
                    }

                    case "2": {
                        /*registar Encomenda*/
                        View.showInsercao("codigo do user: ");
                        int codigoUser = Input.lerInt();

                        View.showInsercao("nome da transportadora: ");
                        String transportadoraNome = Input.lerString();

                        View.showInsercao("dimansao da encomenda: ");
                        String Dimensao = Input.lerString();
                        
                        
                        
                      
                        
                        View.showInsercao("data da criacao da encomenda: ");
                        int Criacao= Input.lerInt();

                        Map<String,Artigo> artigos = new HashMap<String,Artigo>();
                        View.showInsercao("lista de Artigos: ");
                        int pain=0;
                        while(pain==0){
                            View.showInsercao("0 se for adicionar um artigo ");
                            View.showInsercao("1 se nao for adicionar um artigo ");
                            pain = Input.lerInt();
                            if(pain == 0){
                            Artigo art = TMB.createArtigo();
                            if (art !=null){
                                artigos.put(art.getId(),art);
                            }else{
                                System.out.println("error creating artigo");
                                }}
                            
                        }
                        
                        Map<String,Transportadora> ta = tmb.getTransportadoras();
                        Transportadora a = new Transportadora();
                        int f =0; 
                        for(Map.Entry<String,Transportadora> entry : ta.entrySet()){
                            if (entry.getKey()==transportadoraNome){
                                a=entry.getValue();
                                f = 1;
                            }
                        }
                        if(f == 0){
                            System.out.println("Transportadora not found.");
                        }else{
                            double PrecoF = Encomenda.precoFinalTotal(a.getPequeno(),a.getMedio(),a.getGrande(),a.getPremium(),artigos);
                            tmb.addEncomenda(new Encomenda(codigoUser,transportadoraNome,Dimensao,PrecoF,Criacao,artigos));
                        }
                            
                        break;
                    }

                    case "3": {
                        /*registar Transportada*/
                        

                        View.showInsercao("o nome da Transportadora: ");
                        String nomeTrans = Input.lerString();

                        View.showInsercao("taxa a pagar tamanho pequeno: ");
                        double peq = Input.lerDouble();

                        View.showInsercao("taxa a pagar tamanho medio: ");
                        double med = Input.lerDouble();

                        View.showInsercao("taxa a pagar tamanho grande: ");
                        double gra = Input.lerDouble();

                        View.showInsercao("a transportadora é premium: ");
                        Boolean premium = Input.lerBoolean();

                        tmb.addTransportadora(new Transportadora(nomeTrans, peq, med, gra, premium));
                        break;
                    }

                    case "4": {
                        /*registar Artigo*/

                        
                       
                        Artigo artigo = TMB.createArtigo();
                        if (artigo !=null){
                            tmb.addArtigo(artigo);
                        }else{
                            System.out.println("error creating artigo");
                        }
                        
       

                       break;
                    }

                    default: {
                        View.showError("Opcao Invalida");
                        break;
                    }

                }

                break;
            }



            /*gravar o estado da aplicação em ficheiro*/
            case "2": {
                String filename = "C:\\Users\\Utilizador\\Documents\\GitHub\\Poo2023\\Poo2023\\src\\DB.bin";
                try {
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
                    os.writeObject(tmb);
                    os.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                    View.showError(e.getMessage());
                }
                break;
            }

            /*Dar load ao estado da aplicaçao*/
            case "3": {
                String filename = "C:\\Users\\Utilizador\\Documents\\GitHub\\Poo2023\\Poo2023\\src\\DB.bin";
                try {
                    ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
                    tmb = (TMB) is.readObject();
                    is.close();
                }
                catch(IOException | ClassNotFoundException e){
                    e.printStackTrace();
                    View.showError(e.getMessage());
                }
                break;
            }

            /*Quit*/
            case "4": {
                View.showBB();
                break;
            }
            
            

            /*Opçao invalida*/
            default: {
                View.showError("Opcao Invalida");
                break;
            }
        }
    } while(!option.equals("4"));
}

}
