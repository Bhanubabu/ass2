import java.awt.*;
import java.applet.*;
public class Message extends Applet
{
String str;
public void init()
{
str=" HELLO EVERYONE ";
}
public void start()
{
}
public void paint(Graphics g)
{
g.drawString(str,20,40);
}
}
/*  
 <applet code="Message.class" height=200 width=320>
 </applet>
 */
