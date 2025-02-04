package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

public class ObtenerOrden {
    private String URL_BASE = "https://petstore.swagger.io/v2";

    public void consulta(int idOrden) {
        System.out.println("test");
        SerenityRest.given()
                .baseUri(URL_BASE)
                .relaxedHTTPSValidation()
                .log().all()
                .get("store/order/" + String.valueOf(idOrden))
                .then()
                .log().all();
    }

    public void validarStatusCode(int statuscode) {
        Assert.assertEquals(statuscode, SerenityRest.lastResponse().getStatusCode());
    }
}
