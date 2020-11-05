package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
		
	private int id;
	private static int nextId = 1;	
	private String value;

	public JobField() {
		id = nextId;
		nextId++;
	}
	
	public JobField(String aValue) {
		this();
		value = aValue;
	}
	
	@Override
    public String toString() {
        return value;
    }
	
	@Override
    public int hashCode() {
        return Objects.hash(id);
    }
	
	
	public int getId() {
		return id;
	}

	public String getValue() {
		
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}  
	
	
}
