package ISunnyDia.mod.newyear.client.datagen;

import ISunnyDia.mod.newyear.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;

public class NewyearModelProvider extends FabricModelProvider {
    public NewyearModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.CANDY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.KRENDEL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.SNOWBALLS, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public String getName() {
        return "NewyearModelProvider";
    }

}
