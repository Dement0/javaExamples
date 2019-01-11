public class EventKeyboard extends Event {
	
	// Fields
	private int keyboardCode;
	private int modificatorState;
	
	// Constructors
	public EventKeyboard() {
		super();
		this(600, 0);
	}
	
	public EventKeyboard(int eventId, String eventDescription, int keyboardCode, int modificatorState) {
		super(eventId, eventDescription);
		this.keyboardCode = keyboardCode
		this.modificatorState = modificatorState;
	}
	
	// Setters & Getters
	public void setKeyboardCode(int keyboardCode) {
		this.keyboardCode = keyboardCode;
	}
	
	public void setModificatorState(int modificatorState) {
		this.modificatorState = modificatorState;
	}
	
	public int getKeyboardCode() {
		return this.keyboardCode;
	}
	
	public int getModificatorState() {
		return this.modificatorState;
	}
	
	// Methods
	
	// Utilities
}
