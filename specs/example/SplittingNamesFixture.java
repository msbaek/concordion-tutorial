package example;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

@RunWith(ConcordionRunner.class)
public class SplittingNamesFixture {
    public Map<String, String> split(String fullName) {
        Map<String, String> result = new HashMap<String, String>();
        result.put("firstName", fullName.split(" ")[0]);
        result.put("lastName", fullName.split(" ")[1]);
        return result;
    }
}
