package be.ehb.demo_maven;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.chucknorris.io/jokes/random")
                .build();
        try {
            Response response = client.newCall(request).execute();
            String responseText = Objects.requireNonNull(response.body()).string();
            System.out.println(responseText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
