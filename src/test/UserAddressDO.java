package test;

// UserAddress에 대한 DO(Data Object) - 데이터(필드)에 관한 저장소 및 Getter/Setter 
public class UserAddressDO {
	// Data Field
	private String userId;
	private String roadFullAddr;
	private String roadAddrPart1;
	private String roadAddrPart2;
	private String jibunAddr;
	private String engAddr;
	private String zipNo;
	private String admCd;
	private String rnMgtSn;
	private String bdMgtSn;
	private String addrDetail;
	private String detBdNmList;
	private String bdNm;
	private String bdKdcd;
	private String siNm;
	private String sggNm;
	private String emdNm;
	private String liNm;
	private String rn;
	private String udrtYn;
	private int buldMnnm;
	private int buldSlno;
	private String mtYn;
	private int lnbrMnnm;
	private int lnbrSlno;
	private String emdNo;
	
	public UserAddressDO() {}
	
	public UserAddressDO(String userId, String roadFullAddr, String roadAddrPart1, String roadAddrPart2, String jibunAddr, String engAddr, String zipNo, String admCd, String rnMgtSn, String bdMgtSn, String addrDetail, String detBdNmList, String bdNm, String bdKdcd, String siNm, String sggNm, String emdNm, String liNm, String rn, String udrtYn, int buldMnnm, int buldSlno, String mtYn, int lnbrMnnm, int lnbrSlno, String emdNo) {
		this.userId = userId;
		this.roadAddrPart1 = roadAddrPart1;
		this.roadAddrPart2 = roadAddrPart2;
		this.jibunAddr = jibunAddr;
		this.engAddr = engAddr;
		this.zipNo = zipNo;
		this.admCd = admCd;
		this.rnMgtSn = rnMgtSn;
		this.bdMgtSn = bdMgtSn;
		this.addrDetail = addrDetail;
		this.detBdNmList = detBdNmList;
		this.bdNm = bdNm;
		this.bdKdcd = bdKdcd;
		this.siNm = siNm;
		this.sggNm = sggNm;
		this.emdNm = emdNm;
		this.liNm = liNm;
		this.rn = rn;
		this.udrtYn = udrtYn;
		this.buldMnnm = buldMnnm;
		this.buldSlno = buldSlno;
		this.mtYn = mtYn;
		this.lnbrMnnm = lnbrMnnm;
		this.lnbrSlno = lnbrSlno;
		this.emdNo = emdNo;
	}
	
	// Get/Set Method of Field
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoadFullAddr() {
		return roadFullAddr;
	}
	public void setRoadFullAddr(String roadFullAddr) {
		this.roadFullAddr = roadFullAddr;
	}
	public String getRoadAddrPart1() {
		return roadAddrPart1;
	}
	public void setRoadAddrPart1(String roadAddrPart1) {
		this.roadAddrPart1 = roadAddrPart1;
	}
	public String getRoadAddrPart2() {
		return roadAddrPart2;
	}
	public void setRoadAddrPart2(String roadAddrPart2) {
		this.roadAddrPart2 = roadAddrPart2;
	}
	public String getJibunAddr() {
		return jibunAddr;
	}
	public void setJibunAddr(String jibunAddr) {
		this.jibunAddr = jibunAddr;
	}
	public String getEngAddr() {
		return engAddr;
	}
	public void setEngAddr(String engAddr) {
		this.engAddr = engAddr;
	}
	public String getZipNo() {
		return zipNo;
	}
	public void setZipNo(String zipNo) {
		this.zipNo = zipNo;
	}
	public String getAdmCd() {
		return admCd;
	}
	public void setAdmCd(String admCd) {
		this.admCd = admCd;
	}
	public String getRnMgtSn() {
		return rnMgtSn;
	}
	public void setRnMgtSn(String rnMgtSn) {
		this.rnMgtSn = rnMgtSn;
	}
	public String getBdMgtSn() {
		return bdMgtSn;
	}
	public void setBdMgtSn(String bdMgtSn) {
		this.bdMgtSn = bdMgtSn;
	}
	public String getAddrDetail() {
		return addrDetail;
	}
	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}
	public String getDetBdNmList() {
		return detBdNmList;
	}
	public void setDetBdNmList(String detBdNmList) {
		this.detBdNmList = detBdNmList;
	}
	public String getBdNm() {
		return bdNm;
	}
	public void setBdNm(String bdNm) {
		this.bdNm = bdNm;
	}
	public String getBdKdcd() {
		return bdKdcd;
	}
	public void setBdKdcd(String bdKdcd) {
		this.bdKdcd = bdKdcd;
	}
	public String getSiNm() {
		return siNm;
	}
	public void setSiNm(String siNm) {
		this.siNm = siNm;
	}
	public String getSggNm() {
		return sggNm;
	}
	public void setSggNm(String sggNm) {
		this.sggNm = sggNm;
	}
	public String getEmdNm() {
		return emdNm;
	}
	public void setEmdNm(String emdNm) {
		this.emdNm = emdNm;
	}
	public String getLiNm() {
		return liNm;
	}
	public void setLiNm(String liNm) {
		this.liNm = liNm;
	}
	public String getRn() {
		return rn;
	}
	public void setRn(String rn) {
		this.rn = rn;
	}
	public String getUdrtYn() {
		return udrtYn;
	}
	public void setUdrtYn(String udrtYn) {
		this.udrtYn = udrtYn;
	}
	public int getBuldMnnm() {
		return buldMnnm;
	}
	public void setBuldMnnm(int buldMnnm) {
		this.buldMnnm = buldMnnm;
	}
	public int getBuldSlno() {
		return buldSlno;
	}
	public void setBuldSlno(int buldSlno) {
		this.buldSlno = buldSlno;
	}
	public String getMtYn() {
		return mtYn;
	}
	public void setMtYn(String mtYn) {
		this.mtYn = mtYn;
	}
	public int getLnbrMnnm() {
		return lnbrMnnm;
	}
	public void setLnbrMnnm(int lnbrMnnm) {
		this.lnbrMnnm = lnbrMnnm;
	}
	public int getLnbrSlno() {
		return lnbrSlno;
	}
	public void setLnbrSlno(int lnbrSlno) {
		this.lnbrSlno = lnbrSlno;
	}
	public String getEmdNo() {
		return emdNo;
	}
	public void setEmdNo(String emdNo) {
		this.emdNo = emdNo;
	}
}
