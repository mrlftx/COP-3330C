package Poem;
import java.lang.String;
public class Pair {

	private String left;
	private Integer right;
	String temp;

	public Pair(String left, Integer right) {
		assert left != null;
	    assert right != null;

	    this.left = left;
	    this.right = right;
	}

	public String getLeft() { return left; }
	public Integer getRight() { return right; }
	  
	public void setLeft(String s) { left = s; }
	public void setRight(Integer i) { right = i; }
	  
	public boolean leftEquals(String s) {
		temp = this.getLeft();
		  	if(temp.equalsIgnoreCase(s)) {
		  		return true;
		  	}
		  	else
		  		return false;
	  }
}
