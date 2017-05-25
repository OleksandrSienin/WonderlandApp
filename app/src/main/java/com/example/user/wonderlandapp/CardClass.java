package com.example.user.wonderlandapp;

/**
 * Created by User on 09.01.2017.
 */

public class CardClass {
	private int id;
	private String image;
	private String name;
	private String bonuses;
	private CardCategory category;
	private String description;

	public CardClass(int newid, String newimage, String newname, CardCategory newcategory, String newbonuses, String newdescription) {
		id = newid;
		image = newimage;
		name = newname;
		category = newcategory;
		bonuses = newbonuses;
		description = newdescription;
	}

	public int getId() {
		return id;
	}

	public String getImage() {
		return image;
	}

	public String getName() {
		return name;
	}

	public CardCategory getCategory() {
		return category;
	}

	public String getBonuses() {
		return bonuses;
	}

	public String getDescription() {
		return description;
	}

	public enum CardCategory {
		CHARACTER,
		SPELL,
		ABILITY,
		TRICK,
		SURPRISE,
		ATTACK,
		MEETING,
		FRIEND,
		ITEM,
		LOCATION
	}

	public enum CardInfluenceType {
		MIGHT,
		MAGIC,
		HEALTH,
		REPUTATION,
		GOLD,
		INITIALFIELD,
		INITIALINVENTORY,
		SPELLCONSTANT,
		SPELLLIMIT,
		ABILITYCONSTANT,
		ABILITYLIMIT,
		TRICKCONSTANT,
		TRICKLIMIT,
		CARD,
		CUBE,
		CHARACTER,
		STEAL,
		MIGHTWEAPONMASTERY,
		MAGICWEAPONMASTERY,
		SPELL,
		ABILITY,
		TRICK,
		SURPRISE
	}

}
