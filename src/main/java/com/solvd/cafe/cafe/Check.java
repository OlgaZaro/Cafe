package com.solvd.cafe.cafe;

import java.util.ArrayList;
import java.util.List;

public class Check {
    private int numberCheck;
    private static List<String> strava = new ArrayList<>();
    private static List<Integer> sum = new ArrayList<>();

    public Check() {}

    public Check(int numberCheck, List<String> strava, List<Integer> sum) {
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
        this.strava = strava;
    }
    public void setNumberCheck(int numberCheck) {
        this.numberCheck = numberCheck;
    }

}
