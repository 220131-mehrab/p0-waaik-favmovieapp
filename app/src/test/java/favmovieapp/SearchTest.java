package favmovieapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import favmovieapp.domains.Movies;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static favmovieapp.App.mapper;

public class SearchTest {

    @Test
    public void SearchParseTest()  {
        //Data inputstream of src file
        InputStream file = getClass().getClassLoader().getResourceAsStream("tmdb-movies-2000.json");
        //Declarating the Json Node
        JsonNode movieNode = null;
        try {
            //Reading through and parsing file into mapper tree
            movieNode = mapper.readValue(file, JsonNode.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //String movieJson = "{\"adult\":false,\"backdrop_path\":null,\"genre_ids\":[18],\"id\":292767,\"original_language\":\"en\",\"original_title\":\"Clean and Narrow\",\"overview\":\"An ex-convict tries to make an honest living and take care of his girlfriend and her mentally slow brother.\",\"poster_path\":\"\\/tRG75Q8h9ghfs4RbpCXnQCbjD3P.jpg\",\"release_date\":\"1999-01-02\",\"title\":\"Clean and Narrow\",\"video\":false,\"vote_average\":0.0,\"vote_count\":0,\"popularity\":1.095,\"id_imdb\":\"tt0212059\"}";

            //movieNode = mapper.readValue(movieJson, JsonNode.class);
            String movieTitle = String.valueOf(movieNode.get("title"));
            String movieOverview = String.valueOf(movieNode.get("overview"));
            String movieReleaseDate = String.valueOf(movieNode.get("release_date"));
            Assert.assertEquals("\"Closed Ward\"", String.valueOf(movieNode.get("title")));
        System.out.println(movieTitle);
        System.out.println(movieOverview);
        System.out.println(movieReleaseDate);



    }

}
