import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Equipo #2?  
 */
public class Mapa {
    int c1;
    int a1;
    int b1;
    int p1;
    int t1;// <- activadores
    int spuerta1;// <- activadores
    int pr1,pr2,pr3,pr4;
    JFrame jfVentana;
    JLabel jlFondo;
    JButton jbSensor, jbSPresencia1, jbSPresencia2, jbSPresencia3, jbSPresencia4,
            jbAlarma, jbCámara,jbTeclado, jbBotón, jbPuerta;
    OnClick click;
    
    String[ ] srcProductos = new String[9];
    String[ ] nombreProductos = new String[9];
    
    Mapa(){
        jfVentana = new JFrame();
        jlFondo = new JLabel();
        jbSensor = new JButton();
        jbSPresencia1 = new JButton();
        jbSPresencia2 = new JButton();
        jbSPresencia3 = new JButton();
        jbSPresencia4 = new JButton();
        jbAlarma = new JButton();
        jbCámara = new JButton();
        jbTeclado = new JButton();
        jbBotón = new JButton();
        jbPuerta = new JButton();
        click = new OnClick();
    }
    
    void configuración(int sp1,int sp2,int sp3,int sp4,int teclado,int spuerta){
        /*Actuador act = new Actuador(sp1,sp2,sp3,sp4,teclado,spuerta);
        act.a1.reglas_Alarma();
        act.b1.get();
        act.c1.reglas_Camara();
        act.p1.reglas_Puerta();
        act.pr1.reglas_sensoresPresencia();
        act.pr2.reglas_sensoresPresencia();
        act.pr3.reglas_sensoresPresencia();
        act.pr4.reglas_sensoresPresencia();
        act.sp1.reglas_sensorPuerta();
        act.t1.get();
        
        int alarma = act.a1.get();
        int botón = act.b1.get();
        int cámara = act.c1.get();
        int puerta = act.p1.get();
        sp1 = act.pr1.get();
        sp2 = act.pr2.get();
        sp3 = act.pr3.get();
        sp4 = act.pr4.get();
        spuerta = act.sp1.get();
        teclado = act.t1.get();
        */
        int alarma = 0;
        int botón = 0;
        int cámara = 0;
        int puerta = 0;
        
        if(teclado == 0){
                cámara = 1;
            }else if(teclado == 1){
                cámara = 0;
            }
            if((sp1 == 1 && teclado == 1) ||
               (sp2 == 1 && teclado == 1) ||
               (sp3 == 1 && teclado == 1) ||
               (sp4 == 1 && teclado == 1)){
                cámara = 1;
                puerta = 1;
                alarma = 1;
            }
            if(spuerta == 0 && teclado == 1){
                cámara = 1;
                alarma = 1;
            }
            if(teclado == 1 && botón == 1){
               cámara = 1;
            }
            
            if(teclado == 0){
                spuerta = 2;
            }else if(teclado == 1){
                spuerta = 1;
            }
            if(teclado == 1 && spuerta == 0){
                puerta = 1;
            
            }
            
            if(teclado == 0){
                sp1 = 0;
                sp2 = 0;
                sp3 = 0;
                sp4 = 0;
            }else if(teclado == 1){
                sp1 = 1;
                sp2 = 1;
                sp3 = 1;
                sp4 = 1;
            }
            if(teclado ==  0 && botón == 1){
                alarma = 2;
                
            }
        
        
        jfVentana.setSize(1800, 1050);
        jfVentana.setTitle("Bank 1.0");
        jfVentana.setLocationRelativeTo(null);
        jfVentana.setResizable(false);
        jfVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        jlFondo.setSize(1800, 1000);
        jlFondo.setIcon(new ImageIcon("src/Imagenes/Mapa2.png"));
        jlFondo.setBounds(0, 0, 1800, 1000);
        jlFondo.setVisible(true);
        
        if(spuerta == 0){
            jbSensor.setIcon(new ImageIcon("src/Imagenes/SensorOFF.png"));
        }else if(spuerta  == 1){
            jbSensor.setIcon(new ImageIcon("src/Imagenes/SensorON.png"));
        }
        jbSensor.setBounds(95, 570, 100, 100);
        jbSensor.setContentAreaFilled(false);jbSensor.setBorderPainted(false);jbSensor.setOpaque(false);
        jbSensor.addActionListener(click);
        jbSensor.setVisible(true);
        
        
        if(sp1 == 0){
            jbSPresencia1.setIcon(new ImageIcon("src/Imagenes/SPresenciaOFF.png"));
        }else if(sp1  == 1){
            jbSPresencia1.setIcon(new ImageIcon("src/Imagenes/SPresenciaON.png"));
        }
        jbSPresencia1.setBounds(115, 295, 100, 100);
        jbSPresencia1.setContentAreaFilled(false);jbSPresencia1.setBorderPainted(false);jbSPresencia1.setOpaque(false);
        jbSPresencia1.addActionListener(click);
        jbSPresencia1.setVisible(true);
        
        if(sp2 == 0){
            jbSPresencia2.setIcon(new ImageIcon("src/Imagenes/SPresenciaOFF.png"));
        }else if(sp2  == 1){
            jbSPresencia2.setIcon(new ImageIcon("src/Imagenes/SPresenciaON.png"));
        }
        jbSPresencia2.setBounds(650, 220, 100, 100);
        jbSPresencia2.setContentAreaFilled(false);jbSPresencia2.setBorderPainted(false);jbSPresencia2.setOpaque(false);
        jbSPresencia2.addActionListener(click);
        jbSPresencia2.setVisible(true);
        
        if(sp3 == 0){
            jbSPresencia3.setIcon(new ImageIcon("src/Imagenes/SPresenciaOFF.png"));
        }else if(sp3  == 1){
            jbSPresencia3.setIcon(new ImageIcon("src/Imagenes/SPresenciaON.png"));
        }
        jbSPresencia3.setBounds(1480, 305, 100, 100);
        jbSPresencia3.setContentAreaFilled(false);jbSPresencia3.setBorderPainted(false);jbSPresencia3.setOpaque(false);
        jbSPresencia3.addActionListener(click);
        jbSPresencia3.setVisible(true);
        
        if(sp4 == 0){
            jbSPresencia4.setIcon(new ImageIcon("src/Imagenes/SPresenciaOFF.png"));
        }else if(sp4  == 1){
            jbSPresencia4.setIcon(new ImageIcon("src/Imagenes/SPresenciaON.png"));
        }
        jbSPresencia4.setBounds(1390, 585, 100, 100);
        jbSPresencia4.setContentAreaFilled(false);jbSPresencia4.setBorderPainted(false);jbSPresencia4.setOpaque(false);
        jbSPresencia4.addActionListener(click);
        jbSPresencia4.setVisible(true);
        
        
        if(alarma == 0){
            jbAlarma.setIcon(new ImageIcon("src/Imagenes/AlarmaOFF.png"));
        }else if(alarma  == 1){
            jbAlarma.setIcon(new ImageIcon("src/Imagenes/AlarmaON.png"));
        }
        jbAlarma.setBounds(360, 230, 100, 100);
        jbAlarma.setContentAreaFilled(false);jbAlarma.setBorderPainted(false);jbAlarma.setOpaque(false);
        jbAlarma.addActionListener(click);
        jbAlarma.setVisible(true);
        
        
        if(cámara == 0){
            jbCámara.setIcon(new ImageIcon("src/Imagenes/CamaraOFF.png"));
        }else if(cámara  == 1){
            jbCámara.setIcon(new ImageIcon("src/Imagenes/CamaraON.png"));
        }
        jbCámara.setBounds(450, 670, 100, 100);
        jbCámara.setContentAreaFilled(false);jbCámara.setBorderPainted(false);jbCámara.setOpaque(false);
        jbCámara.addActionListener(click);
        jbCámara.setVisible(true);
        
        
        if(teclado == 0){
            jbTeclado.setIcon(new ImageIcon("src/Imagenes/TecladoOFF.png"));
        }else if(teclado  == 1){
            jbTeclado.setIcon(new ImageIcon("src/Imagenes/TecladoON.png"));
        }
        jbTeclado.setBounds(850, 55, 100, 100);
        jbTeclado.setContentAreaFilled(false);jbTeclado.setBorderPainted(false);jbTeclado.setOpaque(false);
        jbTeclado.addActionListener(click);
        jbTeclado.setVisible(true);
        
        if(botón == 0){
            jbBotón.setIcon(new ImageIcon("src/Imagenes/BotónOFF.png"));
        }else if(botón  == 1){
            jbBotón.setIcon(new ImageIcon("src/Imagenes/BotónON.png"));
        }
        jbBotón.setBounds(875, 435, 100, 100);
        jbBotón.setContentAreaFilled(false);jbBotón.setBorderPainted(false);jbBotón.setOpaque(false);
        jbBotón.addActionListener(click);
        jbBotón.setVisible(true);
        
        
        if(puerta == 0){
            jbPuerta.setBackground(Color.decode("#FFFF"));
        }else if(puerta  == 1){
            jbPuerta.setBackground(Color.decode("#1F2238"));
        }
        jbPuerta.setBounds(126, 384, 40, 200);
        jbPuerta.setContentAreaFilled(false);jbPuerta.setBorderPainted(false);jbPuerta.setOpaque(false);
        jbPuerta.addActionListener(click);
        jbPuerta.setVisible(true);
        
        Puerta puertaPrincipal = new Puerta();
        puertaPrincipal.configuración(puerta);
        puertaPrincipal.montaje();
        
        c1 = cámara;
        a1 = alarma;
        b1 = botón;
        p1 = puerta;
        t1 = teclado;// <- activadores
        spuerta1 = spuerta;// <- activadores
        pr1=sp1;
        pr2=sp2;
        pr3=sp3;
        pr4=sp4;

        
       
       
        
    }
    
    void montaje(){
        jfVentana.getContentPane().setLayout(null);
        jlFondo.setLayout(null);
        
        jfVentana.getContentPane().add(jbSensor);
        jfVentana.getContentPane().add(jbSPresencia1);
        jfVentana.getContentPane().add(jbSPresencia2);
        jfVentana.getContentPane().add(jbSPresencia3);
        jfVentana.getContentPane().add(jbSPresencia4);
        jfVentana.getContentPane().add(jbAlarma);
        jfVentana.getContentPane().add(jbCámara);
        jfVentana.getContentPane().add(jbTeclado);
        jfVentana.getContentPane().add(jbBotón);
        jfVentana.getContentPane().add(jbPuerta);
        jfVentana.getContentPane().add(jlFondo);
        jfVentana.setVisible(true);
    }
    
    class OnClick implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
             if(ae.getSource() == jbTeclado){
                Teclado vt = new Teclado();
                vt.configuración(pr1,pr2,pr3,pr4,t1,spuerta1,a1,b1,c1,p1);
                vt.montaje();
             }
            
    
        }
    }    
}
