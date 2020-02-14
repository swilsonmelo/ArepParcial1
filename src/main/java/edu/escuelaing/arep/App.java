package edu.escuelaing.arep;


import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

import com.google.gson.Gson;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        port(getPort());
        
        get("/hello", (req, res) -> "Hello Heroku");
       
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set(i.e. on localhost)
    }
}
