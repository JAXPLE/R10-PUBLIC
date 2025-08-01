package org.Astatine.r10.Command.Company.UserCommand;

import org.Astatine.r10.Command.CommandRegister;
import org.Astatine.r10.Command.GlobalCommandHandler;
import org.Astatine.r10.Data.Company.CompanyData.Company.Company;
import org.Astatine.r10.Data.Company.CompanyData.Company.CompanyController;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CompanyProperty extends CommandRegister {

    public CompanyProperty() {
        super(GlobalCommandHandler.PROPERTY_COMPANY);
    }

    @Override
    public boolean onCommand(final @NotNull CommandSender sender,
                             final @NotNull Command command,
                             final @NotNull String label,
                             final @NotNull String[] args) {

        Player companyOwner = (Player) sender;
        CompanyController controller = new CompanyController();

        Company senderCompany = controller.getCompanyUseOwnerUUID(companyOwner.getUniqueId());

        System.out.println(senderCompany);

        return true;
    }
}
