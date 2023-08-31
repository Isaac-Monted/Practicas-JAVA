import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProyectoFinal extends JFrame implements ActionListener{
    private JTextField TxCasilla1;
    private JLabel texto1, texto2, texto3, texto4;
    private JButton buton1;
    public static String TxNomb = "";

    public ProyectoFinal(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(71,159,164));
        setIconImage(new ImageIcon(getClass().getResource("Imagenes/DG.png")).getImage());

        ImageIcon Imagen = new ImageIcon("Imagenes/Logo_DesinGlass.png");
        texto1 = new JLabel(Imagen);
        texto1.setBounds(25,15,300,150);
        add(texto1);

        texto2 = new JLabel("Sistema de Control Vacacional");
        texto2.setBounds(35,135,300,30);
        texto2.setFont(new Font("Century",3, 18));
        texto2.setForeground(new Color(255,255,255));
        add(texto2);
        
        texto3 = new JLabel("Ingrese Su Nombre: ");
        texto3.setBounds(45,212,200,30);
        texto3.setFont(new Font("Century",1, 12));
        texto3.setForeground(new Color(255,255,255));
        add(texto3);

        texto4 = new JLabel("2022 DesinGlass Compant ©");
        texto4.setBounds(85,375,300,30);
        texto4.setFont(new Font("Century",1, 12));
        texto4.setForeground(new Color(255,255,255));
        add(texto4);

        TxCasilla1 = new JTextField();
        TxCasilla1.setBounds(45,240,255,25);
        TxCasilla1.setBackground(new Color(224,224,224));
        TxCasilla1.setFont(new Font("Century",1,14));
        TxCasilla1.setForeground(new Color(0,112,192));
        add(TxCasilla1);

        buton1 = new JButton("Ingresar");
        buton1.setBounds(125,280,100,30);
        buton1.setFont(new Font("Century",1,14));
        buton1.setBackground(new Color(255,255,255));
        buton1.setForeground(new Color(0,112,192));
        buton1.addActionListener(this);
        add(buton1);
    }

    public void actionPerformed(ActionEvent E){
        if(E.getSource() == buton1){
            TxNomb = TxCasilla1.getText().trim();
            if(TxNomb.equals("")){
                JOptionPane.showMessageDialog(null,"Debes Ingresar tu Nombre.");
            }else{
                ProyectoFinal1 Formulario1 = new ProyectoFinal1();
                Formulario1.setBounds(0,0,610,380);
                Formulario1.setVisible(true);
                Formulario1.setResizable(false);
                Formulario1.setLocationRelativeTo(null);

                this.setVisible(false);
            }
        }
    }

    public static void main(String args []){
        ProyectoFinal Formulario = new ProyectoFinal();
        Formulario.setBounds(0,0,350,450);
        Formulario.setVisible(true);
        Formulario.setResizable(false);
        Formulario.setLocationRelativeTo(null);
        
    }
}
