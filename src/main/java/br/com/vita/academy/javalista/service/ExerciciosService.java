package br.com.vita.academy.javalista.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.vita.academy.javalista.dto.Mapa;


@Service
public class ExerciciosService {
    
    public List<String> metodo1(List<String> lista){
        Collections.sort(lista);
        return lista;
    }

    public Integer metodo2(List<Integer> lista2){
        for (int i = 1; i <= 10; i++) {
            lista2.add(i);
        }
        Integer soma = 0;
        for (Integer num : lista2) {
            soma += num;
        }
        return soma;
    }

    public List<String> metodo3(Set<String> lista3){
        lista3.add("ALUNO");
        lista3.add("VITA");
        lista3.add("PROGRAMADOR");

        List<String> lista2 = new ArrayList<>();

        lista3.forEach(element ->{
            lista2.add(element);
        });

        Collections.sort(lista2);

        return lista2;
    }

    public LinkedList<Integer> metodo4(LinkedList<Integer> lista){
        lista.add(3);
        lista.add(15);
        lista.add(20);

        lista.remove(0);
        lista.remove(lista.size() - 1);

        System.out.println(lista);
        return lista;
    }

    public Mapa metodo5(List<Mapa> lista){
        var mapList = new HashMap<>();

        for (Mapa mapa : lista) {
            mapList.put(mapa.getCidade(), mapa.getPopulacao());
        }

        Mapa maior = new Mapa(null, null);

        for (Mapa mapa : lista) {
            if(mapa.getPopulacao() > maior.getPopulacao()){
                maior = mapa;
            }
        }
        return maior;
    }

}
