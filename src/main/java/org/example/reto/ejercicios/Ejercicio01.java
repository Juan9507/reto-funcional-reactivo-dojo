package org.example.reto.ejercicios;

import org.example.reto.model.Email;
import org.example.reto.util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:
 *
 * Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
 * Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
 * Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)
 * Saber la cantidad de correos que hay, sin usar un ciclo
 * Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
 * En la misma lista determinar si se envió un correo o no a cada uno de los correos, si se le envió cambiar el estado en la lista, Todo esto respetando la inmutabilidad.
 */
public class Ejercicio01 {

    /**
     * Punto a
     * remove correos duplicados de una lista
     * @return
     */
    public List<Email> deleteDuplites(){
        List<Email> email = DataUtil.getEmailList();
        return email.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Punto b
     * saber si hay correos con dominio gmail, hotmail y outlook
     * @return
     */
    public List<Email> filterDomain(){
        List<Email> email = DataUtil.getEmailList();
        return email.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Ejercicio01 ejercicio01 = new Ejercicio01();
       var num =  ejercicio01.deleteDuplites();
        System.out.println(num);
    }

}
