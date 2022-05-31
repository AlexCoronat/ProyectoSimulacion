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
import javax.swing.border.LineBorder;

/**
 *
 * @author Equipo2
 * Vocal percussion on a whole 'nother level
 * Coming from my mind
 * HAAAAAAAAAAA
 * We're Golden Wiiind 
 * Hahahahahhhhaaaaaa
 * mare maro pew pew 
 */
public class Teclado {
    JFrame jfVentana;
    JLabel jlFondo;
    JButton jla1,jla2,jla3,jla4,jla5,jla6,jla7,jla8,jla9, jla10;
    JButton jb1, jb2,jb3,jb4;
    OnClick click;
    
    Teclado(){
        jfVentana = new JFrame();
        jlFondo = new JLabel();
        jla1 = new JButton();
        jla2 = new JButton();
        jla3 = new JButton();
        jla4 = new JButton();
        jla5 = new JButton();
        jla6 = new JButton();
        jla7 = new JButton();
        jla8 = new JButton();
        jla9 = new JButton();
        jla10 = new JButton();
        jb1 = new JButton("Reiniciar");
        jb2 = new JButton("Cerrar");
        jb3 = new JButton("Continuar");
        jb4 = new JButton("Puerta");
        
        click = new OnClick();
    }
    
    void configuración(int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8, int a9, int a10){
        jfVentana.setSize(860, 710);
        jfVentana.setTitle("Tablero de valores");
        jfVentana.setLocationRelativeTo(null);
        jfVentana.setResizable(false); 
        
        jlFondo.setSize(850, 700);
        jlFondo.setIcon(new ImageIcon("src/Imagenes/Teclado.png"));
        jlFondo.setBounds(0, 0, 850, 700);
        jlFondo.setVisible(true);
        
        jb1.setPreferredSize(new Dimension(132,55));
        jb1.setBackground(Color.decode("#ED7899"));
        jb1.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jb1.setForeground(Color.decode("#962819"));
        jb1.setBounds(523,175,132,55);
        jb1.setVisible(true);
        jb1.addActionListener(click);
        
        
        jb2.setPreferredSize(new Dimension(132,55));
        jb2.setBackground(Color.decode("#F9DD8F"));
        jb2.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jb2.setForeground(Color.decode("#A37A09"));
        jb2.setBounds(523,251,132,55);
        jb2.setVisible(true);
        jb2.addActionListener(click);
        
        jb3.setPreferredSize(new Dimension(132,55));
        jb3.setBackground(Color.decode("#72CAAF"));
        jb3.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jb3.setForeground(Color.decode("#134939"));
        jb3.setBounds(523,327,132,55);
        jb3.setVisible(true);
        jb3.addActionListener(click);
        
        jb4.setPreferredSize(new Dimension(132,55));
        jb4.setBackground(Color.decode("#96D7F9"));
        jb4.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jb4.setForeground(Color.decode("#0B4665"));
        jb4.setBounds(523,404,132,55);
        jb4.setVisible(true);
        jb4.addActionListener(click);
        
        jla1.setPreferredSize(new Dimension(68,55));
        jla1.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla1.setForeground(Color.BLACK);
        jla1.setBackground(Color.decode("#FAEFDE"));
        jla1.setBounds(194,175,68,55);
        jla1.setText(a1+"");
        jla1.setFocusPainted(false);
        jla1.setBorderPainted(false);
        //jla1.setContentAreaFilled(false);
        jla1.setVisible(true);
        jla1.addActionListener(click);
        
        jla2.setPreferredSize(new Dimension(68,55));
        jla2.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla2.setForeground(Color.BLACK);
        jla2.setBackground(Color.decode("#FAEFDE"));
        jla2.setBounds(282,175,68,55);
        jla2.setText(a2+"");
        jla2.setFocusPainted(false);
        jla2.setBorderPainted(false);
        jla2.setVisible(true);
        jla2.addActionListener(click);
        
        jla3.setPreferredSize(new Dimension(68,55));
        jla3.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla3.setForeground(Color.BLACK);
        jla3.setBackground(Color.decode("#FAEFDE"));
        jla3.setBounds(370,175,68,55);
        jla3.setText(a3+"");
        jla3.setFocusPainted(false);
        jla3.setBorderPainted(false);
        jla3.setVisible(true);
        jla3.addActionListener(click);
        
        jla4.setPreferredSize(new Dimension(68,55));
        jla4.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla4.setForeground(Color.BLACK);
        jla4.setBackground(Color.decode("#FAEFDE"));
        jla4.setBounds(194,251,68,55);
        jla4.setText(a4+"");
        jla4.setFocusPainted(false);
        jla4.setBorderPainted(false);
        jla4.setVisible(true);
        jla4.addActionListener(click);
        
        jla5.setPreferredSize(new Dimension(68,55));
        jla5.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla5.setForeground(Color.BLACK);
        jla5.setBackground(Color.decode("#FAEFDE"));
        jla5.setBounds(282,251,68,55);
        jla5.setText(a5+"");
        jla5.setFocusPainted(false);
        jla5.setBorderPainted(false);
        jla5.setVisible(true);
        jla5.addActionListener(click);
        
        jla6.setPreferredSize(new Dimension(68,55));
        jla6.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla6.setForeground(Color.BLACK);
        jla6.setBackground(Color.decode("#FAEFDE"));
        jla6.setBounds(370,251,68,55);
        jla6.setText(a6+"");
        jla6.setFocusPainted(false);
        jla6.setBorderPainted(false);
        jla6.setVisible(true);
        jla6.addActionListener(click);
        
        jla7.setPreferredSize(new Dimension(68,55));
        jla7.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla7.setForeground(Color.BLACK);
        jla7.setBackground(Color.decode("#FAEFDE"));
        jla7.setBounds(194,327,68,55);
        jla7.setText(a7+"");
        jla7.setFocusPainted(false);
        jla7.setBorderPainted(false);
        jla7.setVisible(true);
        jla7.addActionListener(click);
        
        jla8.setPreferredSize(new Dimension(68,55));
        jla8.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla8.setForeground(Color.BLACK);
        jla8.setBackground(Color.decode("#FAEFDE"));
        jla8.setBounds(282,327,68,55);
        jla8.setText(a8+"");
        jla8.setFocusPainted(false);
        jla8.setBorderPainted(false);
        jla8.setVisible(true);
        jla8.addActionListener(click);
        
        jla9.setPreferredSize(new Dimension(68,55));
        jla9.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla9.setForeground(Color.BLACK);
        jla9.setBackground(Color.decode("#FAEFDE"));
        jla9.setBounds(370,327,68,55);
        jla9.setText(a9+"");
        jla9.setFocusPainted(false);
        jla9.setBorderPainted(false);
        jla9.setVisible(true);
        jla9.addActionListener(click);
        
        jla10.setPreferredSize(new Dimension(68,55));
        jla10.setFont(new Font("MS UI Gothic",Font.PLAIN,22));
	jla10.setForeground(Color.BLACK);
        jla10.setBackground(Color.decode("#FAEFDE"));
        jla10.setBounds(282,404,68,55);
        jla10.setText(a10+"");
        jla10.setFocusPainted(false);
        jla10.setBorderPainted(false);
        jla10.setVisible(true);
        jla10.addActionListener(click);
    }
    
    void montaje(){
        jfVentana.getContentPane().setLayout(null);
        jlFondo.setLayout(new FlowLayout());
        jfVentana.getContentPane().add(jlFondo);
        jfVentana.getContentPane().add(jla1);
        jfVentana.getContentPane().add(jla2);
        jfVentana.getContentPane().add(jla3);
        jfVentana.getContentPane().add(jla4);
        jfVentana.getContentPane().add(jla5);
        jfVentana.getContentPane().add(jla6);
        jfVentana.getContentPane().add(jla7);
        jfVentana.getContentPane().add(jla8);
        jfVentana.getContentPane().add(jla9);
        jfVentana.getContentPane().add(jla10);
        jfVentana.getContentPane().add(jb1);
        jfVentana.getContentPane().add(jb2);
        jfVentana.getContentPane().add(jb3);
        jfVentana.getContentPane().add(jb4);
        jfVentana.setVisible(true);
    }
    
}
