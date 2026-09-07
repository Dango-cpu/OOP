package com.river;

public class Confluence{
	private River leftriver;
	private River rightriver;
	
	public Confluence(River leftriver, River rightriver){
		this.setLeftriver(leftriver);
		this.setRightriver(rightriver);
	}

	public River getLeftriver() {
		return leftriver;
	}

	public void setLeftriver(River leftriver) {
		this.leftriver = leftriver;
	}

	public River getRightriver() {
		return rightriver;
	}

	public void setRightriver(River rightriver) {
		this.rightriver = rightriver;
	}
}
