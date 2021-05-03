public class GamerManager implements GamerService{
	
	private CheckService _checkService;
	
	public GamerManager(CheckService _checkService) {
		this._checkService = _checkService;
	}

	@Override
	public void Register(Gamer gamer) {
		if(_checkService.CheckRealPerson(gamer)) {
			System.out.println("Hesap açýldý " + gamer.getFirstName());
		}
		else {
			System.out.println("Bilgi hatasý.");
		}
		
	}

	@Override
	public void Remove(Gamer gamer) {
		if(_checkService.CheckRealPerson(gamer)) {
			System.out.println("Hesap açýldý " + gamer.getFirstName());
		}
		else {
			System.out.println("Bilgi hatasý.");
		}
		
		
	}

	@Override
	public void Update(Gamer gamer) {
		if(_checkService.CheckRealPerson(gamer)) {
			System.out.println("Hesap açýldý " + gamer.getFirstName());
		}
		else {
			System.out.println("Bilgi hatasý.");
		}
		
		
	}
	

}
