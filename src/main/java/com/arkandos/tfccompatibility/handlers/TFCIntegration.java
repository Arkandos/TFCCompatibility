package com.arkandos.tfccompatibility.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

public class TFCIntegration {
    public enum processingOreList{
        Copper,
        Gold,
        Platinum,
        Iron,
        Silver,
        Tin,
        Lead,
        Bismuth,
        Nickel,
        Zinc,
        ;

        private ArrayList<ItemStack> getOre(String type, String name){
            return OreDictionary.getOres("ore" + type + name);
        }

        public ArrayList<ItemStack> getPoorOre(){
            return getOre("Poor", this.toString());
        }

        public ArrayList<ItemStack> getNormalOre(){
            return getOre("Normal", this.toString());
        }

        public ArrayList<ItemStack> getRichOre(){
            return getOre("Rich", this.toString());
        }
    }
}
