package no.progark.a18.towerdefence.level;

import no.progark.a18.towerdefence.gameContent.TowerdefenceSprite;

public interface ReatchedTargetListener {
	
	/**
	 * Callback method for sprites that hass reatched there goal.
	 * @param sprite the sprite tat has reatched its final target.
	 */
	public void reatchedtTargt(TowerdefenceSprite sprite);

}
