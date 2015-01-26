package org.hfeng.misc.jdp.ch2.question6.notsafe;


public class ImmutablePerson {
    private final String name;
    private final String address;

    public ImmutablePerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ImmutablePerson(MutablePerson person) {
        this.name = person.getName();
        this.address = person.getAddress();
    }

    public MutablePerson getMutablePerson() {
        return new MutablePerson(this);
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return  name;
    }

    public String toString() {
        return "[ ImmutablePerson " + name + ", " + address + " ]";
    }
}
