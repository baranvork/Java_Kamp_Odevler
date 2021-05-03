
public class CampaignManager implements CampaignInter{

	@Override
	public void Campaign(Campaign campaign) {
		System.out.println("Kampanya ismi: " + campaign.getCampaignName());
		
	}

	@Override
	public void CampignRemove(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya sistemden kaldýrýldý.");
		
	}

	@Override
	public void CampaignUpdate(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya güncellendi.");
		
	}
	
	@Override
	public void CampignApply(Campaign campaign, Games games, Gamer gamer) {
		long price  = (long) (games.Price -(games.Price * campaign.getCampaignRate() / 100));
		campaign.setLastPrice(price);
		
		System.out.println(gamer.getFullName() +  " size özel " + campaign.getCampaignName() + " sonucu yeni fiyat : " + campaign.getLastPrice() );
		
	}
	

}
