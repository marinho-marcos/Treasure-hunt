public class Vazio extends ElementoTabuleiro {
    private static final long serialVersionUID = 1L;    //controle de versao da classe

    public void interagir(Jogador jogador){
        System.out.println("\nNada aqui...");
    }

    public String simbolo(){
        return "⬜";
    }
    
    public String simboloComJogador(){
        return "🙂";
    }
    
}