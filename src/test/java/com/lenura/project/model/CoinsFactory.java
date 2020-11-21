package com.lenura.project.model;

import com.lenura.project.model.Coin;
import com.lenura.project.model.Coins;
import com.lenura.project.model.ILS;
import com.lenura.project.model.USD;

public class CoinsFactory  {
    public static Coin getCoinInstance(Coins coin) {

        switch (coin) {
            case ILS:
                return new ILS();
            case USD:
                return new USD();
        }
        return null;
    }
}
