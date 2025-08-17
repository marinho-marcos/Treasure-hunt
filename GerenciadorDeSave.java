import java.io.*;

public class GerenciadorDeSave {

    private static final String NOME_ARQUIVO = "caca_tesouro.dat";

    //Salva o estado atual do objeto Jogo em um arquivo binário.

    public void salvarJogo(Jogo jogo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOME_ARQUIVO))) {
            oos.writeObject(jogo);
            System.out.println("Jogo salvo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o jogo: " + e.getMessage());
        }
    }

    
     // retorna O objeto Jogo carregado, ou null se não houver save ou ocorrer um erro.
     
    public Jogo carregarJogo() {
        File arquivoSave = new File(NOME_ARQUIVO);
        if (!arquivoSave.exists()) {
            return null; // Nenhum jogo salvo encontrado
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivoSave))) {
            Jogo jogo = (Jogo) ois.readObject();
            System.out.println("Jogo anterior carregado com sucesso!");
            return jogo;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar o jogo: " + e.getMessage());
            //deletar o arquivo corrompido para evitar erros futuros
            arquivoSave.delete();
            return null;
        }
    }

    public void excluirSave() {
        File arquivoSave = new File(NOME_ARQUIVO);
        if (arquivoSave.exists()) {
            arquivoSave.delete();
        }
    }
}