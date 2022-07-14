package org.example.reto.ejercicios;

import org.example.reto.util.DataUtil;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Crear un chat, un input donde lo que se ingrese sea almacenado en una lista,
 * para posteriormente cambiar en la lista las malas palabras,
 * para sos y compararlas con la lista del chat
 * y si se encuentra una reemplazarla por: **** ,
 * todo esto respetando los principios de la programación reactiva.
 */
public class Ejercicio02 {

    public void chat(){
        List<String> bad = DataUtil.getBadWords();      //Lista de groserias
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el mensaje: ");
        String input = sc.nextLine().toLowerCase();
        List<String> chat = Stream.of(input.split(" ")).collect(Collectors.toList());
        Flux.fromIterable(chat)
                .map(chatData -> bad.contains(chatData) ? chatData = "****" : chatData)
                .reduce((acumulador, mensaje) -> acumulador + " " + mensaje)
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        Ejercicio02 ejercicio02 = new Ejercicio02();
        ejercicio02.chat();
    }

}
