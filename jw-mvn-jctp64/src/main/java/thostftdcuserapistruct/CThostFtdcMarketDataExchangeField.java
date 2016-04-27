package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u884c\u60c5\u4ea4\u6613\u6240\u4ee3\u7801\u5c5e\u6027<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:4052</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcMarketDataExchangeField extends StructObject {
	public CThostFtdcMarketDataExchangeField() {
		super();
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcMarketDataExchangeField(Pointer pointer) {
		super(pointer);
	}
}
