package org.java.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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

    public String getMyName(Model model){
      String myName = "Annunziata Posillipo";
      model.addAttribute("name", myName);
      return "index";
   }

  private List<Movies> getBestMovies(){
       List <Movies> bestMovies = new ArrayList<>();

       bestMovies.add(new Movies(1, "L'enigmista"));
       bestMovies.add(new Movies(2, "Star Wars"));
       bestMovies.add(new Movies(3, "Il silenzio degli innocenti"));
       bestMovies.add(new Movies(4, "American Pie"));

       return bestMovies;
   }

   private List<Songs> getBestSongs(){
       List <Songs> bestSongs = new ArrayList<>();

       bestSongs.add(new Songs(1, "The show must go on"));
       bestSongs.add(new Songs(2, "Thriller"));
       bestSongs.add(new Songs(2, "November rain"));
       bestSongs.add(new Songs(2, "Bocca di rosa"));
       bestSongs.add(new Songs(2, "Non è Francesca"));
       return bestSongs;
   }

@GetMapping("/movies")
    public String bestMovies(Model model) {
    model.addAttribute("bestMovies", getBestMovies());
    return "index";
}
@GetMapping("/songs")
    public String bestSongs(Model model){
       model.addAttribute("bestSongs", getBestSongs());
       return "index";

   }
}
