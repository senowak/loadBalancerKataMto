package edu.iis.mto.serverloadbalancer;

public class VmBuildeer {

    private int size;

    public VmBuildeer ofSize(int size) {
        this.size = size;
        return this;
    }

    public Vm build() {
        // TODO Auto-generated method stub
        return new Vm();
    }

}
