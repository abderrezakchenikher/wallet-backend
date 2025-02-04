package com.mywallet;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/get-didcomm-url")
public class DidcommResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> getDidcommUrl() {
        String didcommUrl = "didcomm://traction-acapy-test.apps.silver.devops.gov.bc.ca?oob=eyJAdHlw..."; // Généré dynamiquement

        Map<String, String> response = new HashMap<>();
        response.put("url", didcommUrl);
        
        return response;
    }
}

