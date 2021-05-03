
public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Baran");
		gamer1.setLastName("Baþaran");
		gamer1.setDayOfBirth("2001");
		gamer1.setNationalId("123");
		
		GamerManager gamerManager = new GamerManager (new CheckManager());
		gamerManager.Register(gamer1);
		
		Games game1 = new Games();
		game1.gameid = 1;
		game1.GameName = "Fifa";
		game1.ReleaseDate = "2020";
		game1.Price = 200;
		
		Games game2 = new Games();
		game2.gameid = 2;
		game2.GameName = "Call of Duty";
		game2.ReleaseDate = "2021";
		game2.Price = 300;
		
		GamesManager gameManager = new GamesManager();
		gameManager.GamesAdd(game1);
		gameManager.GamesAdd(game2);
		
		GameBuy gamebuy1 = new GameBuy();
		gamebuy1.GameBuy(gamer1, game2);;
		
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("Yýlbaþý Kampanyasý");
		campaign1.setCampaignRate(20);
		
		Campaign campaign2 = new Campaign();
		campaign2.setCampaignId(2);
		campaign2.setCampaignName("Bayram Kampanyasý");
		campaign2.setCampaignRate(10);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Campaign(campaign1);
		campaignManager.CampaignUpdate(campaign1);
		campaignManager.CampignRemove(campaign1);
		campaignManager.CampignApply(campaign2, game2, gamer1);
		campaignManager.Campaign(campaign2);
		campaignManager.CampaignUpdate(campaign2);
		campaignManager.CampignRemove(campaign2);
		campaignManager.CampignApply(campaign2, game1, gamer1);


	}
	
	
}
