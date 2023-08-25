import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ListaCandidatos {
    public static void main(String[] args) {
        String[] candidatos = { "Igor", "Derick", "Rafaela", "Ianca", "Lucas" };
        for (String candidato : candidatos) {
            entrandoContato(candidato);

        }

    }

    static void entrandoContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVAS ");
        else
            System.out.println("NAO CONSEGUIMOS CONTATO " + candidato + " NUMERO MAXIMO DE TENTATIVAS "
                    + tentativasRealizadas + "REALIZADA");

    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Igor", "Derick", "Rafaela", "Ianca", "Lucas" };
        System.out.println("Imprimindo Lista de Candidatos informando o indice do elemento");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato Nº " + (i + 1) + " é " + candidatos[i]);

        }
        for (String candidato : candidatos) {
            System.out.println("O Candidato Selecionado foi " + candidato);

        }

    }

    static void selecaoCandidato() {

        String[] candidatos = { "Igor", "Derick", "Rafaela", "Ianca", "Lucas", "Hariel", "Pulma" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "solicitou esse valor de salario" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contraproposta");

        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
