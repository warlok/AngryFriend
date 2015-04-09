package com.kademika.angry;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by dean on 4/9/15.
 */
public class Controller extends MouseAdapter implements IntersseptionListener {

    Figure figure;
    View view;

    public Controller(Figure figure, View view) {
        this.figure = figure;
        this.view = view;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
        view.getRect().x = e.getX();
        view.getRect().y = e.getY();
        view.repaint();
    }

    @Override
    public void prossessInterseption() {
        figure.changeCoordinate();
        view.repaint();
    }
}
