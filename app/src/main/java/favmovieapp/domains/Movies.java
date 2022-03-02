package favmovieapp.domains;

/** Movies is the class upon which the object Movies is built upon. Holding the variables and methods of said object.
 *
 */

public class Movies {
    private int rank;
    private String name;

    public Movies(){

    }

    public Movies(int rank, String name){
        this.rank = rank;
        this.name = name;
    }

    public int getRank(int rankInput) {
        return rank;
    }

    public String getName() {
        return name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Converts object into a printable version
    @Override
    public String toString() {
        return "Movies {" +
                "rank=" + rank +
                ", name=" + name + '\'' +
                '}';
    }
}
