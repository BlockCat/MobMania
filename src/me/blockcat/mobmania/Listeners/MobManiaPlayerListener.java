package me.blockcat.mobmania.Listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.util.Vector;

public class MobManiaPlayerListener implements Listener {

	public void onPlayerInteractEntity(PlayerInteractEntityEvent event)
	{
		Player player = event.getPlayer();
		Entity entity = event.getRightClicked();

		if(player.hasPermission("MobMania.fuzrohdah"))
			if(player.getItemInHand().getType() == Material.GOLD_AXE && entity instanceof Creature){
				Location pLoc = player.getLocation();
				pLoc.setPitch(pLoc.getPitch() - 20);
				Vector frd = pLoc.getDirection();
				frd.multiply(5D);
				entity.setVelocity(frd);

				player.sendMessage("Fuz roh dah!");
			}
		
		if(player.hasPermission("MobMania.ridemobs")){
			if(player.getItemInHand().getType() == Material.SADDLE && entity instanceof LivingEntity){
				entity.setPassenger(player);
				
			}
			
		}
	}

}
