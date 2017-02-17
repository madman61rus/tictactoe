package io.hexlet.xo.model;

import java.awt.*;

public class Field {
    public String[][] figures = new String[3][3];

    public int getSize() {
        return 3;
    }

    public String getFigure(final Point point) {
        return this.figures[point.x][point.y];
    }

    public void setFigure(final Point point, final String figure) {
        if ((point.x > 0 && point.x < 3 ) && (point.y >0 && point.y < 3)) {
            figures[point.x][point.y] = figure ;
        }
    }
}
