
/*A Vintage especializa-se em três tipos principais de artigos: sapatilhas, t-shirts e malas. Cada um destes
artigos pode ser novo ou usado, sendo neste último caso disponibilizado também uma avaliação do seu estado
e informação sobre o número de donos que já possuiram o artigo. Cada artigo contém uma descrição, uma
marca, um código alfanumérico e um preço base e ainda uma correcção de preço (normalmente um desconto)
que é definida em função de cada tipo de artigo e da sua condição particular.*/
public class Artigos {
    /*fazer Artigos ser uma super class e o resto ser sub-classes*/
    /*realizar aqui a aplicaçao de taxas e do preço final de cada produto na loja */
    //double PrecoComTaxa;/*preço a pagar do produto com as taxas da loja */

    public double precoNoBalcao(double precoOG, boolean usado, int ano, boolean premium, double valorizacao){
        double precoAPagar = precoOG;
        if(usado==true && premium == true){
            precoAPagar= precoOG + (precoOG*((2023-ano)/2023)* valorizacao)/2;
        }
        else if(usado==false && premium == true){
            precoAPagar= precoOG + precoOG*((2023-ano)/2023)* valorizacao;
        }
        else if(usado==true && premium == false){
            precoAPagar= precoOG - precoOG*((2023-ano)/2023)* valorizacao;
        }
        else {
            precoAPagar= -1;
        }

        return precoAPagar;
    }
   
}
