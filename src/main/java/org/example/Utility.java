package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Utility {



    public String getMethod(String URL)
    {
      String response =  RestAssured.given()
                .when()
                .get(URL)
                .prettyPrint();

      return response;

    }

    public String postMethod(String body, String URL)
    {
        String res =RestAssured.given()
                .when()
                .contentType(ContentType.JSON)
                .body(body)
                .post(URL)
                .prettyPrint();
        return res;
    }
}
