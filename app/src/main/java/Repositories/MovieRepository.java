package Repositories;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import domains.Movies;

import org.w3c.dom.ls.LSOutput;




public class MovieRepository {
        public static void main(String[] args) {
            try {
                //Collecting values for Movies Objects
                ObjectMapper mapper = new ObjectMapper();
                String movieJson = "{\"adult\":false,\"backdrop_path\":null,\"genre_ids\":[18,9648],\"id\":582585,\"original_language\":\"ja\",\"original_title\":\"\\u3044\\u306e\\u3061\\u306e\\u6d77\",\"overview\":\"\",\"poster_path\":\"\\/3zaXzsCBDkYmKRAFYNR5WuWsTcl.jpg\",\"release_date\":\"2001-04-07\",\"title\":\"Closed Ward\",\"video\":false,\"vote_average\":0.0,\"vote_count\":0,\"popularity\":0.6,\"id_imdb\":\"tt0263470\"}";
                //parses data into a data tree collection
                JsonNode jsonNode = mapper.readTree(movieJson);
                //pulls out specific data you want from node string data tree
                String movieTitle = String.valueOf(jsonNode.get("title"));

                System.out.println(movieTitle);

                //turn data into a String
                //movies.toString();




            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}


