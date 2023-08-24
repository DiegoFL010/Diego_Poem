import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class PoemProjects extends JFrame  implements ActionListener {

    private JButton button ;

    private JPanel drawpanel;

    private Image pic;

    public static void main(String []args) {
        PoemProjects frame = new PoemProjects();
        //the size should be correct for the image that's chosen
        //keep the frame smaller then 1024x766
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.createGUI();
        frame.setVisible(true);
        frame.loadImage();

    }

    private void createGUI(){
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
    }

    public void loadImage(){
        String path = "cy.jpg";//find a pic and change cy.jpg to  your pic file name
        File file = new File(path);
        try {
            pic = ImageIO.read(file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        Graphics g = drawPanel.getGraphics();

        Graphics g = drawPanel.getGraphics();
        ImageIcon ico=new ImageIcon(pic);
        ico.paintIcon(this, g, 10, 10);

        //below here you will draw your poem
        g.setColor(Color.BLUE);//set color
        g.drawString("Line 1", 10, 10);//draw
    }
}
