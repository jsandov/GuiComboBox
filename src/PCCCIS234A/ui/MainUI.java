package PCCCIS234A.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JComboBox genreCombo;
    private JComboBox typeCombo;
    private JTextField minVotesField;
    private JButton episodeButton;
    private JButton imdbButton;

    public MainUI() {
        createTable();
        createGenreCombo();
        creatTypeCombo();
    }



    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createTable() {
        Object[][] data = {
                {"The Dark Knight", 2008, 9.0, 1886938},
                {"Stars Wars: Episode V - The Empire Strikes Back", 1980, 8.8, 962165},
                {"Inception", 2010, 8.8, 1675116}};
        showTable.setModel(new DefaultTableModel(
                data,
                new String[]{"Title", "Year", "Rating", "Num Votes"}
        ));
        TableColumnModel columns = showTable.getColumnModel();
        columns.getColumn(0).setMinWidth(250);

        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(JLabel.CENTER);
        columns.getColumn(1).setCellRenderer(centerRender);
        columns.getColumn(2).setCellRenderer(centerRender);
        columns.getColumn(3).setCellRenderer(centerRender);

    }
    private void creatTypeCombo() {
        typeCombo.setModel(new DefaultComboBoxModel(new String[]{"Movie", "tvSeries", "tvEpisode", "short"}));

    }

    private void createGenreCombo() {
        genreCombo.setModel(new DefaultComboBoxModel(new String[]{"Action", "Fantasy", "Drama", "Romance", "Sci-Fi"}));
    }




}
