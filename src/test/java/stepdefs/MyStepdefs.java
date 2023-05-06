package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("deneme")
    public void deneme() {
        System.out.println("Konsol Çıktısı : My Third Job");
    }

    @When("ikinci çıktıyı verelim")
    public void ikinciÇıktıyıVerelim() {
        System.out.println("myBranch te oluşturuldu");
    }

    @And("üçüncü çıktıyı verelim")
    public void üçüncüÇıktıyıVerelim() {
        System.out.println("üçüncü çıktımızdır");
    }
}
