package Oops;

public class Distance11 {
  

int ft,inch;

Distance11(int f,int i)
{
ft=f;
inch=i;
}

Distance11 addDist(Distance11 ob,Distance11 ob1)
{
int f=0,i=0;
i=inch+ob.inch+ob1.inch;
if(i>=12)
{
f=i/12;
i=i%12;
}
f=ft+ob.ft+f+ob1.ft;
Distance11 ob2=new Distance11(f,i);
return ob2;
}

void dispDist()
{
System.out.println(ft+"ft "+inch+"inch");
}
}

class AddDistance
{
public static void main(String []ar)
{
Distance11 ob=new Distance11(12,22);
Distance11 ob1=new Distance11(13,12);
Distance11 ob2=new Distance11(11,11);
Distance11 ob3;
ob3=ob.addDist(ob1,ob2);

ob.dispDist();
ob1.dispDist();
ob2.dispDist();
ob3.dispDist();
}
}
