package de.berlin.fu.wego.model;

import java.util.List;

/**
 * Created by Soeren Titze on 20.06.2016.
 */
public class Journey {
    private Address startingAddress;
    private List<Route> routes;

    public Address getStartingAddress() {
        return startingAddress;
    }

    public void setStartingAddress(Address startingAddress) {
        this.startingAddress = startingAddress;
    }

    public List<Route> getRoutes() {
        return routes;
    }
}
