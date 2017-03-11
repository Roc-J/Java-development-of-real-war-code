package set.train;

import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * 重写hashcode()方法和equals方法
 * @author Roc-J
 *
 */
public class PK_People {
	@Override
	public int hashCode() {
		return number + this.prefix.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(getClass()!=obj.getClass()){
			return false;
		}
		if(this == obj){
			return true;
		}
		final PK_People other = (PK_People)obj;
		if(this.hashCode()!=other.hashCode()){
			return false;
		}
		return true;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	private String prefix;
	private int number;
	
	public String getPK(){
		return this.prefix+"_"+this.number;
	}
	
	public void SetPK(String pk){
		int i = pk.indexOf("_");
		this.prefix = pk.substring(0, i);
		this.number = new Integer(pk.substring(i));
	}
	
	
}
