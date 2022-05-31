import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Equipo 2
 * 
 * Alors on dace tu turu tu ru tu ru 
 * wu 
 * wu wu 
 * et la tut dis que cest fini 
 * le probleme ou bien la musique 
 */
public class Puerta {
    JFrame jfVentana;
    JLabel jlFondo;
    OnClick click;
    
    Puerta(){
        jfVentana = new JFrame();
        jlFondo = new JLabel();
        click = new OnClick();
    }
    
    void configuración(int v){
        jfVentana.setSize(860, 710);
        jfVentana.setTitle("Puerta Principal");
        jfVentana.setLocationRelativeTo(null);
        jfVentana.setResizable(false); 
        
        jlFondo.setSize(850, 700);
        if(v == 0){
            jlFondo.setIcon(new ImageIcon("src/Imagenes/PuertaOFF.png"));
        }else if(v  == 1){
            jlFondo.setIcon(new ImageIcon("src/Imagenes/PuertaON.png"));
        }
        jlFondo.setBounds(0, 0, 850, 700);
        jlFondo.setVisible(true);
        
        
    }
    
    void montaje(){
        jfVentana.getContentPane().setLayout(null);
        jlFondo.setLayout(new FlowLayout());
        jfVentana.getContentPane().add(jlFondo);
        jfVentana.setVisible(true);
    }
    
}


class OnClick implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            
        }
}
