import java.awt*;
import java awt.event *;
{
Message()
{
this.add WindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent We)
{
system.exit(0);
}});
}


public static void main (string args[])
{
Message m=new Message();
m.setTitle("Simple Message");
m.setSize(650,250);
m.setVisible(true);
}
public void paint(Graphics g)
{
this.setBackground(color.green);
g.setColor(color.red);
Font f=new Font("Times New Roman",Font.BOLD+Font.ITALIC,60);
g.setFont(f);
g.drawString("Hello Readers!",50,100);
}
}