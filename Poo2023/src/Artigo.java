
/*A Vintage especializa-se em três tipos principais de artigos: sapatilhas, t-shirts e malas. Cada um destes
artigos pode ser novo ou usado, sendo neste último caso disponibilizado também uma avaliação do seu estado
e informação sobre o número de donos que já possuiram o artigo. Cada artigo contém uma descrição, uma
marca, um código alfanumérico e um preço base e ainda uma correcção de preço (normalmente um desconto)
que é definida em função de cada tipo de artigo e da sua condição particular.*/
public class Artigo {
    /*fazer Artigos ser uma super class e o resto ser sub-classes*/
    /*realizar aqui a aplicaçao de taxas e do preço final de cada produto na loja */
    //double PrecoComTaxa;/*preço a pagar do produto com as taxas da loja */

    private string id;
    //private int tipo; // 0 -> indefinido, 1 -> sapatilhas, 2 -> tshirts, 3 -> malas
    private boolean usado;
    private String avaliacao;
    private int numDonosPrevios;
    private double precoBase;
    private double precoF;
    private String descricao;
    private String marca;

    public Artigo (int id, int tipo, boolean premium, boolean usado, double precoOG, int ano) {
        this.id = id;
    }

    public Artigo () {
        this.premium = false;
        this.usado = false;
        this.precoOG = 0.00;
        this.precoF = 0.00;
        this.ano = -1;
    }

    public double precoNoBalcao(, double valorizacao){
        double precoAPagar = this.precoOG;
        if(this.usado == true && this.premium == true){
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

        return precoAPagar;
    }

    public void setPremium (boolean premium) {
        this.premium = premium;
    }


   
}
