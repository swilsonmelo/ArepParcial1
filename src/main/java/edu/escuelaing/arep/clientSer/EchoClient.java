package edu.escuelaing.arep.clientSer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Servidor Cliente para probar el servidor montado en heroku
 */
public class EchoClient {

    /**
     * Método que ejecuta al servidor cliente
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        EchoClient service = new EchoClient();
        service.performPostCall();
    }

    /**
     * Método encargado del Post, en via como parametro una cadena de números separados por comas
     * @throws IOException
     */
    public void performPostCall() throws IOException {
        //Link de heroku
        URL url = new URL("https://swilson-arep-parcial1.herokuapp.com/calculate");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        String jsonInputString = "1,20,50,6,7,8";
        try (OutputStream os = con.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }

    }

}