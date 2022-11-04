package com.tg;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null){ //otherwise the program crashes
            this.exits = new HashMap<String, Integer>(exits); //creates a new map, which is seperated from the map exits (by reference)
        } else {
            this.exits = new HashMap<>();
        }

        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits); //new map is created, which has all the mappings from the "exits" map
        //it ensures that nothing outside our class can change "exits"
        //the getter returns a copy of "exits", so if the calling program wants to change "exits", then the "exits" mapping field won't be affected
    }
}
