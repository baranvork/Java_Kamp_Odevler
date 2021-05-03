
public class GameBuy implements GameBuyInter{

	@Override
	public void GameBuy(Gamer gamer, Games games) {
		System.out.println("Merhabalar " + gamer.getFirstName() + " Aldýðýnýz oyun: " + games.GameName);
		
	}

}
