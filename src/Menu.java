import java.util.Scanner;

public class Menu {
    private final Scanner input = new Scanner(System.in);

    public String selecionarMoeda(String direcao) {
        int opcao = -1;
        String codigoMoeda = null;

        System.out.printf("Escolha a moeda %s:\n", direcao);
        while (codigoMoeda == null) {
            System.out.println("""
                1 - Real (BRL)
                2 - Dólar Americano (USD)
                3 - Peso Argentino (ARS)
                4 - Boliviano da Bolívia (BOB)
                5 - Peso Chileno (CLP)
                6 - Peso Colombiano (COP)
            """);

            if (input.hasNextInt()) {
                opcao = input.nextInt();
                codigoMoeda = switch (opcao) {
                    case 1 -> "BRL";
                    case 2 -> "USD";
                    case 3 -> "ARS";
                    case 4 -> "BOB";
                    case 5 -> "CLP";
                    case 6 -> "COP";
                    default -> {
                        System.out.println("Opção inválida. Tente novamente.");
                        yield null;
                    }
                };
            } else {
                System.out.println("Entrada inválida. Digite apenas números.");
                input.next(); // descarta entrada inválida
            }
        }

        return codigoMoeda;
    }
}
