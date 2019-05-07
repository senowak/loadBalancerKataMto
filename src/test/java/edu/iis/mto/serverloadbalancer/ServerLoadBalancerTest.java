package edu.iis.mto.serverloadbalancer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class ServerLoadBalancerTest {

    @Test
    public void itCompiles() {
        assertThat(true, equalTo(true));
    }

    @Test
    public void balancingServerWithNoVms_serverStayEmpty() {
        Server theServer = a(ServerBuilder.server()
                                          .withCapacity(1));
        balancing(aServerListWith(theServer), aEmptyOfListVms());

        assertThat(theServer, CurrentLoadPercentageMatcher.hasCurrentLoad(0.0d));

    }

    private void balancing(Server[] servers, Vm[] vms) {
        new ServerLoadBalancer().balance(servers, vms);

    }

    private Vm[] aEmptyOfListVms() {
        return new Vm[0];
    }

    private Server[] aServerListWith(Server... servers) {
        return servers;
    }

    private Server a(ServerBuilder builder) {
        return builder.build();
    }

}
