package com.nttdata.glue;

import com.nttdata.steps.ObtenerOrden;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ObtenerOrdenStepdefs {

    @Steps
    ObtenerOrden obtenerOrden;

        @When("consulto la tienda de mascota con IdMascota {int}")
        public void consultoLaTiendaDeMascotaConIdMascota(int idOrden) {
            obtenerOrden.consulta(idOrden);
        }


    @Then("valido el codigo de respuesta es {int}")
    public void validoElCodigoDeRespuestaEs(int statuscode) {
        obtenerOrden.validarStatusCode(statuscode);

    }
}
