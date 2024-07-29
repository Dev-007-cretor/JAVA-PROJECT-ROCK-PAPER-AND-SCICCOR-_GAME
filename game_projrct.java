
import java.util.LinkedList;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class game_projrct extends Thread implements ActionListener  {

    JFrame f= new JFrame("GAME");
    JButton b= new JButton("ROCK");
    JButton b1=new JButton("PAPER");
    JButton b2= new JButton("sciccor");

    JButton b3= new JButton("restart");

    JTextField t= new JTextField("result");
    JTextField t1= new JTextField("user_score");
    JTextField t2= new JTextField("comp_user");
    JLabel l= new JLabel("ROCK,PAPER,SCICCOR_GAME " );
    int user=0;
    int comp=0;
    game_projrct(){
        f.setBounds(500,500,500,500);
        f.setVisible(true);
        f.setBackground(Color.YELLOW);
        f.setForeground(Color.BLUE);
        f.setLayout(null);
        f.pack();
        b.setBounds(500,200,100,50);
        b.setBackground(Color.GRAY);
        b1.setBounds(630,200,100,50);
        b1.setBackground(Color.WHITE);
        b2.setBounds(550,280,100,50);
        b2.setBackground(Color.GREEN);
        b3.setBounds(550,340,100,50);
        t.setBounds(530,400,150,75);
        t1.setBounds(420,400,75,50);
        t1.setBackground(Color.cyan);
        t2.setBounds(720,400,75,50);
        t2.setBackground(Color.MAGENTA);
        l.setBounds(570,100,200,50);
        l.setBackground(Color.BLUE);
        l.setVisible(true);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(t);
        f.add(t1);
        f.add(t2);
        f.add(l);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }
    public void run(){
          t.setBackground(Color.CYAN);
          t1.setBackground(Color.magenta);
          t2.setBackground(Color.pink);
    }
   void logic(String user_choice,String d){
        String a="ROCK";
        String b="PAPER";
        String c="sciccor";
        if(a.equals(user_choice) && b.equals(d)){
            t.setText("comp is winner");
            t.setBackground(Color.red);
            t2.setBackground(Color.red);

            comp++;
        }
        else if(a.equals(user_choice) && c.equals(d)){
            t.setText("user is winner");
            t.setBackground(Color.GREEN);
            t1.setBackground(Color.GREEN);

            user++;
        }
        else if(a.equals(user_choice) && a.equals(d)){
            t.setText("tie");
            t.setBackground(Color.YELLOW);
            start();
        }
        else if(b.equals(user_choice) && a.equals(d)){
            t.setText("user is winner");
            t.setBackground(Color.GREEN);
            t1.setBackground(Color.green);

            user++;
        }
        else if(b.equals(user_choice) && c.equals(d)){
            t.setText("comp is winner");
            t.setBackground(Color.red);
            t2.setBackground(Color.red);

            comp++;
        }
        else if(b.equals(user_choice) && b.equals(d)){
            t.setText("tie");
            t.setBackground(Color.YELLOW);

        }
        else if(c.equals(user_choice) && a.equals(d)){
            t.setText("comp is winner");
            t.setBackground(Color.red);
            t2.setBackground(Color.red);

            comp++;
        }
        else if(c.equals(user_choice) && b.equals(d)){
             t.setText("user is winner");
             t.setBackground(Color.GREEN);
             t1.setBackground(Color.green);

             user++;
        }
        else if(c.equals(user_choice) && c.equals(d)){
            t.setText("tie");
            t.setBackground(Color.YELLOW);

        }

   }

    public static void main(String[] args) {
      game_projrct g=  new game_projrct();
      g.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if(b==e.getSource()){
               Random r= new Random();
               int R=r.nextInt(3);
               LinkedList<String>s= new LinkedList<>();
               s.add("ROCK");
               s.add("PAPER");
               s.add("sciccor");
               String d=s.get(R);
               System.out.println(d);
             String user_choice = b.getText();
             logic(user_choice,d);
             t1.setText(String.valueOf(user));
             t2.setText(String.valueOf(comp));
             System.out.println(user_choice);
           }
           if(b1==e.getSource()){
               Random r= new Random();
               int R=r.nextInt(3);
               LinkedList<String>s= new LinkedList<>();
               s.add("ROCK");
               s.add("PAPER");
               s.add("sciccor");
               String d=s.get(R);
               System.out.println(d);
               String user_choice = b1.getText();
               logic(user_choice,d);
               t1.setText(String.valueOf(user));
               t2.setText(String.valueOf(comp));
               System.out.println(user_choice);
           }
           if(b2==e.getSource()){
               Random r= new Random();
               int R=r.nextInt(3);
               LinkedList<String>s= new LinkedList<>();
               s.add("ROCK");
               s.add("PAPER");
               s.add("sciccor");
               String d=s.get(R);
               System.out.println(d);
               String user_choice = b2.getText();
               logic(user_choice,d);
               t1.setText(String.valueOf(user));
               t2.setText(String.valueOf(comp));
               System.out.println(user_choice);
           }
           if(b3==e.getSource()){
               t.setText("GAME_RESTART");
               t.setBackground(Color.WHITE);
               user=0;
               comp=0;
               t1.setText("0");
               t1.setBackground(Color.white);
               t2.setText("0");
               t2.setBackground(Color.white);

           }
    }
}
