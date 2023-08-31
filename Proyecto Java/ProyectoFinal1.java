import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ProyectoFinal1 extends JFrame implements ChangeListener, ActionListener{
    private JLabel texto1, texto2;
    private JCheckBox Cheeck1;
    private JButton boton1, boton2;
    private JScrollPane Scrol1;
    private JTextArea area1;
    String nombre = "";

    public ProyectoFinal1(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("Imagenes/DG.png")).getImage());
        ProyectoFinal ventana1 = new ProyectoFinal();
        nombre = ventana1.TxNomb;

        texto1 = new JLabel("TERMINOS Y CONDICIONES");
        texto1.setBounds(215,5,250,30);
        texto1.setFont(new Font("Century",1,14));
        texto1.setForeground(new Color(0,0,0));
        add(texto1);

        area1 = new JTextArea();
        area1.setEditable(false);
        area1.setFont(new Font("Century",0,10));
        area1.setText("\n\n          Terminos y condiciones" +
                        "\n\n          A. Esto es Una prueba para poder colocar terminos y conciones a un programa escrito en java" +
                        "\n          B. De esta manera el usuario puede leer las politicas con las cuales esta elaborado el programa" +
                        "\n          C. El uso de la marca DesinGlass es meramente representativa y no se pretende hacer mal uso de ella" +
                        "\n          Si usted acepta los terminos y condiciones, haga click en (acepto)" + 
                        "\n          Si usted no acepta los terminos y conciciones, haga click en (No acepto) y no utilice este software" + 
                        "\n\n          Para mas informacion sobre nuestros productos o servicios, por favor visite:" + 
                        "\n          www.desinGlass.com.mx");
        Scrol1 = new JScrollPane(area1);
        Scrol1.setBounds(10,40,575,200);
        add(Scrol1);

        Cheeck1 = new JCheckBox("Yo " + nombre + " Acepto");
        Cheeck1.setBounds(10,250,300,30);
        Cheeck1.addChangeListener(this);
        add(Cheeck1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon Imagen = new ImageIcon("Imagenes/Logo_sin_fondo.png");

        texto2 = new JLabel(Imagen);
        texto2.setBounds(315,135,300,300);
        add(texto2);

    }

    public void stateChanged(ChangeEvent e){
        if(Cheeck1.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent E){
        if(E.getSource() == boton1){
            ProyectoFinal2 Formularo2 = new ProyectoFinal2();
            Formularo2.setBounds(0,0,640,535);
            Formularo2.setVisible(true);
            Formularo2.setResizable(false);
            Formularo2.setLocationRelativeTo(null);

            this.setVisible(false);
        }else if(E.getSource() == boton2){
            ProyectoFinal Formulario = new ProyectoFinal();
            Formulario.setBounds(0,0,350,450);
            Formulario.setVisible(true);
            Formulario.setResizable(false);
            Formulario.setLocationRelativeTo(null);
            
            this.setVisible(false);
        }
    }

    public static void main(String args[]){
        ProyectoFinal1 Formulario1 = new ProyectoFinal1();
        Formulario1.setBounds(0,0,610,380);
        Formulario1.setVisible(true);
        Formulario1.setResizable(false);
        Formulario1.setLocationRelativeTo(null);
    }
}
