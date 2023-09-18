package org.example;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            String URL = "https://chercher.tech/sample/api/product/read.php";

            Utility utl = new Utility();

            String response = utl.getMethod(URL);

            System.out.println(response);

            String updateURL = "https://chercher.tech/sample/api/product/update";

            JSONParser parser = new JSONParser();
            //Use JSONObject for simple JSON and JSONArray for array of JSON.
            JSONObject data = (JSONObject) parser.parse(
                    new FileReader("C:\\Users\\DELL\\IdeaProjects\\NewMavenType\\src\\main\\java\\org\\example\\body.json"));//path to the JSON file.

            String json = data.toJSONString();

            String res2 = utl.postMethod(json,updateURL);

            System.out.println("Res2"+res2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}