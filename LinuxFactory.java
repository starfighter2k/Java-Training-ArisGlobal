package InterfacePack;

public class LinuxFactory implements Factory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public List createList() {
		// TODO Auto-generated method stub
		return new LinuxList();
	}

}
