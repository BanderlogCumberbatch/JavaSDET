import org.dao.Person;
import org.pages.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

/**
 * Класс тестов для simbirsoft.com.
 */
public class SimbirSoftTests extends BaseTest {

    /**
     * Действия при инициализации.
     */
    @BeforeMethod
    void initBeforeMethod() {
        open("/");
    }

    /**
     * Тесты модального окна для обратной связи.
     */
    @Test(description = "Show feedback modal window test")
    public void feedBackModalOpenTest() {
        page(MainPage.class)
                .showFeedbackModal()
                .checkModalWindowVisible()
                .checkTextInput();
        sleep(5000);
    }

    /**
     * Тест открытия станицы SDET и кнопки "Запись на консультацию".
     */
    @Test(description = "Open SDET page and consultation button check")
    public void SDETPageTest() {
        page(MainPage.class)
                .goToSDET()
                .SDETPageIsOpen()
                .consultationButtonCheck()
                .checkModalWindowVisible();

        sleep(5000);
    }

    /**
     * Тест открытия станицы контактов.
     */
    @Test(description = "Open Contacts page")
    public void openContactsPageTest() {
        page(MainPage.class)
                .goToContacts()
                .contactsPageIsOpen();
        sleep(7000);
    }

    /**
     * Тест создания объекта Person.
     */
    @Test(description = "Create Person test")
    public void createPersonTest() {
        Person person = new Person.Builder()
                .withName("Testoviy Test Testovich")
                .withAge(45)
                .withWeight(80)
                .build();
    }
}
