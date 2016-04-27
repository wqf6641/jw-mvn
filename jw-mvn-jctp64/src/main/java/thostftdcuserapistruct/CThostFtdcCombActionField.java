package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u7533\u8bf7\u7ec4\u5408<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:3724</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcCombActionField extends StructObject {
	public CThostFtdcCombActionField() {
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
	 * \u7ec4\u5408\u5f15\u7528<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > CombActionRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u7528\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u4e70\u5356\u65b9\u5411<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(5) 
	public byte Direction() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \u4e70\u5356\u65b9\u5411<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(5) 
	public CThostFtdcCombActionField Direction(byte Direction) {
		this.io.setByteField(this, 5, Direction);
		return this;
	}
	/**
	 * \u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(6) 
	public int Volume() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(6) 
	public CThostFtdcCombActionField Volume(int Volume) {
		this.io.setIntField(this, 6, Volume);
		return this;
	}
	/**
	 * \u7ec4\u5408\u6307\u4ee4\u65b9\u5411<br>
	 * C type : TThostFtdcCombDirectionType
	 */
	@Field(7) 
	public byte CombDirection() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \u7ec4\u5408\u6307\u4ee4\u65b9\u5411<br>
	 * C type : TThostFtdcCombDirectionType
	 */
	@Field(7) 
	public CThostFtdcCombActionField CombDirection(byte CombDirection) {
		this.io.setByteField(this, 7, CombDirection);
		return this;
	}
	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(8) 
	public CThostFtdcCombActionField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 8, HedgeFlag);
		return this;
	}
	/**
	 * \u672c\u5730\u7533\u8bf7\u7ec4\u5408\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(9) 
	public Pointer<Byte > ActionLocalID() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(10) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \u4f1a\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(11) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \u5ba2\u6237\u4ee3\u7801<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(12) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \u5408\u7ea6\u5728\u4ea4\u6613\u6240\u7684\u4ee3\u7801<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(13) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \u4ea4\u6613\u6240\u4ea4\u6613\u5458\u4ee3\u7801<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(14) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(15) 
	public int InstallID() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \u5b89\u88c5\u7f16\u53f7<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(15) 
	public CThostFtdcCombActionField InstallID(int InstallID) {
		this.io.setIntField(this, 15, InstallID);
		return this;
	}
	/**
	 * \u7ec4\u5408\u72b6\u6001<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(16) 
	public byte ActionStatus() {
		return this.io.getByteField(this, 16);
	}
	/**
	 * \u7ec4\u5408\u72b6\u6001<br>
	 * C type : TThostFtdcOrderActionStatusType
	 */
	@Field(16) 
	public CThostFtdcCombActionField ActionStatus(byte ActionStatus) {
		this.io.setByteField(this, 16, ActionStatus);
		return this;
	}
	/**
	 * \u62a5\u5355\u63d0\u793a\u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(17) 
	public int NotifySequence() {
		return this.io.getIntField(this, 17);
	}
	/**
	 * \u62a5\u5355\u63d0\u793a\u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(17) 
	public CThostFtdcCombActionField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 17, NotifySequence);
		return this;
	}
	/**
	 * \u4ea4\u6613\u65e5<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(18) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(19) 
	public int SettlementID() {
		return this.io.getIntField(this, 19);
	}
	/**
	 * \u7ed3\u7b97\u7f16\u53f7<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(19) 
	public CThostFtdcCombActionField SettlementID(int SettlementID) {
		this.io.setIntField(this, 19, SettlementID);
		return this;
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(20) 
	public int SequenceNo() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(20) 
	public CThostFtdcCombActionField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 20, SequenceNo);
		return this;
	}
	/**
	 * \u524d\u7f6e\u7f16\u53f7<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(21) 
	public int FrontID() {
		return this.io.getIntField(this, 21);
	}
	/**
	 * \u524d\u7f6e\u7f16\u53f7<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(21) 
	public CThostFtdcCombActionField FrontID(int FrontID) {
		this.io.setIntField(this, 21, FrontID);
		return this;
	}
	/**
	 * \u4f1a\u8bdd\u7f16\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(22) 
	public int SessionID() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * \u4f1a\u8bdd\u7f16\u53f7<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(22) 
	public CThostFtdcCombActionField SessionID(int SessionID) {
		this.io.setIntField(this, 22, SessionID);
		return this;
	}
	/**
	 * \u7528\u6237\u7aef\u4ea7\u54c1\u4fe1\u606f<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(23) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \u72b6\u6001\u4fe1\u606f<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({81}) 
	@Field(24) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 24);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcCombActionField(Pointer pointer) {
		super(pointer);
	}
}
