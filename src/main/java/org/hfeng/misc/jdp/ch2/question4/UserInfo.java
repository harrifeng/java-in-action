package org.hfeng.misc.jdp.ch2.question4;

import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
public class UserInfo {
    private final StringBuffer info;

    public UserInfo(String name, String address) {
        this.info = new StringBuffer("<info name=\"" + name + "\" address=\""
                + address + "\" />");
    }

    public StringBuffer getInfo() {
        return info;
    }

    public String toString() {
        return "[ User Info: " + info + " ]";
    }
}
