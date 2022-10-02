package com.sequential.project.service;

import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import java.nio.charset.StandardCharsets;

import static org.apache.http.impl.client.HttpClients.createDefault;

public class RequestsService {
    public static final String ENDPOINT = "http://127.0.0.1:9011" ;

    public static String getString(String context) {
        CloseableHttpClient httpClient = createDefault();
        HttpGet httpGet = new HttpGet(ENDPOINT + context);
        RequestConfig requestConfig = RequestConfig.custom()
                .setCookieSpec(CookieSpecs.STANDARD)
                .build();
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        String responseString = "";
        try {
            response = httpClient.execute(httpGet);
            responseString = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
        }
        catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return responseString;
    }

}
