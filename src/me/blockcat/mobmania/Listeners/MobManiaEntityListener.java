package me.blockcat.mobmania.Listeners;

import java.util.List;

import me.blockcat.mobmania.MobManiaConfig;
import me.blockcat.mobmania.utils.MobManiaEggs;

import org.bukkit.World;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;


//little change:
//was first:
//public class MobManiaEntityListenr extends EntityListener
public class MobManiaEntityListener implements Listener {

	public void onProjectileHit(ProjectileHitEvent event){
		Projectile projectile = (Projectile) event.getEntity();
		Entity Shooter = projectile.getShooter();

		if(Shooter instanceof Player && projectile instanceof Egg){			
			try{
				MobManiaEggs catchit = new MobManiaEggs();

				catchit.Blaze(projectile);
				catchit.CaveSpider(projectile);
				catchit.Chicken(projectile);
				catchit.Cow(projectile);
				catchit.Creeper(projectile);
				catchit.Enderman(projectile);
				catchit.Ghast(projectile);
				catchit.MagmaCube(projectile);
				catchit.Mooshroom(projectile);
				catchit.Pig(projectile);
				catchit.Pigman(projectile);
				catchit.Sheep(projectile);
				catchit.SilverFish(projectile);
				catchit.Skeleton(projectile);
				catchit.Slime(projectile);
				catchit.Spider(projectile);
				catchit.Squid(projectile);
				catchit.Villager(projectile);
				catchit.Wolf(projectile);				
				catchit.Zombie(projectile);
				
			}
			catch(Exception e){}
		}


		if(Shooter instanceof Snowman){
			try{
				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);
				if(target instanceof LivingEntity){
					int damage = MobManiaConfig.snowMandamage;
					((LivingEntity) target).damage(damage);
				}

			}
			catch(Exception e){}
		}

	}
	
	
	public void onEntityDeath(EntityDeathEvent event)
	{
		LivingEntity Villager = (LivingEntity) event.getEntity();

		World world = Villager.getWorld();

		if(Villager instanceof Villager ){
			world.spawnCreature(Villager.getLocation(), CreatureType.ZOMBIE);
		}


		try{
			Entity zombie = Villager.getKiller();
			List<Entity> entities = zombie.getNearbyEntities(30, 30, 30);
			if(zombie instanceof Monster)
				for(Entity ent : entities) {
					if(ent instanceof LivingEntity && !(ent instanceof Player)) {
						if(ent.getLocation().distance(zombie.getLocation()) <= 5) {
							Monster att = (Monster) zombie;
							att.setTarget((LivingEntity) ent);
						}
					}
				}
			if(zombie instanceof Snowman)
				for(Entity ent : entities) {
					if(ent instanceof LivingEntity && !(ent instanceof Player)) {
						if(ent.getLocation().distance(zombie.getLocation()) <= 5) {
							Snowman att = (Snowman) zombie;
							//if(ent instanceof Snowman)
							att.setTarget((LivingEntity) ent);

						}
					}
				}

		}catch(Exception e){}

	}


}
