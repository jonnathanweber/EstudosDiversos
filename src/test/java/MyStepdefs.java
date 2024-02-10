import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import my.groupId.GreetingResource;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {
    private GreetingResource greetingResource;
    private String retorno;
    @Dado("que a aplicação está inicializada")
    public void queAAplicaçãoEstáInicializada() {
        greetingResource = new GreetingResource();
    }

    @Quando("o método main for invocado")
    public void oMétodoMainForInvocado() {
        retorno = greetingResource.hello();
    }

    @Então("deve retornar {}")
    public void deveRetornarUmaString(String arg0) {
        Assertions.assertEquals(retorno, arg0);
    }

}
