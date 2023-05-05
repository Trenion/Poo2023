import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



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
            }





            /*gravar o estado da aplicação em ficheiro*/
            case "S": {
                String filename = "gestEncomendas.dat";
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
            case "L": {
                String filename = "gestEncomendas.dat";
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
