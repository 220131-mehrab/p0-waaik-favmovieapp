package favmovieapp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private List<String> movies; //Setup data structure
    private File file; //File variable
    public MovieRepository(String filename) { //Construct fields of data structure
        this.movies = new ArrayList<>();
        this.file = new File("" + filename);
        load(); //load file
    }
    //setup Input stream method of API data
    private void InputStream() {
    }
    //load data into repository method
    private void load(){


            }
        }
    }
}
