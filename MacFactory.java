package InterfacePack;

public class MacFactory implements Factory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public List createList() {
		// TODO Auto-generated method stub
		return new MacList();
	}

}
