package org.launchcode.techjobs_oo;


public class Location extends JobField{
    
    public Location(String aValue) {
    	super(aValue);
    }

    // Custom toString, equals, and hashCode methods:

    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location locationA = (Location) o;
        return getId() == locationA.getId();
    }

    
}
