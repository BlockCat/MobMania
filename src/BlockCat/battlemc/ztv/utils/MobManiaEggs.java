package BlockCat.battlemc.ztv.utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;

import BlockCat.battlemc.ztv.MobManiaConfig;

public class MobManiaEggs {

	MobManiaChances mmc = new MobManiaChances();

	public void Blaze (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.Blaze") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Blaze){
					int mindamage = MobManiaConfig.catchBlazeMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchBlazeChance;

						if(mmc.chance(chance)){
							Location Blazeloc = target.getLocation();
							target.getWorld().dropItemNaturally(Blazeloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 61));
							target.remove();
						}
						else{
							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void CaveSpider (Projectile projectile ){

		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.cavespider") || ((Player) shooter).hasPermission("MobMania.catch.*")){
				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof CaveSpider){
					int mindamage = MobManiaConfig.catchCaveSpiderMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchCaveSpiderChance;

						if(mmc.chance(chance)){
							Location caveSpiderloc = target.getLocation();
							target.getWorld().dropItemNaturally(caveSpiderloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 59));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Chicken (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.chicken") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Chicken){
					int mindamage = MobManiaConfig.catchChickenMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchChickenChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 93));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Cow (Projectile projectile ){

		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.cow") || ((Player) shooter).hasPermission("MobMania.catch.*")){
				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Cow && !(target instanceof MushroomCow)){
					int mindamage = MobManiaConfig.catchCowMinHealth;

					if(((Cow) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchCowChance;

						if(mmc.chance(chance)){
							Location Cowloc = target.getLocation();
							target.getWorld().dropItemNaturally(Cowloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 92));
							target.remove();
						}
						else{
							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Creeper (Projectile projectile ){

		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.creeper") || ((Player) shooter).hasPermission("MobMania.catch.*")){
				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Creeper){
					int mindamage = MobManiaConfig.catchCreeperMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchCreeperChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 50));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Enderman (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.enderman") || ((Player) shooter).hasPermission("MobMania.catch.*")){		

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Enderman){
					int mindamage = MobManiaConfig.catchEndermanMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchEndermanChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 58));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Ghast (Projectile projectile ){

		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.ghast") || ((Player) shooter).hasPermission("MobMania.catch.*")){
				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Ghast){
					int mindamage = MobManiaConfig.catchGhastMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchGhastChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 56));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void MagmaCube (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.magmacube") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof MagmaCube){
					int mindamage = MobManiaConfig.catchMagmacubeMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchMagmacubeChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 62));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Mooshroom (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.mooshroom") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof MushroomCow){
					int mindamage = MobManiaConfig.catchMooshroomMinHealth;

					if(((Cow) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchMooshroomChance;

						if(mmc.chance(chance)){
							Location Cowloc = target.getLocation();
							target.getWorld().dropItemNaturally(Cowloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 96));
							target.remove();
						}
						else{
							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Pigman (Projectile projectile ){

		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.pigman") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof PigZombie){
					int mindamage = MobManiaConfig.catchPigzombieMinHealth;

					if(((Cow) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchPigzombieChance;

						if(mmc.chance(chance)){
							Location Cowloc = target.getLocation();
							target.getWorld().dropItemNaturally(Cowloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 57));
							target.remove();
						}
						else{
							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Sheep (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.sheep") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Sheep){
					int mindamage = MobManiaConfig.catchSheepMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchSheepChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 91));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void SilverFish (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.silverfish") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Silverfish){
					int mindamage = MobManiaConfig.catchSilverFishMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchSilverFishChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 60));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Skeleton (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.skeleton") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Skeleton){
					int mindamage = MobManiaConfig.catchSkeletonMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchSkeletonChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 51));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Slime(Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.slime") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Slime){
					int mindamage = MobManiaConfig.catchSlimeMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchSlimeChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 55));
							target.remove();
						}
						else{
							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Spider(Projectile projectile ){

		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.spider") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Spider && !(target instanceof CaveSpider)){
					int mindamage = MobManiaConfig.catchSpiderMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchSpiderChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 52));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Squid(Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.squid") || ((Player) shooter).hasPermission("MobMania.catch.*")){
				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Squid){
					int mindamage = MobManiaConfig.catchSquidMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchSquidChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 94));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Villager(Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.villager") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Villager){
					int mindamage = MobManiaConfig.catchVillagerMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchVillagerChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 120));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Wolf(Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.wolf") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Wolf){
					int mindamage = MobManiaConfig.catchWolfMinHealth;

					if(((Creature) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchWolfChance;

						if(mmc.chance(chance)){
							Location entityloc = target.getLocation();
							target.getWorld().dropItemNaturally(entityloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 95));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Zombie(Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.zombie") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Zombie){
					int mindamage = MobManiaConfig.catchZombieMinHealth;

					if(((Zombie) target).getHealth() < mindamage){
						int chance = MobManiaConfig.catchZombieChance;

						if(mmc.chance(chance)){
							Location zomloc = target.getLocation();
							target.getWorld().dropItemNaturally(zomloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 54));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}

	public void Pig (Projectile projectile ){
		Entity shooter = projectile.getShooter();

		if(shooter instanceof Player){

			if(((Player) shooter).hasPermission("MobMania.catch.pig") || ((Player) shooter).hasPermission("MobMania.catch.*")){

				Entity target = projectile.getNearbyEntities(1, 2, 1).get(0);

				if(target instanceof Pig){
					int mindamage = MobManiaConfig.catchPigMinHealth;

					if(((Pig) target).getHealth()< mindamage){
						int chance = MobManiaConfig.catchPigChance;

						if(mmc.chance(chance)){
							Location pigloc = target.getLocation();
							target.getWorld().dropItemNaturally(pigloc, new ItemStack(Material.MONSTER_EGG, 1, (short) 0, (byte) 90));
							target.remove();
						}
						else{

							((Player) shooter).sendMessage("You did not catch him!");
						}
					}
				}
			}
		}
	}




}
