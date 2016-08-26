package adg.musicrating;

import java.time.Duration;

public class Composition {

	private String name;
	private int position;
	private Duration duration;
	private Rating rating;

	public void setName( String name ) { this.name = name; }
	public String getName() { return name; }

	public void setPosition( int position ) { this.position = position; }
	public int getPosition() { return position; }

	public void setDuration( Duration duration ) { 	this.duration = duration; }
	public Duration getDuration() { return duration; }

	public void setRating( Rating rating ) { this.rating = rating; }
	public Rating getRating() { return rating; }

}
