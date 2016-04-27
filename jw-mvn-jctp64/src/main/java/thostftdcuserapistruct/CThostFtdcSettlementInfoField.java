package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u6295\u8d44\u8005\u7ed3\u7b97\u7ed3\u679c<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:975</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcSettlementInfoField extends StructObject {
	public CThostFtdcSettlementInfoField() {
		super();
	}
	/**
	 * \u4ea4\u6613\u65e5<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(1) 
	public int SettlementID() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(1) 
	public CThostFtdcSettlementInfoField SettlementID(int SettlementID) {
		this.io.setIntField(this, 1, SettlementID);
		return this;
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(4) 
	public int SequenceNo() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(4) 
	public CThostFtdcSettlementInfoField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 4, SequenceNo);
		return this;
	}
	/**
	 * \u6d88\u606f\u6b63\u6587<br>
	 * C type : TThostFtdcContentType
	 */
	@Array({501}) 
	@Field(5) 
	public Pointer<Byte > Content() {
		return this.io.getPointerField(this, 5);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcSettlementInfoField(Pointer pointer) {
		super(pointer);
	}
}
