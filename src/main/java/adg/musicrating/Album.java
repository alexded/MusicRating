package adg.musicrating;

import java.util.List;

public interface Album {
	
	Artist getArtist();
	String getName();
	int getYear();
	List<Composition> getCompositions();
	Rating getRating();

}
