package org.Astatine.r10.Command.UserCommand.Function;

import org.Astatine.r10.Command.CommandRegister;
import org.Astatine.r10.Command.GlobalCommandHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class OffHandItemSwapFunction extends CommandRegister {

    public OffHandItemSwapFunction() {
        super(GlobalCommandHandler.SWAP_HAND_TO_OFFHAND);
    }

    @Override
    public boolean onCommand(final @NotNull CommandSender commandSender,
                             final @NotNull Command command,
                             final @NotNull String s,
                             final @NotNull String[] strings) {

        Player player = (Player) commandSender;

        ItemStack mainHandItem = player.getInventory().getItemInMainHand().asOne();
        ItemStack offHandItem = player.getInventory().getItemInOffHand().asOne();

        player.getInventory().setItemInMainHand(offHandItem);
        player.getInventory().setItemInOffHand(mainHandItem);

        return true;
    }
}
