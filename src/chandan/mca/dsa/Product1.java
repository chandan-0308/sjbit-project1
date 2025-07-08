package chandan.mca.dsa;

import java.util.Objects;

public class Product1 
{
   int prdID;
  String prdName;
  double prdPrice;
  public Product1(int prdID, String prdName, double prdPrice) {
	super();
	this.prdID = prdID;
	this.prdName = prdName;
	this.prdPrice = prdPrice;
}
@Override
public String toString() {
	return "Product1 [prdID=" + prdID + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
}
@Override
public int hashCode() {
	return Objects.hash(prdID, prdName, prdPrice);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product1 other = (Product1) obj;
	return prdID == other.prdID && Objects.equals(prdName, other.prdName)
			&& Double.doubleToLongBits(prdPrice) == Double.doubleToLongBits(other.prdPrice);
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
}
