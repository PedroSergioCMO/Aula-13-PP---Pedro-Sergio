import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicoStreaming servicoStreaming = new ServicoStreaming();
        servicoStreaming.adicionarPacote("Pacote 1: Assistir vídeos em vários dispositivos - R$19,99");
        servicoStreaming.adicionarPacote("Pacote 2: Frete Grátis em produtos - R$9,99");
        servicoStreaming.adicionarPacote("Pacote 3: Caixa surpresa com produtos relacionados a filmes e séries - R$29,99");
        servicoStreaming.adicionarPacote("Pacote 4: Cartão de crédito Platinum - R$49,99");
        servicoStreaming.adicionarPacote("Pacote 5: Compra com Cash Back - R$19,99");

        servicoStreaming.mostrarAssinatura();
    }
}
