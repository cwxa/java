package lssx;

public class Set { protected int n;
private int relationNum;//关系个数
private int[] element;
private int[][] matrix;

public Set(int n, int[] element, int relationNum,int[][] map) {
    this.n = n;
    this.element = element;
    this.relationNum = relationNum;
    this.matrix = map;
}

public Set() {
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

public int getRelationNum() {
	return relationNum;
}

public void setRelationNum(int relationNum) {
	this.relationNum = relationNum;
}

public int[] getElement() {
	return element;
}

public void setElement(int[] element) {
	this.element = element;
}

public int[][] getMatrix() {
	return matrix;
}

public void setMatrix(int[][] matrix) {
	this.matrix = matrix;
}

public Set(int n, int relationNum, int[] element, int[][] matrix) {
	super();
	this.n = n;
	this.relationNum = relationNum;
	this.element = element;
	this.matrix = matrix;
}

}
