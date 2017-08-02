package com.ak.toolkits;

import com.ak.entity.Race;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by arthur on 8/2/17.
 */
public class RaceFormatter implements Formatter<Race> {

    @Override
    public Race parse(String s, Locale locale) throws ParseException {
        Race race = new Race();
        race.setId(Integer.valueOf(s));
        return race;
    }

    @Override
    public String print(Race race, Locale locale) {
        return String.valueOf(race.getId());
    }
}
