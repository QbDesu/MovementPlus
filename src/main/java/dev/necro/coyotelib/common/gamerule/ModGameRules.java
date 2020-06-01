package dev.necro.coyotelib.common.gamerule;

import com.mojang.brigadier.CommandDispatcher;
import dev.necro.coyotelib.CoyoteLib;
import dev.necro.coyotelib.api.common.movement.midair_jump.RegisterGameRuleEvent;
import net.minecraft.command.CommandSource;
import net.minecraft.command.impl.GameRuleCommand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.world.GameRules;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerAboutToStartEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = CoyoteLib.MODID)
public class ModGameRules {
    public static GameRules.RuleKey<GameRules.BooleanValue> PREVENT_CREEPER_GRIEFING;

    @SubscribeEvent
    public static void registerGameRules(RegisterGameRuleEvent event){
        PREVENT_CREEPER_GRIEFING = GameRules.register(CoyoteLib.MODID + ":preventCreeperGriefing", GameRules.BooleanValue.create(false));
    }
}
