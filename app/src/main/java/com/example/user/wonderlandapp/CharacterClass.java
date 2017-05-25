package com.example.user.wonderlandapp;

/**
 * Created by User on 12.01.2017.
 */

public class CharacterClass {
	private int id,
		reputation,
		health,
		money,
		might,
		magic,
		weaponProficieency,
		magicWeaponProficiency,
		spellAmount,
		abilityAmount,
		trickAmount,
		spellLimit,
		abilityLimit,
		trickLimit,
		field,
		inventory;
	private String name,
		description;

	public CharacterClass(int newid,
						  /*int newreputation,
						  int newhealth,
						  int newmoney,
						  int newmight,
						  int newmagic,
						  int newweaponProficieency,
						  int newmagicWeaponProficiency,
						  int newspellAmount,
						  int newabilityAmount,
						  int newtrickAmount,
						  int newspellLimit,
						  int newabilityLimit,
						  int newtrickLimit,
						  int newfield,
						  int newinventory,
						  String newname,*/
						  String newdescription
	) {
		id = newid;
/*        reputation = newreputation;
		health = newhealth;
		money = newmoney;
		might = newmight;
		magic = newmagic;
		weaponProficieency = newweaponProficieency;
		magicWeaponProficiency = newmagicWeaponProficiency;
		spellAmount = newspellAmount;
		abilityAmount = newabilityAmount;
		trickAmount = newtrickAmount;
		spellLimit = newspellLimit;
		abilityLimit = newabilityLimit;
		trickLimit = newtrickLimit;
		field = newfield;
		inventory = newinventory;
		name = newname;*/
		description = newdescription;
	}

}
