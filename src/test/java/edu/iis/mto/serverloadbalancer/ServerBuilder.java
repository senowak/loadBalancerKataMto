package edu.iis.mto.serverloadbalancer;

public class ServerBuilder implements Builder<Server> {

    private int capaticy;

    public ServerBuilder withCapacity(int capacity) {
        this.capaticy = capacity;
        return this;
    }

    @Override
    public Server build() {
        return new Server();
    }

    public static ServerBuilder server() {
        return new ServerBuilder();
    }

}
