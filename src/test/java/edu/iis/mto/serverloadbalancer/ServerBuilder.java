package edu.iis.mto.serverloadbalancer;

public class ServerBuilder {

    private int capaticy;

    public ServerBuilder withCapacity(int capacity) {
        this.capaticy = capacity;
        return this;
    }

    public Server build() {
        return new Server();
    }

}
