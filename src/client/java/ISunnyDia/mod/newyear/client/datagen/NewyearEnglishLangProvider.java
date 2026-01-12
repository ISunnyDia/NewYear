package ISunnyDia.mod.newyear.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class NewyearEnglishLangProvider extends FabricLanguageProvider {
    public NewyearEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.newyear.candy", "Candy");
        translationBuilder.add("item.newyear.snowballs", "Snowballs");
        translationBuilder.add("item.newyear.krendel", "Krendel");

    }
}
