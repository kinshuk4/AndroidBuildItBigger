/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.kchandra.myapplication.backend;

import com.example.Joker;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokerapi",
        version = "v1",
        description = "This api tells a joke.",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.kchandra.example.com",
                ownerName = "backend.myapplication.kchandra.example.com",
                packagePath = ""
        )
)
public class JokeEndPoint {

    @ApiMethod(name = "tellJoke")
    public JokeModel tellJoke() {
        return new JokeModel(Joker.tellJoke());
    }

}
