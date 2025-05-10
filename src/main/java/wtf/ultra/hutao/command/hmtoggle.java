package wtf.ultra.hutao.command;

import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

import static wtf.ultra.hutao.HuTao.enabled;
import static wtf.ultra.hutao.HuTao.setEnabled;

public class hmtoggle extends Command {
    public hmtoggle() {
        super("hmtoggle");
    }

    @Override
    public void handle(@NotNull String[] args) {
        setEnabled(!enabled);
    }
}
