package citi.com.utils;




import citi.com.domain.CacheDTO;
import citi.com.domain.PartiesPayingServiceDTO;


public class Utils {
	
   

	public PartiesPayingServiceDTO getChargeData(final CacheDTO cacheDTO) {
		PartiesPayingServiceDTO partiesPayingServiceDTO = new PartiesPayingServiceDTO();
		partiesPayingServiceDTO.setRefNum(cacheDTO.getRefNum());
		partiesPayingServiceDTO.setSeqNum(cacheDTO.getSeqNum());
		partiesPayingServiceDTO.setProductType(cacheDTO.getProductType());
		partiesPayingServiceDTO.setOpnType(cacheDTO.getOpnType());
		partiesPayingServiceDTO.setFixed_amount_charge(calFixed_amnt_charge(cacheDTO));
		partiesPayingServiceDTO.setFixed_percentage_charge(cacheDTO.getFixed_percentage_charge());
		partiesPayingServiceDTO.setLcAmount(cacheDTO.getLcAmount());
		partiesPayingServiceDTO.setChangeAmount(cacheDTO.getChangeAmount());
		partiesPayingServiceDTO.setFixedPerCharg_Amnt(calFixedPerCharg_Amnt(cacheDTO));
		partiesPayingServiceDTO.setExpirydate(cacheDTO.getExpirydate());
		partiesPayingServiceDTO.setExtendexpirydate(cacheDTO.getExtendexpirydate());
		return partiesPayingServiceDTO;

	}

	private String calFixedPerCharg_Amnt(final CacheDTO cacheDTO) {
		double amount = 0.00;
		String tot_amt = "";
		try {
			amount = ((Double.parseDouble(cacheDTO.getFixed_percentage_charge()))
					* (Double.parseDouble(cacheDTO.getChangeAmount()))) / 100;

			tot_amt = new Double(amount).toString();

		} catch (Exception e) {
			System.out.println("Exception in calFixedPerCharg_Amnt:: " + e);
			amount = 0.00;

		}

		return tot_amt;
	}

	private String calFixed_amnt_charge(final CacheDTO cacheDTO) {
		String fixed_amnt_charge = cacheDTO.getFixed_amount_charge();
		return fixed_amnt_charge;
	}

	public CacheDTO getCaheData() {
		CacheDTO cacheDTO = new CacheDTO();
		cacheDTO.setRefNum("PPC14031105944");
		cacheDTO.setSeqNum("000");
		cacheDTO.setProductType("IMP");
		cacheDTO.setOpnType("AMENDMENT");
		cacheDTO.setFixed_percentage_charge("0.5");
		cacheDTO.setLcAmount("1000");
		cacheDTO.setFixed_amount_charge("25");
		cacheDTO.setChangeAmount("500");
		cacheDTO.setExpirydate("25-09-2018");
		cacheDTO.setExtendexpirydate("25-10-2018");
		return cacheDTO;

	}

	
	public void emailCommunition() {
		// need to implement
		
	}

}
