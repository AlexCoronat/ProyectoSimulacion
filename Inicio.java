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
 * @author Itzel
 * tu tu tuu tuu tuuuu turu tu ruru
 * i wonder if you now
 * how they live in Tokyo 
 * if you seen in the you mean it
 * then you know you have to go 
 * 
 * fast and furiouuuuuuuuus
 * Drift 
 * Drift
 * Drift
 * fast and furiouuuououououuuuuus
 */
public class Inicio {
    JFrame jfVentana;
    JLabel jlFondo;
    JTextField tfActuador1, tfActuador2, tfActuador3,tfActuador4,tfActuador5,tfActuador6;
    JButton jbPush;
    OnClick click;
    
    Inicio(){
        jfVentana = new JFrame();
        jlFondo = new JLabel();
        jbPush = new JButton("PUSH");
        tfActuador1 = new JTextField();
        tfActuador2 = new JTextField();
        tfActuador3 = new JTextField();
        tfActuador4 = new JTextField();
        tfActuador5 = new JTextField();
        tfActuador6 = new JTextField();
        click = new OnClick();
    }
    
    void configuración(){
        
        jfVentana.setSize(850, 700);
        jfVentana.setTitle("Inicio Bank 1.0");
        jfVentana.setLocationRelativeTo(null);
        jfVentana.setResizable(false);
        jfVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        jlFondo.setSize(850, 700);
        jlFondo.setIcon(new ImageIcon("src/Imagenes/Inicio2.png"));
        jlFondo.setBounds(0, 0, 850, 700);
        jlFondo.setVisible(true);
        
        tfActuador1.setPreferredSize(new Dimension(120,30));
        tfActuador1.setBackground(Color.WHITE);
        tfActuador1.setFont(new Font("MS UI Gothic",Font.PLAIN,18));
	tfActuador1.setForeground(Color.BLACK);
        tfActuador1.setToolTipText("Actuador");
        tfActuador1.setBounds(425,160,120,30);
        tfActuador1.setVisible(true);
        
        tfActuador2.setPreferredSize(new Dimension(120,30));
        tfActuador2.setBackground(Color.WHITE);
        tfActuador2.setFont(new Font("MS UI Gothic",Font.PLAIN,18));
	tfActuador2.setForeground(Color.BLACK);
        tfActuador2.setToolTipText("Actuador");
        tfActuador2.setBounds(425,210,120,30);
        tfActuador2.setVisible(true);
        
        tfActuador3.setPreferredSize(new Dimension(120,30));
        tfActuador3.setBackground(Color.WHITE);
        tfActuador3.setFont(new Font("MS UI Gothic",Font.PLAIN,18));
	tfActuador3.setForeground(Color.BLACK);
        tfActuador3.setToolTipText("Actuador");
        tfActuador3.setBounds(425,260,120,30);
        tfActuador3.setVisible(true);
        
        tfActuador4.setPreferredSize(new Dimension(120,30));
        tfActuador4.setBackground(Color.WHITE);
        tfActuador4.setFont(new Font("MS UI Gothic",Font.PLAIN,18));
	tfActuador4.setForeground(Color.BLACK);
        tfActuador4.setToolTipText("Actuador");
        tfActuador4.setBounds(425,310,120,30);
        tfActuador4.setVisible(true);
    
        tfActuador5.setPreferredSize(new Dimension(120,30));
        tfActuador5.setBackground(Color.WHITE);
        tfActuador5.setFont(new Font("MS UI Gothic",Font.PLAIN,18));
	tfActuador5.setForeground(Color.BLACK);
        tfActuador5.setToolTipText("Actuador");
        tfActuador5.setBounds(425,360,120,30);
        tfActuador5.setVisible(true);
        
        tfActuador6.setPreferredSize(new Dimension(120,30));
        tfActuador6.setBackground(Color.WHITE);
        tfActuador6.setFont(new Font("MS UI Gothic",Font.PLAIN,18));
	tfActuador6.setForeground(Color.BLACK);
        tfActuador6.setToolTipText("Actuador");
        tfActuador6.setBounds(425,410,120,30);
        tfActuador6.setVisible(true);
        
        jbPush.setPreferredSize(new Dimension(150,50));
        jbPush.setBackground(Color.decode("#FFB800"));
        jbPush.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jbPush.setForeground(Color.BLACK);
        jbPush.setBorder(new LineBorder(Color.decode("#FF4D00")));
        jbPush.setBounds(350,480,150,50);
        jbPush.setVisible(true);
        jbPush.addActionListener(click);
        
    }
    
    void montaje(){
        jfVentana.getContentPane().setLayout(null);
        jlFondo.setLayout(new FlowLayout());
        jfVentana.getContentPane().add(tfActuador1);
        jfVentana.getContentPane().add(tfActuador2);
        jfVentana.getContentPane().add(tfActuador3);
        jfVentana.getContentPane().add(tfActuador4);
        jfVentana.getContentPane().add(tfActuador5);
        jfVentana.getContentPane().add(tfActuador6);
        jfVentana.getContentPane().add(jbPush);
        jfVentana.getContentPane().add(jlFondo);
        jfVentana.setVisible(true);
    }
    
    class OnClick implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            int sp1 = Integer.parseInt(tfActuador1.getText());
            int sp2 = Integer.parseInt(tfActuador2.getText());
            int sp3 = Integer.parseInt(tfActuador3.getText());
            int sp4 = Integer.parseInt(tfActuador4.getText());
            int teclado = Integer.parseInt(tfActuador5.getText());
            int spuerta = Integer.parseInt(tfActuador6.getText());
            
            Mapa login = new Mapa();
            login.configuración(sp1,sp2,sp3,sp4,teclado,spuerta);
            login.montaje();
            jfVentana.setVisible(false);
        }
    }
            
}
