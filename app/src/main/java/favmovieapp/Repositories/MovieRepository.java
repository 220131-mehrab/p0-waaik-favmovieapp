package favmovieapp.Repositories;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import favmovieapp.domains.Movies;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MovieRepository {
    private static List<Movies> movies;


    public MovieRepository(String movieCSVFile) {
        loadCSV(movieCSVFile);

    }

    public static List<Movies> getMovies() {
        return movies;
    }

    private void loadCSV(String movieCSVFile) {
        //Load CSV into BufferedReader
            try {
               URI uri = Objects.requireNonNull(MovieRepository.class.getClassLoader().getResource(movieCSVFile)).toURI();
               Path filepath = Paths.get(Objects.requireNonNull(uri));
                BufferedReader br = Files.newBufferedReader(filepath);
                parseMovies(br);
            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch (IOException e) {
                System.err.println("Couldn't load file");
                e.printStackTrace();
        }
    }

    private void parseMovies(BufferedReader br)  {
        this.movies = new ArrayList<>();
        //Read and parse Using OpenCSV
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser).withSkipLines(1).build();
        List<String[]> lines = null;
        try {
            lines = reader.readAll();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            e.printStackTrace();
        }



        //parsing function into Movies Array
        for (String[] columns : lines){
            this.movies.add(new Movies(Integer.parseInt(columns[0]), columns[1])); //Adding parsed data into new Moives object

        }
        //movies.forEach(System.out::println);

    }



}








