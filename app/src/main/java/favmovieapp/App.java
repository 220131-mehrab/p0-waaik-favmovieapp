/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package favmovieapp;


public class App {

    public static void main(String[] args) {
        //App context. Returns the Service and Repository methods
        AppContext.build();

        String search = "The Godfather";
        System.out.println(AppContext.getMovieService().searchByName(search));


        //Serve on Tomcat Server
       // Tomcat server = new Tomcat();
        //server.getConnector();
       // server.addContext("", null);
        //server.addServlet("", "moviesServlet", new HttpSer);
    }
}