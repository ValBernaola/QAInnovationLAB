package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import java.text.SimpleDateFormat;
import java.util.Date;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CrearOrden {

    // Generación de la fecha actual
    String date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(new Date());

    private static String CREATE_ORDEN = "https://petstore.swagger.io/v2/store/order";

    @Step("Crear orden {0} en PetStore")
    public void crearOrden(int petId, int quantity, String status){
        SerenityRest.given()
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"petId\": \""+petId+"\",\n" +
                        "  \"quantity\": \""+quantity+"\",\n" +
                        "  \"status\": \""+status+"\",\n" +
                        "}")
                .log().all()
                .post(CREATE_ORDEN)
                .then()
                .statusCode(200)
                .log().all();
    }

    @Step("Validar codigo de respuesta {0}")
    public void validarCodigoDeRespuesta(int statuscode) {
        restAssuredThat(response -> response.statusCode(statuscode));
    }
}
