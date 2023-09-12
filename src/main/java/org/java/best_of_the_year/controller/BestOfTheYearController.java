package org.java.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//Step 1
//Creare un nuovo progetto Spring Boot MVC + Thymeleaf usando lo Spring Initializr.
//Nel progetto aggiungere un controller che risponde alla root dell’applicazione,
// con un metodo che restituisce una view fatta con Thymeleaf in cui viene stampato un titolo:
// “Best of the year by …” (al posto dei puntini deve apparire il vostro nome,
// passato come attributo dal controller attraverso il Model).
//Aggiungere alla pagina due link che portano a:
//- “/movies”
//- “/songs”
//(i controller per queste due pagine verranno implementati allo Step 2)
//Step 2
//Creare all’interno della classe controller due metodi privati :
//- uno restituisce una lista di oggetti di tipo Movie - getBestMovies()
//- l’altro restituisce una lista di oggetti di tipo Song - getBestSongs()
//Creare le classi Movie e Song aventi almeno :
//- un id
//- un titolo
//Aggiungere al controller altri due metodi, che rispondono agli url
//- “/movies”
//- “/songs”
//In ognuno di questi metodi aggiungere al Model un attributo contenente la lista di migliori
// film o canzoni (in base al metodo che stiamo implementando. Utilizzare i due metodi getBestMovies()
// e getBestSongs() per recuperare la lista di film e canzoni.
//Creare i rispettivi template Thymeleaf in cui si mostrano i dati di ciascun film e canzone della lista
@Controller

@RequestMapping("/view")
public class BestOfTheYearController {
   @GetMapping

    public static String getMyName(Model model){
       return "Annunziata";
   }


}
