package com.driver;

public class RWOnly {
    private String name;
    // if we direct access name it shows error that java: name has private access in com.driver.RWOnly
    // in order to resolve the issue create a getter & setter function

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
