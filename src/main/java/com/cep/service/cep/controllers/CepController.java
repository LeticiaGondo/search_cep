package com.cep.service.cep.controllers;

import com.cep.service.cep.models.Cep;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class CepController {

    @GetMapping("/getAddressByCep/{cep}")
    public Cep getAddressByCep(@PathVariable(value = "cep") String cepAdress) {
        String url = "https://viacep.com.br/ws/"+cepAdress+"/json/";
        Client client = ClientBuilder.newClient();
        Cep cep = client.target(url).request().get(Cep.class);
        return cep;
    }

    @GetMapping("/getStreetByCep/{cep}")
    public Map<String, String> getStreetByCep(@PathVariable(value = "cep") String cepAdress) {
        String url = "https://viacep.com.br/ws/"+cepAdress+"/json/";
        Client client = ClientBuilder.newClient();
        Cep cep = client.target(url).request().get(Cep.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("logradouro", cep.getLogradouro());

        return map;
    }

    @GetMapping("/getCityByCep/{cep}")
    public Map<String, String> getCityByCep(@PathVariable(value = "cep") String cepAdress) {
        String url = "https://viacep.com.br/ws/"+cepAdress+"/json/";
        Client client = ClientBuilder.newClient();
        Cep cep = client.target(url).request().get(Cep.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("cidade", cep.getLocalidade());

        return map;
    }

    @GetMapping("/getDistrictByCep/{cep}")
    public Map<String, String> getDistrictByCep(@PathVariable(value = "cep") String cepAdress) {
        String url = "https://viacep.com.br/ws/"+cepAdress+"/json/";
        Client client = ClientBuilder.newClient();
        Cep cep = client.target(url).request().get(Cep.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("bairro", cep.getBairro());

        return map;
    }

    @GetMapping("/getStateByCep/{cep}")
    public Map<String, String> getStateByCep(@PathVariable(value = "cep") String cepAdress) {
        String url = "https://viacep.com.br/ws/"+cepAdress+"/json/";
        Client client = ClientBuilder.newClient();
        Cep cep = client.target(url).request().get(Cep.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("uf", cep.getUf());

        return map;
    }

    @GetMapping ("/getIBGEByCep/{cep}")
    public Map<String, String> getIBGEByCep(@PathVariable (value = "cep") String cepAdress){
        String url = "https://viacep.com.br/ws/"+cepAdress+"/json/";
        Client client = ClientBuilder.newClient();
        Cep cep = client.target(url).request().get(Cep.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("ibge", Integer.toString(cep.getIbge()));

        return map;

    }


}
