package com.hwanjin.hizini.exception;

public class BizException extends RuntimeException{
	
	private static final long serialVersionUID = -8551345395649455455L;
	
	public BizException() {
		super();
	}
	public BizException(Throwable t) {
		super(t);
	}
	public BizException(String msg) {
		super(msg);
	}
}
