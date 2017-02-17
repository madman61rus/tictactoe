package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

/**
 * Created by vkompaniec on 16.02.17.
 */
public class MoveController {

    public boolean applyFigure(final Field field,
                               final Point point,
                               final String figure) {
        if (!(point.x > 0 && point.x < 3 ) || !(point.y >0 && point.y < 3)) {

            return false;
        } else if (field.getFigure(point) == "X" || field.getFigure(point) == "O" ) {
            return false;
        } else {
            field.setFigure(point,figure);
            return true;
        }

    }
}
