package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u67e5\u8be2\u5408\u7ea6\u4fdd\u8bc1\u91d1\u7387<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:2244</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcQryInstrumentMarginRateField extends StructObject {
	public CThostFtdcQryInstrumentMarginRateField() {
		super();
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(3) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(3) 
	public CThostFtdcQryInstrumentMarginRateField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 3, HedgeFlag);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcQryInstrumentMarginRateField(Pointer pointer) {
		super(pointer);
	}
}
