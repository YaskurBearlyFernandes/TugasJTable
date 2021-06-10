package SortingJTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sorting {
    private JTextField textJumlahAngka;
    private JTextField textMasukkanAngka;
    private JButton Buttonurutkan;
    private JTable tablehasil;
    private JPanel rootPanel;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getrootPanel1() {
        return rootPanel;
    }
    public Sorting() {
        this.initComponents();
        Buttonurutkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel)
                        tablehasil.getModel();
                String jumlah2 = textMasukkanAngka.getText();
                int jumlah = Integer.parseInt(textJumlahAngka.getText());
                String angka = textMasukkanAngka.getText();

                if (textJumlahAngka.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "jumlah angka tidak diketahui",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (angka.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Angka belum diinput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                } else {
                    model.addRow(new Object[]{jumlah2, angka});
                    //clear textfield
                    textJumlahAngka.setText("");
                    textMasukkanAngka.setText("");
                }
                int a = 0;
                for (int i : Sorting1.getascen(angka, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Sorting1.getdescen(angka, jumlah)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }


    private void initComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tablehasil.setModel(tableModel);
        //menampilkan sorting di setiap kolom
        tablehasil.setAutoCreateRowSorter(true);
        //hidupkan single selection
        tablehasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
