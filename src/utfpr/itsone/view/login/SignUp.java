package utfpr.itsone.view.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SignUp extends SignIn{
    private JLabel emailLabel = new JLabel("Email");
    private JTextField emailField = new JTextField();

    public SignUp() {
        super();
        remove(submit);
        remove(8);
        register();
    }

    public void register() {
        emailField.setBorder(BorderFactory.createMatteBorder(
                0, 0, 1, 0, new Color(0xcccccc)));
        emailField.setMaximumSize(new Dimension(300,emailField.getPreferredSize().height+5));
        emailField.setBackground(new Color(0x000a1f));
        emailField.setForeground(new Color(0xcccccc));
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);
        emailLabel.setForeground(new Color(0x333436));
        emailField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent arg0) {
                emailLabel.setForeground(new Color(0x285888));
            }

            public void focusLost(FocusEvent arg0) {
                emailLabel.setForeground(new Color(0x333436));
            }
        });
        userField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent arg0) {
                userLabel.setForeground(new Color(0x285888));
            }

            public void focusLost(FocusEvent arg0) {
                userLabel.setForeground(new Color(0x333436));
            }
        });
        passwordField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent arg0) {
                passwordLabel.setForeground(new Color(0x285888));
            }

            public void focusLost(FocusEvent arg0) {
                passwordLabel.setForeground(new Color(0x333436));
            }
        });
        remove(0);
        add(Box.createRigidArea(new Dimension(0, 100)),0);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(emailLabel);
        add(Box.createRigidArea(new Dimension(0, 2)));
        add(emailField);
        submit.setText("SIGN UP");
        styleButtons();
    }

}