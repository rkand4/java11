package com.rocky.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class HttpNewApi {
  private static final String GOOGLE_URI = "http://www.google.com";

  public static void main(String[] args) throws IOException, InterruptedException {
    HttpNewApi httpNewApi = new HttpNewApi();
    httpNewApi.syncGET(GOOGLE_URI);
  }


  public HttpResponse<String> syncGET(String uri) throws IOException, InterruptedException {
    HttpClient client =  HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
                                      .GET()
                                      .uri(URI.create(uri))
                                      .build();
    HttpResponse<String> httpResponse = client.send(request, BodyHandlers.ofString());
    System.out.println(httpResponse.body());
    System.out.println(httpResponse.headers());
    return httpResponse;
  }

  public CompletableFuture<HttpResponse<String>> asyncGET(String uri) throws IOException, InterruptedException {
    HttpClient client =  HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create(uri))
        .build();
    CompletableFuture<HttpResponse<String>> httpResponseCompletableFuture = client
        .sendAsync(request, BodyHandlers.ofString());
    httpResponseCompletableFuture.whenComplete((resp,error) ->
    {
      if(error!=null){
        System.out.println(error);
      }else {
        System.out.println(resp.body());;
        System.out.println(resp.statusCode());;
      }

    });
    return httpResponseCompletableFuture;
  }





}
