import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.*;

public class ConexaoApi {
    public Moedas buscarTaxas(String moedaBase) throws URISyntaxException {
        URI uri = new URI("https://v6.exchangerate-api.com/v6/282199d565fdceb85010360b/latest/" + moedaBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(uri).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ApiResponse apiResponse = new Gson().fromJson(response.body(), ApiResponse.class);
            return apiResponse.conversion_rates();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao acessar API de câmbio", e);
        }
    }
}