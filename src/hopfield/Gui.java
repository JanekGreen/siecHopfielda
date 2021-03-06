/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopfield;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author pawel
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
        setTitle("Sieć neuronowa Hopfielda");
        siec= new Siec(SZEROKOSC*WYSOKOSC*BITY_W_PIKSELU,uczenieProgress);
        dane= new Byte[SZEROKOSC*WYSOKOSC*BITY_W_PIKSELU];
        uczenieProgress.setMaximum(siec.neurony.length-1);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * j: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        scrollPane1 = new java.awt.ScrollPane();
        wzorzecImg = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        wczytajWzorzecButton = new javax.swing.JButton();
        NauczWzorzecButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        uczenieProgress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nauczoneWzorceTA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        scrollPane2 = new java.awt.ScrollPane();
        sprawdzajacyImg = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        wczytajSprawdzajacyButton = new javax.swing.JButton();
        wyczyscObrazSprawdzajacy = new javax.swing.JButton();
        scrollPane3 = new java.awt.ScrollPane();
        rozpoznanyImg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        zapiszWynikDoPliku = new javax.swing.JButton();
        wyczyscWynikButton = new javax.swing.JButton();
        rozpoznajButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iloscIteracji = new javax.swing.JLabel();
        iloscZmian = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        wzorzecImg.setBackground(new java.awt.Color(250, 250, 255));
        wzorzecImg.setMinimumSize(new java.awt.Dimension(100, 100));
        scrollPane1.add(wzorzecImg);

        label1.setText("Uczenie");

        wczytajWzorzecButton.setText("Wczytaj nowy wzorzec");
        wczytajWzorzecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wczytajWzorzecButtonActionPerformed(evt);
            }
        });

        NauczWzorzecButton.setText("Naucz sieć wzorca");
        NauczWzorzecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NauczWzorzecButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Usuń wzorce");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Postęp uczenia:");

        nauczoneWzorceTA.setEditable(false);
        nauczoneWzorceTA.setColumns(20);
        nauczoneWzorceTA.setRows(5);
        jScrollPane1.setViewportView(nauczoneWzorceTA);

        jLabel2.setText("Wzorce nauczone:");

        sprawdzajacyImg.setMaximumSize(new java.awt.Dimension(100, 100));
        sprawdzajacyImg.setMinimumSize(new java.awt.Dimension(100, 100));
        scrollPane2.add(sprawdzajacyImg);

        label2.setText("Odtwarzanie");

        label3.setText("Obraz do rozpoznania:");

        wczytajSprawdzajacyButton.setText("Wczytaj ");
        wczytajSprawdzajacyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wczytajSprawdzajacyButtonActionPerformed(evt);
            }
        });

        wyczyscObrazSprawdzajacy.setText("Wyczysc");
        wyczyscObrazSprawdzajacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyczyscObrazSprawdzajacyActionPerformed(evt);
            }
        });

        rozpoznanyImg.setMaximumSize(new java.awt.Dimension(100, 100));
        rozpoznanyImg.setMinimumSize(new java.awt.Dimension(100, 100));
        scrollPane3.add(rozpoznanyImg);

        jLabel3.setText("Obraz szczęśliwie rozpoznany:");

        zapiszWynikDoPliku.setText("Zapisz do pliku");
        zapiszWynikDoPliku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zapiszWynikDoPlikuActionPerformed(evt);
            }
        });

        wyczyscWynikButton.setText("Wyczyść");
        wyczyscWynikButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyczyscWynikButtonActionPerformed(evt);
            }
        });

        rozpoznajButton.setText("Rozpoznaj");
        rozpoznajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rozpoznajButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Krok");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ilość iteracji:");

        jLabel5.setText("Liczba zmian:");

        iloscIteracji.setText("0");

        iloscZmian.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(uczenieProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NauczWzorzecButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wczytajWzorzecButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(zapiszWynikDoPliku, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wyczyscWynikButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iloscZmian))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(wczytajSprawdzajacyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wyczyscObrazSprawdzajacy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rozpoznajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iloscIteracji)))
                        .addGap(0, 454, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wczytajWzorzecButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NauczWzorzecButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(uczenieProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(scrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zapiszWynikDoPliku)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wyczyscWynikButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(wczytajSprawdzajacyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wyczyscObrazSprawdzajacy)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rozpoznajButton)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(iloscIteracji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(iloscZmian))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wczytajWzorzecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wczytajWzorzecButtonActionPerformed
        
        
         JFileChooser wyborObrazu = new JFileChooser();
         int wartoscZwrocona= wyborObrazu.showOpenDialog(this);
        
         if(wartoscZwrocona == JFileChooser.APPROVE_OPTION)
         {
             try {
                 
                 
                 plikObrazu = wyborObrazu.getSelectedFile();
                 obrazWzorcowy = ImageIO.read(plikObrazu);
                 wzorzecImg.setIcon(new ImageIcon(obrazWzorcowy));
                 
                 
                 
             } catch (IOException ex) {
                 Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         
         }
         
        
    }//GEN-LAST:event_wczytajWzorzecButtonActionPerformed

    private void NauczWzorzecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NauczWzorzecButtonActionPerformed
       
        if(obrazWzorcowy != null)
        {
            try {
                
                dane= PomocniczeFunkcje.zmienObrazNaDane(obrazWzorcowy);
                

            } catch (IOException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
            siec.dodajWzorzec(dane);              
            Thread watek = new Thread(siec.new Uczenie());
            watek.start();
            nauczoneWzorceTA.append(plikObrazu.getName()+"\n");
            System.out.println("Koniec nauki");
            
           
            
        } else
        {
        
         JOptionPane.showMessageDialog(this, "Nie wybrano obrazu uczącego","Błąd!",JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }//GEN-LAST:event_NauczWzorzecButtonActionPerformed

    private void wczytajSprawdzajacyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wczytajSprawdzajacyButtonActionPerformed
      
         JFileChooser wyborObrazu = new JFileChooser();
         int wartoscZwrocona= wyborObrazu.showOpenDialog(this);
        
         if(wartoscZwrocona == JFileChooser.APPROVE_OPTION)
         {
             try {
                 
                 
                 plikObrazu = wyborObrazu.getSelectedFile();
                 obrazSprawdzajacy = ImageIO.read(plikObrazu);
                 sprawdzajacyImg.setIcon(new ImageIcon(obrazSprawdzajacy));
                 siec.koniecPracyKrokowej();
                 
                 
             } catch (IOException ex) {
                 Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         
         }
        
    }//GEN-LAST:event_wczytajSprawdzajacyButtonActionPerformed

    private void rozpoznajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rozpoznajButtonActionPerformed
        
        try {
            
            try {
                
                dane =PomocniczeFunkcje.zmienObrazNaDane(obrazSprawdzajacy);
                
            } catch (IOException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
            PomocniczeFunkcje.wpiszDaneDoSieci(dane, siec);
            //siec.odtworzWzorzec();
            Thread watek = new Thread(siec.new Odtwarzanie());
            watek.start();
            watek.join();
            
            dane=PomocniczeFunkcje.pobierzDaneZWyjscSieci(siec, SZEROKOSC, WYSOKOSC);
            try {
                obrazSprawdzajacy=PomocniczeFunkcje.zmienDaneNaObraz(dane, SZEROKOSC, WYSOKOSC);
                
            } catch (IOException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
            rozpoznanyImg.setIcon(new ImageIcon(obrazSprawdzajacy));
            iloscIteracji.setText(Integer.toString(siec.iloscIteracji));
            iloscZmian.setText(Integer.toString(siec.IloscZmianWIteracji));
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_rozpoznajButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        siec.zapomnijWzorce();
        nauczoneWzorceTA.setText(null);
        wzorzecImg.setIcon(null);
        uczenieProgress.setValue(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void wyczyscWynikButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyczyscWynikButtonActionPerformed
        rozpoznanyImg.setIcon(null);
    }//GEN-LAST:event_wyczyscWynikButtonActionPerformed

    private void wyczyscObrazSprawdzajacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyczyscObrazSprawdzajacyActionPerformed
        sprawdzajacyImg.setIcon(null);
        siec.koniecPracyKrokowej();
    }//GEN-LAST:event_wyczyscObrazSprawdzajacyActionPerformed

    private void zapiszWynikDoPlikuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapiszWynikDoPlikuActionPerformed
       
        if(rozpoznanyImg.getIcon()==null)
        {
         JOptionPane.showMessageDialog(this, "Nie ma obrazu, który możnaby zapisać","Błąd!",JOptionPane.INFORMATION_MESSAGE);
            return;
        
        } 
        try {
            
            dane=PomocniczeFunkcje.pobierzDaneZWyjscSieci(siec, SZEROKOSC, WYSOKOSC);
            BufferedImage bi =PomocniczeFunkcje.zmienDaneNaObraz(dane, SZEROKOSC, WYSOKOSC);
          if(ImageIO.write(bi, "BMP", new File("wynik.bmp")))
          {
              JOptionPane.showMessageDialog(this, "Pomyślnie zapisano obraz w katalogu aplikacji","Informacja!",JOptionPane.INFORMATION_MESSAGE);
              
          } else
          {
              JOptionPane.showMessageDialog(this, "Nie udało się zapisać obrazu wynikowego","Błąd!",JOptionPane.INFORMATION_MESSAGE);
          
          }
            
        
        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_zapiszWynikDoPlikuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        try {
               
            dane =PomocniczeFunkcje.zmienObrazNaDane(obrazSprawdzajacy);
            if(!siec.czyTrwaPracaKrokowa()){
                PomocniczeFunkcje.wpiszDaneDoSieci(dane, siec);
                 siec.pracaKrokowaRozpoczeta();
            }
            siec.wykonajPrzebieg();
            dane=PomocniczeFunkcje.pobierzDaneZWyjscSieci(siec, SZEROKOSC, WYSOKOSC);
            obrazSprawdzajacy=PomocniczeFunkcje.zmienDaneNaObraz(dane, SZEROKOSC, WYSOKOSC);
            rozpoznanyImg.setIcon(new ImageIcon(obrazSprawdzajacy));
            iloscIteracji.setText(Integer.toString(siec.iloscIteracji));
            iloscZmian.setText(Integer.toString(siec.IloscZmianWIteracji));
            
             if(siec.IloscZmianWIteracji==0)
                {
                    JOptionPane.showMessageDialog(this, "Sieć nie jest w stanie lepiej rozpoznać obrazu ","Informacja!",JOptionPane.INFORMATION_MESSAGE);
                    
                }
            
            
        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>
        //</editor-fold>
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }java.awt.EventQueue.invokeLater(() -> {
            new Gui().setVisible(true);
        });
    }

    public static int SZEROKOSC = 45;
    public static int WYSOKOSC  = 40;
    public static int BITY_W_PIKSELU = 8;
    
    private Byte[] dane;
    private BufferedImage obrazWzorcowy=null;
    private BufferedImage obrazSprawdzajacy=null;
    private File plikObrazu=null;
    private Siec siec;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NauczWzorzecButton;
    private javax.swing.JLabel iloscIteracji;
    private javax.swing.JLabel iloscZmian;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTextArea nauczoneWzorceTA;
    private javax.swing.JButton rozpoznajButton;
    private javax.swing.JLabel rozpoznanyImg;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.ScrollPane scrollPane2;
    private java.awt.ScrollPane scrollPane3;
    private javax.swing.JLabel sprawdzajacyImg;
    private javax.swing.JProgressBar uczenieProgress;
    private javax.swing.JButton wczytajSprawdzajacyButton;
    private javax.swing.JButton wczytajWzorzecButton;
    private javax.swing.JButton wyczyscObrazSprawdzajacy;
    private javax.swing.JButton wyczyscWynikButton;
    private javax.swing.JLabel wzorzecImg;
    private javax.swing.JButton zapiszWynikDoPliku;
    // End of variables declaration//GEN-END:variables
}
