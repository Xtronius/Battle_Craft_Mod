package mod.xtronius.bc_mod.util;

import mod.xtronius.bc_mod.entity.projectile.EntityBaseMagic;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.Explosion;

public class BCDamageSource{

	
	public static BCDamageSource waterBolt = (new BCDamageSource("inFire"));

    /** This kind of damage can be blocked or not. */
    private boolean isUnblockable;
    private boolean isDamageAllowedInCreativeMode;
    private float hungerDamage = 0.3F;

    /** This kind of damage is based on fire or not. */
    private boolean fireDamage;

    /** This kind of damage is based on a projectile or not. */
    private boolean projectile;

    /**
     * Whether this damage source will have its damage amount scaled based on the current difficulty.
     */
    private boolean difficultyScaled;
    private boolean magicDamage;
    private boolean explosion;
    public String damageType;

    public static DamageSource causeWaterBoltDamage(EntityBaseMagic par0EntityBaseMagic)
    {
        return new EntityDamageSource("mob", par0EntityBaseMagic);
    }

//    /**
//     * returns an EntityDamageSource of type player
//     */
//    public static DamageSource causePlayerDamage(EntityPlayer par0EntityPlayer)
//    {
//        return new EntityDamageSource("player", par0EntityPlayer);
//    }
//
    /**
     * returns EntityDamageSourceIndirect of an arrow
     */
    public static DamageSource causeWaterBoltDamage(EntityBaseMagic par0EntityBaseMagic, Entity par1Entity)
    {
        return (new EntityDamageSourceIndirect("waterBolt", par0EntityBaseMagic, par1Entity)).setProjectile();
    }
//
//    /**
//     * returns EntityDamageSourceIndirect of a fireball
//     */
//    public static DamageSource causeFireballDamage(EntityFireball par0EntityFireball, Entity par1Entity)
//    {
//        return par1Entity == null ? (new EntityDamageSourceIndirect("onFire", par0EntityFireball, par0EntityFireball)).setFireDamage().setProjectile() : (new EntityDamageSourceIndirect("fireball", par0EntityFireball, par1Entity)).setFireDamage().setProjectile();
//    }
//
//    public static DamageSource causeThrownDamage(Entity par0Entity, Entity par1Entity)
//    {
//        return (new EntityDamageSourceIndirect("thrown", par0Entity, par1Entity)).setProjectile();
//    }
//
//    public static DamageSource causeIndirectMagicDamage(Entity par0Entity, Entity par1Entity)
//    {
//        return (new EntityDamageSourceIndirect("indirectMagic", par0Entity, par1Entity)).setDamageBypassesArmor().setMagicDamage();
//    }
//
//    /**
//     * Returns the EntityDamageSource of the Thorns enchantment
//     */
//    public static DamageSource causeThornsDamage(Entity par0Entity)
//    {
//        return (new EntityDamageSource("thorns", par0Entity)).setMagicDamage();
//    }
//
//    public static DamageSource setExplosionSource(Explosion par0Explosion)
//    {
//        return par0Explosion != null && par0Explosion.getExplosivePlacedBy() != null ? (new EntityDamageSource("explosion.player", par0Explosion.getExplosivePlacedBy())).setDifficultyScaled().setExplosion() : (new DamageSource("explosion")).setDifficultyScaled().setExplosion();
//    }

    /**
     * Returns true if the damage is projectile based.
     */
    public boolean isProjectile()
    {
        return this.projectile;
    }

    /**
     * Define the damage type as projectile based.
     */
    public BCDamageSource setProjectile()
    {
        this.projectile = true;
        return this;
    }

    public boolean isExplosion()
    {
        return this.explosion;
    }

    public BCDamageSource setExplosion()
    {
        this.explosion = true;
        return this;
    }

    public boolean isUnblockable()
    {
        return this.isUnblockable;
    }

    /**
     * How much satiate(food) is consumed by this DamageSource
     */
    public float getHungerDamage()
    {
        return this.hungerDamage;
    }

    public boolean canHarmInCreative()
    {
        return this.isDamageAllowedInCreativeMode;
    }

    protected BCDamageSource(String par1Str)
    {
        this.damageType = par1Str;
    }

    public Entity getSourceOfDamage()
    {
        return this.getEntity();
    }

    public Entity getEntity()
    {
        return null;
    }

    protected BCDamageSource setDamageBypassesArmor()
    {
        this.isUnblockable = true;
        this.hungerDamage = 0.0F;
        return this;
    }

    protected BCDamageSource setDamageAllowedInCreativeMode()
    {
        this.isDamageAllowedInCreativeMode = true;
        return this;
    }

    /**
     * Define the damage type as fire based.
     */
    protected BCDamageSource setFireDamage()
    {
        this.fireDamage = true;
        return this;
    }

    /**
     * Returns the message to be displayed on player death.
     */
    public ChatMessageComponent getDeathMessage(EntityLivingBase par1EntityLivingBase)
    {
        EntityLivingBase entitylivingbase1 = par1EntityLivingBase.func_94060_bK();
        String s = "death.attack." + this.damageType;
        String s1 = s + ".player";
        return entitylivingbase1 != null && StatCollector.func_94522_b(s1) ? ChatMessageComponent.createFromTranslationWithSubstitutions(s1, new Object[] {par1EntityLivingBase.getTranslatedEntityName(), entitylivingbase1.getTranslatedEntityName()}): ChatMessageComponent.createFromTranslationWithSubstitutions(s, new Object[] {par1EntityLivingBase.getTranslatedEntityName()});
    }

    /**
     * Returns true if the damage is fire based.
     */
    public boolean isFireDamage()
    {
        return this.fireDamage;
    }

    /**
     * Return the name of damage type.
     */
    public String getDamageType()
    {
        return this.damageType;
    }

    /**
     * Set whether this damage source will have its damage amount scaled based on the current difficulty.
     */
    public BCDamageSource setDifficultyScaled()
    {
        this.difficultyScaled = true;
        return this;
    }

    /**
     * Return whether this damage source will have its damage amount scaled based on the current difficulty.
     */
    public boolean isDifficultyScaled()
    {
        return this.difficultyScaled;
    }

    /**
     * Returns true if the damage is magic based.
     */
    public boolean isMagicDamage()
    {
        return this.magicDamage;
    }

    /**
     * Define the damage type as magic based.
     */
    public BCDamageSource setMagicDamage()
    {
        this.magicDamage = true;
        return this;
    }
}
