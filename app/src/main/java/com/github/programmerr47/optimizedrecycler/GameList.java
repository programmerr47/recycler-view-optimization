package com.github.programmerr47.optimizedrecycler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Michael Spitsin
 * @since 2016-09-02
 */
public class GameList {
    private static final Random r = new Random();

    public static List<Game> get() {
        List<Game> result = new ArrayList<>();
        result.add(new Game("Age of Empires 2", "One of the best strategies", R.drawable.ic_age_of_empires_2));
        result.add(new Game("Assassin's Creed", "Crusade times...mmm...briliant", R.drawable.ic_assassins_creed));
        result.add(new Game("Assassin's Creed 2", "Interesting game, but not such awesome as original",R.drawable.ic_assassins_creed_2));
        result.add(new Game("Assassin's Creed: Revelations", "Old assassin. How pathetic...", R.drawable.ic_assassins_creed_2_revelations));
        result.add(new Game("Assassin's Creed 3", "Red skin assassin. Funny :)", R.drawable.ic_assassins_creed_3));
        result.add(new Game("Assassin's Creed 4", "Pirate assassin. WTF", R.drawable.ic_assassins_creed_4));
        result.add(new Game("Assassin's Creed: Unity", "I don't know, what is it", R.drawable.ic_assassins_creed_unity));
        result.add(new Game("Assassin's Creed: Syndicate", "More GTA, less assassins", R.drawable.ic_assassins_creed_syndicate));
        result.add(new Game("Diablo", "Source of classic game!", R.drawable.ic_diablo));
        result.add(new Game("Diablo II", "Live classic", R.drawable.ic_diablo_2));
        result.add(new Game("Diablo III", "Distortion of classic", R.drawable.ic_diablo_3));
        result.add(new Game("Devil May Cry 3", "Hard! Cool! But not supporting new controllers", R.drawable.ic_dmc_3));
        result.add(new Game("Devil May Cry 4", "One of the best cut scenes", R.drawable.ic_dmc_4));
        result.add(new Game("DMC: Devil May Cry", "Damn it! I wanted DMC 5!", R.drawable.ic_dmc_new));
        result.add(new Game("Doom", "Classic shooter!", R.drawable.ic_doom));
        result.add(new Game("Doom II", "Classic shooter 2!", R.drawable.ic_doom_2));
        result.add(new Game("Brutal Doom", "Doom but also with brutality!", R.drawable.ic_doom_brutal));
        result.add(new Game("Doom III", "Less brutality more horror", R.drawable.ic_doom_3));
        result.add(new Game("DOOM", "Revival of the legend", R.drawable.ic_doom_4));
        result.add(new Game("Gothic", "My favourite RPG", R.drawable.ic_gothic));
        result.add(new Game("Gothic 2", "Interesting implementation of cool rpg. We take gothic 1, give it big map, various items and interesting plot!", R.drawable.ic_gothic_2));
        result.add(new Game("Gothic 2: Night of the Raven", "Good dlc of goof rpg", R.drawable.ic_gothic_2_notr));
        result.add(new Game("Gothic 3", "Could be awesome, but was very ambiguous", R.drawable.ic_gothic_3));
        result.add(new Game("Arcania: Tales of Gothic", "Crap!", R.drawable.ic_gothic_arcania));
        result.add(new Game("Half-Life", "Cult game", R.drawable.ic_half_life));
        result.add(new Game("Half-Life 2", "Cult sequel of the cult game", R.drawable.ic_half_life_2));
        result.add(new Game("Half-Life 2: Episode 1", "Why they made episodes?", R.drawable.ic_half_life_2_ep1));
        result.add(new Game("Half-Life 2: Episode 2", "Why they made episodes?", R.drawable.ic_half_life_2_ep2));
        result.add(new Game("Prince of Persia: The Sands of Time", "Interesting, but in shadow of Warrior Within", R.drawable.ic_pop_st));
        result.add(new Game("Prince of Persia: Warrior Within", "So good game. SO! GOOOOOOD!", R.drawable.ic_pop_ww));
        result.add(new Game("Prince of Persia: The Two Thrones", "Many promises and stupid buggy realisation", R.drawable.ic_pop_tt));
        result.add(new Game("Prince of Persia (2008)", "Good try, but not so good as expected", R.drawable.ic_pop_2008));
        result.add(new Game("Prince of Persia: Forgotten Sands", "The game of the film , which is based on the game", R.drawable.ic_pop_fs));
        result.add(new Game("Postal 2", "Game of my childhood", R.drawable.ic_postal_2));
        result.add(new Game("Postal 2: Apocalypse Weekends", "Funny!", R.drawable.ic_postal_2_aw));
        result.add(new Game("Postal 3", "Played in demo version and it was bad", R.drawable.ic_postal_3));
        result.add(new Game("Risen", "Gothic in new skin returns", R.drawable.ic_risen));
        result.add(new Game("Risen 2", "Not so interesting as first part", R.drawable.ic_risen_2));
        result.add(new Game("Risen 3", "Not played, don't know about it", R.drawable.ic_risen_3));
        result.add(new Game("Serious Sam: First Encounter", "You are waiting for serious problems", R.drawable.ic_serious_sam_1_1));
        result.add(new Game("Serious Sam 2", "Not serious game", R.drawable.ic_serious_sam_2));
        result.add(new Game("Serious Sam: BFE", "Serios sam return!", R.drawable.ic_serious_sam_3));
        result.add(new Game("Titan Quest", "One of the best Action/RPG of the year", R.drawable.ic_titan_quest));
        result.add(new Game("Titan Quest: Immortal Throne", "One of the cases, when DLC is not inferior to the original", R.drawable.ic_titan_quest_immortal_throne));
        result.add(new Game("The Witcher", "Many bosses, varous equipment, strong plot and good graphic!", R.drawable.ic_witcher));
        result.add(new Game("The Witcher 2", "Failure of the year", R.drawable.ic_witcher_2));
        result.add(new Game("The Witcher 3", "Best RPG of last 10 years", R.drawable.ic_witcher_3));
        return result;
    }

    public static List<Game> increaseCopyPastingText(List<Game> games) {
        List<Game> result = new ArrayList<>();
        for (Game game : games) {
            result.add(new Game(game.getTitle(), breedString(game.getDescription()), game.getIconId()));
        }

        return result;
    }

    private static String breedString(String origin) {
        int count = r.nextInt(100) + 20;
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            resultBuilder.append(origin);
        }

        return resultBuilder.toString();
    }
}
