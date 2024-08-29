package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class ahorcado {

    @Controller("/hangman")

    public String longitud{
        @GetMapping(value = “/longitud”)

        private String[] animales = {"leon", "elefante", "tigre", "cebra", "jirafa", "delfin", "ballena", "gorila", "panda", "aguila", "hipopotamo", "koala", "lobo", "oso", "canguro"};
        private String[] frutas = {"manzana", "platano", "kiwi", "mango", "pera", "uva", "fresa", "naranja", "piña", "sandia", "cereza", "melon", "papaya", "limon", "higo"};
        private String[] paises = {"Mexico", "Canada", "Brasil", "España", "Francia", "Italia", "Alemania", "Japon", "Australia", "Argentina", "Chile", "Peru", "Estados Unidos", "China", "India"};

    }


    private String[] getWordList(String theme) {
        switch (theme) {
            case "animales":
                return animales;
            case "frutas":
                return frutas;
            case "paises":
                return paises;
            default:
                return new String[]{};
        }
    }


}