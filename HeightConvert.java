package training;
import java.util.*;
public class HeightConvert {
private double feet,inch;
public HeightConvert()
{
	feet=0;
	inch=0;
}
public double getHeight()
{
	double res;
	res = ((feet * 12)+inch)*2.5;
	return res;
}
public void setHeight(double ft,double ih)
{
	feet = ft;
	inch = ih;
}
public double add(HeightConvert h)
{
	return this.getHeight() + h.getHeight();
}
}
