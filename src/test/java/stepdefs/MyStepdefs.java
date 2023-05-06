package stepdefs;

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
}
