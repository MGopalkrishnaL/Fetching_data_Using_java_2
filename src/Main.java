import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello world!");
        String url = "https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=a91843d8eb1a4e618bbb362d2b6cf5c5&include=minutely";
        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpResponse<String> response = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(response.statusCode());
    }

}