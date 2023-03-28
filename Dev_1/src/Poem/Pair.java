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

	/*@Override
	public int hashCode() { return left.hashCode() ^ right.hashCode(); }
	*/
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pair)) return false;
	    Pair pairo = (Pair) o;
	    return this.left.equals(pairo.getLeft()) &&
	           this.right.equals(pairo.getRight());
	}
	  
	public boolean leftEquals(String s) {
		//return this.left.equalsignorecase(s);
		temp = this.getLeft();
		  	if(temp.equalsIgnoreCase(s)) {
		  		return true;
		  	}
		  	else
		  		return false;
	  }
}
