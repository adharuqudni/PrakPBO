/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan5;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame implements ActionListener, ItemListener {

    JLabel lluas = new JLabel(" ");
    JLabel lkeliling = new JLabel(" ");
    JLabel lluaspermukaan = new JLabel(" ");
    JLabel lvolume = new JLabel(" ");
    JLabel ltitle = new JLabel(" Kalkulator ");
    JLabel lhitung = new JLabel(" Pilih yang mau dihitung ");

    JRadioButton rbbalok = new JRadioButton(" Balok ");
    JRadioButton rbkerucut = new JRadioButton(" Kerucut ");

    final JTextField fpanjang = new JTextField(10);
    JLabel lpanjang = new JLabel(" Panjang: ");
    final JTextField flebar = new JTextField(10);
    JLabel llebar = new JLabel(" Lebar: ");
    final JTextField fjari = new JTextField(10);
    JLabel ljari = new JLabel(" Jari-Jari: ");
    final JTextField ftinggi = new JTextField(10);
    JLabel ltinggi = new JLabel(" Tinggi: ");

    JButton btnbalok = new JButton("Hitung");
    JButton btnkerucut = new JButton("Hitung");
    JButton btnreset = new JButton("Reset");

    public GUI() {
        setTitle("Mencoba Kombinasi Komponen GUI");
        setDefaultCloseOperation(3);
        setSize(550, 275);

        ButtonGroup group = new ButtonGroup();
        group.add(rbbalok);
        group.add(rbkerucut);
        rbbalok.addItemListener(this);
        rbkerucut.addItemListener(this);
        btnkerucut.addActionListener(this);
        btnbalok.addActionListener(this);
        btnreset.addActionListener(this);

        setLayout(null);
        add(ltitle);
        add(lhitung);
        add(rbbalok);
        add(rbkerucut);
        add(fpanjang);
        add(lpanjang);
        add(flebar);
        add(llebar);
        add(ftinggi);
        add(ltinggi);
        add(btnbalok);
        add(btnreset);

        ltitle.setBounds(115, 10, 120, 20);
        lhitung.setBounds(10, 35, 250, 20);
        rbbalok.setBounds(10, 55, 120, 20);
        rbkerucut.setBounds(130, 55, 100, 20);
        fpanjang.setBounds(130, 85, 120, 20);
        lpanjang.setBounds(10, 85, 150, 20);
        flebar.setBounds(130, 115, 120, 20);
        llebar.setBounds(10, 115, 150, 20);
        ftinggi.setBounds(130, 145, 120, 20);
        ltinggi.setBounds(10, 145, 150, 20);
        btnbalok.setBounds(135, 180, 100, 20);
        btnreset.setBounds(250, 180, 100, 20);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnbalok) {
            try {
                remove(lluas);
                remove(lkeliling);
                remove(lluaspermukaan);
                remove(lvolume);
                int panjang = Integer.parseInt(fpanjang.getText());
                int lebar = Integer.parseInt(flebar.getText());
                int tinggi = Integer.parseInt(ftinggi.getText());
                Balok balok = new Balok(panjang, lebar, tinggi);
                lluas = new JLabel("Luas Persegi:    " + balok.luas());
                lkeliling = new JLabel("Keliling Persegi:    " + balok.keliling());
                lluaspermukaan = new JLabel("Keliling Balok:    " + balok.luasPermukaan());
                lvolume = new JLabel("Volume Balok:    " + balok.volume());

                add(lluas);
                add(lkeliling);
                add(lluaspermukaan);
                add(lvolume);

                lluas.setBounds(300, 30, 200, 20);
                lkeliling.setBounds(300, 60, 200, 20);
                lluaspermukaan.setBounds(300, 90, 200, 20);
                lvolume.setBounds(300, 120, 200, 20);

            } catch (Exception E) {
                if ("For input string: \"\"".equals(E.getMessage())) {
                    Alert alert = new Alert("Empty field");
                } else {
                    Alert alert = new Alert(E.getMessage());
                }

            }

        }
        if (e.getSource() == btnkerucut) {
            try {
                remove(lluas);
                remove(lkeliling);
                remove(lluaspermukaan);
                remove(lvolume);
                int jari = Integer.parseInt(fjari.getText());
                int tinggi = Integer.parseInt(ftinggi.getText());
                Kerucut kerucut = new Kerucut(jari, tinggi);
                lluas = new JLabel("Luas Lingkaran\t\t:" + kerucut.luas());
                lkeliling = new JLabel("Keliling Lingkaran\t:" + kerucut.keliling());
                lluaspermukaan = new JLabel("Volume Kerucut\t\t:" + kerucut.volume());
                lvolume = new JLabel("Keliling Kerucut\t:" + kerucut.luasPermukaan());

                add(lluas);
                add(lkeliling);
                add(lluaspermukaan);
                add(lvolume);

                lluas.setBounds(300, 30, 200, 20);
                lkeliling.setBounds(300, 60, 200, 20);
                lluaspermukaan.setBounds(300, 90, 200, 20);
                lvolume.setBounds(300, 120, 200, 20);

            } catch (Exception E) {
                if ("For input string: \"\"".equals(E.getMessage())) {
                    Alert alert = new Alert("Empty field");
                } else {
                    Alert alert = new Alert(E.getMessage());
                }

            }
        }
        if (e.getSource() == btnreset) {
            fpanjang.setText("");
            flebar.setText("");
            ftinggi.setText("");
            fjari.setText("");
            lluas.setText("");
            lkeliling.setText("");
            lluaspermukaan.setText("");
            lvolume.setText("");
            
        }
    }

    public void itemStateChanged(ItemEvent event) {
        if (event.getSource() == rbbalok) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                remove(fpanjang);
                remove(lpanjang);
                remove(flebar);
                remove(llebar);
                remove(ftinggi);
                remove(ltinggi);
                remove(fjari);
                remove(ljari);
                remove(btnbalok);
                remove(btnkerucut);
                add(fpanjang);
                add(lpanjang);
                add(flebar);
                add(llebar);
                add(ftinggi);
                add(ltinggi);
                add(btnbalok);
                fpanjang.setBounds(130, 85, 120, 20);
                lpanjang.setBounds(10, 85, 150, 20);
                flebar.setBounds(130, 115, 120, 20);
                llebar.setBounds(10, 115, 150, 20);
                ftinggi.setBounds(130, 145, 120, 20);
                ltinggi.setBounds(10, 145, 150, 20);
                btnbalok.setBounds(115, 180, 100, 20);
                fpanjang.setText("");
                flebar.setText("");
            }

        }
        if (event.getSource() == rbkerucut) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                remove(fpanjang);
                remove(lpanjang);
                remove(flebar);
                remove(llebar);
                remove(ftinggi);
                remove(ltinggi);
                remove(fjari);
                remove(ljari);
                remove(btnbalok);
                remove(btnkerucut);
                add(fjari);
                add(ljari);
                add(ftinggi);
                add(ltinggi);
                add(btnkerucut);
                fjari.setBounds(130, 85, 120, 20);
                ljari.setBounds(10, 85, 150, 20);
                ftinggi.setBounds(130, 115, 120, 20);
                ltinggi.setBounds(10, 115, 150, 20);
                btnkerucut.setBounds(115, 180, 100, 20);
                fjari.setText("");
            }
        }
    }

}
