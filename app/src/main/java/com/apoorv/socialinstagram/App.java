package com.apoorv.socialinstagram;

import android.app.Application;

import com.parse.Parse;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LhIYo0nEkZ85muFNW0DoHw3r7W211RaP8XErfIT2")
                // if defined
                .clientKey("yI2bA5HBJuIfBi9C8ZCqHXzfMGjkFeGrZp01PkL8")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
