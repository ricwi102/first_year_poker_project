package poker_client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Richard on 2015-04-23.
 */



public class ClientListener implements ActionListener{

    ClientFrame frame;

    public ClientListener(ClientFrame frame) {

        this.frame = frame;

    }

    public void actionPerformed(ActionEvent e) {
        frame.actionPerformed(e);
    }
}
