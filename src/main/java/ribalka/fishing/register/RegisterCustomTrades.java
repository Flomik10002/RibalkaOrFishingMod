package ribalka.fishing.register;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class RegisterCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(RegisterVillagers.FISHING_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.FISHING_ROD),
                            6, 5, 0.05f
                    ));
                });
    }
}
