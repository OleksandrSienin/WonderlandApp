package com.example.user.wonderlandapp;

/**
 * Created by User on 09.01.2017.
 */

public class CardClass {
    public enum CardType {
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

    public enum CardInfluenceType{
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
        MIGHTARMORLEVEL,
        MAGICARMORLEVEL,
        SPELL,
        ABILITY,
        TRICK,
        SURPRISE
    }

    private int id;
    private String name;
    private String features;
    private CardType category;
    private String description;

    public CardClass(int newid, String newname, CardType newcategory, String newfeatures, String newdescription){
id=newid;
        name=newname;
        category=newcategory;
        features=newfeatures;
        description=newdescription;

    }


/*    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }*/
}
