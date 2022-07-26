package InterfacePack;

public class WindowsFactory implements Factory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public List createList() {
		// TODO Auto-generated method stub
		return new WindowsList();
	}

}
