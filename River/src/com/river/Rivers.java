package com.river;

public abstract class Rivers {
	private River source;
	private River mouth;
	
	public Rivers(River source, River mouth) {
		this.setSource(source);
		this.setMouth(mouth);
	}

	public River getSource() {
		return source;
	}

	public void setSource(River source) {
		this.source = source;
	}

	public River getMouth() {
		return mouth;
	}

	public void setMouth(River mouth) {
		this.mouth = mouth;
	}
}
