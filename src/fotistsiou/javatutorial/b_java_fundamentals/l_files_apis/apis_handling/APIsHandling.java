package fotistsiou.javatutorial.b_java_fundamentals.l_files_apis.apis_handling;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

/**
 * HTTP Client API
 * -> The Apache HTTP Client is a very robust library, suitable for both simple and advanced use cases when testing HTTP endpoints.
 * -> HTTP Client provides synchronous and asynchronous request mechanisms.
 * -> The API consists of three core classes:
 *    - HttpRequest represents the request to be sent via the HttpClient.
 *    - HttpClient behaves as a container for configuration information common to multiple requests.
 *    - HttpResponse represents the result of an HttpRequest call.
 */

public class APIsHandling {

    public static void main(String[] args) {
        // Use the "fetchResponseFromUri" method
        String response = APIsHandling.fetchResponseFromUri("https://api.chucknorris.io/jokes/random");
        System.out.println(response);

        // Use the "fetchJsonValue" method
        String joke = APIsHandling.fetchJsonValue(
                "https://api.chucknorris.io/jokes/random",
                "value"
        );
        System.out.println("The joke of the day is: " + joke);

        // Use the "fetchAndDisplayJsonValueAtIndex" method
        // -> Call the method to fetch the meal name from the API
        Optional<String> value = fetchJsonValueAtIndex(
                "https://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata",
                "meals",
                0,
                "strMeal"
        );
        // -> Handle the retrieved value
        value.ifPresentOrElse(
                meal -> System.out.println("Meal: " + meal), // If present, print the meal
                () -> System.out.println("Failed to retrieve the meal.") // If absent, notify failure
        );
    }

    /**
     * Makes an HTTP GET request to the specified URI and returns the response body as a String.
     *
     * @param uri The URI to which the HTTP GET request is sent.
     * @return The response body as a String.
     */
    public static String fetchResponseFromUri(String uri) {
        // Creates a new instance of HttpClient with default settings.
        HttpClient client = HttpClient.newHttpClient();

        // Builds an HttpRequest using the provided URI and sets the HTTP method to GET.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();

        try {
            // Sends the request synchronously and captures the response body as a String.
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Returns the response body as a String.
            return response.body();
        } catch (IOException | InterruptedException e) {
            // If an IOException or InterruptedException occurs during the request, the method throws a RuntimeException.
            throw new RuntimeException(e);
        }
    }

    /**
     * Sends a GET request to the specified URI, parses the JSON response, and retrieves the value associated
     * with the specified key from the JSON object.
     *
     * @param uri The URI to which the HTTP GET request is sent.
     * @param key The key whose associated value is to be retrieved from the JSON object.
     * @return The value associated with the specified key as a String, or null if the key does not exist.
     */
    public static String fetchJsonValue(String uri, String key) {
        // Fetch the response from the provided URI
        String response = fetchResponseFromUri(uri);

        // Parse the response string into a JsonObject using Gson
        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();

        // Retrieve the value associated with the specified key
        JsonElement jsonElement = jsonObject.get(key);

        // Check if the key exists and retrieve its value
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            return jsonElement.getAsString();
        } else {
            return "Key '" + key + "' does not exist in the JSON response.";
        }
    }

    /**
     * Sends a GET request to the specified URI, parses the JSON response, and retrieves the value of a specified
     * child key from a JSON object at the given index within a JSON array associated with the provided key.
     *
     * @param uri      The URI to which the HTTP GET request is sent.
     * @param key      The key whose associated JSON array is accessed.
     * @param index    The index of the element in the JSON array to retrieve.
     * @param childKey The key whose associated value is to be retrieved from the JSON object.
     * @return An Optional containing the value associated with the specified child key, or an empty Optional if not found.
     */
    public static Optional<String> fetchJsonValueAtIndex(String uri, String key, int index, String childKey) {
        // Fetch the response from the provided URI
        String response = fetchResponseFromUri(uri);

        // Parse the response string into a JsonObject using Gson
        JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();

        // Check if the value associated with the provided key is a JSON array
        if (jsonObject.get(key).isJsonArray()) {
            JsonArray jsonArray = jsonObject.get(key).getAsJsonArray();

            // Check if the element at the specified index is a JSON object
            if (jsonArray.size() > index && jsonArray.get(index).isJsonObject()) {
                JsonObject jsonObject2 = jsonArray.get(index).getAsJsonObject();

                // Check if the child key exists and return its value wrapped in Optional
                if (jsonObject2.has(childKey)) {
                    return Optional.of(jsonObject2.get(childKey).getAsString());
                } else {
                    // Inform the user that the specified child key does not exist
                    System.out.println("Key '" + childKey + "' does not exist in the JSON object at index " + index);
                }
            } else {
                // Inform the user if no JSON object is found at the specified index
                System.out.println("No JSON object found at index " + index);
            }
        } else {
            // Inform the user if the associated value is not a JSON array
            System.out.println("The value associated with the key '" + key + "' is not a JSON array.");
        }

        // Return an empty Optional if the key or index is invalid
        return Optional.empty();
    }
}
