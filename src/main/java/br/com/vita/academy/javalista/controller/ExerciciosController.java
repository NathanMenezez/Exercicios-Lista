package br.com.vita.academy.javalista.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vita.academy.javalista.dto.LinkedListInteger;
import br.com.vita.academy.javalista.dto.ListaInteger;
import br.com.vita.academy.javalista.dto.ListaMapa;
import br.com.vita.academy.javalista.dto.ListaStrings;
import br.com.vita.academy.javalista.dto.Mapa;
import br.com.vita.academy.javalista.dto.SetString;
import br.com.vita.academy.javalista.service.ExerciciosService;

@RestController
public class ExerciciosController {
    
    @Autowired
    ExerciciosService service;

    @PostMapping("/metodo1")
    public List<String> metodo1(@RequestBody ListaStrings lista){
        return service.metodo1(lista.getLista());
    }

    @PostMapping("/metodo2")
    public Integer metodo2(@RequestBody ListaInteger lista){
        return service.metodo2(lista.getLista());
    }

    @PostMapping("/metodo3")
    public List<String> metodo3(@RequestBody SetString lista){
        return service.metodo3(lista.getLista());
    }

    @PostMapping("/metodo4")
    public LinkedList<Integer> metodo4(@RequestBody LinkedListInteger lista){
        return service.metodo4(lista.getLista());
    }

    @PostMapping("/metodo5")
    public Mapa metodo5(@RequestBody ListaMapa lista){
        return service.metodo5(lista.getLista());
    }
}
