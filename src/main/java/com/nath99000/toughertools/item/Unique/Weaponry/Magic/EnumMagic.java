package com.nath99000.toughertools.item.Unique.Weaponry.Magic;

public enum EnumMagic {
   Spectator("spectator"), Rain("rain"), Null("null"), Shout("shout"), Heal("Heal"), Juggernaut("Juggernaut"), Diffuse("Diffuse"), Whirlwind("Whirlwind"), Disorient("Disorient"), Fireball("Fireball"), Wither("Wither"),
    Burst("Burst"), ReBurst("ReBurst"), Explode("Explosion"), Sunlight("Sunlight"), Moonlight("Moonlight"), Ender("Ender");

    private String spell;

    private EnumMagic(String spellname){
        this.spell = spellname;
    }
}
