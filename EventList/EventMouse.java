public class EventMouse extends Event {
	
	// Fields
	private int mousePositionX;
	private int mousePositionY;
	private int pressState;
	
	// Constructors
	public EventMouse() {
		this(500, "-", 0, 0, 0);
	}
	
	public EventMouse(int eventId, String eventDescription, int mousePositionX, int mousePositionY, int pressState) {
		super(eventId, eventDescription);
		this.mousePositionX = mousePositionX;
		this.mousePositionY = mousePositionY;
		this.pressState = pressState;
	}
	
	// Setters & Getters
	public void setMousePositionX(int mousePositionX) {
		this.mousePositionX = mousePositionX;
	}
	
	public void setMousePositionY(int mousePositionY) {
		this.mousePositionY = mousePositionY;
	}
	
	public void setPressState(int pressState) {
		this.pressState = pressState;
	}
	
	public int getMousePositionX() {
		return this.mousePositionX;
	}
	
	public int getMousePositionY() {
		return this.mousePositionY;
	}
	
	public int getPressState() {
		return this.pressState;
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
	public String toString() {
		return ("Event id: " + this.getEventId() + ", Event Description: " + getEventDescription() + ", X: " + this.getMousePositionX() + ", Y: " + this.getMousePositionY() + ", Press state: " + getPressState());
	}
}
