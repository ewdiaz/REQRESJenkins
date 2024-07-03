package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import interactions.GetRest;
import java.io.IOException;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.CodigoEstado;

public class reqResStepDefinitions {

  @Before
  public void before() throws IOException {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^que me encuentro con la uri de REQRES$")
  public void queMeEncuentroConLaUriDeREQRES() {
    OnStage.theActorCalled("").whoCan(CallAnApi.at("https://reqres.in/"));
  }

  @When("^realice el crud de los servicios$")
  public void realiceElCrudDeLosServicios() {
    OnStage.theActorInTheSpotlight().attemptsTo(GetRest.on());
  }

  @Then("^validare que el codigo de estado del servicio final sea (.*)$")
  public void validareQueElCodigoDeEstadoDelServicioFinalSea(String estado) {
    OnStage.theActorInTheSpotlight()
        .should(GivenWhenThen.seeThat(CodigoEstado.delServicio(estado)));
  }
}
