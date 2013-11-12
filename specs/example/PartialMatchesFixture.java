package example;


import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

@RunWith(ConcordionRunner.class)
public class PartialMatchesFixture {
    private List<String> userNames = new ArrayList<String>();

    public void setUpUser(String userName) {
        this.userNames.add(userName);
    }

    public Iterable<String> getSearchResultsFor(String searchString) {
        SortedSet<String> result = new TreeSet<String>();
        for(String userName : userNames) {
            if(userName.contains(searchString))
                result.add(userName);
        }
        return result;
    }
}
