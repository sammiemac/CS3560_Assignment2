import java.util.ArrayList;

public class MessageCount implements VisitorInterface {
	
	private static int totalMessage = 0;

	@Override
	public void visitUser(User user) {
		totalMessage++;
	}

	@Override
	public void visitGroup(UserGroup group) { }
	
	public int getTotalMessage() {
		return totalMessage;
	}
	
	public void setTotalMessge(int total) {
		totalMessage = total;
	}

}
