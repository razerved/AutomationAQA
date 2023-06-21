import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamXMLTest {

    /**
     * Без Optional вычитываем из файла param ( запускать нужно файл -> прав клик Run )
     * Optional нужен для того чтобы использовать заданый default
     */
    @Parameters({"login-value", "password-value"})
    @Test
    public void paramTest(@Optional("Default logAn") String log,@Optional("Default pasW") String pass){
        System.out.println("Login: " + log + "\n" +
                "Pass: " + pass);
    }


}
