package domains;

public class Movies {
    //creating Movie variables
    private String adult;
    private String backdrop_path;
    private String id;
    private String title;
    private String vote_average;
    private String vote_count;
    private String popularity;
    private String genre_ids;
    private String original_language;
    public String original_title;
    private String overview;
    private String poster_path;
    private String release_date;
    private String video;
    private String id_imbd;
    //initializing Movie object
    public Movies(){
        super();
    }




    //initializing Movies variables
    public Movies(String adult, String backdrop_path, String id, String title, String vote_average, String vote_count, String popularity, String genre_ids, String original_language, String original_title, String overview, String poster_path, String release_date, String video, String id_imbd) {
        this.adult = adult;
        this.backdrop_path = backdrop_path;
        this.id = id;
        this.title = title;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
        this.popularity = popularity;
        this.genre_ids = genre_ids;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.video = video;
        this.id_imbd = id_imbd;
    }
    //setting up get methods for variables to save values
    public String getAdult() {return adult;}

    public String getBackdrop_path() {return backdrop_path;}

    public String getId() {return id;}

    public String getTitle() {return title;}

    public String getVote_average() {return vote_average;}

    public String getVote_count() {return vote_count;}

    public String getPopularity() {return popularity;}

    public String getGenre_ids() {
        return genre_ids;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getVideo() {
        return video;
    }

    public String getId_imbd() {
        return id_imbd;
    }
}
