package favmovieapp;

import favmovieapp.domains.Movies;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;




public class SearchTest {
    static List<Movies> movies;

    @Before
    public static void setup() {
        movies = AppContext.getMovieRepository().getMovies();
    }

    @Test
    public void SearchByRankTest() {
        //List<Movies> lines = MovieRepository.parseMovies(loadCSV("combined_rank_ordered_list.csv");
        String givenMovie = "The Godfather";
        String result = AppContext.getMovieService().searchByRank(1);
        Assert.assertEquals(givenMovie, result);

    }
}

