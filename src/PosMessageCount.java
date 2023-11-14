public class PosMessageCount implements VisitorInterface {
	
	private float posMessage = 0;
	private Message messageTracker = new Message();

	@Override
	public void visitUser(User user) {
		posMessage = messageTracker.CalculatePosTweet();
	}

	@Override
	public void visitGroup(UserGroup group) { }
	
	public float getPosMessage() {
		return posMessage;
	}

}
