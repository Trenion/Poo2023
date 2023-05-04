// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.PrintWriter;

// READ-SAVE-LOAD TO STRUCT
public class Main {
    public static void main(String[] args) {

        
        ArrayList<Artigos> lista = new ArrayList<Artigos>();
        lista = loadFile("Order.txt", lista);
  
    }

    public static ArrayList<Artigos> loadFile(String filename,ArrayList<Artigos> lista) throws IOException{
        FileInputStream fis = new FileInputStream(filename);
        int i = fis.read();
        
        while(!(i==-1)){
            char c = (char)i;
            System.out.print(fis);
            System.out.print(c);
            //lista.add(fis);
            i=fis.read();
        }
        

        fis.close();
        return lista;
    }
    
    public void writeFile(String filename, ArrayList<Object> lista) throws IOException{
        //WRITE THE THINGS IN THE FILE
        FileOutputStream fos = new FileOutputStream(filename);
        //fos.write( lista.toString());
   
        fos.flush();
        fos.close();
    }

    //i need to fix this

    public static String readFromFile(String fileName) {
        try {
            // Create a new file object
            File file = new File(fileName);
                       
            // Read data from the file
            byte[] buffer = new byte[(int) file.length()];
            FileInputStream fis = new FileInputStream(file);
            fis.read(buffer);
            fis.close();
            
            // Convert the byte array to a string and return it
            return new String(buffer);
        } catch (IOException e) {
            // Log the error and return an empty string
            System.out.println("Error: " + e.getMessage());
            return "";
        }
    }
    
/* 
// o readFile não está feito da maneira como o sor quer
    public static void readFile(String name){
        System.out.println(name);
        try {
            File myObj = new File(name);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }*/
/* 
    public static ArrayList<Transportadora> addTrans(ArrayList<Transportadora> lista){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Nome da transportadora:\n");
        String line1 = scanner.nextLine();
        System.out.println("Preço para tamanho pequeno:\n");
        double line2 = scanner.nextDouble();
        System.out.println("Preço para tamanho medio:\n");
        double line3 = scanner.nextDouble();
        System.out.println("Preço para tamanho grando:\n");
        double line4 = scanner.nextDouble();
        lista.add(new Transportadora(line1, line2, line3,line4));

        return lista;
    }*/
    

    /* 
    public static ArrayList<Transportadora> loadTrans(String name){
        ArrayList<Transportadora> lista = new ArrayList<Transportadora>();
        try {
            File myObj = new File(name);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                String[] coisa = data.split(";");
                lista.add(new Transportadora(coisa[0], Double.parseDouble(coisa[1]), Double.parseDouble(coisa[2]), Double.parseDouble(coisa[3])));
              
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return lista; 
    }
    public static void saveTrans(ArrayList<Transportadora> lista, String name){
        
        try {
            FileWriter myWriter = new FileWriter(name);
            
            while(lista.next() != Null){
                myWriter.write(lista.getName()+";"+lista.getPequeno()+";"+lista.getMedio()+";"+lista.getGrande()+"\n");
                
            }
            
            myWriter.close();
            System.out.println("Successfully saved to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }


    }*/







/* 
    public static void writeFile(String name){
        Scanner scanner = new Scanner(System.in); 

        try(FileWriter f = new FileWriter(name, true);
        BufferedWriter b = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b);) 
        {
            /*FileWriter myWriter = new FileWriter(name,true);

            fw = new FileWriter("names.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);




            //myWriter.write("Files in Java might be tricky, but it is fun enough!");

            System.out.println("Please correctly input the data.");
            String line = scanner.nextLine();
            myWriter.write(line);
            
            myWriter.close();*/
/* 
            System.out.println("Please correctly input the data.");
            String line = scanner.nextLine();

            p.println(line);// suposedly things here get writnen in the file in a appendice
            System.out.println("Successfully wrote to the file.");

          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }*/








/* 

    public static ArrayList<Artigos> accessFile(){

        ArrayList<Artigos> lista= new ArrayList<Artigos>();

        //String example = ("Shirt,XL,Riscas,10.00,true\nShirt,XS,Quadrados,10.00,false\nMala,XL,100.00,Couro,2010,false,0.50\nMala,Xs,100.00,Metal,1990,true,0.50\nSapatilhas,43,true,Black,1980,70.00,true,false\nSapatilhas,47,false,White,2020,70.00,false,true");

        System.out.println("Hello and welcome!");

        File file = new File("Lista.txt"); /*verify path before running */
/* 
        if (file.exists()) {
            System.out.println("File 'Lista.txt' exists.");
            /*System.out.println(file.getAbsolutePath());*/ /*shows all path */
/* 
            try {
                
                File myObj = new File("Lista.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  System.out.println(data);
                  
                  String[] coisa = data.split(";");//coisa é um conjunto de stings, em que cada uma é um atributo de um artigo.
                  if(coisa[0] == "Shirt"){
                    /*Artigos item =new Artigos();
                    item = setTipo(coisa[0]);*/

/* 
                  }


                  
                }
                myReader.close();

            } catch (FileNotFoundException e) {
                // TODO: handle exception
                e.printStackTrace();
            }catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        else{
            System.out.println("File not found! \n Generating the file.");
            try {
                FileWriter writer = new FileWriter("Lista.txt");
                //writer.write(example);

                writer.close();
    
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            


        }

        return lista;
    }*/
}