// Represents an Event generated from user in an OS

public abstract class Event() {
	
	// Fields
	protected int eventId;
	protected String eventDescription;
	
	// Constructors
	public Event() {
		this(500, 0);
	}
	
	public Event(int eventId, int eventDescription) {
		setEventId(eventId);
		setEventDescription(eventDescription);
	}
	
	// Setters & Getters
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	public int getEventId() {
		return this.eventId;
	}
	
	public string getEventDescription() {
		return this.eventDescription;
	}
	
	// Abstract methods
  // TODO
	
}
