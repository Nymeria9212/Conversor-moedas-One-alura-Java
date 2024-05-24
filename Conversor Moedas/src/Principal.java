import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String currency_code_menu = """
                ARS - Peso argentino
                BOB - Boliviano boliviano
                BRL - Real brasileiro
                CLP - Peso chileno
                COP - Peso colombiano
                USD - Dólar americano
                Sair
                """;

        List<String> lista = new ArrayList<>();
        lista.add("ARS");
        lista.add("BOB");
        lista.add("BRL");
        lista.add("CLP");
        lista.add("COP");
        lista.add("USD");

        Scanner prompt = new Scanner(System.in);

        while (true) {
            System.out.println("[BEM VINDO AO CONVERSOR DE MOEDAS]");
            System.out.println("Qual moeda você quer converter?");
            System.out.println(currency_code_menu);
            String moedaConverter = prompt.nextLine().toUpperCase();

            if (moedaConverter.equalsIgnoreCase("Sair")) {
                break;
            }

            System.out.println("Para qual moeda você quer converter?");
            System.out.println(currency_code_menu);
            String moedaDestino = prompt.nextLine().toUpperCase();

            System.out.println("Qual valor você quer converter?");
            double valor = prompt.nextDouble();
            prompt.nextLine();  // Consume the newline character

            Converter novaConversao = new Converter(moedaConverter, moedaDestino, valor);
            ApiConverter api = new ApiConverter(novaConversao);
            System.out.println(api.playApí());
        }

        prompt.close();
    }
}
