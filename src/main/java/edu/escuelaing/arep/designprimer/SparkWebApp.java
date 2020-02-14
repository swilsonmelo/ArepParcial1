package edu.escuelaing.arep.designprimer;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

import com.google.gson.Gson;



public class SparkWebApp {

    

    public static void main(String[] args) {
        port(getPort());
        /*
        get("/hello", (req, res) -> "Hello Heroku nellll");
        */
        staticFiles.location("/views");
        Gson gson = new Gson();
        get("/statistics", (request, response) -> {
            response.redirect("/index.html");
            response.status(200);
            return null;
        });

        post("/statistics/calculate/", (req, res) -> {
            //res.type("application/json");
            // res.status(201);
            System.out.println(req.body());                        
            return gson.toJson("");

        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set(i.e. on localhost)
    }
}