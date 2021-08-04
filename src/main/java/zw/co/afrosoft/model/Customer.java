package zw.co.afrosoft.model;

import javax.validation.constraints.NotNull;

public class Customer {
    @NotNull(message = " name must not be null")
    private String name;
    @NotNull(message = "location must not be null")
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
