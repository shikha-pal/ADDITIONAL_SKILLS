/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additional_skills1;

/**
 *
 * @author 007
 */
public class Exchangefestival {
     public static void main(String[] args) {
         String s="15 August is Independence day";
         s=s+' ';
String d="",y="";
int l=s.length();
for(int i=0;i<l;i++)
{
char c=s.charAt(i);
if(c!=' ')
d=d+c;
else
{
if(d.compareTo("15")==0)
y=y+" "+"26";
else if(d.compareTo("August")==0)
y=y+" "+"January";
else if(d.compareTo("Independence")==0)
y=y+" "+"Republic";
else
y=y+" "+d;
d="";
}
}
y=y.trim();
System.out.println("Modified String is");
System.out.println(y);

}
}
