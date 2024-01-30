package com.mycompany.proyectoapirest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

    private static final String API_BASE_URL = "https://restcountries.com/v3.1/";

    public String getAllCountries() {
        return sendGetRequest("all");
    }

    public String getCountriesByRegion(String region) {
        return sendGetRequest("region/" + region);
    }

    public String getCountriesByCurrency(String currency) {
        return sendGetRequest("currency/" + currency);
    }

    public String getCountryByCode(String value) {
        return sendGetRequest("alpha/" + value);
    }

    public String getCountryByName(String name) {
        return sendGetRequest("name/" + name);
    }

    public String getCountriesByRegionWithQueryParams(String region, String sortBy, String sortOrder) {
        return sendGetRequestWithQueryParams("region/" + region, sortBy, sortOrder);
    }

    public String getCountriesByCurrencyWithQueryParams(String currency, String sortBy, String sortOrder) {
        return sendGetRequestWithQueryParams("currency/" + currency, sortBy, sortOrder);
    }

    private String sendGetRequest(String endpoint) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(API_BASE_URL + endpoint);
            request.setHeader("Content-Type", "application/json");

            CloseableHttpResponse response = httpClient.execute(request);
            return extractResponseContent(response);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String sendGetRequestWithQueryParams(String endpoint, String sortBy, String sortOrder) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(API_BASE_URL + endpoint + "?sort_by=" + sortBy + "&sort_order=" + sortOrder);
            request.setHeader("Content-Type", "application/json");

            CloseableHttpResponse response = httpClient.execute(request);
            return extractResponseContent(response);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String extractResponseContent(CloseableHttpResponse response) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuilder result = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            result.append(line);
        }

        return result.toString();
    }
}
