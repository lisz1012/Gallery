package com.lisz;

public class Painting extends Item{

    public Painting(Painter painter, String title, int year) {
        super(painter, title, year);
    }

    public Painting(ArtCollective artCollective, String title, int year) {
        super(artCollective, title, year);
    }

    @Override
    public boolean matches(Creator creator) {
        if (super.matches(creator)) {
            return true;
        } else if (this.creator instanceof ArtCollective && creator instanceof Painter) {
            ArtCollective artCollective = (ArtCollective)this.creator;
            for (Artist artist : artCollective.getArtists()) {
                if (artist == creator) {
                    return true;
                }
            }
        }
        return false;
    }
}
