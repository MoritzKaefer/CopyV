
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void CopyV_Given_WeWantToSeeAWelcomeMessage_When_WeGetTheMessage_Then_theMessageShouldBeExactlyHelloCopyV(){
        //arrange

        //act
        String actual = Main.GetMessage();
        //assert
        Assertions.assertEquals("hello CopyV", actual);
    }
}
