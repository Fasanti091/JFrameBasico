import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {

    public App(){
        JFrame frame = new JFrame("FlowLayout");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel();
        panel.add(new JButton("Boton 1"));
        panel.add(new JButton("Boton 2"));
        panel.add(new JButton("Boton 2"));
        panel.add(new JButton("Boton 3"));
        panel.add(new JButton("Boton 4"));
        panel.add(new JButton("Boton 5"));
        contentPane.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
        public void run(){
            App gui = new App();
        }
    });    
    }

}