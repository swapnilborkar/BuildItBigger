/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.SWAPNIL.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
  name = "jokeApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.SWAPNIL.example.com",
    ownerName = "backend.myapplication.SWAPNIL.example.com",
    packagePath=""
  )
)
public class JokesEndpoint {

    @ApiMethod(name = "putJoke")
    public JokeBean putJoke(JokeBean joke) {
//        JokeBean response = new JokeBean();
//        response.setData("Hi, " + name);

        return joke;
    }

}
