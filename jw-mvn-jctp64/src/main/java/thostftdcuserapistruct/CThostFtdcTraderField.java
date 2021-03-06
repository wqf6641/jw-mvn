package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:436</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcTraderField extends StructObject {
	public CThostFtdcTraderField() {
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
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(1) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u4f1a\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u5bc6\u7801<br>
	 * C type : TThostFtdcPasswordType
	 */
	@Array({41}) 
	@Field(3) 
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u5b89\u88c5\u6570\u91cf<br>
	 * C type : TThostFtdcInstallCountType
	 */
	@Field(4) 
	public int InstallCount() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \u5b89\u88c5\u6570\u91cf<br>
	 * C type : TThostFtdcInstallCountType
	 */
	@Field(4) 
	public CThostFtdcTraderField InstallCount(int InstallCount) {
		this.io.setIntField(this, 4, InstallCount);
		return this;
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(5) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 5);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcTraderField(Pointer pointer) {
		super(pointer);
	}
}
