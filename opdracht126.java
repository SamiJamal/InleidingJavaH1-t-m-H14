import java.applet.*;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Map.Entry;
import java.util.*;

public class opdracht126 extends Applet{private static final long serialVersionUID=1L;final opdracht126
v_=this;List<TextField>v___=new ArrayList<TextField>();String v______="Hoe vaak komen de getallen voor?";
public void init(){for(int v_=0;v_<12;v_++)
{TextField v__=new TextField(10);v__.setText("0");v___.add(v__);add(v__);}Button v__=new Button("Update");
v__.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent e){v______=getFieldCount();v_.repaint();}});add(v__);}private String getFieldCount()

    {TreeMap<String,Integer>v_=new TreeMap<String,Integer>();
for(TextField v__:v___)
{String v____=v__.getText();Integer v_____=v_.get(v____);if(v_____==null){v_.put(v____,1);}

else{v_.put(v____,v_____+1);}}StringBuilder v__=new StringBuilder();for(Entry<String,Integer>v____:v__(v_))
{v__.append(v____.getKey()+": "+v____.getValue()+"_");}return v__.toString();}public void paint(Graphics v_){String[]v__=v______.split("_");
int v___=v_.getFontMetrics().getHeight();int v____=16,v_____=160;v_.drawString("Teller",v____,v_____-v___);
for(String v______:v__){v_.drawString(v______,v____,v_____+=v___);}}

static<K,V extends Comparable<?super V>>SortedSet<Map.Entry<K,V>>v__(Map<K,V>v__)
{SortedSet<Map.Entry<K,V>>v_=new TreeSet<Map.Entry<K,V>>(new Comparator<Map.Entry<K,V>>(){

    public int compare(Map.Entry<K,V>v_,Map.Entry<K,V>v__){int v___=v__.getValue().compareTo(v_.getValue());
    return v___!=0?v___:1;}});v_.addAll(v__.entrySet());return v_;}}