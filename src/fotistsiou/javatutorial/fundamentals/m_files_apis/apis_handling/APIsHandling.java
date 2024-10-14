package fotistsiou.javatutorial.fundamentals.m_files_apis.apis_handling;

/* HTTP Client API */
// -> The Apache HTTP Client is a very robust library, suitable for both simple and advanced use cases when testing HTTP endpoints.
// -> HTTP Client provides synchronous and asynchronous request mechanisms.
// -> The API consists of three core classes:
//    - HttpRequest represents the request to be sent via the HttpClient.
//    - HttpClient behaves as a container for configuration information common to multiple requests.
//    - HttpResponse represents the result of an HttpRequest call.

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class APIsHandling {
    public static void main(String[] args) {
        // Use the "get" method to make an HTTP GET request to a specified URI.
        String response = get("https://api.chucknorris.io/jokes/random");
        System.out.println(response);
    }

    // HTTP GET request to a specified URI and return the response body as a String.
    public static String get(String uri) {
        // 1. Creates a new instance of HttpClient using the default settings.
        HttpClient client = HttpClient.newHttpClient();
        // 2. Constructs an HttpRequest with the provided URI and use the GET method.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();
        try {
            // 3. Sends the HTTP request synchronously and obtains the response body as a String.
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // 4. Returns the String body response.
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
