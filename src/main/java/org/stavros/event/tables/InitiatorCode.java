package org.stavros.event.tables;

import java.util.ArrayList;
import java.util.List;

import org.stavros.event.tables.model.Avoid;
import org.stavros.event.tables.model.Follow;
import org.stavros.event.tables.model.Guest;
import org.stavros.event.tables.model.Table;

public class InitiatorCode extends Initiator {
	@Override
	protected List<Table> getTablesDefinitions(int numberOfTables, int numberOfSeatsPerTable) {
		List<Table> tables = new ArrayList<>();
		for (int i=0; i<numberOfTables; i++) {
			tables.add(new Table("table"+(i+1), numberOfSeatsPerTable));
		}
		return tables;
	}
	@Override
	protected Guest[] getGuestsDefinitions(int numberOfGuests) {
		Guest[] guests = new Guest[numberOfGuests];
		for (int i=0; i<numberOfGuests; i++) {
			guests[i] = new Guest(i, "guestName_"+(i+1));
		}
		return guests;
	}
	@Override
	protected List<Avoid> getAvoids() {
		List<Avoid> avoids = new ArrayList<>();
		avoids.add(new Avoid(0, 1));
		avoids.add(new Avoid(10, 11));
		avoids.add(new Avoid(20, 21));
		avoids.add(new Avoid(30, 31));
		avoids.add(new Avoid(40, 41));
		avoids.add(new Avoid(50, 51));
		avoids.add(new Avoid(60, 61));
		avoids.add(new Avoid(70, 71));
		avoids.add(new Avoid(80, 81));
		avoids.add(new Avoid(90, 91));
		return avoids;
	}
	@Override
	protected List<Follow> getFollows() {
		List<Follow> follows = new ArrayList<>();
		follows.add(new Follow(5, 6));
		follows.add(new Follow(15, 16));
		follows.add(new Follow(25, 26));
		follows.add(new Follow(35, 36));
		follows.add(new Follow(45, 46));
		follows.add(new Follow(55, 56));
		follows.add(new Follow(65, 66));
		follows.add(new Follow(75, 76));
		follows.add(new Follow(85, 86));
		follows.add(new Follow(95, 96));
		return follows;
	}
}
