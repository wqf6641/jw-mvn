package thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * \u4ea4\u6613\u6240\u6267\u884c\u5ba3\u544a\u4fe1\u606f<br>
 * <i>native declaration : F:\jna\ThostFtdcUserApiStruct.h:2883</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

 
public class CThostFtdcExchangeExecOrderField extends StructObject {
	public CThostFtdcExchangeExecOrderField() {
		super();
	}
	/**
	 * \u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(0) 
	public int Volume() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * \u6570\u91cf<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(0) 
	public CThostFtdcExchangeExecOrderField Volume(int Volume) {
		this.io.setIntField(this, 0, Volume);
		return this;
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(1) 
	public int RequestID() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \u8bf7\u6c42\u7f16\u53f7<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(1) 
	public CThostFtdcExchangeExecOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 1, RequestID);
		return this;
	}
	/**
	 * \u4e1a\u52a1\u5355\u5143<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(2) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(3) 
	public byte OffsetFlag() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u5f00\u5e73\u6807\u5fd7<br>
	 * C type : TThostFtdcOffsetFlagType
	 */
	@Field(3) 
	public CThostFtdcExchangeExecOrderField OffsetFlag(byte OffsetFlag) {
		this.io.setByteField(this, 3, OffsetFlag);
		return this;
	}
	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(4) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(4) 
	public CThostFtdcExchangeExecOrderField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 4, HedgeFlag);
		return this;
	}
	/**
	 * \u6267\u884c\u7c7b\u578b<br>
	 * C type : TThostFtdcActionTypeType
	 */
	@Field(5) 
	public byte ActionType() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \u6267\u884c\u7c7b\u578b<br>
	 * C type : TThostFtdcActionTypeType
	 */
	@Field(5) 
	public CThostFtdcExchangeExecOrderField ActionType(byte ActionType) {
		this.io.setByteField(this, 5, ActionType);
		return this;
	}
	/**
	 * \u4fdd\u7559\u5934\u5bf8\u7533\u8bf7\u7684\u6301\u4ed3\u65b9\u5411<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	@Field(6) 
	public byte PosiDirection() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \u4fdd\u7559\u5934\u5bf8\u7533\u8bf7\u7684\u6301\u4ed3\u65b9\u5411<br>
	 * C type : TThostFtdcPosiDirectionType
	 */
	@Field(6) 
	public CThostFtdcExchangeExecOrderField PosiDirection(byte PosiDirection) {
		this.io.setByteField(this, 6, PosiDirection);
		return this;
	}
	/**
	 * \u671f\u6743\u884c\u6743\u540e\u662f\u5426\u4fdd\u7559\u671f\u8d27\u5934\u5bf8\u7684\u6807\u8bb0<br>
	 * C type : TThostFtdcExecOrderPositionFlagType
	 */
	@Field(7) 
	public byte ReservePositionFlag() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \u671f\u6743\u884c\u6743\u540e\u662f\u5426\u4fdd\u7559\u671f\u8d27\u5934\u5bf8\u7684\u6807\u8bb0<br>
	 * C type : TThostFtdcExecOrderPositionFlagType
	 */
	@Field(7) 
	public CThostFtdcExchangeExecOrderField ReservePositionFlag(byte ReservePositionFlag) {
		this.io.setByteField(this, 7, ReservePositionFlag);
		return this;
	}
	/**
	 * \u671f\u6743\u884c\u6743\u540e\u751f\u6210\u7684\u5934\u5bf8\u662f\u5426\u81ea\u52a8\u5e73\u4ed3<br>
	 * C type : TThostFtdcExecOrderCloseFlagType
	 */
	@Field(8) 
	public byte CloseFlag() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \u671f\u6743\u884c\u6743\u540e\u751f\u6210\u7684\u5934\u5bf8\u662f\u5426\u81ea\u52a8\u5e73\u4ed3<br>
	 * C type : TThostFtdcExecOrderCloseFlagType
	 */
	@Field(8) 
	public CThostFtdcExchangeExecOrderField CloseFlag(byte CloseFlag) {
		this.io.setByteField(this, 8, CloseFlag);
		return this;
	}
	/**
	 * \u672c\u5730\u6267\u884c\u5ba3\u544a\u7f16\u53f7<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(9) 
	public Pointer<Byte > ExecOrderLocalID() {
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
	public CThostFtdcExchangeExecOrderField InstallID(int InstallID) {
		this.io.setIntField(this, 15, InstallID);
		return this;
	}
	/**
	 * \u6267\u884c\u5ba3\u544a\u63d0\u4ea4\u72b6\u6001<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(16) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 16);
	}
	/**
	 * \u6267\u884c\u5ba3\u544a\u63d0\u4ea4\u72b6\u6001<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(16) 
	public CThostFtdcExchangeExecOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 16, OrderSubmitStatus);
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
	public CThostFtdcExchangeExecOrderField NotifySequence(int NotifySequence) {
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
	public CThostFtdcExchangeExecOrderField SettlementID(int SettlementID) {
		this.io.setIntField(this, 19, SettlementID);
		return this;
	}
	/**
	 * \u6267\u884c\u5ba3\u544a\u7f16\u53f7<br>
	 * C type : TThostFtdcExecOrderSysIDType
	 */
	@Array({21}) 
	@Field(20) 
	public Pointer<Byte > ExecOrderSysID() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * \u62a5\u5355\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(21) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \u63d2\u5165\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(22) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \u64a4\u9500\u65f6\u95f4<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(23) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \u6267\u884c\u7ed3\u679c<br>
	 * C type : TThostFtdcExecResultType
	 */
	@Field(24) 
	public byte ExecResult() {
		return this.io.getByteField(this, 24);
	}
	/**
	 * \u6267\u884c\u7ed3\u679c<br>
	 * C type : TThostFtdcExecResultType
	 */
	@Field(24) 
	public CThostFtdcExchangeExecOrderField ExecResult(byte ExecResult) {
		this.io.setByteField(this, 24, ExecResult);
		return this;
	}
	/**
	 * \u7ed3\u7b97\u4f1a\u5458\u7f16\u53f7<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(25) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(26) 
	public int SequenceNo() {
		return this.io.getIntField(this, 26);
	}
	/**
	 * \u5e8f\u53f7<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(26) 
	public CThostFtdcExchangeExecOrderField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 26, SequenceNo);
		return this;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CThostFtdcExchangeExecOrderField(Pointer pointer) {
		super(pointer);
	}
}