import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenWeatherApp {

    public static void main(String[] args) {
        String apiKey = "723a27c163d43a3bad98e468dff8ffe6";
        String city = "London"; // Replace with the desired city

        try {
            // Construct the API URL
            String apiUrl = "http://api.openweathermap.org/data/2.5/weather" + city + "&appid=" + apiKey;

            // Create a URL object
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Check if the request was successful (HTTP status 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                // Parse and display the weather data
                System.out.println("Weather Data for " + city + ":");
                System.out.println(response.toString());
            } else {
                System.out.println("Error: Unable to fetch weather data.");
                System.out.println("HTTP response code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
