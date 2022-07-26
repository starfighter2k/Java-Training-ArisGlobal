
public class StkException extends Exception {
	private String errmsg;
	public StkException(String msg)
	{
		this.errmsg = msg;
	}
	@Override
	public String toString() {
		return "Error ="+this.errmsg;
	}
	
}
