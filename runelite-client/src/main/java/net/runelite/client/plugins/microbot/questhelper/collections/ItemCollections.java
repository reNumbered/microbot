/*
 * Copyright (c) 2020, Zoinkwiz
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.microbot.questhelper.collections;

import com.google.common.collect.ImmutableList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.ItemID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ItemCollections {
    // Tools
    AXES("Axe", ImmutableList.of(
            ItemID.BRONZE_AXE,
            ItemID.CRYSTAL_AXE,
            ItemID.CRYSTAL_FELLING_AXE,
            ItemID._3RD_AGE_AXE,
            ItemID.ECHO_AXE,
            ItemID.INFERNAL_AXE_OR,
            ItemID.INFERNAL_AXE,
            ItemID.INFERNAL_AXE_UNCHARGED_25371,
            ItemID.INFERNAL_AXE_UNCHARGED,
            ItemID.DRAGON_AXE_OR,
            ItemID.DRAGON_AXE,
            ItemID.DRAGON_FELLING_AXE,
            ItemID.RUNE_AXE,
            ItemID.RUNE_FELLING_AXE,
            ItemID.GILDED_AXE,
            ItemID.ADAMANT_AXE,
            ItemID.ADAMANT_FELLING_AXE,
            ItemID.MITHRIL_AXE,
            ItemID.MITHRIL_FELLING_AXE,
            ItemID.BLACK_AXE,
            ItemID.BLACK_FELLING_AXE,
            ItemID.STEEL_AXE,
            ItemID.STEEL_FELLING_AXE,
            ItemID.IRON_AXE,
            ItemID.IRON_FELLING_AXE,
            ItemID.BRONZE_FELLING_AXE
    )),

    PICKAXES("Pickaxe", ImmutableList.of(
            ItemID.BRONZE_PICKAXE,
            ItemID.INFERNAL_PICKAXE_OR,
            ItemID.ECHO_PICKAXE,
            ItemID.CRYSTAL_PICKAXE,
            ItemID.CRYSTAL_PICKAXE_INACTIVE,
            ItemID._3RD_AGE_PICKAXE,
            ItemID.INFERNAL_PICKAXE,
            ItemID.DRAGON_PICKAXE_OR_25376,
            ItemID.DRAGON_PICKAXE_12797,
            ItemID.DRAGON_PICKAXE_OR,
            ItemID.DRAGON_PICKAXE,
            ItemID.RUNE_PICKAXE,
            ItemID.GILDED_PICKAXE,
            ItemID.ADAMANT_PICKAXE,
            ItemID.MITHRIL_PICKAXE,
            ItemID.BLACK_PICKAXE,
            ItemID.STEEL_PICKAXE,
            ItemID.IRON_PICKAXE
    )),

    HARPOONS("Harpoon", ImmutableList.of(
            ItemID.HARPOON,
            ItemID.INFERNAL_HARPOON_OR,
            ItemID.ECHO_HARPOON,
            ItemID.INFERNAL_HARPOON,
            ItemID.DRAGON_HARPOON,
            ItemID.BARBTAIL_HARPOON

    )),

    MACHETE("Machete", ImmutableList.of(
            ItemID.MACHETE,
            ItemID.RED_TOPAZ_MACHETE,
            ItemID.JADE_MACHETE,
            ItemID.OPAL_MACHETE,
            ItemID.MACHETE
    )),

    HAMMER("Hammer", ImmutableList.of(
            ItemID.HAMMER,
            ItemID.IMCANDO_HAMMER,
            ItemID.IMCANDO_HAMMER_OFFHAND
    )),

    SAW("Saw", ImmutableList.of(
            ItemID.SAW,
            ItemID.AMYS_SAW,
            ItemID.CRYSTAL_SAW
    )),

    NAILS("Nails", ImmutableList.of(
            ItemID.BRONZE_NAILS,
            ItemID.STEEL_NAILS,
            ItemID.IRON_NAILS,
            ItemID.BLACK_NAILS,
            ItemID.MITHRIL_NAILS,
            ItemID.ADAMANTITE_NAILS,
            ItemID.RUNE_NAILS
    )),

    BOWS("Bows", ImmutableList.of(
            ItemID.SHORTBOW,
            ItemID.MAGIC_SHORTBOW,
            ItemID.MAGIC_SHORTBOW_I,
            ItemID.DARK_BOW,
            ItemID.MAGIC_LONGBOW,
            ItemID.YEW_SHORTBOW,
            ItemID.YEW_LONGBOW,
            ItemID.MAPLE_SHORTBOW,
            ItemID.MAPLE_LONGBOW,
            ItemID.WILLOW_SHORTBOW,
            ItemID.WILLOW_LONGBOW,
            ItemID.OAK_SHORTBOW,
            ItemID.OAK_LONGBOW,
            ItemID.LONGBOW
    )),

    CROSSBOWS("Crossbows", ImmutableList.of(
            ItemID.CROSSBOW,
            ItemID.ARMADYL_CROSSBOW,
            ItemID.DRAGON_HUNTER_CROSSBOW,
            ItemID.HUNTERS_CROSSBOW,
            ItemID.DORGESHUUN_CROSSBOW,
            ItemID.BLURITE_CROSSBOW,
            ItemID.DRAGON_CROSSBOW,
            ItemID.RUNE_CROSSBOW_OR,
            ItemID.RUNE_CROSSBOW,
            ItemID.ADAMANT_CROSSBOW,
            ItemID.MITHRIL_CROSSBOW,
            ItemID.STEEL_CROSSBOW,
            ItemID.IRON_CROSSBOW,
            ItemID.BRONZE_CROSSBOW,
            ItemID.PHOENIX_CROSSBOW
    )),

    SWORDS("Swords", ImmutableList.of(
            ItemID.BRONZE_SWORD,
            ItemID.TRAINING_SWORD,
            ItemID.BRONZE_LONGSWORD,
            ItemID.IRON_SWORD,
            ItemID.IRON_LONGSWORD,
            ItemID.STEEL_SWORD,
            ItemID.STEEL_LONGSWORD,
            ItemID.BLACK_SWORD,
            ItemID.BLACK_LONGSWORD,
            ItemID.WHITE_SWORD,
            ItemID.WHITE_LONGSWORD,
            ItemID.MITHRIL_SWORD,
            ItemID.MITHRIL_LONGSWORD,
            ItemID.ADAMANT_SWORD,
            ItemID.ADAMANT_LONGSWORD,
            ItemID.WILDERNESS_SWORD_1,
            ItemID.WILDERNESS_SWORD_2,
            ItemID.WILDERNESS_SWORD_3,
            ItemID.WILDERNESS_SWORD_4
    )),

    METAL_ARROWS(ImmutableList.of(
            ItemID.BRONZE_ARROW,
            ItemID.RUNE_ARROW,
            ItemID.ADAMANT_ARROW,
            ItemID.MITHRIL_ARROW,
            ItemID.STEEL_ARROW,
            ItemID.IRON_ARROW
    )),

    ARROWS(ImmutableList.of(
            ItemID.BRONZE_ARROW,
            ItemID.DRAGON_ARROW,
            ItemID.AMETHYST_ARROW,
            ItemID.RUNE_ARROW,
            ItemID.ADAMANT_ARROW,
            ItemID.MITHRIL_ARROW,
            ItemID.STEEL_ARROW,
            ItemID.IRON_ARROW
    )),

    BRUTAL_ARROWS(ImmutableList.of(
            ItemID.BRONZE_BRUTAL,
            ItemID.RUNE_BRUTAL,
            ItemID.ADAMANT_BRUTAL,
            ItemID.MITHRIL_BRUTAL,
            ItemID.BLACK_BRUTAL,
            ItemID.STEEL_BRUTAL,
            ItemID.IRON_BRUTAL
    )),

    FIRE_ARROWS(ImmutableList.of(
            ItemID.DRAGON_FIRE_ARROW,
            ItemID.DRAGON_FIRE_ARROW_LIT,
            ItemID.AMETHYST_FIRE_ARROW,
            ItemID.AMETHYST_FIRE_ARROW_LIT,
            ItemID.RUNE_FIRE_ARROW,
            ItemID.RUNE_FIRE_ARROW_LIT,
            ItemID.ADAMANT_FIRE_ARROW,
            ItemID.ADAMANT_FIRE_ARROW_LIT,
            ItemID.MITHRIL_FIRE_ARROW,
            ItemID.MITHRIL_FIRE_ARROW_LIT,
            ItemID.STEEL_FIRE_ARROW,
            ItemID.STEEL_FIRE_ARROW_LIT,
            ItemID.IRON_FIRE_ARROW,
            ItemID.IRON_FIRE_ARROW_LIT,
            ItemID.BRONZE_FIRE_ARROW,
            ItemID.BRONZE_FIRE_ARROW_LIT
    )),

    SPECIAL_ARROWS(ImmutableList.of(
            ItemID.BROAD_ARROWS,
            ItemID.OGRE_ARROW,
            ItemID.TRAINING_ARROWS,
            ItemID.ICE_ARROWS
    )),

    ARROW_TIPS(ImmutableList.of(
            ItemID.DRAGON_ARROWTIPS,
            ItemID.AMETHYST_ARROWTIPS,
            ItemID.RUNE_ARROWTIPS,
            ItemID.ADAMANT_ARROWTIPS,
            ItemID.MITHRIL_ARROWTIPS,
            ItemID.STEEL_ARROWTIPS,
            ItemID.IRON_ARROWTIPS,
            ItemID.BRONZE_ARROWTIPS
    )),

    AIR_RUNE(ImmutableList.of(
            ItemID.AIR_RUNE,
            ItemID.MIST_RUNE,
            ItemID.SMOKE_RUNE,
            ItemID.DUST_RUNE
    )),

    AIR_STAFF(ImmutableList.of(
            ItemID.AIR_BATTLESTAFF,
            ItemID.MYSTIC_AIR_STAFF,
            ItemID.STAFF_OF_AIR,
            ItemID.SMOKE_BATTLESTAFF,
            ItemID.MYSTIC_SMOKE_STAFF,
            ItemID.DUST_BATTLESTAFF,
            ItemID.MYSTIC_DUST_STAFF,
            ItemID.MIST_BATTLESTAFF,
            ItemID.MYSTIC_MIST_STAFF
    )),

    FIRE_RUNE(ImmutableList.of(
            ItemID.FIRE_RUNE,
            ItemID.LAVA_RUNE,
            ItemID.SMOKE_RUNE,
            ItemID.STEAM_RUNE
    )),

    FIRE_STAFF(ImmutableList.of(
            ItemID.FIRE_BATTLESTAFF,
            ItemID.MYSTIC_FIRE_STAFF,
            ItemID.STAFF_OF_FIRE,
            ItemID.SMOKE_BATTLESTAFF,
            ItemID.MYSTIC_SMOKE_STAFF,
            ItemID.LAVA_BATTLESTAFF,
            ItemID.MYSTIC_LAVA_STAFF,
            ItemID.STEAM_BATTLESTAFF,
            ItemID.MYSTIC_STEAM_STAFF
    )),

    WATER_RUNE(ImmutableList.of(
            ItemID.WATER_RUNE,
            ItemID.MUD_RUNE,
            ItemID.MIST_RUNE,
            ItemID.STEAM_RUNE
    )),

    WATER_STAFF(ImmutableList.of(
            ItemID.FIRE_BATTLESTAFF,
            ItemID.MYSTIC_FIRE_STAFF,
            ItemID.STAFF_OF_FIRE,
            ItemID.MUD_BATTLESTAFF,
            ItemID.MYSTIC_MUD_STAFF,
            ItemID.MIST_BATTLESTAFF,
            ItemID.MYSTIC_MIST_STAFF,
            ItemID.STEAM_BATTLESTAFF,
            ItemID.MYSTIC_STEAM_STAFF
    )),

    EARTH_RUNE(ImmutableList.of(
            ItemID.EARTH_RUNE,
            ItemID.MUD_RUNE,
            ItemID.LAVA_RUNE,
            ItemID.DUST_RUNE
    )),

    EARTH_STAFF(ImmutableList.of(
            ItemID.EARTH_BATTLESTAFF,
            ItemID.MYSTIC_EARTH_STAFF,
            ItemID.STAFF_OF_EARTH,
            ItemID.MUD_BATTLESTAFF,
            ItemID.MYSTIC_MUD_STAFF,
            ItemID.DUST_BATTLESTAFF,
            ItemID.MYSTIC_DUST_STAFF,
            ItemID.LAVA_BATTLESTAFF,
            ItemID.MYSTIC_LAVA_STAFF
    )),

    // Potions

    ANTIPOISONS(ImmutableList.of(
            ItemID.ANTIVENOM4_12913,
            ItemID.ANTIVENOM3_12915,
            ItemID.ANTIVENOM4_12913,
            ItemID.ANTIVENOM2_12917,
            ItemID.ANTIVENOM1_12919,
            ItemID.ANTIVENOM4,
            ItemID.ANTIVENOM3,
            ItemID.ANTIVENOM2,
            ItemID.ANTIVENOM1,
            ItemID.ANTIDOTE4_5952,
            ItemID.ANTIDOTE3_5954,
            ItemID.ANTIDOTE2_5956,
            ItemID.ANTIDOTE1_5958,
            ItemID.ANTIDOTE4,
            ItemID.ANTIDOTE3,
            ItemID.ANTIDOTE2,
            ItemID.ANTIDOTE1,
            ItemID.SUPERANTIPOISON4,
            ItemID.SUPERANTIPOISON3,
            ItemID.SUPERANTIPOISON2,
            ItemID.SUPERANTIPOISON1,
            ItemID.ANTIPOISON4,
            ItemID.ANTIPOISON3,
            ItemID.ANTIPOISON2,
            ItemID.ANTIPOISON1,
            ItemID.RELICYMS_BALM4,
            ItemID.RELICYMS_BALM3,
            ItemID.RELICYMS_BALM2,
            ItemID.RELICYMS_BALM1,
            ItemID.SANFEW_SERUM4,
            ItemID.SANFEW_SERUM3,
            ItemID.SANFEW_SERUM2,
            ItemID.SANFEW_SERUM1,
            ItemID.RELICYMS_MIX2,
            ItemID.RELICYMS_MIX1,
            ItemID.ANTIPOISON_MIX2,
            ItemID.ANTIPOISON_MIX1,
            ItemID.ANTIDOTE_MIX2,
            ItemID.ANTIDOTE_MIX1
    )),

    ANTIVENOMS(ImmutableList.of(
            ItemID.ANTIVENOM4_12913,
            ItemID.ANTIVENOM3_12915,
            ItemID.ANTIVENOM2_12917,
            ItemID.ANTIVENOM1_12919,
            ItemID.ANTIVENOM4,
            ItemID.ANTIVENOM3,
            ItemID.ANTIVENOM2,
            ItemID.ANTIVENOM1
    )),

    ANTIDISEASE(ImmutableList.of(
            ItemID.INOCULATION_BRACELET,
            ItemID.RELICYMS_BALM4,
            ItemID.RELICYMS_BALM3,
            ItemID.RELICYMS_BALM2,
            ItemID.RELICYMS_BALM1,
            ItemID.SANFEW_SERUM4,
            ItemID.SANFEW_SERUM3,
            ItemID.SANFEW_SERUM2,
            ItemID.SANFEW_SERUM1,
            ItemID.RELICYMS_MIX2,
            ItemID.RELICYMS_MIX1
    )),

    ANTIFIRE(ImmutableList.of(
            ItemID.EXTENDED_SUPER_ANTIFIRE4,
            ItemID.EXTENDED_SUPER_ANTIFIRE3,
            ItemID.EXTENDED_SUPER_ANTIFIRE2,
            ItemID.EXTENDED_SUPER_ANTIFIRE1,
            ItemID.EXTENDED_SUPER_ANTIFIRE_MIX2,
            ItemID.EXTENDED_SUPER_ANTIFIRE_MIX1,
            ItemID.SUPER_ANTIFIRE_POTION4,
            ItemID.SUPER_ANTIFIRE_POTION3,
            ItemID.SUPER_ANTIFIRE_POTION2,
            ItemID.SUPER_ANTIFIRE_POTION1,
            ItemID.SUPER_ANTIFIRE_MIX2,
            ItemID.SUPER_ANTIFIRE_MIX1,
            ItemID.EXTENDED_ANTIFIRE4,
            ItemID.EXTENDED_ANTIFIRE3,
            ItemID.EXTENDED_ANTIFIRE2,
            ItemID.EXTENDED_ANTIFIRE1,
            ItemID.EXTENDED_ANTIFIRE_MIX2,
            ItemID.EXTENDED_ANTIFIRE_MIX1,
            ItemID.ANTIFIRE_POTION4,
            ItemID.ANTIFIRE_POTION3,
            ItemID.ANTIFIRE_POTION2,
            ItemID.ANTIFIRE_POTION1,
            ItemID.ANTIFIRE_MIX2,
            ItemID.ANTIFIRE_MIX1
    )),

    PRAYER_POTIONS(ImmutableList.of(
            ItemID.PRAYER_POTION4,
            ItemID.PRAYER_POTION3,
            ItemID.PRAYER_POTION2,
            ItemID.PRAYER_POTION1
    )),

    RESTORE_POTIONS(ImmutableList.of(
            ItemID.SUPER_RESTORE4,
            ItemID.SUPER_RESTORE3,
            ItemID.SUPER_RESTORE2,
            ItemID.SUPER_RESTORE1,
            ItemID.RESTORE_POTION4,
            ItemID.RESTORE_POTION3,
            ItemID.RESTORE_POTION2,
            ItemID.RESTORE_POTION1
    )),

    SUPER_RESTORE_POTIONS(ImmutableList.of(
            ItemID.SUPER_RESTORE4,
            ItemID.SUPER_RESTORE3,
            ItemID.SUPER_RESTORE2,
            ItemID.SUPER_RESTORE1
    )),

    SUPER_COMBAT_POTIONS(ImmutableList.of(
            ItemID.SUPER_COMBAT_POTION4,
            ItemID.SUPER_COMBAT_POTION3,
            ItemID.SUPER_COMBAT_POTION2,
            ItemID.SUPER_COMBAT_POTION1,
            ItemID.DIVINE_SUPER_COMBAT_POTION4,
            ItemID.DIVINE_SUPER_COMBAT_POTION3,
            ItemID.DIVINE_SUPER_COMBAT_POTION2,
            ItemID.DIVINE_SUPER_COMBAT_POTION1
    )),

    SARADOMIN_BREWS(ImmutableList.of(
            ItemID.SARADOMIN_BREW4,
            ItemID.SARADOMIN_BREW3,
            ItemID.SARADOMIN_BREW2,
            ItemID.SARADOMIN_BREW1
    )),

    RUN_RESTORE_ITEMS(ImmutableList.of(
            ItemID.AGILITY_CAPE,
            ItemID.AGILITY_CAPET,
            ItemID.EXPLORERS_RING_4,
            ItemID.EXPLORERS_RING_3,
            ItemID.EXPLORERS_RING_2,
            ItemID.EXPLORERS_RING_1,
            ItemID.STAMINA_POTION4,
            ItemID.STAMINA_POTION3,
            ItemID.STAMINA_POTION2,
            ItemID.STAMINA_POTION1,
            ItemID.MINT_CAKE,
            ItemID.STRANGE_FRUIT,
            ItemID.STAMINA_MIX2,
            ItemID.STAMINA_MIX1,
            ItemID.SUPER_ENERGY4,
            ItemID.SUPER_ENERGY3,
            ItemID.SUPER_ENERGY2,
            ItemID.SUPER_ENERGY1,
            ItemID.ENERGY_POTION4,
            ItemID.ENERGY_POTION3,
            ItemID.ENERGY_POTION2,
            ItemID.ENERGY_POTION1,
            ItemID.PURPLE_SWEETS,
            ItemID.WHITE_TREE_FRUIT,
            ItemID.SUMMER_PIE,
            ItemID.HALF_A_SUMMER_PIE,
            ItemID.GUTHIX_REST4,
            ItemID.GUTHIX_REST3,
            ItemID.GUTHIX_REST2,
            ItemID.GUTHIX_REST1,
            ItemID.PAPAYA_FRUIT
    )),

    STAMINA_POTIONS(ImmutableList.of(
            ItemID.STAMINA_POTION4,
            ItemID.STAMINA_POTION3,
            ItemID.STAMINA_POTION2,
            ItemID.STAMINA_POTION1,
            ItemID.STAMINA_MIX2,
            ItemID.STAMINA_MIX1
    )),

    AGILITY_POTIONS(ImmutableList.of(
            ItemID.AGILITY_POTION4,
            ItemID.AGILITY_POTION3,
            ItemID.AGILITY_POTION2,
            ItemID.AGILITY_POTION1
    )),

    ANTIFIRE_POTIONS(ImmutableList.of(
            ItemID.ANTIFIRE_POTION4,
            ItemID.ANTIFIRE_POTION3,
            ItemID.ANTIFIRE_POTION2,
            ItemID.ANTIFIRE_POTION1,
            ItemID.SUPER_ANTIFIRE_POTION4,
            ItemID.SUPER_ANTIFIRE_POTION3,
            ItemID.SUPER_ANTIFIRE_POTION2,
            ItemID.SUPER_ANTIFIRE_POTION1,
            ItemID.EXTENDED_ANTIFIRE4,
            ItemID.EXTENDED_ANTIFIRE3,
            ItemID.EXTENDED_ANTIFIRE2,
            ItemID.EXTENDED_ANTIFIRE1,
            ItemID.EXTENDED_SUPER_ANTIFIRE4,
            ItemID.EXTENDED_SUPER_ANTIFIRE3,
            ItemID.EXTENDED_SUPER_ANTIFIRE2,
            ItemID.EXTENDED_SUPER_ANTIFIRE1,
            ItemID.ANTIFIRE_MIX2,
            ItemID.ANTIFIRE_MIX1,
            ItemID.SUPER_ANTIFIRE_MIX2,
            ItemID.SUPER_ANTIFIRE_MIX1
    )),

    // Food

    GOOD_EATING_FOOD(ImmutableList.of(
            ItemID.DARK_CRAB,
            ItemID.TUNA_POTATO,
            ItemID.MANTA_RAY,
            ItemID.SEA_TURTLE,
            ItemID.PINEAPPLE_PIZZA,
            ItemID.SHARK,
            ItemID.MUSHROOM_POTATO,
            ItemID.UGTHANKI_KEBAB_1885,
            ItemID.CURRY,
            ItemID.COOKED_KARAMBWAN,
            ItemID.ANCHOVY_PIZZA,
            ItemID.ANGLERFISH,
            ItemID.MONKFISH,
            ItemID.POTATO_WITH_CHEESE,
            ItemID.MEAT_PIZZA,
            ItemID.POTATO_WITH_BUTTER,
            ItemID.SWORDFISH,
            ItemID.PLAIN_PIZZA,
            ItemID.BASS,
            ItemID.LOBSTER,
            ItemID.CHOCOLATE_CAKE,
            ItemID.CAKE,
            ItemID.STEW,
            ItemID.TUNA,
            ItemID.SALMON,
            ItemID.PIKE,
            ItemID.COD,
            ItemID.TROUT,
            ItemID.MACKEREL,
            ItemID.HERRING,
            ItemID.BREAD,
            ItemID.SARDINE,
            ItemID.COOKED_MEAT,
            ItemID.COOKED_CHICKEN,
            ItemID.SHRIMPS
    )),

    FISH_FOOD(ImmutableList.of(
            ItemID.DARK_CRAB,
            ItemID.MANTA_RAY,
            ItemID.ANGLERFISH,
            ItemID.SEA_TURTLE,
            ItemID.SHARK,
            ItemID.COOKED_KARAMBWAN,
            ItemID.MONKFISH,
            ItemID.COOKED_JUBBLY,
            ItemID.LAVA_EEL,
            ItemID.SWORDFISH,
            ItemID.BASS,
            ItemID.LOBSTER,
            ItemID.RAINBOW_FISH,
            ItemID.TUNA,
            ItemID.CAVE_EEL,
            ItemID.SALMON,
            ItemID.PIKE,
            ItemID.COD,
            ItemID.TROUT,
            ItemID.MACKEREL,
            ItemID.HERRING,
            ItemID.SARDINE,
            ItemID.SHRIMPS
    )),

    GNOME_FOOD(ImmutableList.of(
            ItemID.TANGLED_TOADS_LEGS,
            ItemID.TANGLED_TOADS_LEGS_9551,
            ItemID.CHOCOLATE_BOMB,
            ItemID.CHOCOLATE_BOMB_9553,
            ItemID.WORM_HOLE,
            ItemID.WORM_HOLE_9547,
            ItemID.VEG_BALL,
            ItemID.VEG_BALL_9549,
            ItemID.FRUIT_BATTA,
            ItemID.FRUIT_BATTA_9527,
            ItemID.TOAD_BATTA,
            ItemID.TOAD_BATTA_9529,
            ItemID.WORM_BATTA,
            ItemID.WORM_BATTA_9531,
            ItemID.VEGETABLE_BATTA,
            ItemID.VEGETABLE_BATTA_9533,
            ItemID.CHEESETOM_BATTA,
            ItemID.CHEESETOM_BATTA_9535,
            ItemID.FRUIT_BLAST,
            ItemID.FRUIT_BLAST_9514,
            ItemID.PINEAPPLE_PUNCH,
            ItemID.PINEAPPLE_PUNCH_9512,
            ItemID.TOAD_CRUNCHIES,
            ItemID.TOAD_CRUNCHIES_9538,
            ItemID.WORM_CRUNCHIES,
            ItemID.WORM_CRUNCHIES_9542,
            ItemID.SPICY_CRUNCHIES,
            ItemID.SPICY_CRUNCHIES_9540,
            ItemID.CHOCCHIP_CRUNCHIES,
            ItemID.CHOCCHIP_CRUNCHIES_9544,
            ItemID.BLURBERRY_SPECIAL,
            ItemID.BLURBERRY_SPECIAL_9520,
            ItemID.WIZARD_BLIZZARD,
            ItemID.WIZARD_BLIZZARD_9487,
            ItemID.WIZARD_BLIZZARD_9489,
            ItemID.WIZARD_BLIZZARD_9508,
            ItemID.SHORT_GREEN_GUY,
            ItemID.SHORT_GREEN_GUY_9510,
            ItemID.DRUNK_DRAGON,
            ItemID.DRUNK_DRAGON_9516,
            ItemID.CHOC_SATURDAY,
            ItemID.CHOC_SATURDAY_9518
    )),

    STEWS(ImmutableList.of(
            ItemID.STEW,
            ItemID.CURRY
    )),

    PIZZAS(ImmutableList.of(
            ItemID.PINEAPPLE_PIZZA,
            ItemID.ANCHOVY_PIZZA,
            ItemID.MEAT_PIZZA,
            ItemID.PLAIN_PIZZA
    )),

    POTATO_FOOD(ImmutableList.of(
            ItemID.TUNA_POTATO,
            ItemID.MUSHROOM_POTATO,
            ItemID.EGG_POTATO,
            ItemID.POTATO_WITH_CHEESE,
            ItemID.CHILLI_POTATO,
            ItemID.POTATO_WITH_BUTTER,
            ItemID.BAKED_POTATO
    )),

    PIES(ImmutableList.of(
            ItemID.SUMMER_PIE,
            ItemID.WILD_PIE,
            ItemID.DRAGONFRUIT_PIE,
            ItemID.ADMIRAL_PIE,
            ItemID.MUSHROOM_PIE,
            ItemID.BOTANICAL_PIE,
            ItemID.FISH_PIE,
            ItemID.GARDEN_PIE,
            ItemID.APPLE_PIE,
            ItemID.MUD_PIE,
            ItemID.MEAT_PIE,
            ItemID.REDBERRY_PIE
    )),

    // Teleport items

    GAMES_NECKLACES(ImmutableList.of(
            ItemID.GAMES_NECKLACE1,
            ItemID.GAMES_NECKLACE2,
            ItemID.GAMES_NECKLACE3,
            ItemID.GAMES_NECKLACE4,
            ItemID.GAMES_NECKLACE5,
            ItemID.GAMES_NECKLACE6,
            ItemID.GAMES_NECKLACE7,
            ItemID.GAMES_NECKLACE8
    )),

    RING_OF_DUELINGS(ImmutableList.of(
            ItemID.RING_OF_DUELING1,
            ItemID.RING_OF_DUELING2,
            ItemID.RING_OF_DUELING3,
            ItemID.RING_OF_DUELING4,
            ItemID.RING_OF_DUELING5,
            ItemID.RING_OF_DUELING6,
            ItemID.RING_OF_DUELING7,
            ItemID.RING_OF_DUELING8
    )),

    BURNING_AMULETS(ImmutableList.of(
            ItemID.BURNING_AMULET1,
            ItemID.BURNING_AMULET2,
            ItemID.BURNING_AMULET3,
            ItemID.BURNING_AMULET4,
            ItemID.BURNING_AMULET5
    )),

    NECKLACE_OF_PASSAGES(ImmutableList.of(
            ItemID.NECKLACE_OF_PASSAGE1,
            ItemID.NECKLACE_OF_PASSAGE2,
            ItemID.NECKLACE_OF_PASSAGE3,
            ItemID.NECKLACE_OF_PASSAGE4,
            ItemID.NECKLACE_OF_PASSAGE5
    )),

    SKILLS_NECKLACES(ImmutableList.of(
            ItemID.SKILLS_NECKLACE1,
            ItemID.SKILLS_NECKLACE2,
            ItemID.SKILLS_NECKLACE3,
            ItemID.SKILLS_NECKLACE4,
            ItemID.SKILLS_NECKLACE5,
            ItemID.SKILLS_NECKLACE6
    )),

    RING_OF_WEALTHS(ImmutableList.of(
            ItemID.RING_OF_WEALTH_1,
            ItemID.RING_OF_WEALTH_I1,
            ItemID.RING_OF_WEALTH_2,
            ItemID.RING_OF_WEALTH_I2,
            ItemID.RING_OF_WEALTH_3,
            ItemID.RING_OF_WEALTH_I3,
            ItemID.RING_OF_WEALTH_4,
            ItemID.RING_OF_WEALTH_I4,
            ItemID.RING_OF_WEALTH_5,
            ItemID.RING_OF_WEALTH_I5
    )),

    COMBAT_BRACELETS(ImmutableList.of(
            ItemID.COMBAT_BRACELET1,
            ItemID.COMBAT_BRACELET2,
            ItemID.COMBAT_BRACELET3,
            ItemID.COMBAT_BRACELET4,
            ItemID.COMBAT_BRACELET5,
            ItemID.COMBAT_BRACELET6
    )),

    AMULET_OF_GLORIES(ImmutableList.of(
            ItemID.AMULET_OF_ETERNAL_GLORY,
            ItemID.AMULET_OF_GLORY1,
            ItemID.AMULET_OF_GLORY_T1,
            ItemID.AMULET_OF_GLORY2,
            ItemID.AMULET_OF_GLORY_T2,
            ItemID.AMULET_OF_GLORY3,
            ItemID.AMULET_OF_GLORY_T3,
            ItemID.AMULET_OF_GLORY4,
            ItemID.AMULET_OF_GLORY_T4,
            ItemID.AMULET_OF_GLORY5,
            ItemID.AMULET_OF_GLORY_T5,
            ItemID.AMULET_OF_GLORY6,
            ItemID.AMULET_OF_GLORY_T6
    )),

    DIGSITE_PENDANTS(ImmutableList.of(
            ItemID.DIGSITE_PENDANT_1,
            ItemID.DIGSITE_PENDANT_2,
            ItemID.DIGSITE_PENDANT_3,
            ItemID.DIGSITE_PENDANT_4,
            ItemID.DIGSITE_PENDANT_5
    )),

    SLAYER_RINGS(ImmutableList.of(
            ItemID.SLAYER_RING_ETERNAL,
            ItemID.SLAYER_RING_1,
            ItemID.SLAYER_RING_2,
            ItemID.SLAYER_RING_3,
            ItemID.SLAYER_RING_4,
            ItemID.SLAYER_RING_5,
            ItemID.SLAYER_RING_6,
            ItemID.SLAYER_RING_7,
            ItemID.SLAYER_RING_8
    )),

    PHAROAH_SCEPTRE(ImmutableList.of(
            ItemID.PHARAOHS_SCEPTRE_26948,
            ItemID.PHARAOHS_SCEPTRE_UNCHARGED
    )),

    EXPLORERS_RINGS(ImmutableList.of(
            ItemID.EXPLORERS_RING_4,
            ItemID.EXPLORERS_RING_3,
            ItemID.EXPLORERS_RING_2
    )),

    // Logs

    LOGS_FOR_FIRE(ImmutableList.of(
            ItemID.LOGS,
            ItemID.OAK_LOGS,
            ItemID.WILLOW_LOGS,
            ItemID.TEAK_LOGS,
            ItemID.REDWOOD_LOGS,
            ItemID.MAPLE_LOGS,
            ItemID.MAHOGANY_LOGS,
            ItemID.YEW_LOGS,
            ItemID.MAGIC_LOGS,
            ItemID.BLISTERWOOD_LOGS,
            ItemID.ARCTIC_PINE_LOGS,
            ItemID.ACHEY_TREE_LOGS,
            ItemID.REDWOOD_PYRE_LOGS,
            ItemID.MAGIC_PYRE_LOGS,
            ItemID.YEW_PYRE_LOGS,
            ItemID.MAHOGANY_PYRE_LOGS,
            ItemID.MAPLE_PYRE_LOGS,
            ItemID.ARCTIC_PYRE_LOGS,
            ItemID.TEAK_PYRE_LOGS,
            ItemID.WILLOW_PYRE_LOGS,
            ItemID.OAK_PYRE_LOGS,
            ItemID.PYRE_LOGS,
            ItemID.GREEN_LOGS,
            ItemID.RED_LOGS,
            ItemID.PURPLE_LOGS,
            ItemID.WHITE_LOGS,
            ItemID.BLUE_LOGS
    )),

    BONES(ImmutableList.of(
            ItemID.BONES,
            ItemID.BURNT_BONES,
            ItemID.WOLF_BONES,
            ItemID.BAT_BONES,
            ItemID.BIG_BONES,
            ItemID.JOGRE_BONES,
            ItemID.BABYDRAGON_BONES,
            ItemID.DRAGON_BONES,
            ItemID.DAGANNOTH_BONES
    )),

    // Other

    GREEGREES(ImmutableList.of(
            ItemID.KARAMJAN_MONKEY_GREEGREE,
            ItemID.GORILLA_GREEGREE,
            ItemID.ANCIENT_GORILLA_GREEGREE,
            ItemID.BEARDED_GORILLA_GREEGREE,
            ItemID.KRUK_MONKEY_GREEGREE,
            ItemID.NINJA_MONKEY_GREEGREE,
            ItemID.ZOMBIE_MONKEY_GREEGREE,
            ItemID.ZOMBIE_MONKEY_GREEGREE_4030,
            ItemID.NINJA_MONKEY_GREEGREE_4025
    )),

    ANTIFIRE_SHIELDS(ImmutableList.of(
            ItemID.DRAGONFIRE_SHIELD,
            ItemID.DRAGONFIRE_SHIELD_11284,
            ItemID.DRAGONFIRE_WARD,
            ItemID.DRAGONFIRE_WARD_22003,
            ItemID.ANCIENT_WYVERN_SHIELD,
            ItemID.ANCIENT_WYVERN_SHIELD_21634,
            ItemID.ANTIDRAGON_SHIELD,
            ItemID.ANTIDRAGON_SHIELD_8282
    )),

    ANTI_WYVERN_SHIELDS(ImmutableList.of(
            ItemID.DRAGONFIRE_SHIELD,
            ItemID.DRAGONFIRE_SHIELD_11284,
            ItemID.DRAGONFIRE_WARD,
            ItemID.DRAGONFIRE_WARD_22003,
            ItemID.ANCIENT_WYVERN_SHIELD,
            ItemID.ANCIENT_WYVERN_SHIELD_21634,
            ItemID.MIND_SHIELD,
            ItemID.ELEMENTAL_SHIELD
    )),

    GHOSTSPEAK(ImmutableList.of(
            ItemID.GHOSTSPEAK_AMULET,
            ItemID.GHOSTSPEAK_AMULET_4250,
            ItemID.MORYTANIA_LEGS_2,
            ItemID.MORYTANIA_LEGS_3,
            ItemID.MORYTANIA_LEGS_4
    )),

    LIGHT_SOURCES("Light_sources", ImmutableList.of(
            ItemID.FIREMAKING_CAPET,
            ItemID.FIREMAKING_CAPE,
            ItemID.MAX_CAPE,
            ItemID.BRUMA_TORCH,
            ItemID.KANDARIN_HEADGEAR_4,
            ItemID.KANDARIN_HEADGEAR_3,
            ItemID.KANDARIN_HEADGEAR_2,
            ItemID.KANDARIN_HEADGEAR_1,
            ItemID.BULLSEYE_LANTERN_4550,
            ItemID.SAPPHIRE_LANTERN_4702,
            ItemID.EMERALD_LANTERN_9065,
            ItemID.OIL_LANTERN_4539,
            ItemID.CANDLE_LANTERN_4531,
            ItemID.CANDLE_LANTERN_4534,
            ItemID.MINING_HELMET,
            ItemID.OIL_LAMP_4524,
            ItemID.LIT_TORCH,
            ItemID.LIT_CANDLE,
            ItemID.LIT_BLACK_CANDLE,
            ItemID.ABYSSAL_LANTERN_NORMAL_LOGS,
            ItemID.ABYSSAL_LANTERN_BLUE_LOGS,
            ItemID.ABYSSAL_LANTERN_RED_LOGS,
            ItemID.ABYSSAL_LANTERN_WHITE_LOGS,
            ItemID.ABYSSAL_LANTERN_PURPLE_LOGS,
            ItemID.ABYSSAL_LANTERN_GREEN_LOGS,
            ItemID.ABYSSAL_LANTERN_OAK_LOGS,
            ItemID.ABYSSAL_LANTERN_WILLOW_LOGS,
            ItemID.ABYSSAL_LANTERN_MAPLE_LOGS,
            ItemID.ABYSSAL_LANTERN_YEW_LOGS,
            ItemID.ABYSSAL_LANTERN_BLISTERWOOD_LOGS,
            ItemID.ABYSSAL_LANTERN_MAGIC_LOGS,
            ItemID.ABYSSAL_LANTERN_REDWOOD_LOGS
    )),

    CATS(ImmutableList.of(
            ItemID.WILY_HELLCAT,
            ItemID.WILY_CAT,
            ItemID.WILY_CAT_6556,
            ItemID.WILY_CAT_6557,
            ItemID.WILY_CAT_6558,
            ItemID.WILY_CAT_6559,
            ItemID.WILY_CAT_6560,

            ItemID.LAZY_HELL_CAT,
            ItemID.LAZY_CAT,
            ItemID.LAZY_CAT_6550,
            ItemID.LAZY_CAT_6551,
            ItemID.LAZY_CAT_6552,
            ItemID.LAZY_CAT_6553,
            ItemID.LAZY_CAT_6554,

            ItemID.HELL_CAT,
            ItemID.PET_CAT,
            ItemID.PET_CAT_1562,
            ItemID.PET_CAT_1563,
            ItemID.PET_CAT_1564,
            ItemID.PET_CAT_1565,
            ItemID.PET_CAT_1566,

            ItemID.HELLKITTEN,
            ItemID.PET_KITTEN,
            ItemID.PET_KITTEN_1556,
            ItemID.PET_KITTEN_1557,
            ItemID.PET_KITTEN_1558,
            ItemID.PET_KITTEN_1559,
            ItemID.PET_KITTEN_1560,
            // Overgrown cats
            ItemID.OVERGROWN_HELLCAT,
            ItemID.PET_CAT_1567,
            ItemID.PET_CAT_1568,
            ItemID.PET_CAT_1569,
            ItemID.PET_CAT_1570,
            ItemID.PET_CAT_1571,
            ItemID.PET_CAT_1572
    )),

    HUNTING_CATS(ImmutableList.of(
            ItemID.WILY_HELLCAT,
            ItemID.WILY_CAT,
            ItemID.WILY_CAT_6556,
            ItemID.WILY_CAT_6557,
            ItemID.WILY_CAT_6558,
            ItemID.WILY_CAT_6559,
            ItemID.WILY_CAT_6560,

            ItemID.LAZY_HELL_CAT,
            ItemID.LAZY_CAT,
            ItemID.LAZY_CAT_6550,
            ItemID.LAZY_CAT_6551,
            ItemID.LAZY_CAT_6552,
            ItemID.LAZY_CAT_6553,
            ItemID.LAZY_CAT_6554,

            ItemID.HELL_CAT,
            ItemID.PET_CAT,
            ItemID.PET_CAT_1562,
            ItemID.PET_CAT_1563,
            ItemID.PET_CAT_1564,
            ItemID.PET_CAT_1565,
            ItemID.PET_CAT_1566,

            ItemID.HELLKITTEN,
            ItemID.PET_KITTEN,
            ItemID.PET_KITTEN_1556,
            ItemID.PET_KITTEN_1557,
            ItemID.PET_KITTEN_1558,
            ItemID.PET_KITTEN_1559,
            ItemID.PET_KITTEN_1560
    )),

    FLOWERS(ImmutableList.of(
            ItemID.RED_FLOWERS,
            ItemID.YELLOW_FLOWERS,
            ItemID.PURPLE_FLOWERS,
            ItemID.ORANGE_FLOWERS,
            ItemID.MIXED_FLOWERS,
            ItemID.ASSORTED_FLOWERS,
            ItemID.BLACK_FLOWERS,
            ItemID.WHITE_FLOWERS,
            ItemID.RED_FLOWERS_8938,
            ItemID.BLUE_FLOWERS_8936
    )),

    ROD_OF_IVANDIS(ImmutableList.of(
            ItemID.ROD_OF_IVANDIS_10,
            ItemID.ROD_OF_IVANDIS_9,
            ItemID.ROD_OF_IVANDIS_8,
            ItemID.ROD_OF_IVANDIS_7,
            ItemID.ROD_OF_IVANDIS_6,
            ItemID.ROD_OF_IVANDIS_5,
            ItemID.ROD_OF_IVANDIS_4,
            ItemID.ROD_OF_IVANDIS_3,
            ItemID.ROD_OF_IVANDIS_2,
            ItemID.ROD_OF_IVANDIS_1
    )),

    SALVE_AMULET(ImmutableList.of(
            ItemID.SALVE_AMULETEI,
            ItemID.SALVE_AMULET_E,
            ItemID.SALVE_AMULETI,
            ItemID.SALVE_AMULET,
            ItemID.SALVE_AMULETEI_25278,
            ItemID.SALVE_AMULETI_25250,
            ItemID.SALVE_AMULETI_26763,
            ItemID.SALVE_AMULETEI_26782
    )),

    WATERING_CANS(ImmutableList.of(
            ItemID.GRICOLLERS_CAN,
            ItemID.WATERING_CAN8,
            ItemID.WATERING_CAN7,
            ItemID.WATERING_CAN6,
            ItemID.WATERING_CAN5,
            ItemID.WATERING_CAN4,
            ItemID.WATERING_CAN3,
            ItemID.WATERING_CAN2,
            ItemID.WATERING_CAN1
    )),

    ENCHANTED_LYRE(ImmutableList.of(
            ItemID.ENCHANTED_LYREI,
            ItemID.ENCHANTED_LYRE5,
            ItemID.ENCHANTED_LYRE4,
            ItemID.ENCHANTED_LYRE3,
            ItemID.ENCHANTED_LYRE2,
            ItemID.ENCHANTED_LYRE1
    )),

    SKILLCAPE(ImmutableList.of(
            ItemID.AGILITY_CAPE,
            ItemID.AGILITY_CAPET,
            ItemID.ATTACK_CAPE,
            ItemID.ATTACK_CAPET,
            ItemID.CONSTRUCT_CAPE,
            ItemID.CONSTRUCT_CAPET,
            ItemID.COOKING_CAPE,
            ItemID.COOKING_CAPET,
            ItemID.CRAFTING_CAPE,
            ItemID.CRAFTING_CAPET,
            ItemID.DEFENCE_CAPE,
            ItemID.DEFENCE_CAPET,
            ItemID.FARMING_CAPE,
            ItemID.FARMING_CAPET,
            ItemID.FIREMAKING_CAPE,
            ItemID.FIREMAKING_CAPET,
            ItemID.FISHING_CAPE,
            ItemID.FISHING_CAPET,
            ItemID.FLETCHING_CAPE,
            ItemID.FLETCHING_CAPET,
            ItemID.HERBLORE_CAPE,
            ItemID.HERBLORE_CAPET,
            ItemID.HITPOINTS_CAPE,
            ItemID.HITPOINTS_CAPET,
            ItemID.HUNTER_CAPE,
            ItemID.HUNTER_CAPET,
            ItemID.MAGIC_CAPE,
            ItemID.MAGIC_CAPET,
            ItemID.MINING_CAPE,
            ItemID.MINING_CAPET,
            ItemID.PRAYER_CAPE,
            ItemID.PRAYER_CAPET,
            ItemID.RANGING_CAPE,
            ItemID.RANGING_CAPET,
            ItemID.RUNECRAFT_CAPE,
            ItemID.RUNECRAFT_CAPET,
            ItemID.SLAYER_CAPE,
            ItemID.SLAYER_CAPET,
            ItemID.SMITHING_CAPE,
            ItemID.SMITHING_CAPET,
            ItemID.STRENGTH_CAPE,
            ItemID.STRENGTH_CAPET,
            ItemID.THIEVING_CAPE,
            ItemID.THIEVING_CAPET,
            ItemID.WOODCUTTING_CAPE,
            ItemID.WOODCUT_CAPET,
            ItemID.QUEST_POINT_CAPE,
            ItemID.QUEST_POINT_CAPE_T
    )),

    SLAYER_HELMETS(SharedCollections.slayer_helmets),

    RAW_FISH(ImmutableList.of(
            ItemID.RAW_SHRIMPS,
            ItemID.RAW_SARDINE,
            ItemID.RAW_KARAMBWANJI,
            ItemID.RAW_HERRING,
            ItemID.RAW_ANCHOVIES,
            ItemID.RAW_MACKEREL,
            ItemID.RAW_TROUT,
            ItemID.RAW_COD,
            ItemID.RAW_PIKE,
            ItemID.RAW_SLIMY_EEL,
            ItemID.RAW_SALMON,
            ItemID.RAW_TUNA,
            ItemID.RAW_RAINBOW_FISH,
            ItemID.RAW_CAVE_EEL,
            ItemID.RAW_LOBSTER,
            ItemID.RAW_BASS,
            ItemID.RAW_SWORDFISH,
            ItemID.RAW_LAVA_EEL,
            ItemID.RAW_MONKFISH,
            ItemID.RAW_KARAMBWAN,
            ItemID.RAW_SHARK,
            ItemID.RAW_SEA_TURTLE,
            ItemID.RAW_MANTA_RAY,
            ItemID.RAW_ANGLERFISH,
            ItemID.RAW_DARK_CRAB
    )),

    COMPOST(ImmutableList.of(
            ItemID.BOTTOMLESS_COMPOST_BUCKET_22997,
            ItemID.ULTRACOMPOST,
            ItemID.SUPERCOMPOST,
            ItemID.COMPOST
    )),

    FAIRY_STAFF(ImmutableList.of(
            ItemID.LUNAR_STAFF,
            ItemID.LUNAR_STAFF__PT3,
            ItemID.LUNAR_STAFF__PT2,
            ItemID.LUNAR_STAFF__PT1,
            ItemID.DRAMEN_STAFF
    )),

    EARTH_ALTAR(ImmutableList.of(
            ItemID.ELEMENTAL_TIARA,
            ItemID.ELEMENTAL_TALISMAN,
            ItemID.EARTH_TIARA,
            ItemID.EARTH_TALISMAN
    )),

    ESSENCE_LOW(ImmutableList.of(
            ItemID.DAEYALT_ESSENCE,
            ItemID.PURE_ESSENCE,
            ItemID.RUNE_ESSENCE
    )),

    ESSENCE_HIGH(ImmutableList.of(
            ItemID.DAEYALT_ESSENCE,
            ItemID.PURE_ESSENCE
    )),

    COINS(ImmutableList.of(
            ItemID.COINS_995,
            ItemID.COINS_8890,
            ItemID.COINS_6964,
            ItemID.COINS
    )),

    COOKING_GUILD(ImmutableList.of(
            ItemID.CHEFS_HAT,
            ItemID.VARROCK_ARMOUR_3,
            ItemID.VARROCK_ARMOUR_4,
            ItemID.COOKING_CAPET,
            ItemID.COOKING_CAPE
    )),

    MINING_HELM(ImmutableList.of(
            ItemID.MINING_HELMET_5014,
            ItemID.MINING_HELMET
    )),

    QUICKLIME_GLOVES(ImmutableList.of(
            ItemID.FEROCIOUS_GLOVES, ItemID.BARROWS_GLOVES, ItemID.DRAGON_GLOVES, ItemID.GRANITE_GLOVES,
            ItemID.RUNE_GLOVES, ItemID.ADAMANT_GLOVES, ItemID.MITHRIL_GLOVES, ItemID.BLACK_GLOVES,
            ItemID.STEEL_GLOVES, ItemID.IRON_GLOVES, ItemID.BRONZE_GLOVES, ItemID.ANTISANTA_GLOVES,
            ItemID.GREY_GLOVES, ItemID.RED_GLOVES, ItemID.YELLOW_GLOVES, ItemID.TEAL_GLOVES,
            ItemID.PURPLE_GLOVES, ItemID.COW_GLOVES, ItemID.FREMENNIK_GLOVES, ItemID.GLOVES_OF_SILENCE,
            ItemID.GHOSTLY_GLOVES, ItemID.HARDLEATHER_GLOVES, ItemID.HAM_GLOVES, ItemID.ICE_GLOVES,
            ItemID.INFINITY_GLOVES, ItemID.LEATHER_GLOVES, ItemID.LUNAR_GLOVES, ItemID.MIME_GLOVES,
            ItemID.MOONCLAN_GLOVES, ItemID.MOURNER_GLOVES, ItemID.MYSTIC_GLOVES, ItemID.MYSTIC_GLOVES_DARK,
            ItemID.MYSTIC_GLOVES_DUSK, ItemID.MYSTIC_GLOVES_LIGHT, ItemID.PENANCE_GLOVES, ItemID.ROCKSHELL_GLOVES,
            ItemID.ROGUE_GLOVES, ItemID.SANTA_GLOVES, ItemID.SLAYER_GLOVES, ItemID.SPINED_GLOVES,
            ItemID.VOID_KNIGHT_GLOVES, ItemID.WHITE_GLOVES, ItemID.ZOMBIE_GLOVES, ItemID.ANCIENT_CEREMONIAL_GLOVES,
            ItemID.BLOODBARK_GAUNTLETS, ItemID.BUNNY_PAWS, ItemID.CHAOS_GAUNTLETS, ItemID.CLUE_HUNTER_GLOVES,
            ItemID.COOKING_GAUNTLETS, ItemID.CRAB_CLAW, ItemID.CRABCLAW_HOOK, ItemID.DRAGONSTONE_GAUNTLETS,
            ItemID.EXPERT_MINING_GLOVES, ItemID.GILDED_DHIDE_VAMBRACES, ItemID.GLOVES_OF_DARKNESS, ItemID.GOLDSMITH_GAUNTLETS,
            ItemID.GROUP_IRONMAN_BRACERS, ItemID.GROUP_IRONMAN_BRACERS_UNRANKED, ItemID.HARDCORE_GROUP_IRONMAN_BRACERS, ItemID.HOLY_WRAPS,
            ItemID.KLANKS_GAUNTLETS, ItemID.MINING_GLOVES, ItemID.ORNATE_GLOVES, ItemID.PIRATES_HOOK,
            ItemID.RANGER_GLOVES, ItemID.REGEN_BRACELET, ItemID.SAMURAI_GLOVES, ItemID.SHAYZIEN_GLOVES_5,
            ItemID.SHAYZIEN_GLOVES_4, ItemID.SHAYZIEN_GLOVES_3, ItemID.SHAYZIEN_GLOVES_2, ItemID.SHAYZIEN_GLOVES_1,
            ItemID.SNOW_IMP_COSTUME_GLOVES, ItemID.SPLITBARK_GAUNTLETS, ItemID.SPOOKIER_GLOVES, ItemID.SPOOKY_GLOVES,
            ItemID.STEEL_GAUNTLETS, ItemID.SUPERIOR_MINING_GLOVES, ItemID.SWAMPBARK_GAUNTLETS, ItemID.WARM_GLOVES,
            ItemID.ZARYTE_VAMBRACES, ItemID.SMITHS_GLOVES_I, ItemID.KARAMJA_GLOVES_4, ItemID.KARAMJA_GLOVES_3,
            ItemID.KARAMJA_GLOVES_2, ItemID.KARAMJA_GLOVES_1
    )),

    BELLADONNA_GLOVES(ImmutableList.of(
            ItemID.FEROCIOUS_GLOVES, ItemID.BARROWS_GLOVES, ItemID.DRAGON_GLOVES, ItemID.GRANITE_GLOVES,
            ItemID.RUNE_GLOVES, ItemID.ADAMANT_GLOVES, ItemID.MITHRIL_GLOVES, ItemID.BLACK_GLOVES,
            ItemID.STEEL_GLOVES, ItemID.IRON_GLOVES, ItemID.BRONZE_GLOVES, ItemID.ANCIENT_BRACERS,
            ItemID.ARMADYL_BRACERS, ItemID.BANDOS_BRACERS, ItemID.BLACK_DHIDE_VAMBRACES, ItemID.BLACK_SPIKY_VAMBRACES,
            ItemID.BLOODBARK_GAUNTLETS, ItemID.BLUE_DHIDE_VAMBRACES, ItemID.BLUE_SPIKY_VAMBRACES, ItemID.CHAOS_GAUNTLETS,
            ItemID.CLUE_HUNTER_GLOVES, ItemID.COOKING_GAUNTLETS, ItemID.CRAB_CLAW, ItemID.CRABCLAW_HOOK,
            ItemID.DRAGONSTONE_GAUNTLETS, ItemID.EXPERT_MINING_GLOVES, ItemID.GILDED_DHIDE_VAMBRACES, ItemID.GLOVES_OF_DARKNESS,
            ItemID.GOLDSMITH_GAUNTLETS, ItemID.GREEN_DHIDE_VAMBRACES, ItemID.GREEN_SPIKY_VAMBRACES, ItemID.GROUP_IRONMAN_BRACERS,
            ItemID.GROUP_IRONMAN_BRACERS_UNRANKED, ItemID.GUTHIX_BRACERS, ItemID.HARDCORE_GROUP_IRONMAN_BRACERS, ItemID.KLANKS_GAUNTLETS,
            ItemID.LEATHER_VAMBRACES, ItemID.MINING_GLOVES, ItemID.MUMMYS_HANDS, ItemID.GREY_GLOVES,
            ItemID.RED_GLOVES, ItemID.YELLOW_GLOVES, ItemID.TEAL_GLOVES, ItemID.PURPLE_GLOVES,
            ItemID.FREMENNIK_GLOVES, ItemID.GLOVES_OF_SILENCE, ItemID.GHOSTLY_GLOVES, ItemID.HARDLEATHER_GLOVES,
            ItemID.HAM_GLOVES, ItemID.ICE_GLOVES, ItemID.INFINITY_GLOVES, ItemID.LEATHER_GLOVES,
            ItemID.LUNAR_GLOVES, ItemID.MOONCLAN_GLOVES, ItemID.MOURNER_GLOVES, ItemID.MYSTIC_GLOVES,
            ItemID.MYSTIC_GLOVES_DARK, ItemID.MYSTIC_GLOVES_DUSK, ItemID.MYSTIC_GLOVES_LIGHT, ItemID.MYSTIC_GLOVES_OR,
            ItemID.ORNATE_GLOVES, ItemID.PENANCE_GLOVES, ItemID.PIRATES_HOOK, ItemID.RANGER_GLOVES,
            ItemID.RED_DHIDE_VAMBRACES, ItemID.RED_SPIKY_VAMBRACES, ItemID.REGEN_BRACELET, ItemID.ROCKSHELL_GLOVES,
            ItemID.ROGUE_GLOVES, ItemID.SAMURAI_GLOVES, ItemID.SARADOMIN_BRACERS, ItemID.SHAYZIEN_GLOVES_5,
            ItemID.SHAYZIEN_GLOVES_4, ItemID.SHAYZIEN_GLOVES_3, ItemID.SHAYZIEN_GLOVES_2, ItemID.SHAYZIEN_GLOVES_1,
            ItemID.SLAYER_GLOVES, ItemID.SMITHS_GLOVES, ItemID.SNAKESKIN_VAMBRACES, ItemID.SPIKY_VAMBRACES,
            ItemID.SPINED_GLOVES, ItemID.SPLITBARK_GAUNTLETS, ItemID.STEEL_GAUNTLETS, ItemID.SUPERIOR_MINING_GLOVES,
            ItemID.SWAMPBARK_GAUNTLETS, ItemID.VOID_KNIGHT_GLOVES, ItemID.VOID_KNIGHT_GLOVES_OR, ItemID.WHITE_GLOVES,
            ItemID.ZAMORAK_BRACERS, ItemID.ZARYTE_VAMBRACES, ItemID.SKELETAL_GLOVES, ItemID.KARAMJA_GLOVES_4,
            ItemID.KARAMJA_GLOVES_3, ItemID.KARAMJA_GLOVES_2, ItemID.KARAMJA_GLOVES_1
    )),

    GRACEFUL_TOP(ImmutableList.of(
            ItemID.GRACEFUL_TOP, ItemID.GRACEFUL_TOP_11855, ItemID.GRACEFUL_TOP_13583, ItemID.GRACEFUL_TOP_13584,
            ItemID.GRACEFUL_TOP_13595, ItemID.GRACEFUL_TOP_13596, ItemID.GRACEFUL_TOP_13607, ItemID.GRACEFUL_TOP_13608,
            ItemID.GRACEFUL_TOP_13619, ItemID.GRACEFUL_TOP_13620, ItemID.GRACEFUL_TOP_13631, ItemID.GRACEFUL_TOP_13632,
            ItemID.GRACEFUL_TOP_13671, ItemID.GRACEFUL_TOP_13672, ItemID.GRACEFUL_TOP_21067, ItemID.GRACEFUL_TOP_21069,
            ItemID.GRACEFUL_TOP_24749, ItemID.GRACEFUL_TOP_24751, ItemID.GRACEFUL_TOP_25075, ItemID.GRACEFUL_TOP_25077,
            ItemID.GRACEFUL_TOP_27450, ItemID.GRACEFUL_TOP_27452
    )),

    GRACEFUL_LEGS(ImmutableList.of(
            ItemID.GRACEFUL_LEGS, ItemID.GRACEFUL_LEGS_11857, ItemID.GRACEFUL_LEGS_13585, ItemID.GRACEFUL_LEGS_13586,
            ItemID.GRACEFUL_LEGS_13597, ItemID.GRACEFUL_LEGS_13598, ItemID.GRACEFUL_LEGS_13609, ItemID.GRACEFUL_LEGS_13610,
            ItemID.GRACEFUL_LEGS_13621, ItemID.GRACEFUL_LEGS_13622, ItemID.GRACEFUL_LEGS_13633, ItemID.GRACEFUL_LEGS_13634,
            ItemID.GRACEFUL_LEGS_13673, ItemID.GRACEFUL_LEGS_13674, ItemID.GRACEFUL_LEGS_21070, ItemID.GRACEFUL_LEGS_21072,
            ItemID.GRACEFUL_LEGS_24752, ItemID.GRACEFUL_LEGS_24754, ItemID.GRACEFUL_LEGS_25078, ItemID.GRACEFUL_LEGS_25080,
            ItemID.GRACEFUL_LEGS_27453, ItemID.GRACEFUL_LEGS_27455
    )),

    GRACEFUL_HOOD(ImmutableList.of(
            ItemID.GRACEFUL_HOOD, ItemID.GRACEFUL_HOOD_11851, ItemID.GRACEFUL_HOOD_13579, ItemID.GRACEFUL_HOOD_13580,
            ItemID.GRACEFUL_HOOD_13591, ItemID.GRACEFUL_HOOD_13592, ItemID.GRACEFUL_HOOD_13603, ItemID.GRACEFUL_HOOD_13604,
            ItemID.GRACEFUL_HOOD_13615, ItemID.GRACEFUL_HOOD_13616, ItemID.GRACEFUL_HOOD_13627, ItemID.GRACEFUL_HOOD_13628,
            ItemID.GRACEFUL_HOOD_13667, ItemID.GRACEFUL_HOOD_13668, ItemID.GRACEFUL_HOOD_21061, ItemID.GRACEFUL_HOOD_21063,
            ItemID.GRACEFUL_HOOD_24743, ItemID.GRACEFUL_HOOD_24745, ItemID.GRACEFUL_HOOD_25069, ItemID.GRACEFUL_HOOD_25071,
            ItemID.GRACEFUL_HOOD_27444, ItemID.GRACEFUL_HOOD_27446
    )),

    GRACEFUL_CAPE(ImmutableList.of(
            ItemID.GRACEFUL_CAPE, ItemID.GRACEFUL_CAPE_11853, ItemID.GRACEFUL_CAPE_13581, ItemID.GRACEFUL_CAPE_13582,
            ItemID.GRACEFUL_CAPE_13593, ItemID.GRACEFUL_CAPE_13594, ItemID.GRACEFUL_CAPE_13605, ItemID.GRACEFUL_CAPE_13606,
            ItemID.GRACEFUL_CAPE_13617, ItemID.GRACEFUL_CAPE_13618, ItemID.GRACEFUL_CAPE_13629, ItemID.GRACEFUL_CAPE_13630,
            ItemID.GRACEFUL_CAPE_13669, ItemID.GRACEFUL_CAPE_13670, ItemID.GRACEFUL_CAPE_21064, ItemID.GRACEFUL_CAPE_21066,
            ItemID.GRACEFUL_CAPE_24746, ItemID.GRACEFUL_CAPE_24748, ItemID.GRACEFUL_CAPE_25072, ItemID.GRACEFUL_CAPE_25074,
            ItemID.GRACEFUL_CAPE_27447, ItemID.GRACEFUL_CAPE_27449
    )),

    GRACEFUL_BOOTS(ImmutableList.of(
            ItemID.GRACEFUL_BOOTS, ItemID.GRACEFUL_BOOTS_11861, ItemID.GRACEFUL_BOOTS_13589, ItemID.GRACEFUL_BOOTS_13590,
            ItemID.GRACEFUL_BOOTS_13601, ItemID.GRACEFUL_BOOTS_13602, ItemID.GRACEFUL_BOOTS_13613, ItemID.GRACEFUL_BOOTS_13614,
            ItemID.GRACEFUL_BOOTS_13625, ItemID.GRACEFUL_BOOTS_13626, ItemID.GRACEFUL_BOOTS_13637, ItemID.GRACEFUL_BOOTS_13638,
            ItemID.GRACEFUL_BOOTS_13677, ItemID.GRACEFUL_BOOTS_13678, ItemID.GRACEFUL_BOOTS_21076, ItemID.GRACEFUL_BOOTS_21078,
            ItemID.GRACEFUL_BOOTS_24758, ItemID.GRACEFUL_BOOTS_24760, ItemID.GRACEFUL_BOOTS_25084, ItemID.GRACEFUL_BOOTS_25086,
            ItemID.GRACEFUL_BOOTS_27459, ItemID.GRACEFUL_BOOTS_27461
    )),

    GRACEFUL_GLOVES(ImmutableList.of(
            ItemID.GRACEFUL_GLOVES, ItemID.GRACEFUL_GLOVES_11859, ItemID.GRACEFUL_GLOVES_13587, ItemID.GRACEFUL_GLOVES_13588,
            ItemID.GRACEFUL_GLOVES_13599, ItemID.GRACEFUL_GLOVES_13600, ItemID.GRACEFUL_GLOVES_13611, ItemID.GRACEFUL_GLOVES_13612,
            ItemID.GRACEFUL_GLOVES_13623, ItemID.GRACEFUL_GLOVES_13624, ItemID.GRACEFUL_GLOVES_13635, ItemID.GRACEFUL_GLOVES_13636,
            ItemID.GRACEFUL_GLOVES_13675, ItemID.GRACEFUL_GLOVES_13676, ItemID.GRACEFUL_GLOVES_21073, ItemID.GRACEFUL_GLOVES_21075,
            ItemID.GRACEFUL_GLOVES_24755, ItemID.GRACEFUL_GLOVES_24757, ItemID.GRACEFUL_GLOVES_25081, ItemID.GRACEFUL_GLOVES_25083,
            ItemID.GRACEFUL_GLOVES_27456, ItemID.GRACEFUL_GLOVES_27458
    )),

    QUEST_CAPE(ImmutableList.of(
            ItemID.QUEST_POINT_CAPE_T,
            ItemID.QUEST_POINT_CAPE
    )),

    COSMIC_ALTAR(ImmutableList.of(
            ItemID.CATALYTIC_TIARA,
            ItemID.CATALYTIC_TALISMAN,
            ItemID.COSMIC_TIARA,
            ItemID.COSMIC_TALISMAN
    )),

    WALL_BEAST(new ImmutableList.Builder<Integer>()
            .addAll(SharedCollections.slayer_helmets)
            .add(ItemID.SPINY_HELMET)
            .build()),

    WATER_ALTAR(ImmutableList.of(
            ItemID.ELEMENTAL_TIARA,
            ItemID.ELEMENTAL_TALISMAN,
            ItemID.WATER_TIARA,
            ItemID.WATER_TALISMAN
    )),

    FIRE_ALTAR(ImmutableList.of(
            ItemID.ELEMENTAL_TIARA,
            ItemID.ELEMENTAL_TALISMAN,
            ItemID.FIRE_TIARA,
            ItemID.FIRE_TALISMAN
    )),

    PLUNDER_ARTEFACTS(ImmutableList.of(
            ItemID.IVORY_COMB,
            ItemID.POTTERY_SCARAB,
            ItemID.POTTERY_STATUETTE,
            ItemID.STONE_SEAL,
            ItemID.STONE_SCARAB,
            ItemID.STONE_STATUETTE,
            ItemID.GOLD_SEAL,
            ItemID.GOLDEN_SCARAB,
            ItemID.GOLDEN_STATUETTE
    )),

    WATERSKIN(ImmutableList.of(
            ItemID.WATERSKIN4,
            ItemID.WATERSKIN3,
            ItemID.WATERSKIN2,
            ItemID.WATERSKIN1
    )),

    GRIMY_HERB(ImmutableList.of(
            ItemID.GRIMY_AVANTOE,
            ItemID.GRIMY_CADANTINE,
            ItemID.GRIMY_DWARF_WEED,
            ItemID.GRIMY_GUAM_LEAF,
            ItemID.GRIMY_HARRALANDER,
            ItemID.GRIMY_IRIT_LEAF,
            ItemID.GRIMY_KWUARM,
            ItemID.GRIMY_LANTADYME,
            ItemID.GRIMY_MARRENTILL,
            ItemID.GRIMY_RANARR_WEED,
            ItemID.GRIMY_SNAPDRAGON,
            ItemID.GRIMY_TARROMIN,
            ItemID.GRIMY_TOADFLAX,
            ItemID.GRIMY_TORSTOL
    )),

    BLACKJACKS(ImmutableList.of(
            ItemID.MAPLE_BLACKJACKD,
            ItemID.MAPLE_BLACKJACKO,
            ItemID.MAPLE_BLACKJACK,
            ItemID.WILLOW_BLACKJACKD,
            ItemID.WILLOW_BLACKJACKO,
            ItemID.WILLOW_BLACKJACK,
            ItemID.OAK_BLACKJACKO,
            ItemID.OAK_BLACKJACKD,
            ItemID.OAK_BLACKJACK
    )),

    KERIS(ImmutableList.of(
            ItemID.KERISP_10584,
            ItemID.KERISP_10583,
            ItemID.KERISP,
            ItemID.KERIS
    )),

    STUFFED_KQ_HEAD(ImmutableList.of(
            ItemID.STUFFED_KQ_HEAD,
            ItemID.STUFFED_KQ_HEAD_TATTERED
    )),

    RECHARGEABLE_NECK_BRACELET(ImmutableList.of(
            ItemID.SKILLS_NECKLACE3,
            ItemID.COMBAT_BRACELET3,
            ItemID.SKILLS_NECKLACE2,
            ItemID.COMBAT_BRACELET2,
            ItemID.SKILLS_NECKLACE1,
            ItemID.COMBAT_BRACELET1,
            ItemID.SKILLS_NECKLACE,
            ItemID.COMBAT_BRACELET
    )),

    DEATHALTAR(ImmutableList.of(
            ItemID.DEATH_TIARA,
            ItemID.DEATH_TALISMAN
    )),

    IMBUABLE_SALVE_AMULET(ImmutableList.of(
            ItemID.SALVE_AMULET_E,
            ItemID.SALVE_AMULET
    )),

    IMBUED_SALVE_AMULET(ImmutableList.of(
            ItemID.SALVE_AMULETEI,
            ItemID.SALVE_AMULETI,
            ItemID.SALVE_AMULETEI_25278,
            ItemID.SALVE_AMULETI_25250
    )),

    NON_MAGIC_TREE_ROOT(ImmutableList.of(
            ItemID.OAK_ROOTS,
            ItemID.WILLOW_ROOTS,
            ItemID.MAPLE_ROOTS,
            ItemID.YEW_ROOTS
    )),

    ARDY_CLOAKS(ImmutableList.of(
            ItemID.ARDOUGNE_CLOAK_1,
            ItemID.ARDOUGNE_CLOAK_2,
            ItemID.ARDOUGNE_CLOAK_3,
            ItemID.ARDOUGNE_CLOAK_4,
            ItemID.ARDOUGNE_MAX_CAPE
    )),
    TEAM_CAPE(ImmutableList.of(
            ItemID.TEAM1_CAPE,
            ItemID.TEAM2_CAPE,
            ItemID.TEAM3_CAPE,
            ItemID.TEAM4_CAPE,
            ItemID.TEAM5_CAPE,
            ItemID.TEAM6_CAPE,
            ItemID.TEAM7_CAPE,
            ItemID.TEAM8_CAPE,
            ItemID.TEAM9_CAPE,
            ItemID.TEAM10_CAPE,
            ItemID.TEAM11_CAPE,
            ItemID.TEAM12_CAPE,
            ItemID.TEAM13_CAPE,
            ItemID.TEAM14_CAPE,
            ItemID.TEAM15_CAPE,
            ItemID.TEAM16_CAPE,
            ItemID.TEAM17_CAPE,
            ItemID.TEAM18_CAPE,
            ItemID.TEAM19_CAPE,
            ItemID.TEAM20_CAPE,
            ItemID.TEAM21_CAPE,
            ItemID.TEAM22_CAPE,
            ItemID.TEAM23_CAPE,
            ItemID.TEAM24_CAPE,
            ItemID.TEAM25_CAPE,
            ItemID.TEAM26_CAPE,
            ItemID.TEAM27_CAPE,
            ItemID.TEAM28_CAPE,
            ItemID.TEAM29_CAPE,
            ItemID.TEAM30_CAPE,
            ItemID.TEAM31_CAPE,
            ItemID.TEAM32_CAPE,
            ItemID.TEAM33_CAPE,
            ItemID.TEAM34_CAPE,
            ItemID.TEAM35_CAPE,
            ItemID.TEAM36_CAPE,
            ItemID.TEAM37_CAPE,
            ItemID.TEAM38_CAPE,
            ItemID.TEAM39_CAPE,
            ItemID.TEAM40_CAPE,
            ItemID.TEAM41_CAPE,
            ItemID.TEAM42_CAPE,
            ItemID.TEAM43_CAPE,
            ItemID.TEAM44_CAPE,
            ItemID.TEAM45_CAPE,
            ItemID.TEAM46_CAPE,
            ItemID.TEAM47_CAPE,
            ItemID.TEAM48_CAPE,
            ItemID.TEAM49_CAPE,
            ItemID.TEAM50_CAPE
    )),

    CHAOS_ALTAR(ImmutableList.of(
            ItemID.CATALYTIC_TIARA,
            ItemID.CATALYTIC_TALISMAN,
            ItemID.CHAOS_TIARA,
            ItemID.CHAOS_TALISMAN
    )),

    RUNE_AXE_BETTER(ImmutableList.of(
            ItemID.RUNE_AXE,
            ItemID.DRAGON_AXE,
            ItemID.INFERNAL_AXE_UNCHARGED,
            ItemID.INFERNAL_AXE_UNCHARGED_25371,
            ItemID.CRYSTAL_AXE_INACTIVE,
            ItemID.CRYSTAL_AXE,
            ItemID.CRYSTAL_AXE_23862
    )),

    GOD_STAFF(ImmutableList.of(
            ItemID.ZAMORAK_STAFF,
            ItemID.STAFF_OF_THE_DEAD,
            ItemID.STAFF_OF_THE_DEAD_23613,
            ItemID.TOXIC_STAFF_OF_THE_DEAD,
            ItemID.TOXIC_STAFF_UNCHARGED,
            ItemID.GUTHIX_STAFF,
            ItemID.VOID_KNIGHT_MACE,
            ItemID.VOID_KNIGHT_MACE_BROKEN,
            ItemID.VOID_KNIGHT_MACE_L,
            ItemID.STAFF_OF_BALANCE,
            ItemID.SARADOMIN_STAFF,
            ItemID.STAFF_OF_LIGHT
    )),

    SNAIL_SHELLS(ImmutableList.of(
            ItemID.BLAMISH_BARK_SHELL,
            ItemID.BLAMISH_BLUE_SHELL,
            ItemID.BLAMISH_MYRE_SHELL,
            ItemID.BLAMISH_BLUE_SHELL_3361,
            ItemID.BLAMISH_MYRE_SHELL_3355,
            ItemID.BLAMISH_RED_SHELL,
            ItemID.BLAMISH_RED_SHELL_3357,
            ItemID.BLAMISH_OCHRE_SHELL,
            ItemID.BLAMISH_OCHRE_SHELL_3359
    )),

    TANNABLE_HIDE(ImmutableList.of(
            ItemID.BLACK_DRAGONHIDE,
            ItemID.RED_DRAGONHIDE,
            ItemID.BLUE_DRAGONHIDE,
            ItemID.GREEN_DRAGONHIDE,
            ItemID.SNAKE_HIDE_7801,
            ItemID.SNAKE_HIDE,
            ItemID.COWHIDE
    )),

    BONEMEAL(ImmutableList.of(
            ItemID.BONEMEAL,
            ItemID.BAT_BONEMEAL,
            ItemID.BURNT_BONEMEAL,
            ItemID.BIG_BONEMEAL,
            ItemID.BABY_DRAGON_BONEMEAL,
            ItemID.BEARDED_GORILLA_BONEMEAL,
            ItemID.BURNT_JOGRE_BONEMEAL,
            ItemID.DRAGON_BONEMEAL,
            ItemID.DRAKE_BONEMEAL,
            ItemID.GORILLA_BONEMEAL,
            ItemID.SMALL_NINJA_BONEMEAL,
            ItemID.SKELETON_BONEMEAL,
            ItemID.MONKEY_BONEMEAL,
            ItemID.FAYRG_BONEMEAL,
            ItemID.DAGANNOTHKING_BONEMEAL,
            ItemID.HYDRA_BONEMEAL,
            ItemID.JOGRE_BONEMEAL,
            ItemID.LARGE_ZOMBIE_MONKEY_BONEMEAL,
            ItemID.LAVA_DRAGON_BONEMEAL,
            ItemID.MEDIUM_NINJA_BONEMEAL,
            ItemID.OURG_BONEMEAL,
            ItemID.RAURG_BONEMEAL,
            ItemID.SHAIKAHAN_BONEMEAL,
            ItemID.SUPERIOR_DRAGON_BONEMEAL,
            ItemID.WYRM_BONEMEAL,
            ItemID.WOLF_BONEMEAL,
            ItemID.ZOGRE_BONEMEAL,
            ItemID.SMALL_ZOMBIE_MONKEY_BONEMEAL,
            ItemID.WYVERN_BONEMEAL
    )),

    EAR_PROTECTION(new ImmutableList.Builder<Integer>()
            .addAll(SharedCollections.slayer_helmets)
            .add(ItemID.EARMUFFS)
            .build()),

    NOSE_PROTECTION(new ImmutableList.Builder<Integer>()
            .addAll(SharedCollections.slayer_helmets)
            .add(ItemID.NOSE_PEG)
            .build()),

    ELITE_PYRE_LOGS(ImmutableList.of(
            ItemID.MAGIC_PYRE_LOGS,
            ItemID.REDWOOD_PYRE_LOGS
    )),

    SHADE_REMAINS(ImmutableList.of(
            ItemID.LOAR_REMAINS,
            ItemID.PHRIN_REMAINS,
            ItemID.RIYL_REMAINS,
            ItemID.ASYN_REMAINS,
            ItemID.FIYR_REMAINS,
            ItemID.URIUM_REMAINS
    )),

    AHRIM_HOOD(ImmutableList.of(
            ItemID.AHRIMS_HOOD,
            ItemID.AHRIMS_HOOD_100,
            ItemID.AHRIMS_HOOD_75,
            ItemID.AHRIMS_HOOD_50,
            ItemID.AHRIMS_HOOD_25
    )),

    AHRIM_ROBESKIRT(ImmutableList.of(
            ItemID.AHRIMS_ROBESKIRT,
            ItemID.AHRIMS_ROBESKIRT_100,
            ItemID.AHRIMS_ROBESKIRT_75,
            ItemID.AHRIMS_ROBESKIRT_50,
            ItemID.AHRIMS_ROBESKIRT_25
    )),

    AHRIM_ROBETOP(ImmutableList.of(
            ItemID.AHRIMS_ROBETOP,
            ItemID.AHRIMS_ROBETOP_100,
            ItemID.AHRIMS_ROBETOP_75,
            ItemID.AHRIMS_ROBETOP_50,
            ItemID.AHRIMS_ROBETOP_25
    )),

    AHRIM_STAFF(ImmutableList.of(
            ItemID.AHRIMS_STAFF,
            ItemID.AHRIMS_STAFF_100,
            ItemID.AHRIMS_STAFF_75,
            ItemID.AHRIMS_STAFF_50,
            ItemID.AHRIMS_STAFF_25
    )),

    KARIL_CROSSBOW(ImmutableList.of(
            ItemID.KARILS_CROSSBOW,
            ItemID.KARILS_CROSSBOW_100,
            ItemID.KARILS_CROSSBOW_75,
            ItemID.KARILS_CROSSBOW_50,
            ItemID.KARILS_CROSSBOW_25
    )),

    KARIL_COIF(ImmutableList.of(
            ItemID.KARILS_COIF,
            ItemID.KARILS_COIF_100,
            ItemID.KARILS_COIF_75,
            ItemID.KARILS_COIF_50,
            ItemID.KARILS_COIF_25
    )),

    KARIL_SKIRT(ImmutableList.of(
            ItemID.KARILS_LEATHERSKIRT,
            ItemID.KARILS_LEATHERSKIRT_100,
            ItemID.KARILS_LEATHERSKIRT_75,
            ItemID.KARILS_LEATHERSKIRT_50,
            ItemID.KARILS_LEATHERSKIRT_25
    )),

    KARIL_TOP(ImmutableList.of(
            ItemID.KARILS_LEATHERTOP,
            ItemID.KARILS_LEATHERTOP_100,
            ItemID.KARILS_LEATHERTOP_75,
            ItemID.KARILS_LEATHERTOP_50,
            ItemID.KARILS_LEATHERTOP_25
    )),

    DHAROK_AXE(ImmutableList.of(
            ItemID.DHAROKS_GREATAXE,
            ItemID.DHAROKS_GREATAXE_100,
            ItemID.DHAROKS_GREATAXE_75,
            ItemID.DHAROKS_GREATAXE_50,
            ItemID.DHAROKS_GREATAXE_25
    )),

    DHAROK_HELM(ImmutableList.of(
            ItemID.DHAROKS_HELM,
            ItemID.DHAROKS_HELM_100,
            ItemID.DHAROKS_HELM_75,
            ItemID.DHAROKS_HELM_50,
            ItemID.DHAROKS_HELM_25
    )),

    DHAROK_BODY(ImmutableList.of(
            ItemID.DHAROKS_PLATEBODY,
            ItemID.DHAROKS_PLATEBODY_100,
            ItemID.DHAROKS_PLATEBODY_75,
            ItemID.DHAROKS_PLATEBODY_50,
            ItemID.DHAROKS_PLATEBODY_25
    )),

    DHAROK_LEGS(ImmutableList.of(
            ItemID.DHAROKS_PLATELEGS,
            ItemID.DHAROKS_PLATELEGS_100,
            ItemID.DHAROKS_PLATELEGS_75,
            ItemID.DHAROKS_PLATELEGS_50,
            ItemID.DHAROKS_PLATELEGS_25
    )),

    GUTHAN_WARSPEAR(ImmutableList.of(
            ItemID.GUTHANS_WARSPEAR,
            ItemID.GUTHANS_WARSPEAR_100,
            ItemID.GUTHANS_WARSPEAR_75,
            ItemID.GUTHANS_WARSPEAR_50,
            ItemID.GUTHANS_WARSPEAR_25
    )),

    GUTHAN_HELM(ImmutableList.of(
            ItemID.GUTHANS_HELM,
            ItemID.GUTHANS_HELM_100,
            ItemID.GUTHANS_HELM_75,
            ItemID.GUTHANS_HELM_50,
            ItemID.GUTHANS_HELM_25
    )),

    GUTHAN_BODY(ImmutableList.of(
            ItemID.GUTHANS_PLATEBODY,
            ItemID.GUTHANS_PLATEBODY_100,
            ItemID.GUTHANS_PLATEBODY_75,
            ItemID.GUTHANS_PLATEBODY_50,
            ItemID.GUTHANS_PLATEBODY_25
    )),

    GUTHAN_SKIRT(ImmutableList.of(
            ItemID.GUTHANS_CHAINSKIRT,
            ItemID.GUTHANS_CHAINSKIRT_100,
            ItemID.GUTHANS_CHAINSKIRT_75,
            ItemID.GUTHANS_CHAINSKIRT_50,
            ItemID.GUTHANS_CHAINSKIRT_25
    )),

    TORAG_HAMMERS(ImmutableList.of(
            ItemID.TORAGS_HAMMERS,
            ItemID.TORAGS_HAMMERS_100,
            ItemID.TORAGS_HAMMERS_75,
            ItemID.TORAGS_HAMMERS_50,
            ItemID.TORAGS_HAMMERS_25
    )),

    TORAG_HELM(ImmutableList.of(
            ItemID.TORAGS_HELM,
            ItemID.TORAGS_HELM_100,
            ItemID.TORAGS_HELM_75,
            ItemID.TORAGS_HELM_50,
            ItemID.TORAGS_HELM_25
    )),

    TORAG_BODY(ImmutableList.of(
            ItemID.TORAGS_PLATEBODY,
            ItemID.TORAGS_PLATEBODY_100,
            ItemID.TORAGS_PLATEBODY_75,
            ItemID.TORAGS_PLATEBODY_50,
            ItemID.TORAGS_PLATEBODY_25
    )),

    TORAG_LEGS(ImmutableList.of(
            ItemID.TORAGS_PLATELEGS,
            ItemID.TORAGS_PLATELEGS_100,
            ItemID.TORAGS_PLATELEGS_75,
            ItemID.TORAGS_PLATELEGS_50,
            ItemID.TORAGS_PLATELEGS_25
    )),

    VERAC_FLAIL(ImmutableList.of(
            ItemID.VERACS_FLAIL,
            ItemID.VERACS_FLAIL_100,
            ItemID.VERACS_FLAIL_75,
            ItemID.VERACS_FLAIL_50,
            ItemID.VERACS_FLAIL_25
    )),

    VERAC_BRASSARD(ImmutableList.of(
            ItemID.VERACS_BRASSARD,
            ItemID.VERACS_BRASSARD_100,
            ItemID.VERACS_BRASSARD_75,
            ItemID.VERACS_BRASSARD_50,
            ItemID.VERACS_BRASSARD_25
    )),

    VERAC_HELM(ImmutableList.of(
            ItemID.VERACS_HELM,
            ItemID.VERACS_HELM_100,
            ItemID.VERACS_HELM_75,
            ItemID.VERACS_HELM_50,
            ItemID.VERACS_HELM_25
    )),

    VERAC_SKIRT(ImmutableList.of(
            ItemID.VERACS_PLATESKIRT,
            ItemID.VERACS_PLATESKIRT_100,
            ItemID.VERACS_PLATESKIRT_75,
            ItemID.VERACS_PLATESKIRT_50,
            ItemID.VERACS_PLATESKIRT_25
    )),

    ARCEUUS_BOOKS(ImmutableList.of(
            ItemID.RADAS_CENSUS,
            ItemID.RICKTORS_DIARY_7,
            ItemID.EATHRAM__RADA_EXTRACT,
            ItemID.KILLING_OF_A_KING,
            ItemID.HOSIDIUS_LETTER,
            ItemID.WINTERTODT_PARABLE,
            ItemID.TWILL_ACCORD,
            ItemID.BYRNES_CORONATION_SPEECH,
            ItemID.IDEOLOGY_OF_DARKNESS,
            ItemID.RADAS_JOURNEY,
            ItemID.TRANSVERGENCE_THEORY,
            ItemID.TRISTESSAS_TRAGEDY,
            ItemID.TREACHERY_OF_ROYALTY,
            ItemID.TRANSPORTATION_INCANTATIONS
    )),

    WARM_CLOTHING(ImmutableList.of(
            ItemID.SANTA_MASK,
            ItemID.SANTA_JACKET,
            ItemID.SANTA_PANTALOONS,
            ItemID.SANTA_GLOVES,
            ItemID.SANTA_BOOTS,
            ItemID.ANTISANTA_MASK,
            ItemID.ANTISANTA_JACKET,
            ItemID.ANTISANTA_PANTALOONS,
            ItemID.ANTISANTA_GLOVES,
            ItemID.ANTISANTA_BOOTS,
            ItemID.BUNNY_TOP,
            ItemID.BUNNY_LEGS,
            ItemID.BUNNY_PAWS,
            ItemID.BUNNY_FEET,
            ItemID.CLUE_HUNTER_GARB,
            ItemID.CLUE_HUNTER_TROUSERS,
            ItemID.CLUE_HUNTER_GLOVES,
            ItemID.CLUE_HUNTER_BOOTS,
            ItemID.CLUE_HUNTER_CLOAK,
            ItemID.POLAR_CAMO_TOP,
            ItemID.POLAR_CAMO_LEGS,
            ItemID.WOOD_CAMO_TOP,
            ItemID.WOOD_CAMO_LEGS,
            ItemID.JUNGLE_CAMO_TOP,
            ItemID.JUNGLE_CAMO_LEGS,
            ItemID.DESERT_CAMO_TOP,
            ItemID.DESERT_CAMO_LEGS,
            ItemID.LARUPIA_HAT,
            ItemID.LARUPIA_TOP,
            ItemID.LARUPIA_LEGS,
            ItemID.GRAAHK_HEADDRESS,
            ItemID.GRAAHK_TOP,
            ItemID.GRAAHK_LEGS,
            ItemID.KYATT_HAT,
            ItemID.KYATT_TOP,
            ItemID.KYATT_LEGS,
            ItemID.BOMBER_CAP,
            ItemID.BOMBER_JACKET,
            ItemID.YAKHIDE_ARMOUR,
            ItemID.YAKHIDE_ARMOUR_10824,
            ItemID.PYROMANCER_HOOD,
            ItemID.PYROMANCER_GARB,
            ItemID.PYROMANCER_ROBE,
            ItemID.PYROMANCER_BOOTS,
            ItemID.CHICKEN_HEAD,
            ItemID.CHICKEN_WINGS,
            ItemID.CHICKEN_LEGS,
            ItemID.CHICKEN_FEET,
            ItemID.EVIL_CHICKEN_HEAD,
            ItemID.EVIL_CHICKEN_WINGS,
            ItemID.EVIL_CHICKEN_LEGS,
            ItemID.EVIL_CHICKEN_FEET,
            ItemID.SANTA_HAT,
            ItemID.BLACK_SANTA_HAT,
            ItemID.BEARHEAD,
            ItemID.FIRE_TIARA,
            ItemID.LUMBERJACK_HAT,
            ItemID.FIREMAKING_HOOD,
            ItemID.FIRE_MAX_HOOD,
            ItemID.INFERNAL_MAX_HOOD,
            ItemID.JESTER_SCARF,
            ItemID.TRIJESTER_SCARF,
            ItemID.WOOLLY_SCARF,
            ItemID.BOBBLE_SCARF,
            ItemID.GNOME_SCARF,
            ItemID.RAINBOW_SCARF,
            ItemID.GLOVES_OF_SILENCE,
            ItemID.FREMENNIK_GLOVES,
            ItemID.WARM_GLOVES,
            ItemID.FIREMAKING_CAPE,
            ItemID.MAX_CAPE,
            ItemID.FIRE_CAPE,
            ItemID.FIRE_MAX_CAPE,
            ItemID.INFERNAL_CAPE,
            ItemID.INFERNAL_MAX_CAPE,
            ItemID.OBSIDIAN_CAPE,
            ItemID.STAFF_OF_FIRE,
            ItemID.FIRE_BATTLESTAFF,
            ItemID.LAVA_BATTLESTAFF,
            ItemID.STEAM_BATTLESTAFF,
            ItemID.SMOKE_BATTLESTAFF,
            ItemID.MYSTIC_FIRE_STAFF,
            ItemID.MYSTIC_LAVA_STAFF,
            ItemID.MYSTIC_STEAM_STAFF,
            ItemID.MYSTIC_SMOKE_STAFF,
            ItemID.INFERNAL_AXE,
            ItemID.INFERNAL_AXE_UNCHARGED,
            ItemID.INFERNAL_AXE_UNCHARGED_25371,
            ItemID.INFERNAL_AXE_OR,
            ItemID.INFERNAL_PICKAXE,
            ItemID.VOLCANIC_ABYSSAL_WHIP,
            ItemID.ALE_OF_THE_GODS,
            ItemID.BRUMA_TORCH,
            ItemID.TOME_OF_FIRE,
            ItemID.TOME_OF_FIRE_EMPTY,
            ItemID.LIT_BUG_LANTERN,
            ItemID.UGLY_HALLOWEEN_JUMPER_BLACK,
            ItemID.UGLY_HALLOWEEN_JUMPER_ORANGE
    )),

    STONE_BOOTS(ImmutableList.of(
            ItemID.BOOTS_OF_STONE,
            ItemID.BOOTS_OF_BRIMSTONE,
            ItemID.GRANITE_BOOTS
    )),

    FISHING_ROD(ImmutableList.of(
            ItemID.PEARL_FISHING_ROD,
            ItemID.FISHING_ROD
    )),

    OGRE_BRUTAL_ARROWS(ImmutableList.of(
            ItemID.RUNE_BRUTAL,
            ItemID.ADAMANT_BRUTAL,
            ItemID.MITHRIL_BRUTAL,
            ItemID.BLACK_BRUTAL,
            ItemID.STEEL_BRUTAL,
            ItemID.IRON_BRUTAL,
            ItemID.BRONZE_BRUTAL,
            ItemID.OGRE_ARROW
    )),

    OGRE_BELLOWS(ImmutableList.of(
            ItemID.OGRE_BELLOWS_3,
            ItemID.OGRE_BELLOWS_2,
            ItemID.OGRE_BELLOWS_1,
            ItemID.OGRE_BELLOWS
    )),

    OGRE_BOW(ImmutableList.of(
            ItemID.OGRE_BOW,
            ItemID.COMP_OGRE_BOW
    )),

    TELEPORT_CRYSTAL(ImmutableList.of(
            ItemID.TELEPORT_CRYSTAL_5,
            ItemID.TELEPORT_CRYSTAL_4,
            ItemID.TELEPORT_CRYSTAL_3,
            ItemID.TELEPORT_CRYSTAL_2,
            ItemID.TELEPORT_CRYSTAL_1
    )),

    NINJA_GREEGREE(ImmutableList.of(
            ItemID.KRUK_MONKEY_GREEGREE,
            ItemID.NINJA_MONKEY_GREEGREE,
            ItemID.NINJA_MONKEY_GREEGREE_4025
    )),

    CRYSTAL_BOW(ImmutableList.of(
            ItemID.NEW_CRYSTAL_BOW_4213,
            ItemID.NEW_CRYSTAL_BOW_16888,
            ItemID.NEW_CRYSTAL_BOW_I,
            ItemID.NEW_CRYSTAL_BOW_I_16889,
            ItemID.CRYSTAL_BOW,
            ItemID.CRYSTAL_BOW_24123,
            ItemID.CRYSTAL_BOW_110,
            ItemID.CRYSTAL_BOW_110_I,
            ItemID.CRYSTAL_BOW_210,
            ItemID.CRYSTAL_BOW_210_I,
            ItemID.CRYSTAL_BOW_310,
            ItemID.CRYSTAL_BOW_310_I,
            ItemID.CRYSTAL_BOW_410,
            ItemID.CRYSTAL_BOW_410_I,
            ItemID.CRYSTAL_BOW_510,
            ItemID.CRYSTAL_BOW_510_I,
            ItemID.CRYSTAL_BOW_610,
            ItemID.CRYSTAL_BOW_610_I,
            ItemID.CRYSTAL_BOW_710,
            ItemID.CRYSTAL_BOW_710_I,
            ItemID.CRYSTAL_BOW_810,
            ItemID.CRYSTAL_BOW_810_I,
            ItemID.CRYSTAL_BOW_910,
            ItemID.CRYSTAL_BOW_910,
            ItemID.CRYSTAL_BOW_FULL,
            ItemID.CRYSTAL_BOW_FULL_I
    )),

    MOUTH_PROTECTION(new ImmutableList.Builder<Integer>()
            .addAll(SharedCollections.slayer_helmets)
            .add(ItemID.FACEMASK)
            .build()),

    VOID_HELM(ImmutableList.of(
            ItemID.VOID_MAGE_HELM,
            ItemID.VOID_MELEE_HELM,
            ItemID.VOID_RANGER_HELM
    )),

    VOID_TOP(ImmutableList.of(
            ItemID.ELITE_VOID_TOP,
            ItemID.VOID_KNIGHT_TOP
    )),

    VOID_ROBE(ImmutableList.of(
            ItemID.ELITE_VOID_ROBE,
            ItemID.VOID_KNIGHT_ROBE
    )),

    GUTHIX_BALANCE_UNF(ImmutableList.of(
            ItemID.GUTHIX_BALANCE_UNF,
            ItemID.GUTHIX_BALANCE_UNF_7654,
            ItemID.GUTHIX_BALANCE_UNF_7656,
            ItemID.GUTHIX_BALANCE_UNF_7658
    )),

    EYE_HAT(ImmutableList.of(
            ItemID.HAT_OF_THE_EYE,
            ItemID.HAT_OF_THE_EYE_BLUE,
            ItemID.HAT_OF_THE_EYE_GREEN,
            ItemID.HAT_OF_THE_EYE_RED
    )),

    EYE_TOP(ImmutableList.of(
            ItemID.ROBE_TOP_OF_THE_EYE,
            ItemID.ROBE_TOP_OF_THE_EYE_BLUE,
            ItemID.ROBE_TOP_OF_THE_EYE_GREEN,
            ItemID.ROBE_TOP_OF_THE_EYE_RED
    )),

    EYE_BOTTOM(ImmutableList.of(
            ItemID.ROBE_BOTTOMS_OF_THE_EYE,
            ItemID.ROBE_BOTTOMS_OF_THE_EYE_BLUE,
            ItemID.ROBE_BOTTOMS_OF_THE_EYE_GREEN,
            ItemID.ROBE_BOTTOMS_OF_THE_EYE_RED
    )),

    CLIMBING_BOOTS(ImmutableList.of(
            ItemID.CLIMBING_BOOTS,
            ItemID.CLIMBING_BOOTS_G
    )),

    ALLOTMENT_SEEDS(ImmutableList.of(
            ItemID.POTATO_SEED,
            ItemID.ONION_SEED,
            ItemID.CABBAGE_SEED,
            ItemID.TOMATO_SEED,
            ItemID.SWEETCORN_SEED,
            ItemID.WATERMELON_SEED,
            ItemID.SNAPE_GRASS_SEED
    )),

    HERB_SEEDS(ImmutableList.of(
            ItemID.GUAM_SEED,
            ItemID.MARRENTILL_SEED,
            ItemID.TARROMIN_SEED,
            ItemID.HARRALANDER_SEED,
            ItemID.RANARR_SEED,
            ItemID.TOADFLAX_SEED,
            ItemID.IRIT_SEED,
            ItemID.AVANTOE_SEED,
            ItemID.KWUARM_SEED,
            ItemID.SNAPDRAGON_SEED,
            ItemID.HUASCA_SEED,
            ItemID.CADANTINE_SEED,
            ItemID.LANTADYME_SEED,
            ItemID.DWARF_WEED_SEED,
            ItemID.TORSTOL_SEED
    )),

    FLOWER_SEEDS(ImmutableList.of(
            ItemID.MARIGOLD_SEED,
            ItemID.ROSEMARY_SEED,
            ItemID.NASTURTIUM_SEED,
            ItemID.WOAD_SEED,
            ItemID.LIMPWURT_SEED,
            ItemID.WHITE_LILY_SEED
    )),

    HOPS_SEEDS(ImmutableList.of(
            ItemID.BARLEY_SEED,
            ItemID.HAMMERSTONE_SEED,
            ItemID.ASGARNIAN_SEED,
            ItemID.JUTE_SEED,
            ItemID.YANILLIAN_SEED,
            ItemID.KRANDORIAN_SEED,
            ItemID.WILDBLOOD_SEED
    )),

    BUSH_SEEDS(ImmutableList.of(
            ItemID.REDBERRY_SEED,
            ItemID.CADAVABERRY_SEED,
            ItemID.DWELLBERRY_SEED,
            ItemID.JANGERBERRY_SEED,
            ItemID.WHITEBERRY_SEED,
            ItemID.POISON_IVY_SEED
    )),

    TREE_SAPLINGS(ImmutableList.of(
            ItemID.OAK_SAPLING,
            ItemID.WILLOW_SAPLING,
            ItemID.MAPLE_SAPLING,
            ItemID.YEW_SAPLING,
            ItemID.MAGIC_SAPLING
    )),

    FRUIT_TREE_SAPLINGS(ImmutableList.of(
            ItemID.APPLE_SAPLING,
            ItemID.BANANA_SAPLING,
            ItemID.ORANGE_SAPLING,
            ItemID.CURRY_SAPLING,
            ItemID.PINEAPPLE_SAPLING,
            ItemID.PAPAYA_SAPLING,
            ItemID.PALM_SAPLING,
            ItemID.DRAGONFRUIT_SAPLING
    )),

    GHOMMALS_HILT(ImmutableList.of(
            ItemID.GHOMMALS_AVERNIC_DEFENDER_6_L,
            ItemID.GHOMMALS_AVERNIC_DEFENDER_6,
            ItemID.GHOMMALS_HILT_6,
            ItemID.GHOMMALS_AVERNIC_DEFENDER_5_L,
            ItemID.GHOMMALS_AVERNIC_DEFENDER_5,
            ItemID.GHOMMALS_HILT_5,
            ItemID.GHOMMALS_HILT_4,
            ItemID.GHOMMALS_HILT_3,
            ItemID.GHOMMALS_HILT_2,
            ItemID.GHOMMALS_HILT_1
    ));

    private final List<Integer> items;
    private final String wikiTerm;

    ItemCollections(String wikiTerm, List<Integer> items) {
        this.wikiTerm = wikiTerm;
        this.items = items;
    }

    ItemCollections(List<Integer> items) {
        this.wikiTerm = null;
        this.items = items;
    }

    public List<Integer> reverseOrder() {
        List<Integer> reversedArray = new ArrayList<>(getItems());
        Collections.reverse(reversedArray);
        return reversedArray;
    }
}

/**
 * These are useful item collections.
 * These lists are ORDERED.
 * Order items from highest tier to lowest tier,
 * or highest dose to lowest dose, etc.
 * As long as the list is consistent in how it is ordered.
 */

class SharedCollections {
    static final ImmutableList<Integer> slayer_helmets = ImmutableList.of(
            ItemID.SLAYER_HELMET,
            ItemID.SLAYER_HELMET_I,
            ItemID.SLAYER_HELMET_I_25177,
            ItemID.SLAYER_HELMET_I_26674,
            ItemID.BLACK_SLAYER_HELMET,
            ItemID.BLACK_SLAYER_HELMET_I,
            ItemID.BLACK_SLAYER_HELMET_I_25179,
            ItemID.BLACK_SLAYER_HELMET_I_26675,
            ItemID.GREEN_SLAYER_HELMET,
            ItemID.GREEN_SLAYER_HELMET_I,
            ItemID.GREEN_SLAYER_HELMET_I_25181,
            ItemID.GREEN_SLAYER_HELMET_I_26676,
            ItemID.RED_SLAYER_HELMET,
            ItemID.RED_SLAYER_HELMET_I,
            ItemID.RED_SLAYER_HELMET_I_25183,
            ItemID.RED_SLAYER_HELMET_I_26677,
            ItemID.PURPLE_SLAYER_HELMET,
            ItemID.PURPLE_SLAYER_HELMET_I,
            ItemID.PURPLE_SLAYER_HELMET_I_25185,
            ItemID.PURPLE_SLAYER_HELMET_I_26678,
            ItemID.TURQUOISE_SLAYER_HELMET,
            ItemID.TURQUOISE_SLAYER_HELMET_I,
            ItemID.TURQUOISE_SLAYER_HELMET_I_25187,
            ItemID.TURQUOISE_SLAYER_HELMET_I_26679,
            ItemID.HYDRA_SLAYER_HELMET,
            ItemID.HYDRA_SLAYER_HELMET_I,
            ItemID.HYDRA_SLAYER_HELMET_I_25189,
            ItemID.HYDRA_SLAYER_HELMET_I_26680,
            ItemID.TWISTED_SLAYER_HELMET,
            ItemID.TWISTED_SLAYER_HELMET_I,
            ItemID.TWISTED_SLAYER_HELMET_I_25191,
            ItemID.TWISTED_SLAYER_HELMET_I_26681,
            ItemID.TZKAL_SLAYER_HELMET,
            ItemID.TZKAL_SLAYER_HELMET_I,
            ItemID.TZKAL_SLAYER_HELMET_I_25914,
            ItemID.TZKAL_SLAYER_HELMET_I_26684,
            ItemID.VAMPYRIC_SLAYER_HELMET,
            ItemID.VAMPYRIC_SLAYER_HELMET_I,
            ItemID.VAMPYRIC_SLAYER_HELMET_I_25908,
            ItemID.VAMPYRIC_SLAYER_HELMET_I_26683,
            ItemID.TZTOK_SLAYER_HELMET,
            ItemID.TZTOK_SLAYER_HELMET_I,
            ItemID.TZTOK_SLAYER_HELMET_I_25902,
            ItemID.TZTOK_SLAYER_HELMET_I_26682
    );
}
