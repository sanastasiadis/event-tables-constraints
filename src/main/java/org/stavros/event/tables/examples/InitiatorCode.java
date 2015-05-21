package org.stavros.event.tables.examples;

import java.util.ArrayList;
import java.util.List;

import org.stavros.event.tables.Initiator;
import org.stavros.event.tables.model.Guest;
import org.stavros.event.tables.model.Table;
import org.stavros.event.tables.model.constraints.Avoid;
import org.stavros.event.tables.model.constraints.AvoidPlacement;
import org.stavros.event.tables.model.constraints.Follow;
import org.stavros.event.tables.model.constraints.ForcePlacement;

public class InitiatorCode extends Initiator {
	
	private int customNumberOfTables;
	public void setCustomNumberOfTables(int customNumberOfTables) {
		this.customNumberOfTables = customNumberOfTables;
	}
	public int getCustomNumberOfTables() {
		return this.customNumberOfTables;
	}
	
	private int customNumberOfGuests;
	public void setCustomNumberOfGuests(int customNumberOfGuests) {
		this.customNumberOfGuests = customNumberOfGuests;
	}
	public int getCustomNumberOfGuests() {
		return this.customNumberOfGuests;
	}
	
	private int customNumberOfSeatsPerTable;
	public void setCustomNumberOfSeatsPerTable(int customNumberOfSeatsPerTable) {
		this.customNumberOfSeatsPerTable = customNumberOfSeatsPerTable;
	}
	public int getCustomNumberOfSeatsPerTable() {
		return this.customNumberOfSeatsPerTable;
	}
	
	@Override
	protected List<Table> getTablesDefinitions() {
		List<Table> tables = new ArrayList<>();
		for (int i=0; i<getCustomNumberOfTables(); i++) {
			tables.add(new Table("table"+(i+1), getCustomNumberOfSeatsPerTable()));
		}
		return tables;
	}
	@Override
	protected Guest[] getGuestsDefinitions() {
		Guest[] guests = new Guest[getCustomNumberOfGuests()];
		for (int i=0; i<getCustomNumberOfGuests(); i++) {
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
	
	@Override
	protected List<AvoidPlacement> getAvoidPlacements() {
		List<AvoidPlacement> avoidPlacements = new ArrayList<>();
		avoidPlacements.add(new AvoidPlacement(97, "table1"));
		avoidPlacements.add(new AvoidPlacement(97, "table2"));
		avoidPlacements.add(new AvoidPlacement(97, "table4"));
		avoidPlacements.add(new AvoidPlacement(97, "table5"));
		avoidPlacements.add(new AvoidPlacement(97, "table6"));
		avoidPlacements.add(new AvoidPlacement(97, "table7"));
		avoidPlacements.add(new AvoidPlacement(97, "table8"));
		avoidPlacements.add(new AvoidPlacement(97, "table9"));
		avoidPlacements.add(new AvoidPlacement(97, "table10"));
		return avoidPlacements;
	}
	
	@Override
	protected List<ForcePlacement> getForcePlacements() {
		List<ForcePlacement> forcePlacements = new ArrayList<>();
		forcePlacements.add(new ForcePlacement(96, "table1"));
		return forcePlacements;
	}
}
