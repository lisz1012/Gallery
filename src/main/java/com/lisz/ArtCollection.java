package com.lisz;

import java.util.ArrayList;
import java.util.List;

public class ArtCollection {
    // Collection简单起见这里就直接用List了
    private List<Item> items;

    public ArtCollection() {
        items = new ArrayList<>();
    }

    public ArtCollection(List<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public List<Item> search(String title) {
        List<Item> res = new ArrayList<>();
        for (Item item : items) {
            if (item.matches(title)) {
                res.add(item);
            }
        }
        return res;
    }

    public List<Item> search(Artist artist) {
        List<Item> res = new ArrayList<>();
        for (Item item : items) {
            if (item.matches(artist)) {
                res.add(item);
            }
        }
        return res;
    }

    public List<Item> search(Painter painter) {
        List<Item> res = new ArrayList<>();
        for (Item item : items) {
            if (item.matches(painter)) {
                res.add(item);
            }
        }
        return res;
    }
}
