package ru.tropin.springApp;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    @Override
    public List<String> getSong() {
        return new ArrayList<>();
    }
}
