package BlockCat.battlemc.ztv;

import java.util.List;
import java.util.logging.Logger;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import BlockCat.battlemc.ztv.Listeners.MobManiaEntityListener;
import BlockCat.battlemc.ztv.Listeners.MobManiaPlayerListener;

public class MobMania extends JavaPlugin {

	private MobManiaPlayerListener playerListener = new MobManiaPlayerListener();
	private MobManiaEntityListener snowman = new MobManiaEntityListener();
	Logger log = Logger.getLogger("Minecraft");
	MobMania plugin = this;
	@Override
	public void onDisable() {
		log.info("[ZtV] Dissabled ! :(");

	}

	@Override
	public void onEnable() {
		log.info("[ZtV] Enabled :)");
		//registering events
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(this.snowman, this);
		pm.registerEvents(this.playerListener, this);

		//making a config.
		MobManiaConfig mmc = new MobManiaConfig(this);
		mmc.loadConfig();

		//setting up scheduler for mob-retargeting.

		if(mmc.mobattackeachother)
			this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
				public void run(){
					for(World w : plugin.getServer().getWorlds()){
						for(Entity e : plugin.getServer().getWorld(w.getName()).getEntities()){
							if(MobManiaConfig.mobattackeachother){
								MobMania.target(e);
								//plugin.getServer().broadcastMessage("seek update");
							}
						}
					}
				}
			}, 1L, 20L);


	}

	public static void target(Entity entity){
		Entity zombie = entity;
		zombie.getWorld();
		List<Entity> entities = zombie.getNearbyEntities(30, 30, 30);

		if(MobManiaConfig.mobattackeachother)
			if(zombie instanceof Monster){
				if(((Monster) zombie).getTarget() == null){
					for(Entity ent : entities) {
						if(ent instanceof LivingEntity && !(ent instanceof Player)) {
							if(ent.getLocation().distance(zombie.getLocation()) <= 5) {
								Monster att = (Monster) zombie;
								att.setTarget((LivingEntity) ent);
							}
						}
					}
				}
			}

	}

}
