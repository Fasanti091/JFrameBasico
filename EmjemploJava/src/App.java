import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class App {
    private JTextField caja;
    

    public App(){
        JFrame frame = new JFrame("FlowLayout");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel();
        //panel.setLayout(new GridLayout(3,3));
        //panel.setLayout(new BorderLayout());
        /*caja= new JTextField();
        caja.setBounds(x, y, width, height);
        add(caja);*/
    
        panel.add(new JButton("Importar"));
        panel.add(new JButton("Ordenar"));
        panel.add(new JButton("Buscar"));
        panel.add(new JButton("Eliminar"));
        contentPane.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        
    }

    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
        public void run(){
            App gui = new App();
        }
    });    
    }

}