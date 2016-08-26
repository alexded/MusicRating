package adg.musicrating.data.lindseystirling;

import java.time.Duration;
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
	
	public BraveEnough() {
		String[] tracks = new String[] { 
			"01 | Lost Girls | 04:35 | ?/1", 
			"02 | Brave Enough ( feat. Christina Perri | 04:23 | ?/1",
			"03 | The Arena | 03:52 | ?/1",
			"04 | The Phoenix | 04:04 | ?/1",
			"05 | Where Do We Go ( feat. Carah Faye ) | 04:15 | ?/1",
			"06 | Those Days ( feat. Dan + Shay ) | 03:46 | ?/1",
			"07 | Prism | 03:32 | ?/1",
			"08 | Hold My Heart ( feat. ZZ Ward ) | 03:29 | ?/1",
			"09 | Mirage ( feat. Raja Kumari ) | 04:22 | ?/1",
			"10 | Don't Let This Feeling Fade ( feat. Rivers Cuomo & Lecrae ) | 03:36 | ?/1",
			"11 | First Light | 03:23 | ?/1",
			" |  |  | ?/1"
		};
		Composition composition01 = new Composition();
		composition01.setPosition( 1 );
		composition01.setName( "Lost Girls" );
		composition01.setDuration( Duration.parse( "PT4M35S" ));
		composition01.setRating( new Rating() );
	}
	
	public Artist getArtist() { return this.artist; }
	public String getName() { return this.name; }
	public int getYear() { return this.year; }
	public List<Composition> getCompositions() { return this.compositions; }
	public Rating getRating() { return this.rating; }

}
