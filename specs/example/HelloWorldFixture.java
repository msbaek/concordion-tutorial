package example;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class HelloWorldFixture {
    private String currentTime;

    public String getGreeting() {
        if("09:00AM".equals(currentTime))
            return "Good Morning World!";
        return "Hello World!";
    }

    public String greetingFor(String firstName) {
        return String.format("Hello %s!", firstName);
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}
