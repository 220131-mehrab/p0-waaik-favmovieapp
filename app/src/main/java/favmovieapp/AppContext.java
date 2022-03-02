package favmovieapp;

import favmovieapp.Repositories.MovieRepository;
import favmovieapp.Service.MovieService;

/** AppContext is here to build the MovieRepository and MovieService objects, so that their methods can used in the App class.
 * Built with the source data that the MovieRepository and MovieService will be using.
 */

public class AppContext {

    //App context
    private final static String movieCSVFile = "combined_rank_ordered_list.csv";
    private static MovieRepository movieRepository;
    private static MovieService movieService;
    //Will build the program running the load and parse functions of the App = Abstraction
    public static void build() {
        movieRepository = new MovieRepository(movieCSVFile); //Calling upon Movie Repository to pull in and parse src data
        movieService = new MovieService(movieRepository); //Injection
    }

    public static MovieRepository getMovieRepository() {
        return movieRepository;
    }

    public static MovieService getMovieService() {
        return movieService;
    }
}

