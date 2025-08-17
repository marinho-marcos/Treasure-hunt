public class Tesouro extends ElementoTabuleiro {
    private static final long serialVersionUID = 1L;    //controle de versao da classe

    public void interagir(Jogador jogador){
        jogador.setPontuacao(jogador.getPontuacao() + 3);
        jogador.setTesouros(jogador.getTesouros() - 1);

        System.out.println("\nVoce encontrou um TESOURO! +3 pontos.");
    }

    public String simbolo(){
        return "💰";
    }
    
    public String simboloComJogador(){
        return "🤑";
    }
}