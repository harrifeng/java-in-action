package org.hfeng.book.dpj.ch7.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Object construct() {
        builder.makeTitle("Greeting");
        builder.makeString("From morning to night");
        builder.makeItems(new String[] {
                "Good Morning",
                "Good Noon",
        });
        builder.makeString("Night now");
        builder.makeItems(new String[]{
                "Good Night",
                "Have a good dream",
                "Goodbye!",
        });
        return builder.getResult();
    }
}
