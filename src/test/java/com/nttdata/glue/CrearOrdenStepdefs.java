package com.nttdata.glue;

import com.nttdata.steps.CrearOrden;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearOrdenStepdefs {

    @Steps
    CrearOrden crearOrden;

    @When("deseo crear una nueva orden petId {int}, quantity {int}, status {string} y complete {boolean}\"")
    public void crearOrden(int petId, int quantity, String status) {
        crearOrden.crearOrden(petId, quantity, status);
    }

    @Then("El código de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
        crearOrden.validarCodigoDeRespuesta(statusCode);
    }


}
