package org.example;

import org.json.JSONObject;

import java.io.InputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ProjetoSistemaDeInformacoesClimaticasEmTempoReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();

        try {
            String dadosClimaticos = getDadosClimaticos(cidade);

            // 1006 = localização não encontrada
            if (dadosClimaticos.contains("\"code\":1006")) {
                System.out.println("Localização não encontrada. Por favor, tente novamente.");

            } else {
                imprimirDadosclimaticos(dadosClimaticos);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getDadosClimaticos(String cidade) throws Exception {
        String apiKey = lerApiKeyDoClasspath();

        String formataNomeCidade = URLEncoder.encode(cidade, StandardCharsets.UTF_8);
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    public static String lerApiKeyDoClasspath() throws Exception {
        InputStream inputStream = ProjetoSistemaDeInformacoesClimaticasEmTempoReal.class
                .getClassLoader()
                .getResourceAsStream("api-key.txt");

        if (inputStream == null) {
            throw new Exception("Arquivo api-key.txt não encontrado no classpath.");
        }

        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8)) {
            return scanner.useDelimiter("\\A").next().trim();
        }
    }

    public static void imprimirDadosclimaticos(String dados) {

        JSONObject dadosJson = new JSONObject(dados);
        JSONObject informacoesMeteorologicas = dadosJson.getJSONObject("current");

        String cidade = dadosJson.getJSONObject("location").getString("name");
        String pais = dadosJson.getJSONObject("location").getString("country");

        // Extrai dados adicionais
        String condicaoTempo = informacoesMeteorologicas.getJSONObject("condition").getString("text");
        int umidade = informacoesMeteorologicas.getInt("humidity");
        float velocidadeVento = (float) informacoesMeteorologicas.getDouble("wind_kph");
        float pressaoAtmosferica = (float) informacoesMeteorologicas.getDouble("pressure_mb");
        float sensacaoTermica = (float) informacoesMeteorologicas.getDouble("feelslike_c");
        float temperaturaAtual = (float) informacoesMeteorologicas.getDouble("temp_c");


        // Extrai dada e hora retornada pela API
        String dataHoraString = informacoesMeteorologicas.getString("last_updated");

        System.out.println("Informações Metereológicas para " + cidade + ", " + pais);
        System.out.println("Data e Hora: " + dataHoraString);
        System.out.println("Temperatura Atual: " + temperaturaAtual + " ºC");
        System.out.println("Sensação Térmica: " + sensacaoTermica + " ºC");
        System.out.println("Condição do Tempo: " + condicaoTempo);
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Velocidade do Vento: " + velocidadeVento + " km/h");
        System.out.println("Pressão Atmosférica: " + pressaoAtmosferica + " mb");
    }

}

    

