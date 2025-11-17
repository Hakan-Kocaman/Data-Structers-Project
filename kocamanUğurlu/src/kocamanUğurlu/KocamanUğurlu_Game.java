package kocamanUğurlu;


import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hakan
 */
public class KocamanUğurlu_Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    Cell selectedCell;
    KocamanUğurlu_CellList<Integer> cellList= new KocamanUğurlu_CellList<>();
    int score;
    int level;
    boolean finished;
    
    public KocamanUğurlu_Game(String username, int level) {
        initComponents();
        this.username.setText(username);
        this.levellbl.setText("Level " + level);
        this.level = level;
        boolean finished=false;
        
        if (level==1) {
            jLabel2.setVisible(false);
        }

        cellList.fillrandom();
        int bigprize= (int) (Math.random()*30+1);
        cellList.get(bigprize).action=3;
        Cell temp = cellList.head;
        for (int i = 0; i < cellList.size; i++) {
            switch (i) {
                case 0 -> {
                    temp.btn = stbtn;
                    temp.lbl = stlbl;
                }
                case 1 -> {
                    temp.btn = btn1;
                    temp.lbl = lbl1;
                }
                case 2 -> {
                    temp.btn = btn2;
                    temp.lbl = lbl2;
                }
                case 3 -> {
                    temp.btn = btn3;
                    temp.lbl = lbl3;
                }
                case 4 -> {
                    temp.btn = btn4;
                    temp.lbl = lbl4;
                }
                case 5 -> {
                    temp.btn = btn5;
                    temp.lbl = lbl5;
                }
                case 6 -> {
                    temp.btn = btn6;
                    temp.lbl = lbl6;
                }
                case 7 -> {
                    temp.btn = btn7;
                    temp.lbl = lbl7;
                }
                case 8 -> {
                    temp.btn = btn8;
                    temp.lbl = lbl8;
                }
                case 9 -> {
                    temp.btn = btn9;
                    temp.lbl = lbl9;
                }
                case 10 -> {
                    temp.btn = btn10;
                    temp.lbl = lbl10;
                }
                case 11 -> {
                    temp.btn = btn11;
                    temp.lbl = lbl11;
                }
                case 12 -> {
                    temp.btn = btn12;
                    temp.lbl = lbl12;
                }
                case 13 -> {
                    temp.btn = btn13;
                    temp.lbl = lbl13;
                }
                case 14 -> {
                    temp.btn = btn14;
                    temp.lbl = lbl14;
                }
                case 15 -> {
                    temp.btn = btn15;
                    temp.lbl = lbl15;
                }
                case 16 -> {
                    temp.btn = btn16;
                    temp.lbl = lbl16;
                }
                case 17 -> {
                    temp.btn = btn17;
                    temp.lbl = lbl17;
                }
                case 18 -> {
                    temp.btn = btn18;
                    temp.lbl = lbl18;
                }
                case 19 -> {
                    temp.btn = btn19;
                    temp.lbl = lbl19;
                }
                case 20 -> {
                    temp.btn = btn20;
                    temp.lbl = lbl20;
                }
                case 21 -> {
                    temp.btn = btn21;
                    temp.lbl = lbl21;
                }
                case 22 -> {
                    temp.btn = btn22;
                    temp.lbl = lbl22;
                }
                case 23 -> {
                    temp.btn = btn23;
                    temp.lbl = lbl23;
                }
                case 24 -> {
                    temp.btn = btn24;
                    temp.lbl = lbl24;
                }
                case 25 -> {
                    temp.btn = btn25;
                    temp.lbl = lbl25;
                }
                case 26 -> {
                    temp.btn = btn26;
                    temp.lbl = lbl26;
                }
                case 27 -> {
                    temp.btn = btn27;
                    temp.lbl = lbl27;
                }
                case 28 -> {
                    temp.btn = btn28;
                    temp.lbl = lbl28;
                }
                case 29 -> {
                    temp.btn = btn29;
                    temp.lbl = lbl29;
                }
                case 30 -> {
                    temp.btn = btn30;
                    temp.lbl = lbl30;
                }
                case 31 -> {
                    temp.btn = fnbtn;
                    temp.lbl = fnlbl;
                }

                default ->
                    throw new AssertionError();
            }
            if (i < 31) {
                temp = temp.next;

            }
        }
        for (int i = 1; i < cellList.size; i++) {
            
            cellList.get(i).btn.setEnabled(false);
            cellList.get(i).lbl.setText("");
        }

        
        cellList.addMovers();

        stbtn.setEnabled(true);
        stlbl.setText("     ▲ ");
        selectedCell = cellList.get(0);
        
        scorelbl.setText("Score: " + score);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        levellbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultlbl = new javax.swing.JTextArea();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        stbtn = new javax.swing.JButton();
        fnbtn = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl29 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        fnlbl = new javax.swing.JLabel();
        stlbl = new javax.swing.JLabel();
        scorelbl = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        roll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username.setText("username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 198, -1));

        levellbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        levellbl.setText("level 1");
        getContentPane().add(levellbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 76, -1));

        resultlbl.setColumns(20);
        resultlbl.setRows(5);
        jScrollPane1.setViewportView(resultlbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 189, 300));

        btn1.setText("1");
        btn1.setEnabled(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 47, -1));

        btn2.setText("2");
        btn2.setEnabled(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 47, -1));

        btn3.setText("3");
        btn3.setEnabled(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 47, -1));

        btn4.setText("4");
        btn4.setEnabled(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 47, -1));

        btn5.setText("5");
        btn5.setEnabled(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 47, -1));

        btn6.setText("6");
        btn6.setEnabled(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 47, -1));

        btn7.setText("7");
        btn7.setEnabled(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 47, -1));

        btn8.setText("8");
        btn8.setEnabled(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 47, -1));

        btn9.setText("9");
        btn9.setEnabled(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 47, -1));

        btn10.setText("10");
        btn10.setEnabled(false);
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 47, -1));

        btn11.setText("11");
        btn11.setEnabled(false);
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 47, -1));

        btn12.setText("12");
        btn12.setEnabled(false);
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 47, -1));

        btn13.setText("13");
        btn13.setEnabled(false);
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 47, -1));

        btn14.setText("14");
        btn14.setEnabled(false);
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 47, -1));

        btn15.setText("15");
        btn15.setEnabled(false);
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 47, -1));

        btn16.setText("16");
        btn16.setEnabled(false);
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 47, -1));

        btn17.setText("17");
        btn17.setEnabled(false);
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        getContentPane().add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 47, -1));

        btn18.setText("18");
        btn18.setEnabled(false);
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });
        getContentPane().add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 47, -1));

        btn19.setText("19");
        btn19.setEnabled(false);
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });
        getContentPane().add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 47, -1));

        btn20.setText("20");
        btn20.setEnabled(false);
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        getContentPane().add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 47, -1));

        btn21.setText("21");
        btn21.setEnabled(false);
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        getContentPane().add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 47, -1));

        btn22.setText("22");
        btn22.setEnabled(false);
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        getContentPane().add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 47, -1));

        btn23.setText("23");
        btn23.setEnabled(false);
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        getContentPane().add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 47, -1));

        btn24.setText("24");
        btn24.setEnabled(false);
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });
        getContentPane().add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 47, -1));

        btn25.setText("25");
        btn25.setEnabled(false);
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });
        getContentPane().add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 47, -1));

        btn26.setText("26");
        btn26.setEnabled(false);
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });
        getContentPane().add(btn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 47, -1));

        btn27.setText("27");
        btn27.setEnabled(false);
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });
        getContentPane().add(btn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 47, -1));

        btn28.setText("28");
        btn28.setEnabled(false);
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });
        getContentPane().add(btn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 47, -1));

        btn29.setText("29");
        btn29.setEnabled(false);
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });
        getContentPane().add(btn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 47, -1));

        btn30.setText("30");
        btn30.setEnabled(false);
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });
        getContentPane().add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 47, -1));

        stbtn.setText("ST");
        stbtn.setEnabled(false);
        stbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stbtnActionPerformed(evt);
            }
        });
        getContentPane().add(stbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 47, -1));

        fnbtn.setText("FN");
        fnbtn.setEnabled(false);
        fnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(fnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 47, -1));

        lbl1.setText("lbl1");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 37, -1));

        lbl2.setText("lbl1");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 37, -1));

        lbl3.setText("lbl1");
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 37, -1));

        lbl4.setText("lbl1");
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 37, -1));

        lbl5.setText("lbl1");
        getContentPane().add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 37, -1));

        lbl6.setText("lbl1");
        getContentPane().add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 37, -1));

        lbl7.setText("lbl1");
        getContentPane().add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 37, -1));

        lbl8.setText("lbl1");
        getContentPane().add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 37, -1));

        lbl9.setText("lbl1");
        getContentPane().add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 37, -1));

        lbl10.setText("lbl1");
        getContentPane().add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 37, -1));

        lbl11.setText("lbl1");
        getContentPane().add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 37, -1));

        lbl12.setText("lbl1");
        getContentPane().add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 37, -1));

        lbl13.setText("lbl1");
        getContentPane().add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 37, -1));

        lbl14.setText("lbl1");
        getContentPane().add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 37, -1));

        lbl15.setText("lbl1");
        getContentPane().add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 37, -1));

        lbl16.setText("lbl1");
        getContentPane().add(lbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 37, -1));

        lbl17.setText("lbl1");
        getContentPane().add(lbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 37, -1));

        lbl18.setText("lbl1");
        getContentPane().add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 37, -1));

        lbl19.setText("lbl1");
        getContentPane().add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 37, -1));

        lbl20.setText("lbl1");
        getContentPane().add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 37, -1));

        lbl21.setText("lbl1");
        getContentPane().add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 37, -1));

        lbl22.setText("lbl1");
        getContentPane().add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 37, -1));

        lbl23.setText("lbl1");
        getContentPane().add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 37, -1));

        lbl24.setText("lbl1");
        getContentPane().add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 37, -1));

        lbl25.setText("lbl1");
        getContentPane().add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 37, -1));

        lbl26.setText("lbl1");
        getContentPane().add(lbl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 37, -1));

        lbl27.setText("lbl1");
        getContentPane().add(lbl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 37, -1));

        lbl28.setText("lbl1");
        getContentPane().add(lbl28, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 37, -1));

        lbl29.setText("lbl1");
        getContentPane().add(lbl29, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 37, -1));

        lbl30.setText("lbl1");
        getContentPane().add(lbl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 37, -1));

        fnlbl.setText("fnlbl");
        getContentPane().add(fnlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 37, -1));

        stlbl.setText("lbl1");
        getContentPane().add(stlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 37, -1));

        scorelbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        scorelbl.setText("Score:");
        getContentPane().add(scorelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 138, -1));

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        restart.setText("Restart");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });
        getContentPane().add(restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        roll.setText("Roll");
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kocamanUğurlu/KocamanUğurlu_background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnbtnActionPerformed

    private void stbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stbtnActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn25ActionPerformed

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        int diceroll = (int) (Math.random() * 6 + 1);

        resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "Rolled: " + diceroll);

        selectedCell.btn.setEnabled(false);
        selectedCell.lbl.setText("");

        for (int i = 0; i < diceroll; i++) {
            if (selectedCell==cellList.tail) {
                finished=true;
                act();
                cellList.tail.action=0;
                break;

            }
            selectedCell=selectedCell.next;

        }

        if (finished) {

            if (level == 1) {
                //LEVEL 1 END

                int choice = JOptionPane.showOptionDialog(
                    null,
                    "Wanna reach into Level 2?",
                    "Choice",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"Stop", "Continue"},
                    "Continue"
                );
                if (choice == 0) {
                    JOptionPane.showMessageDialog(rootPane, "* Username: " + username.getText() + "\n* Level: " + level + "\n* Score: " + score);
                    writeScores();
                    BackbtnActionPerformed(evt);
                } else if (choice == 1) {
                    writeScores();
                    KocamanUğurlu_Game newgame = new KocamanUğurlu_Game(username.getText(), 2);
                    this.dispose();
                    newgame.setVisible(true);
                }

            } else {
                //LEVEL 2 END
                JOptionPane.showMessageDialog(rootPane, "* Username: " + username.getText() + "\n* Level: " + level + "\n* Score: " + score);
                writeScores();
                BackbtnActionPerformed(evt);

            }
            return;
        }

        act();

        if (level==2) {

            if (selectedCell.altCell!=null) {
                int selectedcell_number=0;
                int altcell_number=0;
                Cell temp= selectedCell;
                Cell alttemp= selectedCell.altCell;
                while (temp.prev!=null) {
                    selectedcell_number++;
                    temp=temp.prev;
                }
                while (alttemp.prev!=null) {
                    altcell_number++;
                    alttemp=alttemp.prev;
                }
                if (selectedcell_number<altcell_number) {
                    resultlbl.setText(resultlbl.getText() + "\n--------------\n "+selectedcell_number+"->"+altcell_number+"\nMoved "+(altcell_number-selectedcell_number+" cells forward"));
                }else
                resultlbl.setText(resultlbl.getText() + "\n--------------\n "+altcell_number+"<-"+selectedcell_number+"\nMoved "+(selectedcell_number-altcell_number)+" cells backward");

                selectedCell=selectedCell.altCell;
                act();

            }
        }

        selectedCell.btn.setEnabled(true);
        selectedCell.lbl.setText("     ▲ ");
    }//GEN-LAST:event_rollActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        KocamanUğurlu_Game newgame = new KocamanUğurlu_Game(username.getText(), 1);
        this.dispose();
        newgame.setVisible(true);
    }//GEN-LAST:event_restartActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        KocamanUğurlu_mainMenu newmainmenu = new KocamanUğurlu_mainMenu();
        this.dispose();
        newmainmenu.setVisible(true);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed
private void act() {
        switch ((int)selectedCell.action) {
            case 0 -> {
                resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "<Nothing happened>");
            }
            case 1 -> {
                score += 10;
                resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "Score increased ( +10 )");
                scorelbl.setText("Score: " + score);
            }
            case 2 -> {
                score -= 5;
                resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "Score decreased ( -5 )");
                scorelbl.setText("Score: " + score);
            }
            case 3 -> {
                score += 50;
                 scorelbl.setText("Score: " + score);
                resultlbl.setText(resultlbl.getText() + "\n--------------\n" + "You found the Grand Prize!\nScore increased ( +50 )");
                JOptionPane.showMessageDialog(rootPane, "* You found the Grand Prize!\n* Score increased ( +50 )");
            }

            default ->
                throw new AssertionError();
        }

    }

    private void writeScores() {
        try {
            FileWriter writer = new FileWriter("src/kocamanUğurlu/KocamanUğurlu_score.txt", true);

            writer.write(username.getText() + ", level" + level + ", " + score + "\n");
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton fnbtn;
    private javax.swing.JLabel fnlbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel levellbl;
    private javax.swing.JButton restart;
    private javax.swing.JTextArea resultlbl;
    private javax.swing.JButton roll;
    private javax.swing.JLabel scorelbl;
    private javax.swing.JButton stbtn;
    private javax.swing.JLabel stlbl;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
