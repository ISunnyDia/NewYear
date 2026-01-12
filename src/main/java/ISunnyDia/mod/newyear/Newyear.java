package ISunnyDia.mod.newyear;

import ISunnyDia.mod.newyear.item.ModItemGroups;
import ISunnyDia.mod.newyear.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Newyear implements ModInitializer {

    public static final String MOD_ID = "newyear";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
        public void onInitialize() {
        ModItems.initialize();
        ModItemGroups.initialize();
        ModItemGroups.registerItemGroups();
    }
}
