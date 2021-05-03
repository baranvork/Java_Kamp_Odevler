
public class Campaign {
	private int CampaignId;
	private String campaignName;
	private double CampaignRate; 
	private long LastPrice;
	
	public Campaign () {
		
	};
	public Campaign(int campaignId, String campaignName, double campaignRate, long lastPrice) {
		super();
		CampaignId = campaignId;
		this.campaignName = campaignName;
		CampaignRate = campaignRate;
		LastPrice = lastPrice;
	}
	public int getCampaignId() {
		return CampaignId;
	}
	public void setCampaignId(int campaignId) {
		CampaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getCampaignRate() {
		return CampaignRate;
	}
	public void setCampaignRate(double campaignRate) {
		CampaignRate = campaignRate;
	}
	public void setLastPrice(long lastPrice) {
		LastPrice = lastPrice;
	
	}
	public long getLastPrice() {

		return LastPrice;
	}

}
