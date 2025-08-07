import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        String moedaOrigem = menu.selecionarMoeda("DE");
        Moedas taxas = new ConexaoApi().buscarTaxas(moedaOrigem);
        String moedaDestino = menu.selecionarMoeda("PARA");

        double taxaDestino = taxas.getTaxa(moedaDestino);

        System.out.println("Digite o valor que deseja converter:");
        double valor = input.nextDouble();

        double convertido = valor * taxaDestino;

        System.out.printf("Valor convertido de %.2f %s para %s: %.2f%n",
                valor, moedaOrigem, moedaDestino, convertido);
    }
}
