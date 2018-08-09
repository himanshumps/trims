/**
 * 
 */
package citi.com.domain;

import java.io.Serializable;

/**
 * @author mp27471
 *
 */
public class CacheDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String refNum;
	private String seqNum;
	private String productType;
	private String opnType;
	private String fixed_amount_charge;
	private String fixed_percentage_charge;
	private String lcAmount;
	private String changeAmount;
	private String expirydate;
	private String extendexpirydate;

	/**
	 * @return the refNum
	 */
	public String getRefNum() {
		return refNum;
	}

	/**
	 * @param refNum
	 *            the refNum to set
	 */
	public void setRefNum(String refNum) {
		this.refNum = refNum;
	}

	/**
	 * @return the seqNum
	 */
	public String getSeqNum() {
		return seqNum;
	}

	/**
	 * @param seqNum
	 *            the seqNum to set
	 */
	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType
	 *            the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the opnType
	 */
	public String getOpnType() {
		return opnType;
	}

	/**
	 * @param opnType
	 *            the opnType to set
	 */
	public void setOpnType(String opnType) {
		this.opnType = opnType;
	}

	/**
	 * @return the fixed_amount_charge
	 */
	public String getFixed_amount_charge() {
		return fixed_amount_charge;
	}

	/**
	 * @param fixed_amount_charge
	 *            the fixed_amount_charge to set
	 */
	public void setFixed_amount_charge(String fixed_amount_charge) {
		this.fixed_amount_charge = fixed_amount_charge;
	}

	/**
	 * @return the fixed_percentage_charge
	 */
	public String getFixed_percentage_charge() {
		return fixed_percentage_charge;
	}

	/**
	 * @param fixed_percentage_charge
	 *            the fixed_percentage_charge to set
	 */
	public void setFixed_percentage_charge(String fixed_percentage_charge) {
		this.fixed_percentage_charge = fixed_percentage_charge;
	}

	/**
	 * @return the lcAmount
	 */
	public String getLcAmount() {
		return lcAmount;
	}

	/**
	 * @param lcAmount
	 *            the lcAmount to set
	 */
	public void setLcAmount(String lcAmount) {
		this.lcAmount = lcAmount;
	}

	/**
	 * @return the changeAmount
	 */
	public String getChangeAmount() {
		return changeAmount;
	}

	/**
	 * @param changeAmount
	 *            the changeAmount to set
	 */
	public void setChangeAmount(String changeAmount) {
		this.changeAmount = changeAmount;
	}

	/**
	 * @return the expirydate
	 */
	public String getExpirydate() {
		return expirydate;
	}

	/**
	 * @param expirydate
	 *            the expirydate to set
	 */
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	/**
	 * @return the extendexpirydate
	 */
	public String getExtendexpirydate() {
		return extendexpirydate;
	}

	/**
	 * @param extendexpirydate
	 *            the extendexpirydate to set
	 */
	public void setExtendexpirydate(String extendexpirydate) {
		this.extendexpirydate = extendexpirydate;
	}

}
