import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeSave gerenciador = new GerenciadorDeSave();
        Jogo cacaTesouro = gerenciador.carregarJogo();
        Scanner scanner = new Scanner(System.in);

        if (cacaTesouro != null) {      // se um jogo foi carregado
            System.out.print("Encontramos um jogo salvo. Deseja continuar? (S/N): ");
            String resposta = scanner.nextLine().toUpperCase();
            if (!resposta.equals("S")) {
                cacaTesouro = new Jogo(); // usuário optou por um novo jogo
                System.out.println("Iniciando um novo jogo!");
            }
        } else {
            // Se nenhum jogo foi carregado, cria um novo
            cacaTesouro = new Jogo();
            System.out.println("Bem-vindo ao Caça ao Tesouro! Iniciando um novo jogo.");
        }

        cacaTesouro.executar();
        
        System.out.println("\nObrigado por jogar!");

        scanner.close();
    }
}
