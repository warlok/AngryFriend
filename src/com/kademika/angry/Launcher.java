package com.kademika.angry;

/**
 * Created by dean on 4/9/15.
 */
public class Launcher {

    public static void main(String args[]) {
        Figure f = new Figure();
        View view = new View(f);
        Controller controller = new Controller(f,view);

        view.setListener(controller);
        view.addMouseMotionListener(controller);

    }

}
