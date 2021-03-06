package ch.aeberhardo.xlsx2beans.converter;

public class XlsxBeanConverterException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public XlsxBeanConverterException() {
		super();
	}

	public XlsxBeanConverterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public XlsxBeanConverterException(String message, Throwable cause) {
		super(message, cause);
	}

	public XlsxBeanConverterException(String message) {
		super(message);
	}

	public XlsxBeanConverterException(Throwable cause) {
		super(cause);
	}

}
