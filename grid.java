import java.awt.*;  
import javax.swing.*;  
  
public class MyGridLayout{  
JFrame t;  
MyGridLayout()
{  
    t=new JFrame();  
      
    JButton a=new JButton("1");  
    JButton b=new JButton("2");  
    JButton c=new JButton("3");  
    JButton d=new JButton("4");  
    JButton e=new JButton("5");  
    JButton f=new JButton("6");  
    JButton g=new JButton("7");  
    JButton h=new JButton("8");  
    JButton i=new JButton("9");  
          
    t.add(a);
    t.add(b);
    t.add(c);
    t.add(d);
    t.add(e);  
    t.add(f);
    t.add(g);
    t.add(h);
    t.add(i);  
  
    t.setLayout(new GridLayout(3,3)); 
    t.setSize(300,300);  
    t.setVisible(true);  
}  
public static void main(String[] args)
 {  
    new MyGridLayout();  
}  
}  