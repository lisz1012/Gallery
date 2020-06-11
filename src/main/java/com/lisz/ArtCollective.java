package com.lisz;

import java.util.Arrays;
import java.util.List;

public class ArtCollective extends Creator {
    private List<Artist> artists;

    public ArtCollective(String name, List<Artist> artists) {
        this.name = name;
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public List<Artist> getArtists() {
        return artists;
    }
}
