package com.solvd.cafe.cafe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class Check {
    public static Check check = new Check();
    private int numberCheck;
    private static List<String> strava = new ArrayList<>();
    private static List<Integer> sum = new ArrayList<>();

    public Check() {}

    private Check(int numberCheck, List<String> strava, List<Integer> sum) {
        this.numberCheck = numberCheck;
        this.strava = strava;
        this.sum = sum;
    }

    public static List<Integer> getSum() {
        return sum;
    }

    public static List<String> getStrava() {
        return strava;
    }
    public int getNumberCheck() { return numberCheck; }

    public void setSum(List<Integer> sum) {
        this.sum = sum;
    }

    public void setStrava(List<String> strava) {
        Check.strava = strava;
    }
    public void setNumberCheck(int numberCheck) {
        this.numberCheck = numberCheck;
    }

}
