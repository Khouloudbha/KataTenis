package service;

import dto.Player;

public class ScoreUtils {

    public static String onWin(Player player)
    {
        switch(player.getScore()){
            case "0" : return "15";
            case "15": return "30";
            case "30": return "40";
            case "40": return "A";
        }
        return "0";
    }
}
