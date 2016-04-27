package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u8f93\u5165\u62a5\u4ef7\u64cd\u4f5c<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:3292</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcInputQuoteActionField extends StructObject {
	public CThostFtdcInputQuoteActionField() {
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
	 * \u62a5\u4ef7\u64cd\u4f5c\u5f15\u7528<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	@Field(2) 
	public int QuoteActionRef() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * \u62a5\u4ef7\u64cd\u4f5c\u5f15\u7528<br>
	 * C type : TThostFtdcOrderActionRefType
	 */
	@Field(2) 
	public CThostFtdcInputQuoteActionField QuoteActionRef(int QuoteActionRef) {
		this.io.setIntField(this, 2, QuoteActionRef);
		return this;
	}
	/**
	 * \u62a5\u4ef7\u5f15\u7528<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > QuoteRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(4) 
	public int RequestID() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(4) 
	public CThostFtdcInputQuoteActionField RequestID(int RequestID) {
		this.io.setIntField(this, 4, RequestID);
		return this;
	}
	/**
	 * \u524d\u7f6e\u7f16\u53f7<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(5) 
	public int FrontID() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \u524d\u7f6e\u7f16\u53f7<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(5) 
	public CThostFtdcInputQuoteActionField FrontID(int FrontID) {
		this.io.setIntField(this, 5, FrontID);
		return this;
	}
	/**
	 * \u4f1a\u8bdd\u7f16\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(6) 
	public int SessionID() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \u4f1a\u8bdd\u7f16\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(6) 
	public CThostFtdcInputQuoteActionField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u62a5\u4ef7\u64cd\u4f5c\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(8) 
	public Pointer<Byte > QuoteSysID() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u64cd\u4f5c\u6807\u5fd7<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(9) 
	public byte ActionFlag() {
		return this.io.getByteField(this, 9);
	}
	/**
	 * \u64cd\u4f5c\u6807\u5fd7<br>
	 * C type : TThostFtdcActionFlagType
	 */
	@Field(9) 
	public CThostFtdcInputQuoteActionField ActionFlag(byte ActionFlag) {
		this.io.setByteField(this, 9, ActionFlag);
		return this;
	}
	/**
	 * \u7528\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(10) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(11) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 11);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcInputQuoteActionField(Pointer pointer) {
		super(pointer);
	}
}
