package edu.iis.mto.serverloadbalancer;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class CurrentLoadPercentageMatcher extends TypeSafeMatcher<Server> {

    private double expectedLoadPercentage;

    public CurrentLoadPercentageMatcher(double expectedLoadPercentage) {
        this.expectedLoadPercentage = expectedLoadPercentage;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a server with load percentage of ")
                   .appendValue(expectedLoadPercentage);
    }

    @Override
    protected void describeMismatchSafely(Server item, Description description) {
        description.appendText("a server with load percentage of ")
                   .appendValue(item.currentLoadPercetage);
    }

    @Override
    protected boolean matchesSafely(Server server) {
        return doubleAreEquel(expectedLoadPercentage, server.currentLoadPercetage);
    }

    private boolean doubleAreEquel(double d1, Double d2) {
        return d1 == d2 || Math.abs(d1 - d2) < 0.01d;
    }

    public static CurrentLoadPercentageMatcher hasCurrentLoad(double expectedLoadPercentage) {
        return new CurrentLoadPercentageMatcher(expectedLoadPercentage);
    }

}
