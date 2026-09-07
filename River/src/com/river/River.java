package com.river;

public class River{
	private Location location;
	private Confluence confluence;
	
	public River(Location location, Confluence confluence) {
		this.setLocation(location);
		this.setConfluence(confluence);
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Confluence getConfluence() {
		return confluence;
	}

	public void setConfluence(Confluence confluence) {
		this.confluence = confluence;
	}
}
