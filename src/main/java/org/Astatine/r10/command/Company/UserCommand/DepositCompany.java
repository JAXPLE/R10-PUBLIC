package org.Astatine.r10.Command.Company.UserCommand;

import org.Astatine.r10.Command.CommandRegister;
import org.Astatine.r10.Command.GlobalCommandHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class DepositCompany extends CommandRegister {

    public DepositCompany() {
        super(GlobalCommandHandler.DEPOSIT_COMPANY);
    }

    @Override
    public boolean onCommand(final @NotNull CommandSender sender,
                             final @NotNull Command command,
                             final @NotNull String label,
                             final @NotNull String[] args) {

        return true;
    }
}
