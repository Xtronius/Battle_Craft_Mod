package mod.xtronius.bc_mod.util;

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

public class DamageSource_BC
{
    public static DamageSource_BC inFire = (new DamageSource_BC("inFire")).setFireDamage();
    public static DamageSource_BC onFire = (new DamageSource_BC("onFire")).setDamageBypassesArmor().setFireDamage();
    public static DamageSource_BC lava = (new DamageSource_BC("lava")).setFireDamage();
    public static DamageSource_BC inWall = (new DamageSource_BC("inWall")).setDamageBypassesArmor();
    public static DamageSource_BC drown = (new DamageSource_BC("drown")).setDamageBypassesArmor();
    public static DamageSource_BC starve = (new DamageSource_BC("starve")).setDamageBypassesArmor();
    public static DamageSource_BC cactus = new DamageSource_BC("cactus");
    public static DamageSource_BC fall = (new DamageSource_BC("fall")).setDamageBypassesArmor();
    public static DamageSource_BC outOfWorld = (new DamageSource_BC("outOfWorld")).setDamageBypassesArmor().setDamageAllowedInCreativeMode();
    public static DamageSource_BC generic = (new DamageSource_BC("generic")).setDamageBypassesArmor();
    public static DamageSource_BC magic = (new DamageSource_BC("magic")).setDamageBypassesArmor().setMagicDamage();
    public static DamageSource_BC wither = (new DamageSource_BC("wither")).setDamageBypassesArmor();
    public static DamageSource_BC anvil = new DamageSource_BC("anvil");
    public static DamageSource_BC fallingBlock = new DamageSource_BC("fallingBlock");

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

   
  

    /**
     * returns EntityDamageSourceIndirect of an arrow
     */
    public static DamageSource causeMageDamage(mod.xtronius.bc_mod.entity.projectile.EntityBaseMagic enitityBaseMagic, Entity par1Entity)
    {
        return (new EntityDamageSourceIndirect("arrow", enitityBaseMagic, par1Entity)).setProjectile();
    }

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
    public DamageSource_BC setProjectile()
    {
        this.projectile = true;
        return this;
    }

    public boolean isExplosion()
    {
        return this.explosion;
    }

    public DamageSource_BC setExplosion()
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

    protected DamageSource_BC(String par1Str)
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

    protected DamageSource_BC setDamageBypassesArmor()
    {
        this.isUnblockable = true;
        this.hungerDamage = 0.0F;
        return this;
    }

    protected DamageSource_BC setDamageAllowedInCreativeMode()
    {
        this.isDamageAllowedInCreativeMode = true;
        return this;
    }

    /**
     * Define the damage type as fire based.
     */
    protected DamageSource_BC setFireDamage()
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
    public DamageSource_BC setDifficultyScaled()
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
    public DamageSource_BC setMagicDamage()
    {
        this.magicDamage = true;
        return this;
    }
}
