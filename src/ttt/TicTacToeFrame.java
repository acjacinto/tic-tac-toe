
package ttt;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author jacin
 */
public class TicTacToeFrame extends javax.swing.JFrame {

    private String whosTurn = "X";
    private String playerOne = "Player One";
    private String playerTwo = "Player Two";
    private int playerOneCount = 0;
    private int playerTwoCount = 0;
    private String playersTurn = "";
    
    public TicTacToeFrame() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        getPlayerNames();
        setPlayerName();
        setScore();
    }
    
    private void tieGame()
    {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
         if (one != "" && two != "" && three != "" && four != ""
                  && five != "" && six != "" && seven != ""
                  && eight != "" && nine != "")
        {
            JOptionPane.showMessageDialog(this, 
                    "Game is a tie",
                    "Tie Game",
                    JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
        
    
    }
    private void setScore()
    {
        jLabel_Score.setText(playerOne + "'s Score is :"+ String.valueOf(playerOneCount) + "\t        " + playersTurn + "\'s move       " + playerTwo
                + "\'s Score is :"+ String.valueOf(playerTwoCount));
    }
    
    private void setPlayerName()
    {
        if(whosTurn.equalsIgnoreCase("X"))
        {
            playersTurn = playerOne;
        }else
        {
            playersTurn = playerTwo;
        }
        jLabel_Score.setText(playerOne + "'s Score is :"+ String.valueOf(playerOneCount) + "\t      " + playersTurn + "'s move     " + playerTwo
                + "'s Score is :"+ String.valueOf(playerTwoCount));
    }
    
    private void getPlayerNames()
    {
        playerOne = JOptionPane.showInputDialog(this,
                "Player one name:",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        
        playerTwo = JOptionPane.showInputDialog(this,
                "Player two name:",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        if (playerOne.equals(""))
        {
            playerOne = "Player one";
        }
        if (playerTwo.equals(""))
        {
            playerTwo = "Player two";
        }
    }

    private void detwhosTurn()
    {
        if (whosTurn.equalsIgnoreCase("X"))
        {
        whosTurn = "O";
        }
        else 
        {
            whosTurn = "X";
        }
}
    
    private void xWins()
    {
        JOptionPane.showMessageDialog(this, 
                playerOne + " wins",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        playerOneCount++;
        resetGame();
    }
    
    private void oWins()
    {
        JOptionPane.showMessageDialog(this, 
                playerTwo + " wins",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        playerTwoCount++;
        resetGame();   
    }
    
    private void resetGame()
    {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        setScore();
    }
    
    private void determineIfWin()
    {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        //Winning Conditions
        if (one == "X" && two == "X" && three == "X")
        {
            xWins();
        }
        if (four == "X" && five == "X" && six == "X")
        {
            xWins();
        }
        if (seven == "X" && eight == "X" && nine == "X")
        {
            xWins();
        }
        if (one == "X" && four == "X" && seven == "X")
        {
            xWins();
        }
        if (two == "X" && five == "X" && eight == "X")
        {
            xWins();
        }
        if (three == "X" && six == "X" && nine == "X")
        {
            xWins();
        }
        if (one == "X" && five == "X" && nine == "X")
        {
            xWins();
        }
        if (three == "X" && five == "X" && seven == "X")
        {
            xWins();
        }
        
        //if O wins
        if (one == "O" && two == "O" && three == "O")
        {
            oWins();
        }
        if (four == "O" && five == "O" && six == "O")
        {
            oWins();
        }
        if (seven == "O" && eight == "O" && nine == "O")
        {
            oWins();
        }
        if (one == "O" && four == "O" && seven == "O")
        {
            oWins();
        }
        if (two == "O" && five == "O" && eight == "O")
        {
            oWins();
        }
        if (three == "O" && six == "O" && nine == "O")
        {
            oWins();
        }
        if (one == "O" && five == "O" && nine == "O")
        {
            oWins();
        }
        if (three == "O" && five == "O" && seven == "O")
        {
            oWins();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Score = new javax.swing.JLabel();
        jPanel2_GridHolder = new javax.swing.JPanel();
        jPanel_1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel_3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel_4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel_5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel_6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel_7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel_8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel_9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel_Score.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Score.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Score.setText("Place Holder for Scores");
        jPanel1.add(jLabel_Score, java.awt.BorderLayout.PAGE_END);

        jPanel2_GridHolder.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2_GridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel_1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel_1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_1);

        jPanel_2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_2);

        jPanel_3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_3);

        jPanel_4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_4);

        jPanel_5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_5);

        jPanel_6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_6);

        jPanel_7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_7);

        jPanel_8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_8);

        jPanel_9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2_GridHolder.add(jPanel_9);

        jPanel1.add(jPanel2_GridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton1.setForeground(Color.red);
        }
        else 
        {
        jButton1.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton2.setForeground(Color.red);
        }
        else 
        {
        jButton2.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jButton3.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton3.setForeground(Color.red);
        }
        else 
        {
        jButton3.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton4.setForeground(Color.red);
        }
        else 
        {
        jButton4.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton5.setForeground(Color.red);
        }
        else 
        {
        jButton5.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton6.setForeground(Color.red);
        }
        else 
        {
        jButton6.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton7.setForeground(Color.red);
        }
        else 
        {
        jButton7.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton8.setForeground(Color.red);
        }
        else 
        {
        jButton8.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X"))
        {
        jButton9.setForeground(Color.red);
        }
        else 
        {
        jButton9.setForeground(Color.blue);
        }
        detwhosTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel_Score;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2_GridHolder;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_6;
    private javax.swing.JPanel jPanel_7;
    private javax.swing.JPanel jPanel_8;
    private javax.swing.JPanel jPanel_9;
    // End of variables declaration//GEN-END:variables
}
