package favmovieapp;

import favmovieapp.domains.Movies;
import org.junit.Test;

public class MoviesTest {
    @Test
    public void constructorTest(){;
        String movieJson = "{\"adult\":false,\"backdrop_path\":null,\"genre_ids\":[18],\"id\":292767,\"original_language\":\"en\",\"original_title\":\"Clean and Narrow\",\"overview\":\"An ex-convict tries to make an honest living and take care of his girlfriend and her mentally slow brother.\",\"poster_path\":\"\\/tRG75Q8h9ghfs4RbpCXnQCbjD3P.jpg\",\"release_date\":\"1999-01-02\",\"title\":\"Clean and Narrow\",\"video\":false,\"vote_average\":0.0,\"vote_count\":0,\"popularity\":1.095,\"id_imdb\":\"tt0212059\"}";
        Movies movies = new Movies(movieJson);

    }


}
