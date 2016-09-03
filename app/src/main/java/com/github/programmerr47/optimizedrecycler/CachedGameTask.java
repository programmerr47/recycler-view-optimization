package com.github.programmerr47.optimizedrecycler;

import java.util.List;

/**
 * @author Michael Spitsin
 * @since 2016-09-02
 */
public class CachedGameTask implements GameTask {
    private final GameTask origin;
    private List<Game> cachedResult;

    public CachedGameTask(GameTask origin) {
        this.origin = origin;
    }

    @Override
    public List<Game> getGameList() {
        return cachedResult != null ? cachedResult : origin.getGameList();
    }
}
