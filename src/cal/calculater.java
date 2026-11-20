
package cal;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



class calculaterlisner extends WindowAdapter{
    
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}



public class calculater implements ActionListener{

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,li,dk;
    TextField tf;
    String fv,sv,op;
    double fdv,sdv;
    double resalt;
    
    calculater(){
        Frame f1 = new Frame();
        f1.setBackground(Color.WHITE);
        f1.addWindowListener(new calculaterlisner());
        f1.setBounds(500, 250, 300, 330);
        f1.setTitle("My cal");
    
        f1.setVisible(true);
    
        MenuBar mbar = new MenuBar();
        MenuItem ma1 = new MenuItem("Close");
        MenuItem ma2 = new MenuItem("Standard");
        MenuItem ma3 = new MenuItem("Scientific");
        MenuItem ma4 = new MenuItem("Copy");
        MenuItem ma5 = new MenuItem("Paste");
        MenuItem ma6 = new MenuItem("Cut");
        MenuItem ma7 = new MenuItem("Delete");
        MenuItem ma8 = new MenuItem("Select All");
        MenuItem ma9 = new MenuItem("Ask for Online");
        
        
        Menu m1 = new Menu("File");
        m1.add(ma1);
        
        Menu m2 = new Menu("View");
        m2.add(ma2);
        m2.add(ma3);
        
        
        Menu m3 = new Menu("Edit");
        m3.add(ma4);
        m3.add(ma5);
        m3.add(ma6);
        m3.add(ma7);
        m3.add(ma8);
        
        Menu m4 = new Menu("Help");
        m4.add(ma9);
    
        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        mbar.add(m4);
        f1.setMenuBar(mbar);
        
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(5,5,3,3);
        
        Button pbc = new Button("");
        pbc.setBounds(500, 250, 100, 20);
        
        pbc.addActionListener(new ActionListener() {    
    public void actionPerformed (ActionEvent e) {    
            p2.setBackground(Color.BLACK);    
        }    
    });
        Button pbc2 = new Button("");
        pbc2.setBounds(500, 250, 100, 20);
        
        pbc2.addActionListener(new ActionListener() {    
    public void actionPerformed (ActionEvent e) {    
            p2.setBackground(Color.WHITE);    
        }    
    });

        
        
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        
        b11 = new Button("=");
        b12 = new Button("+");
        b13 = new Button("-");
        b14 = new Button("/");
        b15 = new Button("DEL");
        b16 = new Button("*");
        b17 = new Button(".");
        b18 = new Button("%");
        b19 = new Button("AC");
        b20 = new Button("√");
        
        li = new Button();
        dk = new Button();
        
        Font fon1 = new Font("Calibri",Font.BOLD,25);
        Font fon2 = new Font("Calibri",Font.BOLD,20);
        
        b0.setFont(fon1);
        b1.setFont(fon1);
        b2.setFont(fon1);
        b3.setFont(fon1);
        b4.setFont(fon1);
        b5.setFont(fon1);
        b6.setFont(fon1);
        b7.setFont(fon1);
        b8.setFont(fon1);
        b9.setFont(fon1);
        
        b11.setFont(fon2);
        b12.setFont(fon2);
        b13.setFont(fon2);
        b14.setFont(fon2);
        b15.setFont(fon2);
        b16.setFont(fon2);
        b17.setFont(fon2);
        b18.setFont(fon2);
        b19.setFont(fon2);
        b20.setFont(fon2);
       
        Color col = new Color(102, 153, 225);
        Color col2 = new Color(225, 153, 0);
        Color col3 = new Color(51, 102, 225);
        Color col4 = new Color(153, 153, 153);
        Color col5 = new Color(204, 204, 255);
        Color col6 = new Color(225, 225, 255);
        Color col7 = new Color(0, 0, 0);
               
        b0.setBackground(col);
        b1.setBackground(col);
        b2.setBackground(col);
        b3.setBackground(col);
        b4.setBackground(col);
        b5.setBackground(col);
        b6.setBackground(col);
        b7.setBackground(col);
        b8.setBackground(col);
        b9.setBackground(col);
        b15.setBackground(col2);
        b11.setBackground(col3);
        b12.setBackground(col4);
        b13.setBackground(col4);
        b14.setBackground(col4);
        b16.setBackground(col4);
        b17.setBackground(col);
        b18.setBackground(col5);
        b19.setBackground(col2);
        b20.setBackground(col5);
        pbc.setBackground(col7);
        pbc2.setBackground(col6);
        
        li.setBackground(col6);
        dk.setBackground(col7);
        
        tf = new TextField(25);
        
        p2.add(b20);
        p2.add(b18);
        p2.add(b15);
        p2.add(b19);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b16);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b14);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b13);
        p2.add(b17);
        p2.add(b0);
        p2.add(b11);
        p2.add(b12);
        
        p1.add(li);
        p1.add(pbc2);
        
        p1.add(tf);
        
        p1.add(pbc);
        p1.add(dk);
        
        f1.add(p1,BorderLayout.NORTH);
        f1.add(p2,BorderLayout.CENTER);
        p2.setLayout(g1);
        p2.setBackground(Color.WHITE);
        
        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        
         li.addActionListener(this);
         dk.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object o = e.getSource();
        if(o.equals(b0)){
            tf.setText(tf.getText()+b0.getLabel());
        }else if(o.equals(b1)){
            tf.setText(tf.getText()+b1.getLabel());
        }else if(o.equals(b2)){
            tf.setText(tf.getText()+b2.getLabel());
        }else if(o.equals(b3)){
            tf.setText(tf.getText()+b3.getLabel());
        }else if(o.equals(b4)){
            tf.setText(tf.getText()+b4.getLabel());
        }else if(o.equals(b5)){
            tf.setText(tf.getText()+b5.getLabel());
        }else if(o.equals(b6)){
            tf.setText(tf.getText()+b6.getLabel());
        }else if(o.equals(b7)){
            tf.setText(tf.getText()+b7.getLabel());
        }else if(o.equals(b8)){
            tf.setText(tf.getText()+b8.getLabel());
        }else if(o.equals(b9)){
            tf.setText(tf.getText()+b9.getLabel());
         
        }else if(o.equals(b19)){
  try{
       fv=tf.getText();
       fv=fv.substring(0, fv.length()-1);
    }catch(StringIndexOutOfBoundsException f){
        tf.setText("Error");
        return;
    }
  tf.setText(fv);
}else if(o.equals(b20)){
    try{
        fv=tf.getText();
        fdv=Math.sqrt(Double.parseDouble(fv));
    }catch(NumberFormatException f){
        tf.setText("Error");
        return;
    }tf.setText(fdv+"");
    
}else if(o.equals(b12)){ 
            try{
              fv=tf.getText();
              fdv = Double.parseDouble(fv);
            }catch(NumberFormatException f){
                tf.setText("Invalid Format");
                return;
            }
            tf.setText("");
            op=b12.getLabel();
          
                
        }else if(o.equals(b13)){
            try{
               fv=tf.getText();
              fdv = Double.parseDouble(fv);
            }catch(NumberFormatException f){
                tf.setText("Invalid Format");
                return;
            }tf.setText("");
           op=b13.getLabel();
          
                
        }else if(o.equals(b14)){
            try{
               fv=tf.getText();
              fdv = Double.parseDouble(fv);
            }catch(NumberFormatException f){
                tf.setText("Invalid Format");
                return;
            }tf.setText("");
           op=b14.getLabel();
                
        }else if(o.equals(b15)){
            tf.setText("");
                
        }else if(o.equals(b16)){
            try{
               fv=tf.getText();
              fdv = Double.parseDouble(fv);
            }catch(NumberFormatException f){
                tf.setText("Invalid Format");
                return;
            }tf.setText("");
          op=b16.getLabel();
        
        }else if(o.equals(b18)){
            try{
               fv=tf.getText();
              fdv = Double.parseDouble(fv);
            }catch(NumberFormatException f){
                tf.setText("Invalid Format");
                return;
            }tf.setText("");
           op=b18.getLabel();
        }
        
        else if(o.equals(b17)){
             try{
               fv=tf.getText();
                
             }catch(NumberFormatException f){
                 fv=tf.getText();
             }
            tf.setText((fv+"."));
        }
    
        
        else if(o.equals(b11)){
             try{
               sv=tf.getText();
            sdv = Double.parseDouble(sv);
            
            }catch(NumberFormatException f){
                tf.setText("Invalid Format");
                return;
            } if(op.equals("+")){
                resalt = fdv+sdv;
                tf.setText(resalt+"");
            }else if(op.equals("-")){
                resalt=fdv-sdv;
                tf.setText(resalt+"");
           }else if(op.equals("*")){
                resalt=fdv*sdv;
                 tf.setText(resalt+"");
            }else if(op.equals("/")){
               resalt=fdv/sdv;
                tf.setText(resalt+"");
           }else if(op.equals("%")){
               resalt=fdv%sdv;
                tf.setText(String.valueOf(resalt));
            }
        }else if(o.equals(li)){
            
            Color col = new Color(102, 153, 225);
            Color col2 = new Color(225, 153, 0);
            Color col3 = new Color(51, 102, 225);
            Color col4 = new Color(153, 153, 153);
            Color col5 = new Color(204, 204, 255);
            Color col6 = new Color(0, 0, 0);
            
            
        b0.setForeground(col6);
        b1.setForeground(col6);
        b2.setForeground(col6);
        b3.setForeground(col6);
        b4.setForeground(col6);
        b5.setForeground(col6);
        b6.setForeground(col6);
        b7.setForeground(col6);
        b8.setForeground(col6);
        b9.setForeground(col6);
        
        b11.setForeground(col6);
        b12.setForeground(col6);
        b13.setForeground(col6);
        b14.setForeground(col6);
        b16.setForeground(col6);
        b17.setForeground(col6);
            
        b0.setBackground(col);
        b1.setBackground(col);
        b2.setBackground(col);
        b3.setBackground(col);
        b4.setBackground(col);
        b5.setBackground(col);
        b6.setBackground(col);
        b7.setBackground(col);
        b8.setBackground(col);
        b9.setBackground(col);
       
        b11.setBackground(col3);
        b12.setBackground(col4);
        b13.setBackground(col4);
        b14.setBackground(col4);
        b15.setBackground(col2);
        b16.setBackground(col4);
        b17.setBackground(col);
        b18.setBackground(col5);
        b19.setBackground(col2);
        b20.setBackground(col5);
        
        }else if(o.equals(dk)){
            
            Color col = new Color(225, 225, 225);
            Color col2 = new Color(225, 153, 0);
            Color col3 = new Color(51, 102, 225);
            Color col4 = new Color(51, 51, 51);
            Color col5 = new Color(204, 204, 255);
            
        b0.setForeground(col);
        b1.setForeground(col);
        b2.setForeground(col);
        b3.setForeground(col);
        b4.setForeground(col);
        b5.setForeground(col);
        b6.setForeground(col);
        b7.setForeground(col);
        b8.setForeground(col);
        b9.setForeground(col);
        
        b11.setForeground(col);
        b12.setForeground(col);
        b13.setForeground(col);
        b14.setForeground(col);
        b16.setForeground(col);
        b17.setForeground(col);   
            
        b0.setBackground(col4);
        b1.setBackground(col4);
        b2.setBackground(col4);
        b3.setBackground(col4);
        b4.setBackground(col4);
        b5.setBackground(col4);
        b6.setBackground(col4);
        b7.setBackground(col4);
        b8.setBackground(col4);
        b9.setBackground(col4);
        b15.setBackground(col2);
        b11.setBackground(col3);
        b12.setBackground(col4);
        b13.setBackground(col4);
        b14.setBackground(col4);
        b16.setBackground(col4);
        b17.setBackground(col4);
        b18.setBackground(col5);
        b19.setBackground(col2);
        b20.setBackground(col5);
        }
    }
        
}
    
class Createcalculater{
    public static void main(String[] args) {
        new calculater();
    }
}
