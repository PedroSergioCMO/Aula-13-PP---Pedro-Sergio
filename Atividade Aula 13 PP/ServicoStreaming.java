import java.util.ArrayList;
import java.util.List;

class ServicoStreaming {
    private String assinaturaBase;
    private List<String> pacotesOpcionais;

    public ServicoStreaming() {
        assinaturaBase = "Assinatura Base: Assistir vídeos num único dispositivo - R$9,99";
        pacotesOpcionais = new ArrayList<>();
    }

    public void adicionarPacote(String pacote) {
        pacotesOpcionais.add(pacote);
    }

    public void removerPacote(String pacote) {
        pacotesOpcionais.remove(pacote);
    }

    public void mostrarAssinatura() {
        System.out.println("Assinatura:");
        System.out.println(assinaturaBase);
        System.out.println("Pacotes Opcionais:");
        for (String pacote : pacotesOpcionais) {
            System.out.println(pacote);
        }
    }
}
