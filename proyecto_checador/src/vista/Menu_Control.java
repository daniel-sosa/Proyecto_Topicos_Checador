/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.oracle.jrockit.jfr.DataType;
import java.*;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.datatype.Duration;
import modelo.ChequeoXDiaDAO;
import modelo.ChequeoXDiaVO;
import modelo.DepartamentoDAO;
import modelo.DepartamentoVO;
import modelo.EmpleadoDAO;
import modelo.EmpleadoVO;
import modelo.HorarioDAO;
import modelo.HorarioVO;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;

public class Menu_Control extends JFrame {

    private ImageIcon imagenInicio, imagenClose, imagenRest, imagenMin;
    private Icon icono, icono_close, icono_Rest, icono_Min;
    private ButtonGroup grupoBtnCon, grupoBtnReg, grupoBtnAct, grupoBtnDel;
    JDialog dialog;
    JButton btnCerrarSesion;
    EmpleadoVO empVarClass;

    /**
     * Creates new form Menu_Control
     */
    public Menu_Control() {
        initComponents();
        CargaVistaActualizar();
        setAlwaysOnTop(false);
        dialog = new JDialog(null, "Cerrar Sesion", Dialog.ModalityType.DOCUMENT_MODAL);
        dialog.setBounds(getWidth() - 150, 100, 327, 167);
        dialog.setLayout(null);
        dialog.setBounds(935 - 150, 100, 327, 167);
        getContentPane().setLayout(null);

        JLabel label = new JLabel("");
        label.setBorder(new LineBorder(Color.black));
        label.setBounds(10, 11, 75, 73);
        dialog.add(label);

        JLabel lblJulianRamirez = new JLabel("Administrador:");
        lblJulianRamirez.setBounds(95, 11, 104, 14);
        dialog.add(lblJulianRamirez);

        btnCerrarSesion = new JButton("Cerrar Sesion");
        btnCerrarSesion.setBounds(187, 94, 114, 23);
        dialog.add(btnCerrarSesion);

        JLabel lblLuisGerardoJulian = new JLabel("Luis Gerardo Julian Ramirez");
        lblLuisGerardoJulian.setBounds(95, 36, 206, 14);
        dialog.add(lblLuisGerardoJulian);
        dialog.setUndecorated(true);
        dialog.getContentPane().setBackground(Color.WHITE);

        setLocationRelativeTo(null);
        jLabel3.setVisible(false);
        etiNameCon.setVisible(false);

        imagenInicio = new ImageIcon("src/imagenes/iconLogin.png");
        icono = new ImageIcon(imagenInicio.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
        jLabel5.setIcon(icono);

        imagenClose = new ImageIcon("src/imagenes/btnClose.png");
        icono_close = new ImageIcon(imagenClose.getImage().getScaledInstance(etiClose.getWidth(), etiClose.getHeight(), Image.SCALE_DEFAULT));
        etiClose.setIcon(icono_close);

        imagenRest = new ImageIcon("src/imagenes/rest.png");
        icono_Rest = new ImageIcon(imagenRest.getImage().getScaledInstance(etiRest.getWidth(), etiRest.getHeight(), Image.SCALE_DEFAULT));
        etiRest.setIcon(icono_Rest);

        imagenMin = new ImageIcon("src/imagenes/mini.png");
        icono_Min = new ImageIcon(imagenMin.getImage().getScaledInstance(etimin.getWidth(), etimin.getHeight(), Image.SCALE_DEFAULT));
        etimin.setIcon(icono_Min);

        grupoBtnCon = new ButtonGroup();
        grupoBtnCon.add(jRadioButton1);
        grupoBtnCon.add(jRadioButton2);
        grupoBtnCon.add(jRadioButton9);

        grupoBtnReg = new ButtonGroup();
        grupoBtnReg.add(jRadioButton3);
        grupoBtnReg.add(jRadioButton4);

        grupoBtnAct = new ButtonGroup();
        grupoBtnAct.add(jRadioButton5);
        grupoBtnAct.add(jRadioButton6);

        grupoBtnDel = new ButtonGroup();
        grupoBtnDel.add(jRadioButton7);
        grupoBtnDel.add(jRadioButton8);

        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
                dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        etiNameCon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtnameReg = new javax.swing.JTextField();
        txtDirReg = new javax.swing.JTextField();
        txtApePReg = new javax.swing.JTextField();
        txtTelReg = new javax.swing.JTextField();
        txtTelEmerReg = new javax.swing.JTextField();
        txtApeMReg = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox<String>();
        jLabel25 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<String>();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        etiTelEmerBaja = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        etiApeMBaja = new javax.swing.JLabel();
        etiApePBaja = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        etiTelBaja = new javax.swing.JLabel();
        etiDirBaja = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        etinameBaja = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<String>();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox5 = new javax.swing.JComboBox<String>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtnameAct = new javax.swing.JTextField();
        txtDirAct = new javax.swing.JTextField();
        txtApePAct = new javax.swing.JTextField();
        txtTelAct = new javax.swing.JTextField();
        txtTelEmerAct = new javax.swing.JTextField();
        txtApeMAct = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        etiClose = new javax.swing.JLabel();
        etiRest = new javax.swing.JLabel();
        etimin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Informacion de interes:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Datos Personales", "Control de Asistencia", "Informacion de Departamentos" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido Paterno", "Apellido Materno", "ID Reporte", "Sexo", "Direccion", "Telefono", "Telefono Emergencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Ingrese Nombre");

        jLabel4.setText("   Busqueda por:");

        jRadioButton1.setText("Codigo");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jRadioButton2.setText("Nombre");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton9.setSelected(true);
        jRadioButton9.setText("S/P");
        jRadioButton9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton9ItemStateChanged(evt);
            }
        });

        jButton8.setText("Limpiar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setText("Opciones:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empleados Vigentes", "Desempleados" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 564, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiNameCon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton9)
                                .addGap(41, 41, 41))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(821, 821, 821)
                        .addComponent(jButton3)
                        .addGap(43, 43, 43)
                        .addComponent(jButton8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiNameCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton9))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton3.setText("M");
        jRadioButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("F");
        jRadioButton4.setBorderPainted(true);
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel12.setText("Sexo");

        jLabel13.setText("Departamento");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Informatica", "Limpieza", " ", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Horario");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Lunes", "8:00", "--------------------------------"},
                {"Martes", "8:00", "--------------------------------"},
                {"Miercoles", "8:00", "--------------------------------"},
                {"Jueves", "8:00", "--------------------------------"},
                {"Viernes", "8:00", "--------------------------------"}
            },
            new String [] {
                "Dia", "Entrada", "Salida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setText("Numero de Emergencia ");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 151, 30));

        jLabel50.setText("Apellido Materno");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 151, -1));

        jLabel54.setText("Apellido Paterno");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 151, -1));

        jLabel55.setText("Numero de Telefono  ");
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 151, 30));

        jLabel57.setText("Direccion");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 151, 30));

        jLabel59.setText("Nombre");
        jPanel7.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 151, -1));

        txtnameReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnameRegMouseClicked(evt);
            }
        });
        txtnameReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameRegActionPerformed(evt);
            }
        });
        jPanel7.add(txtnameReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        txtDirReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDirRegMouseClicked(evt);
            }
        });
        txtDirReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirRegActionPerformed(evt);
            }
        });
        jPanel7.add(txtDirReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, -1));

        txtApePReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApePRegMouseClicked(evt);
            }
        });
        txtApePReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApePRegActionPerformed(evt);
            }
        });
        jPanel7.add(txtApePReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, -1));
        jPanel7.add(txtTelReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 200, -1));
        jPanel7.add(txtTelEmerReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 200, -1));

        txtApeMReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApeMRegMouseClicked(evt);
            }
        });
        txtApeMReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeMRegActionPerformed(evt);
            }
        });
        jPanel7.add(txtApeMReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 200, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 582, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioButton3)
                                    .addGap(32, 32, 32)
                                    .addComponent(jRadioButton4))
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 970, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "14161274", " " }));
        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jLabel25.setText("Codigo de Empleado");

        jLabel32.setText("Sexo");

        jRadioButton7.setText("M");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setText("F");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jLabel33.setText("Departamento");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Informatica", "Limpieza", " ", " " }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jLabel34.setText("Horario");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dia", "Entrada", "Salida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jButton6.setText("Cancelar");

        jButton7.setText("OK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Numero de Emergencia ");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 151, 30));

        etiTelEmerBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(etiTelEmerBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 200, 20));

        jLabel28.setText("Apellido Materno");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 151, -1));

        etiApeMBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(etiApeMBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 200, 20));

        etiApePBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(etiApePBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, 20));

        jLabel27.setText("Apellido Paterno");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 151, -1));

        jLabel30.setText("Numero de Telefono  ");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 151, 30));

        etiTelBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(etiTelBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 200, 20));

        etiDirBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(etiDirBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 20));

        jLabel29.setText("Direccion");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 151, 30));

        etinameBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(etinameBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 20));

        jLabel26.setText("Nombre");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 151, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1177, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jRadioButton7)
                                    .addGap(32, 32, 32)
                                    .addComponent(jRadioButton8))
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("   Bajas", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Codigo de Empleado");

        jLabel22.setText("Sexo");

        jRadioButton5.setText("M");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("F");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel23.setText("Departamento");

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel24.setText("Horario");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Lunes", null, null},
                {"Martes", null, null},
                {"Miercoles", null, null},
                {"Jueves", null, null},
                {"Viernes", null, null}
            },
            new String [] {
                "Dia", "Entrada", "Salida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setText("Numero de Emergencia ");
        jPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 151, 30));

        jLabel49.setText("Apellido Materno");
        jPanel6.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 151, -1));

        jLabel52.setText("Apellido Paterno");
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 151, -1));

        jLabel53.setText("Numero de Telefono  ");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 151, 30));

        jLabel56.setText("Direccion");
        jPanel6.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 151, 30));

        jLabel58.setText("Nombre");
        jPanel6.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 151, -1));
        jPanel6.add(txtnameAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        txtDirAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirActActionPerformed(evt);
            }
        });
        jPanel6.add(txtDirAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, -1));
        jPanel6.add(txtApePAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 200, -1));
        jPanel6.add(txtTelAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 200, -1));
        jPanel6.add(txtTelEmerAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 200, -1));
        jPanel6.add(txtApeMAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 200, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jRadioButton5)
                                    .addGap(32, 32, 32)
                                    .addComponent(jRadioButton6))
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 970, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualizar", jPanel3);

        jPanel8.setBackground(new java.awt.Color(0, 51, 255));

        etiClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiCloseMouseExited(evt);
            }
        });

        etiRest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiRestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiRestMouseExited(evt);
            }
        });

        etimin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etimin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiRest, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etimin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiRest, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void etiCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiCloseMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea Cerrar Sesion?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_etiCloseMouseClicked

    private void etiCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiCloseMouseEntered
        ImageIcon imagen = new ImageIcon("src/imagenes/btnClose2.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiClose.getWidth(), etiClose.getHeight(), Image.SCALE_DEFAULT));
        etiClose.setIcon(icono);
    }//GEN-LAST:event_etiCloseMouseEntered

    private void etiCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiCloseMouseExited
        ImageIcon imagen = new ImageIcon("src/imagenes/btnClose.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiClose.getWidth(), etiClose.getHeight(), Image.SCALE_DEFAULT));
        etiClose.setIcon(icono);
    }//GEN-LAST:event_etiCloseMouseExited

    private void etiRestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiRestMouseEntered
        ImageIcon imagen = new ImageIcon("src/imagenes/rest2.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiRest.getWidth(), etiRest.getHeight(), Image.SCALE_DEFAULT));
        etiRest.setIcon(icono);
    }//GEN-LAST:event_etiRestMouseEntered

    private void etiRestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiRestMouseExited
        ImageIcon imagen = new ImageIcon("src/imagenes/rest.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiRest.getWidth(), etiRest.getHeight(), Image.SCALE_DEFAULT));
        etiRest.setIcon(icono);
    }//GEN-LAST:event_etiRestMouseExited

    private void etiminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiminMouseClicked
        setExtendedState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_etiminMouseClicked

    private void etiminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiminMouseEntered
        ImageIcon imagen = new ImageIcon("src/imagenes/mini2.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etimin.getWidth(), etimin.getHeight(), Image.SCALE_DEFAULT));
        etimin.setIcon(icono);
    }//GEN-LAST:event_etiminMouseEntered

    private void etiminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiminMouseExited
        ImageIcon imagen = new ImageIcon("src/imagenes/mini.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etimin.getWidth(), etimin.getHeight(), Image.SCALE_DEFAULT));
        etimin.setIcon(icono);
    }//GEN-LAST:event_etiminMouseExited

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged


    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()) {
            jLabel3.setText("Ingrese Codigo");
        }
        jLabel3.setVisible(true);
        etiNameCon.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton9ItemStateChanged
        jLabel3.setVisible(false);
            etiNameCon.setVisible(false);    }//GEN-LAST:event_jRadioButton9ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton2.isSelected()) {
            jLabel3.setText("Ingrese Nombre");
        }
        jLabel3.setVisible(true);
        etiNameCon.setVisible(true);
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

        if (evt.getItem().equals("Datos Personales")) {//---------------------------------------------------------------
            jLabel2.setVisible(true);
            jComboBox2.setVisible(true);
            jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Empleados Vigentes", "Desempleados"}));
            if (!jRadioButton9.isSelected()) {
                jLabel3.setVisible(true);
                etiNameCon.setVisible(true);
            }
            jLabel4.setVisible(true);
            jRadioButton1.setVisible(true);
            jRadioButton2.setVisible(true);
            jRadioButton9.setVisible(true);
            jButton3.setVisible(true);
            String titulos[] = {"Codigo", "Nombre", "Apellido Paterno", "Apellido Materno", "ID Reporte", "Sexo", "Direccion", "Telefono", "Telefono Emergencia"};
            Object datos[][] = {null, null, null, null, null, null, null, null, null};
            jTable1.setModel(new DefaultTableModel(datos, titulos));
        } else if (evt.getItem().equals("Informacion de Departamentos")) {//.......................................................
            jLabel2.setVisible(false);
            jComboBox2.setVisible(false);

            jLabel3.setVisible(false);
            etiNameCon.setVisible(false);
            jLabel4.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton9.setVisible(false);
            jButton3.setVisible(false);
            DepartamentoDAO ddao= new DepartamentoDAO();
            ArrayList <DepartamentoVO> ald= ddao.ListarDepartamento();
            Object datos[][] = new Object[ald.size()][];
            for (int i = 0; i <ald.size(); i++) {
                datos[i]=ald.get(i).toString().split(",");
            }
            String titulos[] = {"ID", "Nombre", "Ubicacion"};
            
            jTable1.setModel(new DefaultTableModel(datos, titulos));
            
        } else {
            jLabel2.setVisible(true);
            jComboBox2.setVisible(true);
            jComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"Asistencias", "Retardos", "Faltas"}));
            if (!jRadioButton9.isSelected()) {
                jLabel3.setVisible(true);
                etiNameCon.setVisible(true);
            }
            jLabel4.setVisible(true);
            jRadioButton1.setVisible(true);
            jRadioButton2.setVisible(true);
            jRadioButton9.setVisible(true);
            jButton3.setVisible(true);
            String titulos[] = {"Codigo", "Nombre", "Apellido P", "Apellido M", "Contador"};
            Object datos[][] = {null, null, null, null, null};
            jTable1.setModel(new DefaultTableModel(datos, titulos));
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (!dialog.isVisible()) {
            setAlwaysOnTop(false);
            dialog.setVisible(true);
        } else {

            dialog.dispose();
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        dialog.dispose();
        setAlwaysOnTop(false);

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        etiNameCon.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtnameReg.setText("");
        txtApePReg.setText("");
        txtApeMReg.setText("");
        txtDirReg.setText("");
        txtTelReg.setText("");
        txtTelEmerReg.setText("");
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jComboBox3.setSelectedIndex(0);
        String titulos[] = {"Dia", "Entrada", "Salida"};
        Object datos[][] = {null, null, null};
        jTable2.setModel(new DefaultTableModel(datos, titulos));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jComboBox5.setSelectedIndex(0);
        txtnameAct.setText("");
        txtApeMAct.setText("");
        txtApePAct.setText("");
        txtDirAct.setText("");
        txtTelAct.setText("");
        txtTelEmerAct.setText("");
        jRadioButton6.setSelected(false);
        jRadioButton5.setSelected(false);
        jComboBox4.setSelectedIndex(0);
        String titulos[] = {"Dia", "Entrada", "Salida"};
        Object datos[][] = {null, null, null};
        jTable3.setModel(new DefaultTableModel(datos, titulos));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Object[] ar = null;
        Object[][] d = null;
        EmpleadoDAO edao = new EmpleadoDAO();
        ChequeoXDiaDAO cdao = new ChequeoXDiaDAO();
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                datosPersonales(ar, edao, d);
                break;
            case 1:

                controlAsistencia();
                break;

        }

//            DefaultTableModel dt;
//            dt = new  DefaultTableModel(d,ar);
//            jTable1.setModel(dt);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (verificarRegistros()) {
            EmpleadoDAO edao = new EmpleadoDAO();
            int mayor = edao.dameCodigoMayor() + 1;
            int idD = jComboBox3.getSelectedIndex() + 100;
            String sexo = jRadioButton3.isSelected() ? "Masculino" : "Femenino";
            EmpleadoVO e = new EmpleadoVO(mayor + "", idD + "", txtnameReg.getText(), txtApePReg.getText(), txtApeMReg.getText(), sexo, txtDirReg.getText(), txtTelReg.getText(), txtTelEmerReg.getText(), "activo");
            edao.registrarEmpleado(e);

            HorarioDAO hdao = new HorarioDAO();
            HorarioVO h;
            DefaultTableModel tm = (DefaultTableModel) jTable2.getModel();

            long mil = 0;
            String[] aux = null;
            java.sql.Time[] artE = new java.sql.Time[6];
            java.sql.Time[] artS = new java.sql.Time[6];
            int cols = tm.getColumnCount();
            int fils = tm.getRowCount();
            for (int i = 0; i < fils; i++) {
                for (int j = 0; j < cols; j++) {
                    if (tm.isCellEditable(i, j)) {
                        aux = tm.getValueAt(i, j).toString().split(":");
                        LocalTime lt = new LocalTime(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]), 00, 678);
                        mil = lt.toDateTimeToday().withDate(1970, 1, 1).getMillis();
                        artE[i] = new java.sql.Time(mil);
                    }
                }

            }
            h = new HorarioVO(mayor + "", artE[0], artE[1], artE[2], artE[3], artE[4]);
            hdao.registrarHorario(h);

            Object[][] datos = new Object[6][];
            String[] titu = "Dias,Hora de entrada,Hora de salida".split(",");
            String[] he = h.toString().split(",");
            String[] hs = h.getHorasDeSalida().split(",");
            String[] dias = "Lunes,Martes,Miercoles,Jueves,Viernes".split(",");
            for (int i = 0; i < dias.length; i++) {
                datos[i] = (dias[i] + "," + he[i + 1] + "," + hs[i]).split(",");
                System.out.println(dias[i] + "  " + he + "  " + hs);
            }
            DefaultTableModel dtm = new DefaultTableModel(datos, titu);
            jTable2.setModel(dtm);
        }

        CargaVistaActualizar();


    }//GEN-LAST:event_jButton2ActionPerformed
    public boolean verificarRegistros() {
        boolean t = true;
        if (txtnameReg.getText().isEmpty()) {
            txtnameReg.setBorder(new LineBorder(Color.RED));
            t = false;
        }
        if (txtApePReg.getText().isEmpty()) {
            txtApePReg.setBorder(new LineBorder(Color.RED));
            t = false;
        }
        if (txtApeMReg.getText().isEmpty()) {
            txtApeMReg.setBorder(new LineBorder(Color.RED));
            t = false;
        }
        if (txtDirReg.getText().isEmpty()) {
            txtDirReg.setBorder(new LineBorder(Color.RED));
            t = false;
        }
        if (!jRadioButton4.isSelected() && !jRadioButton3.isSelected()) {
            jRadioButton3.setBorder(new LineBorder(Color.RED));
            jRadioButton3.setBorderPainted(true);
            jRadioButton4.setBorder(new LineBorder(Color.RED));
            jRadioButton4.setBorderPainted(true);
            t = false;
        }
        return t;
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        EmpleadoVO e;
        EmpleadoDAO edao = new EmpleadoDAO();
        String codigo, ideDep, sexo;
        codigo = jComboBox5.getItemAt(jComboBox5.getSelectedIndex());
        try{
        
        System.out.println(codigo);
        
        //ideDep = (jComboBox4.getSelectedIndex() + 100) + "";
        sexo = jRadioButton5.isSelected() ? "Masculino" : "femenino";

        e = new EmpleadoVO(codigo, "100", txtnameAct.getText(), txtApePAct.getText(), txtApeMAct.getText(), sexo, txtDirAct.getText(), txtTelAct.getText(), txtTelEmerAct.getText(), "Activo");
        edao.actualizarEmpleado(e, empVarClass);
        }catch(Exception ey){}
        DefaultTableModel tm = (DefaultTableModel) jTable3.getModel();
        HorarioDAO hdao = new HorarioDAO();
        HorarioVO  horaBD = hdao.ConsultaHorarioXCodigo(codigo),horaTabla ;
        int filas= tm.getRowCount();
        java.sql.Time []arHE= new Time[filas];
        for (int i = 0; i < filas; i++){ 
            
              arHE[i]= combercionTime(tm.getValueAt(i,1).toString());
              
        }
        horaTabla= new HorarioVO(codigo,arHE[0],arHE[1],arHE[2],arHE[3],arHE[4]);
        hdao.actualizarHorario(horaTabla, horaBD);
        System.out.println(horaTabla.toString());
        ActualizarTabla(jTable3, horaTabla.formato_dia_Hentrada_Hsalida(), "Dia,Hora de Entrada,Hora de Salida".split(","));
        CargaVistaActualizar();
        
    }//GEN-LAST:event_jButton5ActionPerformed
//...........................Encabezado..............................................................................
    public Time combercionTime(String t){
        String []aux=t.split(":");
        int hrs=0,min=0;
        try {
            hrs=Integer.parseInt(aux[0]);
            min=Integer.parseInt(aux[1]);
            
        } catch (Exception e) {
//            LocalTime lt= new LocalTime(00, 00, 00,678);
//            long m= lt.toDateTimeToday().withDate(1970, 1, 1).getMillis();
            System.out.print(e.getMessage());
//            return new java.sql.Time(m);
        }
        LocalTime lt= new LocalTime(hrs, min, 00,678);
        long m= lt.toDateTimeToday().withDate(1970, 1, 1).getMillis();
      return new java.sql.Time(m);
    
    }
    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
        int codigoE = Integer.parseInt(jComboBox5.getSelectedItem().toString());

        EmpleadoDAO edao = new EmpleadoDAO();
        EmpleadoVO e = edao.consultarEmpleado(codigoE);
        empVarClass = e;
        txtnameAct.setText(e.getNombre());
        txtDirAct.setText(e.getDireccion());
        txtApeMAct.setText(e.getApellidoMaterno());
        txtApePAct.setText(e.getApellidoPaterno());
        txtTelAct.setText(e.getNumTel());
        txtTelEmerAct.setText(e.getNumEmergencia());
        jComboBox4.setSelectedIndex(Integer.parseInt(e.getId_Departamento()) - 100);
        if (e.getSexo().equals("Masculino")) {

            jRadioButton5.setSelected(true);
        } else {
            jRadioButton6.setSelected(true);
        }//
        HorarioDAO hdao = new HorarioDAO();
        HorarioVO h = hdao.ConsultaHorarioXCodigo(codigoE + "");
        String[] titu = "Dia,Hora de entrada,Hora de salida ".split(",");
        ActualizarTabla(jTable3, h.formato_dia_Hentrada_Hsalida(), titu);


    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void txtDirActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirActActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void txtnameRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameRegActionPerformed


    }//GEN-LAST:event_txtnameRegActionPerformed

    private void txtApePRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApePRegActionPerformed

    }//GEN-LAST:event_txtApePRegActionPerformed

    private void txtApeMRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeMRegActionPerformed

    }//GEN-LAST:event_txtApeMRegActionPerformed

    private void txtDirRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirRegActionPerformed

    }//GEN-LAST:event_txtDirRegActionPerformed

    private void txtnameRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameRegMouseClicked
        JTextField j = new JTextField();
        txtnameReg.setBorder(j.getBorder());
    }//GEN-LAST:event_txtnameRegMouseClicked

    private void txtDirRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDirRegMouseClicked
        JTextField j = new JTextField();
        txtDirReg.setBorder(j.getBorder());
    }//GEN-LAST:event_txtDirRegMouseClicked

    private void txtApePRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApePRegMouseClicked
        JTextField j = new JTextField();
        txtApePReg.setBorder(j.getBorder());
    }//GEN-LAST:event_txtApePRegMouseClicked

    private void txtApeMRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApeMRegMouseClicked
        JTextField j = new JTextField();
        txtApeMReg.setBorder(j.getBorder());
    }//GEN-LAST:event_txtApeMRegMouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        JRadioButton j = new JRadioButton();
        jRadioButton3.setBorder(j.getBorder());
        jRadioButton4.setBorder(j.getBorder());
        //jRadioButton3.setBorderPainted(false); jRadioButton4.setBorderPainted(false);
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        jRadioButton3MouseClicked(null);
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int em = 1000 + jComboBox6.getSelectedIndex();
        EmpleadoDAO edao = new EmpleadoDAO();
        EmpleadoVO e = edao.consultarEmpleado(em), e2;
        e.setContrato("no activo");
        e2 = e;
        edao.actualizarEmpleado(e2, e);
        HorarioDAO hdao = new HorarioDAO();
        hdao.eliminarHorario(em + "");
        jTable4.setModel(new DefaultTableModel());
        CargaVistaActualizar();


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
        String op = jComboBox6.getItemAt(jComboBox6.getSelectedIndex());
        EmpleadoDAO edao = new EmpleadoDAO();
        EmpleadoVO e = new EmpleadoVO();
        e = edao.consultarEmpleado(Integer.parseInt(op));
        empVarClass = e;
        etinameBaja.setText(e.getNombre());
        etiApeMBaja.setText(e.getApellidoMaterno());
        etiApePBaja.setText(e.getApellidoPaterno());
        etiTelBaja.setText(e.getNumTel());
        etiTelEmerBaja.setText(e.getNumEmergencia());
        etiDirBaja.setText(e.getDireccion());
        if (e.getSexo().equals("Masculino")) {
            jRadioButton7.setSelected(true);
        } else {
            jRadioButton8.setSelected(true);
        }

        HorarioDAO hdao = new HorarioDAO();
        HorarioVO h = hdao.ConsultaHorarioXCodigo(op + "");
        String[] titulo = "Dia,Hora de entrada,Hora de salida".split(",");

        ActualizarTabla(jTable4, h.formato_dia_Hentrada_Hsalida(), titulo);

        jComboBox7.setSelectedIndex(Integer.parseInt(e.getId_Departamento()) - 100);


    }//GEN-LAST:event_jComboBox6ItemStateChanged
    //----------------------------Encabezado---------------------------------------------------------------------------------

    private void CargaVistaActualizar() {
        EmpleadoVO e = new EmpleadoVO();
        HorarioVO h = new HorarioVO();
        DepartamentoDAO d = new DepartamentoDAO();
        EmpleadoDAO edao = new EmpleadoDAO();
        ArrayList<EmpleadoVO> ale = edao.listaDeEmpleadosActivos();
        ArrayList<DepartamentoVO> ald = d.ListarDepartamento();
        String[] codigosEmpleados = new String[ale.size()];
        String[] nombreDepartamentos = new String[ald.size()];
        for (int i = 0; i < ale.size(); i++) {
            codigosEmpleados[i] = ale.get(i).getCodigoEmpleado();
        }
        for (int i = 0; i < ald.size(); i++) {
            nombreDepartamentos[i] = ald.get(i).getNombreDepartamento();
        }
        JComboBox j = new JComboBox(codigosEmpleados);
        jComboBox5.setModel(j.getModel());
        jComboBox6.setModel(j.getModel());
        JComboBox dep = new JComboBox(nombreDepartamentos);
        jComboBox4.setModel(dep.getModel());
        jComboBox7.setModel(dep.getModel());
        jComboBox3.setModel(dep.getModel());
    }

    private void ActualizarTabla(JTable t, Object[][] datos, String[] titulo) {
        if(datos!=null && titulo!= null){
            DefaultTableModel aux = new DefaultTableModel(datos, titulo);
            t.setModel(aux);
        }
        else{
            DefaultTableModel aux = new DefaultTableModel();
            t.setModel(aux);
        }
    }
    //------------------------------------final-----------------------------------------------------------------------------------

    private void datosPersonales(Object[] ar, EmpleadoDAO edao, Object[][] d) {
        if (jComboBox2.getSelectedIndex() != 1) {
            ar = "CodigoEmpleado,id_Departamento,Nombre,ApellidoPaterno,ApellidoMaterno,Sexo,Direccion,NumTel,NumEmergencia,contrato".toString().split(",");

            ArrayList<EmpleadoVO> al;
            if (jRadioButton1.isSelected()) {
                try {
                    EmpleadoVO em = edao.consultarEmpleado(Integer.parseInt(etiNameCon.getText()));
                    int co = Integer.parseInt(em.getCodigoEmpleado());
                    d = new Object[1][12];
                    d[0] = (Object[]) em.toString().split(",");
                } catch (Exception ep) {
                    JOptionPane.showMessageDialog(null, etiNameCon.getText(), "No existe ningun Codigo de empleado", 0);
                    etiNameCon.setText("");
                }
            }
            if (jRadioButton2.isSelected()) {
                try {
                    ArrayList<EmpleadoVO> arEmpleado = edao.consultarEmpleado(etiNameCon.getText());//-------------
                    d = new Object[arEmpleado.size()][12];
                    for (int i = 0; i < arEmpleado.size(); i++) {
                        d[i] = (Object[]) arEmpleado.get(i).toString().split(",");
                    }
                    //System.out.println(arEmpleado.get(i).toString()); 
                } catch (Exception te) {
                }
            }
            if (jRadioButton9.isSelected()) {
                try {
                    ArrayList<EmpleadoVO> arEmpleado = edao.listaDeEmpleado();//-------------
                    d = new Object[arEmpleado.size()][12];
                    for (int i = 0; i < arEmpleado.size(); i++) {
                        d[i] = (Object[]) arEmpleado.get(i).toString().split(",");
                        //System.out.println(arEmpleado.get(i).toString());
                    }
                } catch (Exception te) {
                }
            }
        }
        DefaultTableModel dt;
        dt = new DefaultTableModel(d, ar);
        jTable1.setModel(dt);
    }

    private void controlAsistencia() {
        ChequeoXDiaDAO cdao=new ChequeoXDiaDAO();
        
        if(jRadioButton1.isSelected()){
            String []opc="asistencia,retardo,falta".split(",");
            String opcion = "";
            
            int op=jComboBox2.getSelectedIndex();
            
             opcion= opc[op];
            ArrayList<ChequeoXDiaVO> alc=cdao.control_de_F_A_R_xEmpleadoCod(etiNameCon.getText(), opcion);
            Object [][]datos= new Object[alc.size()][];
            String [] titulo=("Codigo,Nombre,"+opcion+",Fecha ").split(",");
            for (int i = 0; i < alc.size(); i++) 
                datos[i]=alc.get(i).toString().split(",");
            jTable1.setModel(new DefaultTableModel(datos, titulo));
        }
        if(jRadioButton2.isSelected()){
            String []opc="asistencia,retardo,falta".split(",");
            String opcion = "";
            
            int op=jComboBox2.getSelectedIndex();
            
             opcion= opc[op];
            ArrayList<ChequeoXDiaVO> alc=cdao.control_de_F_A_R_xEmpleadoNom(etiNameCon.getText(), opcion);
            Object [][]datos= new Object[alc.size()][];
            String [] titulo=("Codigo,Nombre,"+opcion+",Fecha ").split(",");
            for (int i = 0; i < alc.size(); i++) 
                datos[i]=alc.get(i).toString().split(",");
            jTable1.setModel(new DefaultTableModel(datos, titulo));
        }
        if(jRadioButton9.isSelected()){
            String []opc="asistencia,retardo,falta".split(",");
            String opcion = "";
            
            int op=jComboBox2.getSelectedIndex();
            
             opcion= opc[op];
            ArrayList<ChequeoXDiaVO> alc=cdao.control_F_R_A_deTodosLosEmpleados( opcion);
            Object [][]datos= new Object[alc.size()][];
            String [] titulo=("Codigo,Nombre,"+opcion).split(",");
            for (int i = 0; i < alc.size(); i++) 
                datos[i]=alc.get(i).tostring().split(",");
            jTable1.setModel(new DefaultTableModel(datos, titulo));
        }
       
        
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Control().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiApeMBaja;
    private javax.swing.JLabel etiApePBaja;
    private javax.swing.JLabel etiClose;
    private javax.swing.JLabel etiDirBaja;
    private javax.swing.JTextField etiNameCon;
    private javax.swing.JLabel etiRest;
    private javax.swing.JLabel etiTelBaja;
    private javax.swing.JLabel etiTelEmerBaja;
    private javax.swing.JLabel etimin;
    private javax.swing.JLabel etinameBaja;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField txtApeMAct;
    private javax.swing.JTextField txtApeMReg;
    private javax.swing.JTextField txtApePAct;
    private javax.swing.JTextField txtApePReg;
    private javax.swing.JTextField txtDirAct;
    private javax.swing.JTextField txtDirReg;
    private javax.swing.JTextField txtTelAct;
    private javax.swing.JTextField txtTelEmerAct;
    private javax.swing.JTextField txtTelEmerReg;
    private javax.swing.JTextField txtTelReg;
    private javax.swing.JTextField txtnameAct;
    private javax.swing.JTextField txtnameReg;
    // End of variables declaration//GEN-END:variables
}
