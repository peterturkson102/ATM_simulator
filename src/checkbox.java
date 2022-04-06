
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class checkbox implements ItemListener{
    //Labels
    JLabel jlselected;
    JLabel jlchanged;

    //Checkboxes
    JCheckBox jcbaccra;
    JCheckBox jcbkumasi;
    JCheckBox jcbtamale;


    public checkbox() {
        JFrame jfrmwindow = new JFrame();
        jfrmwindow.setLayout(new FlowLayout());
        jfrmwindow.setSize(1024,768);
        jfrmwindow.setDefaultCloseOperation(jfrmwindow.EXIT_ON_CLOSE);

        //Creating objects of the references to the labels
        jlselected=new JLabel("");
        jlchanged=new JLabel("");

        //Creating object of the references to the checkboxes
        jcbaccra=new JCheckBox("Accra");
        jcbkumasi=new JCheckBox("Kumasi");
        jcbtamale=new JCheckBox("Tamale");

        //Adding listeners to the checkboxes
        jcbaccra.addItemListener(this);
        jcbkumasi.addItemListener(this);
        jcbtamale.addItemListener(this);

        // Adding checkboxes to frame
        jfrmwindow.add(jcbaccra);
        jfrmwindow.add(jcbkumasi);
        jfrmwindow.add(jcbtamale);
        //Adding Labels to frame
        jfrmwindow.add(jlselected);
        jfrmwindow.add(jlchanged,BorderLayout.SOUTH);
        jfrmwindow.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        jcbaccra=(JCheckBox)e.getItem();
        jcbkumasi=(JCheckBox)e.getItem();
        jcbtamale=(JCheckBox)e.getItem();

        String str=" ";


        if(jcbaccra.isSelected()){
            jlselected.setText("\n"+jcbaccra.getText()+" Was checked");
            str+="Accra";
        }else
        {
            jlselected.setText("\n"+jcbaccra.getText()+" Was unchecked");
            str+="Accra";
        }

        if(jcbkumasi.isSelected()){
            jlselected.setText("\n"+jcbkumasi.getText()+" Was checked");
            str+=" ,Kumasi";
        }else{
            jlselected.setText("\n"+jcbkumasi.getText()+" Was unchecked");
            str+=" ,Kumasi";
        }

        if(jcbtamale.isSelected()){
            jlselected.setText("\n"+jcbtamale.getText()+" Was checked");
            str+=" ,Tamale";
        }else
        {
            jlchanged.setText("\n"+jcbtamale.getText()+" Was unchecked");
            str+=" ,Tamale";
        }
    }
}