package com.company.lesson7homework;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Calendar {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));

        //Напишите тут ваш код
        map.put("Дима", new Date("JUNE 28 1984"));
        map.put("Вадим", new Date("APR 29 1992"));
        map.put("Мама", new Date("DEC 11 1959"));
        map.put("Test", new Date("JUNE 9 1980"));
        map.put("igor", new Date("JUNE 5 1980"));
        map.put("test55", new Date("JUNE 28 1980"));
        map.put("test11", new Date("JUNE 2 1980"));
        map.put("aaa", new Date("JUNE 4 1980"));
        map.put("aaaaaaa", new Date("JUNE 6 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if (rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }
    }
}
