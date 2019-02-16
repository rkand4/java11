package com.rocky.http;

import java.io.IOException;
import java.net.http.HttpResponse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HttpNewApiTest {


  private HttpNewApi httpNewApi;

  @BeforeEach
  public  void init(){
    httpNewApi = new HttpNewApi();
  }



  @Test
  public void testAsyncHttpGet() throws IOException, InterruptedException {
    HttpResponse<String> httpResponse = httpNewApi.asyncGET("http://www.google.com")
        .join();
    assertTrue(!httpResponse.body().isBlank());
    assertTrue(200 == httpResponse.statusCode());
  }

  @Test
  public void testSyncHttpGet() throws IOException, InterruptedException {
    HttpResponse<String> httpResponse = httpNewApi.syncGET("http://www.google.com");
    assertTrue(!httpResponse.body().isBlank());
    assertTrue(200 == httpResponse.statusCode());
  }







}
