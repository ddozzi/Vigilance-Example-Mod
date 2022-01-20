package com.example.examplemod.command;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.config.ExampleConfiguration;
import gg.essential.api.EssentialAPI;
import gg.essential.api.commands.Command;
import gg.essential.api.commands.DefaultHandler;

public class ExampleCommand extends Command {

    public ExampleCommand(String name) {
        super(name);
    }

    @DefaultHandler
    public void handle() {
        EssentialAPI.getGuiUtil().openScreen(ExampleMod.instance.config.gui());
    }

}
