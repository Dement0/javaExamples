public class EventKeyboard extends Event {
	
	// Fields
	private int keyboardCode;
	private int modificatorState;
	
	// Constructors
	public EventKeyboard() {
		this(500, "-", 600, 0);
	}
	
	public EventKeyboard(int eventId, String eventDescription, int keyboardCode, int modificatorState) {
		super(eventId, eventDescription);
		this.keyboardCode = keyboardCode;
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
	@Override
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	@Override
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	@Override
	public int getEventId() {
		return this.eventId;
	}
	
	@Override
	public String getEventDescription() {
		return this.eventDescription;
	}

	
	// Utilities
	@Override
	public String toString() {
		return ("Event id: " + this.getEventId() + ", Event Description: " + getEventDescription() + ", Keyboard code: " + this.getKeyboardCode() + ", Modificator state: " + this.getModificatorState());
	}
}
