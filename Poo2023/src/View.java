public interface View {
    public static void printMenu(){
        
        System.out.println("1 -> Registar um utilizador, encomenda, transportadora ou um artigo.");
        System.out.println("2 -> Save State.");
        System.out.println("3 -> Load State.\n");
        System.out.println("4 -> Quit.\n");
    }
    public static void showOpcoesRegisto(){
        System.out.println("1 -> Registar Utilizador.");
        System.out.println("2 -> Registar Encomenda.");
        System.out.println("3 -> Registar Transportadora.");
        System.out.println("4 -> Registar Artigo.");
    }

    public static void showBB(){
        System.out.println("The end!");
    }
    public static void showError(String s){
        System.out.println("Error: " + s);
    }
    public static void showInsercao(String s){
        System.out.print("Insira " + s);
    }
}
