package interfaces;

import healers.potions.Potion;
import player.Player;

public interface IHeal {
    void heal(Player player, Potion potion);
}
