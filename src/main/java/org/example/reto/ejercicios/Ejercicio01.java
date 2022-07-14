package org.example.reto.ejercicios;

import org.example.reto.model.Email;
import org.example.reto.util.DataUtil;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes operadores:
 * <p>
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
     * remover correos duplicados de una lista
     *
     * @return la lista con los correos sin duplicados
     */
    public List<String> deleteDuplites() {
        List<Email> email = DataUtil.getEmailList();
        return email.stream()
                .map(emailDuplicate -> emailDuplicate.getEmail())
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Punto b
     * saber si hay correos con dominio gmail, hotmail y outlook
     *
     * @return
     */
    public List<Email> filterDomain() {
        List<Email> email = DataUtil.getEmailList();
        return email.stream()
                .filter(filterEmail ->
                        filterEmail.getDomain() == "gmail" ||
                                filterEmail.getDomain() == "hotmail" ||
                                filterEmail.getDomain() == "outlook")
                .collect(Collectors.toList());
    }

    /**
     * Punto c
     * Saber si cumple con la condicion @ y el dominio correcto
     *
     * @return
     */
    public List<Object> condition() {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)");
        List<Email> email = DataUtil.getEmailList();
        return email.stream()
                .map(emailCondition -> {
                    Matcher mather = pattern.matcher(emailCondition.getEmail());
                    if (mather.find() &&
                            emailCondition.getDomain() == "gmail" ||
                            emailCondition.getDomain() == "hotmail" ||
                            emailCondition.getDomain() == "outlook"

                    ) {
                        System.out.println("\n" + emailCondition.getEmail() + " Es valido");
                    } else {
                        System.out.println("\n" + emailCondition.getEmail() + " No es valido");
                    }
                    return null;
                }).collect(Collectors.toList());
    }

    /**
     * Punto d
     * Saber la cantidad de correos que hay, sin usar un ciclo
     * amount -> cantidad
     * todos los correos;
     */
    public void amountEverybodyEmail(){
        List<Email> email = DataUtil.getEmailList();
        long total = email.stream().count();
        System.out.println("Total de correos: " + total);
    }

    /**
     * Punto e
     * Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
     * amount -> cantidad
     * correos email, hotmail, outlook;
     */
    public void amountEmail(){
        List<Email> email = filterDomain();
        long total = email.stream().count();
        System.out.println("Total de correos email, hotmail y outlook  : " + total);
    }

    /**
     * Punto final
     * En la misma lista determinar si se envió un correo o no a cada uno de los correos,
     * si se le envió cambiar el estado en la lista,
     * TODO esto respetando la inmutabilidad.
     */
    public List<Email> sendEmail(){
        List<Email> email = filterDomain();
        return email.stream().map(newEmail -> {
            if(newEmail.getSend() == "si"){
                newEmail.setStatus(true);
            }
            return newEmail;
        }).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        Ejercicio01 ejercicio01 = new Ejercicio01();

        //System.out.println(ejercicio01.deleteDuplites()); TODO descomentar para compilar el punto A

        //System.out.println(ejercicio01.filterDomain()); TODO descomentar para compilar el punto B

        //ejercicio01.condition(); TODO descomentar para compilar el punto C

        //ejercicio01.amountEverybodyEmail(); TODO descomentar para compilar el punto D

        //ejercicio01.amountEmail(); TODO descomemnta para compilar el punto E

       /*var email = ejercicio01.sendEmail(); TODO descomentar para compilar el punto final
        List<Email> emailOrigin = DataUtil.getEmailList();
        System.out.println("Lista original " + emailOrigin);
        System.out.println("modificada " + email);*/
    }

}
