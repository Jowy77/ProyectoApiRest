/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoapirest;

import com.mycompany.proyectoapirest.dto.Root;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/**
 *
 * @author Iproy
 */
public class ProyectoApiRest {

    public static void main(String[] args) {

        RestClient client = new RestClient();
        // Ejemplo de llamada al método para obtener información de todos los países
        String allCountriesData = client.getAllCountries();
        System.out.println("Información de todos los países:\n" + allCountriesData);

        // Ejemplo de llamada al método para obtener información de un país por su id
        String countryByIdData = client.getCountryByCode("US");
        System.out.println("Información del país con iso_alpha2 US:\n" + countryByIdData);

        // Ejemplo de llamada al método para obtener información de países en una región específica
        String countriesInRegionData = client.getCountriesByRegion("Europe");
        System.out.println("Países en la región Europe:\n" + countriesInRegionData);

        // Ejemplo de llamada al método para obtener información de países que utilizan una moneda específica
        String countriesUsingCurrencyData = client.getCountriesByCurrency("EUR");
        System.out.println("Países que utilizan la moneda EUR:\n" + countriesUsingCurrencyData);

        Gson gson = new Gson();

        Type listType = new TypeToken<List<Root>>() {}.getType();
        List<Root> paises = gson.fromJson(allCountriesData, listType);

        for (Root pais : paises) {
            System.out.println(pais.toString());
        }
    }
}
