import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProyectoFinal2 extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu opciones, calcular, acercaDe, colorFondo;
    private JMenuItem miCalculo, miBlanco, miNegro, miAzul, miElCreador, miSalir, miNuevo;
    private JLabel logo, Bienvenida, titulo, nombre, apellido1, apellido2, departamento,
                    antiguedad, resultado, footer;
    private JTextField TxNombre, TxApellido1, TxApellido2;
    private JComboBox CxDepartamento, CxAntiguedad;
    private JScrollPane Scrol1;
    private JTextArea Area1;

    String Nombre = "";

    public ProyectoFinal2(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(71,159,164));
        setIconImage(new ImageIcon(getClass().getResource("Imagenes/Logo_DesinGlass.png")).getImage());
        ProyectoFinal Ventana1 = new ProyectoFinal();
        Nombre = Ventana1.TxNomb;

        menubar = new JMenuBar();
        menubar.setBackground(new Color(255,255,255));
        setJMenuBar(menubar);

        opciones = new JMenu("Opciones");
        opciones.setBackground(new Color(255,255,255));
        opciones.setFont(new Font("Century",1,14));
        opciones.setForeground(new Color(0,0,0));
        menubar.add(opciones);

        calcular = new JMenu("Calcular");
        calcular.setBackground(new Color(255,255,255));
        calcular.setFont(new Font("Century",1,14));
        calcular.setForeground(new Color(0,0,0));
        menubar.add(calcular);

        acercaDe = new JMenu("Acerca De");
        acercaDe.setBackground(new Color(255,255,255));
        acercaDe.setFont(new Font("Century",1,14));
        acercaDe.setForeground(new Color(0,0,0));
        menubar.add(acercaDe);

        colorFondo = new JMenu("Color de Fondo");
        colorFondo.setFont(new Font("Century",1,14));
        colorFondo.setForeground(new Color(0,0,0));
        opciones.add(colorFondo);

        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Century",1,14));
        miCalculo.setForeground(new Color(0,0,0));
        miCalculo.addActionListener(this);
        calcular.add(miCalculo);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Century",1,14));
        miNegro.setForeground(new Color(0,0,0));
        miNegro.addActionListener(this);
        colorFondo.add(miNegro);

        miBlanco = new JMenuItem("Blanco");
        miBlanco.setFont(new Font("Century",1,14));
        miBlanco.setForeground(new Color(0,0,0));
        miBlanco.addActionListener(this);
        colorFondo.add(miBlanco);

        miAzul = new JMenuItem("Azul");
        miAzul.setFont(new Font("Century",1,14));
        miAzul.setForeground(new Color(0,0,0));
        miAzul.addActionListener(this);
        colorFondo.add(miAzul);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Century",1,14));
        miNuevo.setForeground(new Color(0,0,0));
        miNuevo.addActionListener(this);
        opciones.add(miNuevo);

        miElCreador = new JMenuItem("El Creador");
        miElCreador.setFont(new Font("Century",1,14));
        miElCreador.setForeground(new Color(0,0,0));
        miElCreador.addActionListener(this);
        acercaDe.add(miElCreador);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Century",1,14));
        miSalir.setForeground(new Color(0,0,0));
        miSalir.addActionListener(this);
        opciones.add(miSalir);

        ImageIcon Imagen = new ImageIcon("Imagenes/Logo_sin_fondo.png");

        logo = new JLabel(Imagen);
        logo.setBounds(5,5,250,100);
        add(logo);

        Bienvenida = new JLabel("Bienvenido " + Nombre);
        Bienvenida.setBounds(280,30,300,50);
        Bienvenida.setFont(new Font("Century",1,32));
        Bienvenida.setForeground(new Color(0,0,0));
        add(Bienvenida);

        titulo = new JLabel("Datos del trabajador para el calculo de vacaciones");
        titulo.setBounds(45,140,900,25);
        titulo.setFont(new Font("century",0,24));
        titulo.setForeground(new Color(0,0,0));
        add(titulo);

        nombre = new JLabel("Nombre Completo");
        nombre.setBounds(25,188,180,25);
        nombre.setFont(new Font("Century",1,12));
        nombre.setForeground(new Color(0,0,0));
        add(nombre);

        TxNombre = new JTextField();
        TxNombre.setBounds(25,213,150,25);
        TxNombre.setBackground(new java.awt.Color(224,224,224));
        TxNombre.setFont(new java.awt.Font("Century",1,14));
        TxNombre.setForeground(new java.awt.Color(0,112,192));
        add(TxNombre);

        apellido1 = new JLabel("Apellido Completo");
        apellido1.setBounds(25,248,180,25);
        apellido1.setFont(new Font("Century",1,12));
        apellido1.setForeground(new Color(0,0,0));
        add(apellido1);

        TxApellido1 = new JTextField();
        TxApellido1.setBounds(25,273,150,25);
        TxApellido1.setBackground(new java.awt.Color(224,224,224));
        TxApellido1.setFont(new java.awt.Font("Century",1,14));
        TxApellido1.setForeground(new java.awt.Color(0,112,192));
        add(TxApellido1);

        apellido2 = new JLabel("Apellido Completo");
        apellido2.setBounds(25,308,180,25);
        apellido2.setFont(new Font("Century",1,12));
        apellido2.setForeground(new Color(0,0,0));
        add(apellido2);

        TxApellido2 = new JTextField();
        TxApellido2.setBounds(25,334,150,25);
        TxApellido2.setBackground(new java.awt.Color(224,224,224));
        TxApellido2.setFont(new java.awt.Font("Century",1,14));
        TxApellido2.setForeground(new java.awt.Color(0,112,192));
        add(TxApellido2);

        departamento = new JLabel("Departamento");
        departamento.setBounds(220,188,180,25);
        departamento.setFont(new Font("Century",1,12));
        departamento.setForeground(new Color(0,0,0));
        add(departamento);

        CxDepartamento = new JComboBox();
        CxDepartamento.setBounds(220,213,220,25);
        CxDepartamento.setBackground(new java.awt.Color(224,224,224));
        CxDepartamento.setFont(new java.awt.Font("Century",1,14));
        CxDepartamento.setForeground(new java.awt.Color(0,112,192));
        add(CxDepartamento);
        CxDepartamento.addItem("");
        CxDepartamento.addItem("Atencion A Cliente");
        CxDepartamento.addItem("Departamento de Logistica");
        CxDepartamento.addItem("Departamento de Gerencia");

        antiguedad = new JLabel("Antiguedad");
        antiguedad.setBounds(220,248,180,25);
        antiguedad.setFont(new Font("Century",1,12));
        antiguedad.setForeground(new Color(0,0,0));
        add(antiguedad);

        CxAntiguedad = new JComboBox();
        CxAntiguedad.setBounds(220,273,220,25);
        CxAntiguedad.setBackground(new java.awt.Color(224,224,224));
        CxAntiguedad.setFont(new java.awt.Font("Century",1,14));
        CxAntiguedad.setForeground(new java.awt.Color(0,112,192));
        add(CxAntiguedad);
        CxAntiguedad.addItem("");
        CxAntiguedad.addItem("1 año de servicio");
        CxAntiguedad.addItem("2 a 6 años de servicio");
        CxAntiguedad.addItem("7 años o mas de servicio");

        resultado = new JLabel("Resultado del Calculo: ");
        resultado.setBounds(220,307,180,25);
        resultado.setFont(new Font("Century",1,12));
        resultado.setForeground(new Color(0,0,0));
        add(resultado);

        Area1 = new JTextArea();
        Area1.setEditable(false);
        Area1.setBackground(new Color(224,224,224));
        Area1.setFont(new Font("Century",1,11));
        Area1.setForeground(new Color(0,112,192));
        Area1.setText("\n      Aqui aparece el resultado del calculo de las vacaciones.");
        Scrol1 = new JScrollPane(Area1);
        Scrol1.setBounds(220,333,385,90);
        add(Scrol1);

        footer = new JLabel("2022 DesinGlass Company © | Todos los derechos reservados");
        footer.setBounds(135,445,500,30);
        footer.setFont(new Font("Century",1,12));
        footer.setForeground(new Color(0,0,0));
        add(footer);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == miCalculo){
            String NombreTrabajador = TxNombre.getText();
            String Ap1 = TxApellido1.getText();
            String Ap2 = TxApellido2.getText();
            String Depa = CxDepartamento.getSelectedItem().toString();
            String Anti = CxAntiguedad.getSelectedItem().toString();

            if(NombreTrabajador.equals("") || Ap1.equals("") || Ap2.equals("")
                || Depa.equals("") || Anti.equals("")){
                    JOptionPane.showMessageDialog(null, "Ingrese Todos los Datos al Formulario");
            }else{
                if(Depa.equals("Atencion A Cliente")){
                    if(Anti.equals("1 año de servicio")){
                        Area1.setText("\n  El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + 
                                        "\n  Con " + Anti +
                                        "\n  recibe 6 dias de vacaciones");      
                    }
                    if(Anti.equals("2 a 6 años de servicio")){
                        Area1.setText("\n   El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + "Con" + Anti +
                                        "\n  recibe 14 dias de vacaciones"); 
                    }
                    if(Anti.equals("7 años o mas de servicio")){
                        Area1.setText("\n   El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + 
                                        "\n  Con " + Anti +
                                        "\n  recibe 20 dias de vacaciones"); 
                    }
                }

                if(Depa.equals("Departamento de Gerencia")){
                    if(Anti.equals("1 año de servicio")){
                        Area1.setText("\n   El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + 
                                        "\n  Con " + Anti +
                                        "\n  recibe 10 dias de vacaciones");  
                    }
                    if(Anti.equals("2 a 6 años de servicio")){
                        Area1.setText("\n   El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + 
                                        "\n  Con " + Anti +
                                        "\n  recibe 20 dias de vacaciones"); 
                    }
                    if(Anti.equals("7 años o mas de servicio")){
                        Area1.setText("\n   El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + 
                                        "\n  Con " + Anti +
                                        "\n  recibe 30 dias de vacaciones"); 
                    }
                }

                if(Depa.equals("Departamento de Logistica")){
                    if(Anti.equals("1 año de servicio")){
                        Area1.setText("\n   El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + 
                                        "\n  Con " + Anti +
                                        "\n  recibe 6 dias de vacaciones");  
                    }
                    if(Anti.equals("2 a 6 años de servicio")){
                        Area1.setText("\n   El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + 
                                        "\n  Con " + Anti +
                                        "\n  recibe 14 dias de vacaciones"); 
                    }
                    if(Anti.equals("7 años o mas de servicio")){
                        Area1.setText("\n   El Trabajador " + NombreTrabajador + " " + Ap1 + " " + Ap2 +
                                        "\n  Quien Labora en el departamento: " + Depa + " " + 
                                        "\n  Con " + Anti +
                                        "\n  recibe 20 dias de vacaciones"); 
                    }
                }
            }
        }
        if(e.getSource() == miNegro){
            getContentPane().setBackground(new Color(0,0,0)); 
            logo.setForeground(new Color(255,255,255));
            Bienvenida.setForeground(new Color(255,255,255));
            titulo.setForeground(new Color(255,255,255));
            nombre.setForeground(new Color(255,255,255));
            apellido1.setForeground(new Color(255,255,255));
            apellido2.setForeground(new Color(255,255,255));
            departamento.setForeground(new Color(255,255,255));
            antiguedad.setForeground(new Color(255,255,255));
            resultado.setForeground(new Color(255,255,255));
            footer.setForeground(new Color(255,255,255));             
        }   
        if(e.getSource() == miBlanco){
            getContentPane().setBackground(new Color(255,255,255));
            logo.setForeground(new Color(0,0,0));
            Bienvenida.setForeground(new Color(0,0,0));
            titulo.setForeground(new Color(0,0,0));
            nombre.setForeground(new Color(0,0,0));
            apellido1.setForeground(new Color(0,0,0));
            apellido2.setForeground(new Color(0,0,0));
            departamento.setForeground(new Color(0,0,0));
            antiguedad.setForeground(new Color(0,0,0));
            resultado.setForeground(new Color(0,0,0));
            footer.setForeground(new Color(0,0,0));  
        }
        if(e.getSource() == miAzul){
            getContentPane().setBackground(new Color(0,112,192));
            logo.setForeground(new Color(255,255,255));
            Bienvenida.setForeground(new Color(255,255,255));
            titulo.setForeground(new Color(255,255,255));
            nombre.setForeground(new Color(255,255,255));
            apellido1.setForeground(new Color(255,255,255));
            apellido2.setForeground(new Color(255,255,255));
            departamento.setForeground(new Color(255,255,255));
            antiguedad.setForeground(new Color(255,255,255));
            resultado.setForeground(new Color(255,255,255));
            footer.setForeground(new Color(255,255,255)); 
        }
        if(e.getSource() == miNuevo){
            TxNombre.setText("");
            TxApellido1.setText("");
            TxApellido2.setText("");
            CxDepartamento.setSelectedIndex(0);
            CxAntiguedad.setSelectedIndex(0);
            Area1.setText("\n      Aqui aparece el resultado del calculo de las vacaciones.");
        }
        if(e.getSource() == miSalir){
            ProyectoFinal Formulario = new ProyectoFinal();
            Formulario.setBounds(0,0,350,450);
            Formulario.setVisible(true);
            Formulario.setResizable(false);
            Formulario.setLocationRelativeTo(null);

            this.setVisible(false);
        }
        if(e.getSource() == miElCreador){
            JOptionPane.showMessageDialog(null, "Desarrollado Por Isaac Montes\n"+
                                                                "     www.DesinGlass.com.mx");
        }
    }

    public static void main(String args[]){
        ProyectoFinal2 Formularo2 = new ProyectoFinal2();
        Formularo2.setBounds(0,0,640,535);
        Formularo2.setVisible(true);
        Formularo2.setResizable(false);
        Formularo2.setLocationRelativeTo(null);
    }
}
