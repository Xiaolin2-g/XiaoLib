package com.xiaolin.xiaolib.datagen;

import com.xiaolin.xiaolib.util.SmeltingGlobals;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.TagKey;

import java.util.function.Consumer;

public class ModRecipeHelper {

    // Convert

    public static String convertMirrored(ItemConvertible from) {
        return RecipeProvider.getItemPath(from) + "_mirrored";
    }

    public static String convertBetween(ItemConvertible from, TagKey<Item> to) {
        return RecipeProvider.getItemPath(from) + "_from_" + getItemPath(to);
    }

    public static String getItemPath(TagKey<Item> item) {
        return item.id().getPath();
    }

    // Create

    public static CraftingRecipeJsonBuilder createStairsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 4)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createStairsRecipe(TagKey<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 4)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createMirroredStairsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 4)
                .input('#', input)
                .pattern("  #")
                .pattern(" ##")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createMirroredStairsRecipe(TagKey<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 4)
                .input('#', input)
                .pattern("  #")
                .pattern(" ##")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createHelmetRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createHelmetRecipe(TagKey<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createChestplateRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("###")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createChestplateRecipe(TagKey<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("###")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createLeggingsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createLeggingsRecipe(TagKey<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .pattern("###")
                .pattern("# #")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createBootsRecipe(ItemConvertible input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createBootsRecipe(TagKey<Item> input, ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .pattern("# #")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createHelmetRecipeOfTwoMaterials(ItemConvertible input,
                                                                             ItemConvertible input_2,
                                                                             ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O#O")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createHelmetRecipeOfTwoMaterials(TagKey<Item> input,
                                                                             TagKey<Item> input_2,
                                                                             ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O#O")
                .pattern("# #");
    }

    public static CraftingRecipeJsonBuilder createChestplateRecipeOfTwoMaterials(ItemConvertible input,
                                                                                 ItemConvertible input_2,
                                                                                 ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O O")
                .pattern("#O#")
                .pattern("O#O");
    }

    public static CraftingRecipeJsonBuilder createChestplateRecipeOfTwoMaterials(TagKey<Item> input,
                                                                                 TagKey<Item> input_2,
                                                                                 ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O O")
                .pattern("#O#")
                .pattern("O#O");
    }

    public static CraftingRecipeJsonBuilder createLeggingsRecipeOfTwoMaterials(ItemConvertible input,
                                                                               ItemConvertible input_2,
                                                                               ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O#O")
                .pattern("# #")
                .pattern("O O");
    }

    public static CraftingRecipeJsonBuilder createLeggingsRecipeOfTwoMaterials(TagKey<Item> input,
                                                                               TagKey<Item> input_2,
                                                                               ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("O#O")
                .pattern("# #")
                .pattern("O O");
    }

    public static CraftingRecipeJsonBuilder createBootsRecipeOfTwoMaterials(ItemConvertible input,
                                                                            ItemConvertible input_2,
                                                                            ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("# #")
                .pattern("O O");
    }

    public static CraftingRecipeJsonBuilder createBootsRecipeOfTwoMaterials(TagKey<Item> input,
                                                                            TagKey<Item> input_2,
                                                                            ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('O', input_2)
                .pattern("# #")
                .pattern("O O");
    }

    public static CraftingRecipeJsonBuilder createHorseArmor(ItemConvertible input,
                                                             ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('T', Items.TRIPWIRE_HOOK)
                .pattern("  #")
                .pattern("###")
                .pattern("T T");
    }

    public static CraftingRecipeJsonBuilder createHorseArmor(TagKey<Item> input,
                                                             ItemConvertible output) {
        return ShapedRecipeJsonBuilder.create
                        (output, 1)
                .input('#', input)
                .input('T', Items.TRIPWIRE_HOOK)
                .pattern("  #")
                .pattern("###")
                .pattern("T T");
    }

    public static CraftingRecipeJsonBuilder createSmallVertical(ItemConvertible input,
                                                                ItemConvertible input_2,
                                                                ItemConvertible output,
                                                                int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .input('O', input_2)
                .pattern("#")
                .pattern("O");
    }


    public static CraftingRecipeJsonBuilder createSmallVertical(TagKey<Item> input,
                                                                TagKey<Item> input_2,
                                                                ItemConvertible output,
                                                                int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .input('O', input_2)
                .pattern("#")
                .pattern("O");
    }


    public static CraftingRecipeJsonBuilder createO(ItemConvertible input,
                                                    ItemConvertible output,
                                                    int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .pattern("###")
                .pattern("# #")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createO(TagKey<Item> input,
                                                    ItemConvertible output,
                                                    int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .pattern("###")
                .pattern("# #")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createOWithMiddle(ItemConvertible input,
                                                              ItemConvertible input_2,
                                                              ItemConvertible output,
                                                              int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .input('O', input_2)
                .pattern("###")
                .pattern("#O#")
                .pattern("###");
    }


    public static CraftingRecipeJsonBuilder createOWithMiddle(TagKey<Item> input,
                                                              TagKey<Item> input_2,
                                                              ItemConvertible output,
                                                              int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .input('O', input_2)
                .pattern("###")
                .pattern("#O#")
                .pattern("###");
    }

    public static CraftingRecipeJsonBuilder createItemOnTopOfAnother(ItemConvertible input,
                                                                     ItemConvertible input_2,
                                                                     ItemConvertible output,
                                                                     int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .input('O', input_2)
                .pattern("#")
                .pattern("O");
    }

    public static CraftingRecipeJsonBuilder createItemOnTopOfAnother(TagKey<Item> input,
                                                                     TagKey<Item> input_2,
                                                                     ItemConvertible output,
                                                                     int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .input('O', input_2)
                .pattern("#")
                .pattern("O");
    }


    public static CraftingRecipeJsonBuilder createSameItemOnTopOfAnother(ItemConvertible input,
                                                                         ItemConvertible output,
                                                                         int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .pattern("#")
                .pattern("#");
    }


    public static CraftingRecipeJsonBuilder createSameItemOnTopOfAnother(TagKey<Item> input,
                                                                         ItemConvertible output,
                                                                         int outputCount) {
        return ShapedRecipeJsonBuilder.create
                        (output, outputCount)
                .input('#', input)
                .pattern("#")
                .pattern("#");
    }










    // Offer


    public static void offerWoodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible log, ItemConvertible bark, ItemConvertible output){
        ShapelessRecipeJsonBuilder.create(output, 1)
                .input(log).input(bark)
                .criterion(RecipeProvider.hasItem(log), RecipeProvider.conditionsFromItem(log))
                .offerTo(exporter);
    }


    public static void offerStairsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input, ItemConvertible output){
        createStairsRecipe(input, output)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input)).
                offerTo(exporter);

        createMirroredStairsRecipe(input, output)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input)).
                offerTo(exporter, convertMirrored(output));


    }

    public static void offerDyeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input,
                                      ItemConvertible output, int outputCount){
        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter,
                        RecipeProvider.convertBetween(output, input));

    }

    public static void offerCompactingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible input,
                                             ItemConvertible output){
        RecipeProvider.offerReversibleCompactingRecipesWithCompactingRecipeGroup(exporter, input, output,
                output + "_from_" + input, null);
    }


    public static void offerArmorRecipeOfTheSameMaterial(Consumer<RecipeJsonProvider> exporter,
                                                         ItemConvertible material,
                                                         ItemConvertible helmet,
                                                         ItemConvertible chestplate,
                                                         ItemConvertible leggings,
                                                         ItemConvertible boots){
        createHelmetRecipe(material, helmet)
                .criterion(RecipeProvider.hasItem(material),
                        RecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);

        createChestplateRecipe(material, chestplate)
                .criterion(RecipeProvider.hasItem(material),
                        RecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);

        createLeggingsRecipe(material, leggings)
                .criterion(RecipeProvider.hasItem(material),
                        RecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);

        createBootsRecipe(material, boots)
                .criterion(RecipeProvider.hasItem(material),
                        RecipeProvider.conditionsFromItem(material))
                .offerTo(exporter);
    }

    public static void offerArmorRecipeOfTheSameMaterial(Consumer<RecipeJsonProvider> exporter,
                                                         TagKey<Item> material,
                                                         String conditions,
                                                         ItemConvertible helmet,
                                                         ItemConvertible chestplate,
                                                         ItemConvertible leggings,
                                                         ItemConvertible boots){
        createHelmetRecipe(material, helmet)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createChestplateRecipe(material, chestplate)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createLeggingsRecipe(material, leggings)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createBootsRecipe(material, boots)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);
    }


    public static void offerArmorRecipeOfDifferentMaterials(Consumer<RecipeJsonProvider> exporter,
                                                            ItemConvertible helmet_material,
                                                            ItemConvertible chestplate_material,
                                                            ItemConvertible leggings_material,
                                                            ItemConvertible boots_material,
                                                            ItemConvertible helmet,
                                                            ItemConvertible chestplate,
                                                            ItemConvertible leggings,
                                                            ItemConvertible boots){
        createHelmetRecipe(helmet_material, helmet)
                .criterion(RecipeProvider.hasItem(helmet_material),
                        RecipeProvider.conditionsFromItem(helmet_material))
                .offerTo(exporter);

        createChestplateRecipe(chestplate_material, chestplate)
                .criterion(RecipeProvider.hasItem(chestplate_material),
                        RecipeProvider.conditionsFromItem(chestplate_material))
                .offerTo(exporter);

        createLeggingsRecipe(leggings_material, leggings)
                .criterion(RecipeProvider.hasItem(leggings_material),
                        RecipeProvider.conditionsFromItem(leggings_material))
                .offerTo(exporter);

        createBootsRecipe(boots_material, boots)
                .criterion(RecipeProvider.hasItem(boots_material),
                        RecipeProvider.conditionsFromItem(boots_material))
                .offerTo(exporter);
    }

    public static void offerArmorRecipeOfDifferentMaterials(Consumer<RecipeJsonProvider> exporter,
                                                            TagKey<Item> helmet_material,
                                                            TagKey<Item> chestplate_material,
                                                            TagKey<Item> leggings_material,
                                                            TagKey<Item> boots_material,
                                                            String conditions,
                                                            ItemConvertible helmet,
                                                            ItemConvertible chestplate,
                                                            ItemConvertible leggings,
                                                            ItemConvertible boots){
        createHelmetRecipe(helmet_material, helmet)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(helmet_material))
                .offerTo(exporter);

        createChestplateRecipe(chestplate_material, chestplate)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(chestplate_material))
                .offerTo(exporter);

        createLeggingsRecipe(leggings_material, leggings)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(leggings_material))
                .offerTo(exporter);

        createBootsRecipe(boots_material, boots)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(boots_material))
                .offerTo(exporter);
    }

    public static void offerArmorRecipeOfTwoMaterials(Consumer<RecipeJsonProvider> exporter,
                                                      ItemConvertible material,
                                                      ItemConvertible material_2,
                                                      ItemConvertible helmet,
                                                      ItemConvertible chestplate,
                                                      ItemConvertible leggings,
                                                      ItemConvertible boots){

        createHelmetRecipeOfTwoMaterials(material, material_2, helmet)
                .criterion(RecipeProvider.hasItem(material),
                        RecipeProvider.conditionsFromItem(material)).
                offerTo(exporter);

        createChestplateRecipeOfTwoMaterials(material, material_2, chestplate)
                .criterion(RecipeProvider.hasItem(material),
                        RecipeProvider.conditionsFromItem(material)).
                offerTo(exporter);

        createLeggingsRecipeOfTwoMaterials(material, material_2, leggings)
                .criterion(RecipeProvider.hasItem(material),
                        RecipeProvider.conditionsFromItem(material)).
                offerTo(exporter);

        createBootsRecipeOfTwoMaterials(material, material_2, boots)
                .criterion(RecipeProvider.hasItem(material),
                        RecipeProvider.conditionsFromItem(material)).
                offerTo(exporter);
    }

    public static void offerArmorRecipeOfTwoMaterials(Consumer<RecipeJsonProvider> exporter,
                                                      TagKey<Item> material,
                                                      TagKey<Item> material_2,
                                                      String conditions,
                                                      ItemConvertible helmet,
                                                      ItemConvertible chestplate,
                                                      ItemConvertible leggings,
                                                      ItemConvertible boots){

        createHelmetRecipeOfTwoMaterials(material, material_2, helmet)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createChestplateRecipeOfTwoMaterials(material, material_2, chestplate)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createLeggingsRecipeOfTwoMaterials(material, material_2, leggings)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);

        createBootsRecipeOfTwoMaterials(material, material_2, boots)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(material))
                .offerTo(exporter);
    }

    public static void offerSmelting(Consumer<RecipeJsonProvider> exporter,
                                     ItemConvertible input, ItemConvertible output){
        CookingRecipeJsonBuilder.createSmelting
                        (Ingredient.ofItems(input),
                                output,
                                SmeltingGlobals.STANDARD_XP_SMELTING,
                                SmeltingGlobals.STANDARD_SMELTING_TIME)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerSmelting(Consumer<RecipeJsonProvider> exporter,
                                     ItemConvertible input, ItemConvertible output,
                                     float xp, int cookingTime){
        CookingRecipeJsonBuilder.createSmelting
                        (Ingredient.ofItems(input),
                                output,
                                xp, cookingTime)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }


    public static void offerHorseArmor(Consumer<RecipeJsonProvider> exporter,
                                       ItemConvertible input,
                                       ItemConvertible output){

        createHorseArmor(input, output)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerHorseArmor(Consumer<RecipeJsonProvider> exporter,
                                       TagKey<Item> input,
                                       ItemConvertible output,
                                       String conditions){

        createHorseArmor(input, output)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(input))
                .offerTo(exporter);;
    }

    public static void offerRebarking(Consumer<RecipeJsonProvider> exporter,
                                      ItemConvertible input,
                                      ItemConvertible input_2,
                                      ItemConvertible output){

        ShapelessRecipeJsonBuilder.create(output, 1)
                .input(input)
                .input(input_2)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, RecipeProvider.convertBetween(output, input));

    }


    public static void offerSmallVertical(Consumer<RecipeJsonProvider> exporter,
                                          ItemConvertible input,
                                          ItemConvertible input_2,
                                          ItemConvertible output,
                                          int outputCount,
                                          boolean from){

        if(from == true){
            createSmallVertical(input, input_2, output, outputCount)
                    .criterion(RecipeProvider.hasItem(input),
                            RecipeProvider.conditionsFromItem(input))
                    .offerTo(exporter, RecipeProvider.convertBetween(output, input));
        }
        else{
            createSmallVertical(input, input_2, output, outputCount)
                    .criterion(RecipeProvider.hasItem(input),
                            RecipeProvider.conditionsFromItem(input))
                    .offerTo(exporter);
        }




    }

    public static void offerSmallVertical(Consumer<RecipeJsonProvider> exporter,
                                          TagKey<Item> input,
                                          TagKey<Item> input_2,
                                          ItemConvertible output,
                                          String conditions,
                                          int outputCount,
                                          boolean from){
        if(from == true){
            createSmallVertical(input, input_2, output, outputCount)
                    .criterion(conditions,
                            RecipeProvider.conditionsFromTag(input))
                    .offerTo(exporter, convertBetween(output,input));
        }
        else{
            createSmallVertical(input, input_2, output, outputCount)
                    .criterion(conditions,
                            RecipeProvider.conditionsFromTag(input))
                    .offerTo(exporter);

        }

    }

    public static void offerTwoOfTheSameItem(Consumer<RecipeJsonProvider> exporter,
                                             ItemConvertible input,
                                             ItemConvertible output,
                                             int outputCount){

        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .input(input)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, RecipeProvider.convertBetween(output, input));
    }

    public static void offerThreeOfTheSameItem(Consumer<RecipeJsonProvider> exporter,
                                               ItemConvertible input,
                                               ItemConvertible output,
                                               int outputCount){

        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .input(input)
                .input(input)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, RecipeProvider.convertBetween(output, input));
    }

    public static void offerFourOfTheSameItem(Consumer<RecipeJsonProvider> exporter,
                                              ItemConvertible input,
                                              ItemConvertible output,
                                              int outputCount){

        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, RecipeProvider.convertBetween(output, input));
    }

    public static void offerFiveOfTheSameItem(Consumer<RecipeJsonProvider> exporter,
                                              ItemConvertible input,
                                              ItemConvertible output,
                                              int outputCount){

        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, RecipeProvider.convertBetween(output, input));
    }

    public static void offerSixOfTheSameItem(Consumer<RecipeJsonProvider> exporter,
                                             ItemConvertible input,
                                             ItemConvertible output,
                                             int outputCount){

        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, RecipeProvider.convertBetween(output, input));
    }

    public static void offerSevenOfTheSameItem(Consumer<RecipeJsonProvider> exporter,
                                               ItemConvertible input,
                                               ItemConvertible output,
                                               int outputCount){

        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, RecipeProvider.convertBetween(output, input));
    }

    public static void offerEightOfTheSameItem(Consumer<RecipeJsonProvider> exporter,
                                               ItemConvertible input,
                                               ItemConvertible output,
                                               int outputCount){

        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .input(input)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, RecipeProvider.convertBetween(output, input));
    }

    public static void offerAnotherOne(Consumer<RecipeJsonProvider> exporter,
                                       ItemConvertible input,
                                       ItemConvertible output_1,
                                       ItemConvertible output_2,
                                       ItemConvertible output_3,
                                       ItemConvertible output_4){


        offerTwoOfTheSameItem(exporter, input, output_1, 1);
        offerThreeOfTheSameItem(exporter, input, output_2, 1);
        offerFourOfTheSameItem(exporter, input, output_3, 1);
        offerFiveOfTheSameItem(exporter, input, output_4, 1);
    }

    public static void offerO(Consumer<RecipeJsonProvider> exporter,
                              ItemConvertible input,
                              ItemConvertible output,
                              int outputCount,
                              boolean from){

        if(from == true){
            createO(input, output, outputCount)
                    .criterion(RecipeProvider.hasItem(input),
                            RecipeProvider.conditionsFromItem(input))
                    .offerTo(exporter, RecipeProvider.convertBetween(output, input));
        }
        else{
            createO(input, output, outputCount)
                    .criterion(RecipeProvider.hasItem(input),
                            RecipeProvider.conditionsFromItem(input))
                    .offerTo(exporter);
        }


    }

    public static void offerO(Consumer<RecipeJsonProvider> exporter,
                              TagKey<Item> input,
                              ItemConvertible output,
                              String conditions,
                              int outputCount,
                              boolean from){

        if(from == true){
            createO(input, output, outputCount)
                    .criterion(conditions,
                            RecipeProvider.conditionsFromTag(input))
                    .offerTo(exporter, convertBetween(output, input));
        }
        else{
            createO(input, output, outputCount)
                    .criterion(conditions,
                            RecipeProvider.conditionsFromTag(input))
                    .offerTo(exporter);
        }
    }

    public static void offerOWithMiddle(Consumer<RecipeJsonProvider> exporter,
                                        ItemConvertible input,
                                        ItemConvertible input_2,
                                        ItemConvertible output,
                                        int outputCount,
                                        boolean from){

        if(from == true){
            createOWithMiddle(input, input_2, output, outputCount)
                    .criterion(RecipeProvider.hasItem(input),
                            RecipeProvider.conditionsFromItem(input))
                    .offerTo(exporter, RecipeProvider.convertBetween(output, input));
        }
        else{
            createOWithMiddle(input, input_2, output, outputCount)
                    .criterion(RecipeProvider.hasItem(input),
                            RecipeProvider.conditionsFromItem(input))
                    .offerTo(exporter);
        }

    }

    public static void offerOWithMiddle(Consumer<RecipeJsonProvider> exporter,
                                        TagKey<Item> input,
                                        TagKey<Item> input_2,
                                        ItemConvertible output,
                                        String conditions,
                                        int outputCount,
                                        boolean from){

        if(from == true){
            createOWithMiddle(input, input_2, output, outputCount)
                    .criterion(conditions,
                            RecipeProvider.conditionsFromTag(input))
                    .offerTo(exporter, convertBetween(output, input));
        }
        else{
            createOWithMiddle(input, input_2, output, outputCount)
                    .criterion(conditions,
                            RecipeProvider.conditionsFromTag(input))
                    .offerTo(exporter);
        }
    }


    public static void offerItemOnTopOfAnother(Consumer<RecipeJsonProvider> exporter,
                                               ItemConvertible input,
                                               ItemConvertible input_2,
                                               ItemConvertible output,
                                               int outputCount){

        createItemOnTopOfAnother(input, input_2, output, outputCount)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerItemOnTopOfAnother(Consumer<RecipeJsonProvider> exporter,
                                               TagKey<Item> input,
                                               TagKey<Item> input_2,
                                               ItemConvertible output,
                                               int outputCount,
                                               String conditions){

        createItemOnTopOfAnother(input, input_2, output, outputCount)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(input))
                .offerTo(exporter);
    }

    public static void offerSameItemOnTopOfAnother(Consumer<RecipeJsonProvider> exporter,
                                                   ItemConvertible input,
                                                   ItemConvertible output,
                                                   int outputCount){

        createSameItemOnTopOfAnother(input, output, outputCount)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerSameItemOnTopOfAnother(Consumer<RecipeJsonProvider> exporter,
                                                   TagKey<Item> input,
                                                   ItemConvertible output,
                                                   int outputCount,
                                                   String conditions){

        createSameItemOnTopOfAnother(input, output, outputCount)
                .criterion(conditions,
                        RecipeProvider.conditionsFromTag(input))
                .offerTo(exporter);
    }

    public static void offerTwoItemsShapeless(Consumer<RecipeJsonProvider> exporter,
                                              ItemConvertible input,
                                              ItemConvertible input_2,
                                              ItemConvertible output,
                                              int outputCount){

        ShapelessRecipeJsonBuilder.create(output, outputCount)
                .input(input)
                .input(input_2)
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }



}
