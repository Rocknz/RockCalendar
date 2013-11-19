package com.example.rockcalendar;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeRequestUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;

public class RockActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        HttpTransport httpTransport = new NetHttpTransport();
        JacksonFactory jsonFactory = new JacksonFactory();

        // The clientId and clientSecret are copied from the API Access tab on
        // the Google APIs Console
        String clientId = "YOUR_CLIENT_ID";
        String clientSecret = "YOUR_CLIENT_SECRET";

        // Or your redirect URL for web based applications.
        String redirectUrl = "urn:ietf:wg:oauth:2.0:oob";
        String scope = "https://www.googleapis.com/auth/calendar";
        List<String>  a = null;
        a.add(scope);
        // Step 1: Authorize -->
        String authorizationUrl = new GoogleAuthorizationCodeRequestUrl(clientId, redirectUrl, a).build();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.rock, menu);
        return true;
    }
    
}
