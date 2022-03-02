package favmovieapp.Service;

import favmovieapp.Repositories.MovieRepository;
import favmovieapp.domains.Movies;

/** MovieService is where the data from the parsed source data, in the MovieRepository, is injected into MovieService to make it possible that you can search the movie database by name.
 *
 */

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) { //Dependency Injection. Service is dependent on an instance of object Repository
        this.movieRepository = movieRepository;
    }


    public  String searchByName(String searchInput) {
        for (Movies movie : movieRepository.getMovies()) {
            if (movie.getName().equalsIgnoreCase(searchInput)) {
                return movie.getName();

            }
        }
        return null;
    }public String searchByRank(int rankInput) {
        for (Movies movie : movieRepository.getMovies()) {
            if (movie.getRank(rankInput) != 0)
                return movie.getName();

            }return null;
        }

}