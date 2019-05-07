package edu.iis.mto.serverloadbalancer;

public class VmBuildeer implements Builder<Vm> {

    private int size;

    public VmBuildeer ofSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public Vm build() {
        // TODO Auto-generated method stub
        return new Vm();
    }

    public static VmBuildeer vm() {
        return new VmBuildeer();
    }
}
