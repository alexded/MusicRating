package adg.musicrating.data.lindseystirling;

import java.util.List;

import adg.musicrating.Album;
import adg.musicrating.Artist;
import adg.musicrating.Composition;
import adg.musicrating.Rating;

public class BraveEnough implements Album {
	
	private Artist artist = new LindseyStirling();
	private String name = "Brave Enough";
	private int year = 2016;
	private List<Composition> compositions;
	private Rating rating;
	
	public Artist getArtist() { return this.artist; }
	public String getName() { return this.name; }
	public int getYear() { return this.year; }
	public List<Composition> getCompositions() { return this.compositions; }
	public Rating getRating() { return this.rating; }

}
