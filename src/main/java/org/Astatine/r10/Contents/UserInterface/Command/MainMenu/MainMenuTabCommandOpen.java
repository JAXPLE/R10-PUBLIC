package org.Astatine.r10.Contents.UserInterface.Command.MainMenu;

import org.Astatine.r10.Command.CommandRegister;
import org.Astatine.r10.Command.GlobalCommandHandler;
import org.Astatine.r10.Contents.UserInterface.Menu.MainMenuUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MainMenuTabCommandOpen extends CommandRegister {

    public MainMenuTabCommandOpen() {
        super(GlobalCommandHandler.MAIN_MENU_TAB_OPEN);
    }

    @Override
    public boolean onCommand(final @NotNull CommandSender commandSender,
                             final @NotNull Command command,
                             final @NotNull String s,
                             final @NotNull String[] strings) {

        new MainMenuUI((Player) commandSender);
        return true;
    }
}
