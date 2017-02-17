package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class CurrentMoveController {

    public String currentMove(final Field field) {
        // BEGIN (write your solution here)\

        if ((countFigure("X",field) == 0) && (countFigure("O", field) == 0)) {
            return "X";
        }

        if (countFigure("X", field) == 0) {
            return "O";
        }
        if ( countFigure("X",field) > countFigure("O", field)) {
            return "O";
        }else {
            return "X";
        }

    }

    private int countFigure(final String figure, Field field) {
        int counter = 0 ;
        for (int i=0; i < field.getSize(); i++) {
            for (int j=0; j < field.getSize(); j++) {
                Point point = new Point();
                point.x = i;
                point.y = j;
                if ( (field.getFigure(point) != null) && field.getFigure(point).equals(figure)) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
