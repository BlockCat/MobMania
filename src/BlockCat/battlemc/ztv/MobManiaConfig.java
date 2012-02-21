package BlockCat.battlemc.ztv;

import org.bukkit.configuration.file.FileConfiguration;

public class MobManiaConfig {

	MobMania plugin;
	
	
	public MobManiaConfig(MobMania mm){
		plugin = mm;
	}
	
	public void loadConfig(){
		final FileConfiguration config  = plugin.getConfig();
		config.options().header("MobMania configuration");
		
		config.addDefault("Mobs.attack each other", true);
		mobattackeachother = config.getBoolean("Mobs.attack each other" , true);
		
		config.addDefault("Mobs.catch.blaze.min health", 10);
		config.addDefault("Mobs.catch.blaze.chance", 50);
		catchBlazeMinHealth = config.getInt("Mobs.catch.blaze.min health", 10);
		catchBlazeChance = config.getInt("Mobs.catch.blaze.chance", 50);
		
		config.addDefault("Mobs.catch.cave spider.min health", 10);
		config.addDefault("Mobs.catch.cave spider.chance", 50);
		catchCaveSpiderMinHealth = config.getInt("Mobs.catch.cave spider.min health", 10);
		catchCaveSpiderChance = config.getInt("Mobs.catch.cave spider.chance", 50);
		
		config.addDefault("Mobs.catch.chicken.min health", 10);
		config.addDefault("Mobs.catch.chicken.chance", 50);
		catchChickenMinHealth = config.getInt("Mobs.catch.chicken.min health", 10);
		catchChickenChance = config.getInt("Mobs.catch.chicken.chance", 50);
		
		config.addDefault("Mobs.catch.cow.min health", 10);
		config.addDefault("Mobs.catch.cow.chance", 50);
		catchCowMinHealth = config.getInt("Mobs.catch.cow.min health", 10);
		catchCowChance = config.getInt("Mobs.catch.cow.chance", 50);
		
		config.addDefault("Mobs.catch.creeper.min health", 10);
		config.addDefault("Mobs.catch.creeper.chance", 50);
		catchCreeperMinHealth = config.getInt("Mobs.catch.creeper.min health", 10);
		catchCreeperChance = config.getInt("Mobs.catch.creeper.chance", 50);
		
		config.addDefault("Mobs.catch.enderman.min health", 10);
		config.addDefault("Mobs.catch.enderman.chance", 50);
		catchEndermanMinHealth = config.getInt("Mobs.catch.enderman.min health", 10);
		catchEndermanChance = config.getInt("Mobs.catch.enderman.chance", 50);
		
		config.addDefault("Mobs.catch.ghast.min health", 10);
		config.addDefault("Mobs.catch.ghast.chance", 50);
		catchGhastMinHealth = config.getInt("Mobs.catch.ghast.min health", 10);
		catchGhastChance = config.getInt("Mobs.catch.ghast.chance", 50);
		
		config.addDefault("Mobs.catch.magma cube.min health", 10);
		config.addDefault("Mobs.catch.magma cube.chance", 50);
		catchMagmacubeMinHealth = config.getInt("Mobs.catch.magma cube.min health", 10);
		catchMagmacubeChance = config.getInt("Mobs.catch.magma cube.chance", 50);
		
		config.addDefault("Mobs.catch.mooshroom.min health", 10);
		config.addDefault("Mobs.catch.mooshroom.chance", 50);
		catchMooshroomMinHealth = config.getInt("Mobs.catch.mooshroom.min health", 10);
		catchMooshroomChance = config.getInt("Mobs.catch.mooshroom.chance", 50);
		
		config.addDefault("Mobs.catch.pigzombie.min health", 10);
		config.addDefault("Mobs.catch.pigzombie.chance", 50);
		catchPigzombieMinHealth = config.getInt("Mobs.catch.pigzombie.min health", 10);
		catchPigzombieChance = config.getInt("Mobs.catch.pigzombie.chance", 50);
		
		config.addDefault("Mobs.catch.sheep.min health", 10);
		config.addDefault("Mobs.catch.sheep.chance", 50);
		catchSheepMinHealth = config.getInt("Mobs.catch.sheep.min health", 10);
		catchSheepChance = config.getInt("Mobs.catch.sheep.chance", 50);
		
		config.addDefault("Mobs.catch.silver fish.min health", 10);
		config.addDefault("Mobs.catch.silver fish.chance", 50);
		catchSilverFishMinHealth = config.getInt("Mobs.catch.silver fish.min health", 10);
		catchSilverFishChance = config.getInt("Mobs.catch.silver fish.chance", 50);
		
		config.addDefault("Mobs.catch.skeleton.min health", 10);
		config.addDefault("Mobs.catch.skeleton.chance", 50);
		catchSkeletonMinHealth = config.getInt("Mobs.catch.skeleton.min health", 10);
		catchSkeletonChance = config.getInt("Mobs.catch.skeleton.chance", 50);
		
		config.addDefault("Mobs.catch.slime.min health", 10);
		config.addDefault("Mobs.catch.slime.chance", 50);
		catchSlimeMinHealth = config.getInt("Mobs.catch.slime.min health", 10);
		catchSlimeChance = config.getInt("Mobs.catch.slime.chance", 50);
		
		config.addDefault("Mobs.catch.spider.min health", 10);
		config.addDefault("Mobs.catch.spider.chance", 50);
		catchSpiderMinHealth = config.getInt("Mobs.catch.spider.min health", 10);
		catchSpiderChance = config.getInt("Mobs.catch.spider.chance", 50);
		
		config.addDefault("Mobs.catch.squid.min health", 10);
		config.addDefault("Mobs.catch.squid.chance", 50);
		catchSquidMinHealth = config.getInt("Mobs.catch.squid.min health", 10);
		catchSquidChance = config.getInt("Mobs.catch.squid.chance", 50);
		
		config.addDefault("Mobs.catch.villager.min health", 10);
		config.addDefault("Mobs.catch.villager.chance", 50);
		catchVillagerMinHealth = config.getInt("Mobs.catch.villager.min health", 10);
		catchVillagerChance = config.getInt("Mobs.catch.villager.chance", 50);
		
		config.addDefault("Mobs.catch.wolf.min health", 10);
		config.addDefault("Mobs.catch.wolf.chance", 50);
		catchWolfMinHealth = config.getInt("Mobs.catch.wolf.min health", 10);
		catchWolfChance = config.getInt("Mobs.catch.wolf.chance", 50);
		
		config.addDefault("Mobs.catch.zombie.min health", 10);
		config.addDefault("Mobs.catch.zombie.chance", 50);
		catchZombieMinHealth = config.getInt("Mobs.catch.zombie.min health", 10);
		catchZombieChance = config.getInt("Mobs.catch.zombie.chance", 50);
		
		config.addDefault("Mobs.catch.pig.min health", 10);
		config.addDefault("Mobs.catch.pig.chance", 50);
		catchPigMinHealth = config.getInt("Mobs.catch.pig.min health", 10);
		catchPigChance = config.getInt("Mobs.catch.pig.chance", 50);
		
		config.addDefault("Mobs.snowman.damage", 1.5);
		snowMandamage  = (int) (config.getDouble("Mobs.snowman.damage" , 1.5) * 2);
		
	    config.options().copyDefaults(true);
	    plugin.saveConfig();
		
		}
	
	public static boolean mobattackeachother;
	
	public static int catchBlazeMinHealth;
	public static int catchBlazeChance;
	
	public static int catchCaveSpiderMinHealth;
	public static int catchCaveSpiderChance;
	
	public static int catchChickenMinHealth;
	public static int catchChickenChance;
	
	public static int catchCowMinHealth;
	public static int catchCowChance;
	
	public static int catchCreeperMinHealth;
	public static int catchCreeperChance;
	
	public static int catchEndermanMinHealth;
	public static int catchEndermanChance;
	
	public static int catchGhastMinHealth;
	public static int catchGhastChance;
	
	public static int catchMagmacubeMinHealth;
	public static int catchMagmacubeChance;
	
	public static int catchMooshroomMinHealth;
	public static int catchMooshroomChance;
	
	public static int catchPigMinHealth;
	public static int catchPigChance;
	
	public static int catchPigzombieMinHealth;
	public static int catchPigzombieChance;
	
	public static int catchSheepMinHealth;
	public static int catchSheepChance;
	
	public static int catchSilverFishMinHealth;
	public static int catchSilverFishChance;
	
	public static int catchSkeletonMinHealth;
	public static int catchSkeletonChance;
	
	public static int catchSlimeMinHealth;
	public static int catchSlimeChance;
	
	public static int catchSpiderMinHealth;
	public static int catchSpiderChance;
	
	public static int catchSquidMinHealth;
	public static int catchSquidChance;
	
	public static int catchVillagerMinHealth;
	public static int catchVillagerChance;
	
	public static int catchWolfMinHealth;
	public static int catchWolfChance;
	
	public static int catchZombieMinHealth;
	public static int catchZombieChance;
	
	public static int snowMandamage;

	
	
}
