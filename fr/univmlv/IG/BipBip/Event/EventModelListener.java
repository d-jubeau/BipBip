package fr.univmlv.IG.BipBip.Event;

import java.util.List;

public interface EventModelListener {
	void eventsAdded(List<? extends Event> events);
	void eventAdded(Event event, int index);
	void eventRemoved(int index);
}
