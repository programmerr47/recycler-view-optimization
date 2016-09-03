package com.github.programmerr47.optimizedrecycler;

/**
 * @author Michael Spitsin
 * @since 2016-09-01
 */
public class Game {
    private final String title;
    private final String description;
    private final int iconId;

    public Game(String title, String desctiption, int iconId) {
        this.title = title;
        this.description = desctiption;
        this.iconId = iconId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getIconId() {
        return iconId;
    }
}
