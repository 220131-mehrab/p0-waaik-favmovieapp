package favmovieapp.Service;

import favmovieapp.Repositories.MovieRepository;
import favmovieapp.domains.Movies;

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