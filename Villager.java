import java.util.Arrays;

class Villager {
    public String name;

    public String villager(final String name) {
        this.name = name;

        switch (name) {
            case "alex" -> {
                String[] infoAlex = {"\n" +
                        "Alex", "\n" +
                        "Birthday: Summer 13th", "\n" +
                        "Loves <3: Complete Breakfast, Prismatic Shard, Rabbit's Foot, Golden Pumpkin, Salmon Dinner", "\n" +
                        "HATES: Bat Wing, Carp, Copper Ore, Grape, Holly, Joja Cola, Poppy, Quartz, Rusty Cog, Rusty Spoon"
                };
                return Arrays.toString(infoAlex).replace("[", "").replace("]", "").trim();
            }
            case "abigail" -> {
                String[] infoAbigail = {"\n" +
                        "Abigail", "\n" +
                        "Birthday: Fall 13th", "\n" +
                        "Loves <3: Amethyst, Blackberry Cobbler, Chocolate Cake, Golden Pumpkin, Pufferfish, Pumpkin, Spicy Eel, \nUniversal Loves", "\n" +
                        "HATES: Poppy"
                };
                return Arrays.toString(infoAbigail).replace("[", "").replace("]", "").trim();
            }
            case "caroline" -> {
                String[] infoCaroline = {"\n" +
                        "Caroline", "\n" +
                        "Birthday: Winter 7th", "\n" +
                        "Loves <3: Fish Taco, Prismatic Shard, Summer Spangle", "\n" +
                        "HATES: Bait, Bat Wing, Carp, Green Algae, Joja Cola, Poppy, Quartz, Rusty Spoon, Rusty Spur, SalmonBerry, Seaweed, \nSlime, Stone, Golden Pumpkin"
                };
                return Arrays.toString(infoCaroline).replace("[", "").replace("]", "").trim();
            }
            case "clint" -> {
                String[] infoClint = {"\n" +
                        "Clint", "\n" +
                        "Birthday: Winter 26th", "\n" +
                        "Loves <3: Amethyst, Artichoke Dip, Aquamarine, Emerald, Fiddlehead Risotto, Gold Bar, Iridium Bar, Jade, Omni Geode, Ruby, Topaz", "\n" +
                        "HATES: Bat Wing, Carp, Copper Ore, Glass Shards, Green Algae, Iron Ore, Joja Cola, Poppy, Rusty Spoon, \nRusty Spur, Sea Urchin, Seaweed, Slime, Snail, Stone, White Algae"
                };
                return Arrays.toString(infoClint).replace("[", "").replace("]", "").trim();
            }
            case "demetrius" -> {
                String[] infoDemetrius = {"\n" +
                        "Demetrius", "\n" +
                        "Birthday: Summer 19th", "\n" +
                        "Loves <3: Bean Hotpot, Ice Cream, Rice Pudding, Strawberry.", "\n" +
                        "HATES: Bait, Bat Wing, Broken Glasses, Copper Ore, Decorative Bowl, Dwarf Scroll III, Green Algae, Iron Ore, \nJoja Cola, Nautilus Fossil, Holly, Poppy, Red Mushroom, Sea Urchin, Stone"
                };
                return Arrays.toString(infoDemetrius).replace("[", "").replace("]", "").trim();
            }
            case "dwarf" -> {
                String[] infoDwarf = {"\n" +
                        "Dwarf", "\n" +
                        "Birthday: Summer 22nd", "\n" +
                        "Loves <3: Amethyst, Aquamarine, Emerald, Jade, Omni Geode, Ruby, Topaz", "\n" +
                        "HATES: All junk, All Bait, Ancient Drum, Bat Wing, Bug Meat, Green Algae, Iron Ore, Sea Urchin, Slime"
                };
                return Arrays.toString(infoDwarf).replace("[", "").replace("]", "").trim();
            }
            case "elliot" -> {
                String[] infoElliot = {"\n" +
                        "Elliot", "\n" +
                        "Birthday: Fall 5th", "\n" +
                        "Loves <3: Crab Cakes, Duck Feather, Lobster, Pomegranate, Tom Kha Soup", "\n" +
                        "HATES: Amaranth, Bat Wing, Broken Glasses, Budget TV, Copper Ore, Dried Starfish, Dwarvish Helm, Green Algae, \nJoja Cola, Nautilus Shell, Poppy, Salmonberry, Sea Cucumber, Sea Urchin, Seaweed, Soggy Newspaper, Stone, Strange Bun, Torch, Wood"
                };
                return Arrays.toString(infoElliot).replace("[", "").replace("]", "").trim();
            }
            case "emily" -> {
                String[] infoEmily = {"\n" +
                        "Emily", "\n" +
                        "Birthday: Spring 27th", "\n" +
                        "Loves <3: Amethyst, Aquamarine, Cloth, Emerald, Jade, Ruby, Survival Burger, Topaz, Wool", "\n" +
                        "HATES: All universal hates, Fish Taco, Holly, Maki Roll, Salmon Dinner, Sashimi,"
                };
                return Arrays.toString(infoEmily).replace("[", "").replace("]", "").trim();
            }
            case "evelyn" -> {
                String[] infoEvelyn = {"\n" +
                        "Evelyn", "\n" +
                        "Birthday: Winter 20th", "\n" +
                        "Loves <3: Chocolate Cake, Diamond, Fairy Rose, Stuffing, Tulip", "\n" +
                        "HATES: Albacore, Bat Wing, Clam, Clay, Cockle, Copper Ore, Coral, Crayfish, Green Algae, Herring, Holly, \nJoja Cola, Oyster, Poppy, Salmonberry, Sashimi, Sea Urchin, Spice Berry, Stone, Strange Bun, Trout Soup, Void Mayonnaise"
                };
                return Arrays.toString(infoEvelyn).replace("[", "").replace("]", "").trim();
            }
            case "george" -> {
                String[] infoGeorge = {"\n" +
                        "George", "\n" +
                        "Birthday: Fall 24th", "\n" +
                        "Loves <3: Fried Mushroom, Leek", "\n" +
                        "HATES: Bat Wing, Clay, Dandelion, Green Algae, Joja Cola, Poppy, Quartz, Red Mushroom, Stone, Strange Bun"
                };
                return Arrays.toString(infoGeorge).replace("[", "").replace("]", "").trim();
            }
            case "kent" -> {
                String[] infoKent = {"\n" +
                        "Kent", "\n" +
                        "Birthday: Spring 4th", "\n" +
                        "Loves <3: Fiddlehead Risotto, Rabbit's Foot, Roasted Hazelnut", "\n" +
                        "HATES: Algae, Bat Wing, Joja Cola, Milk, Poppy, Sashimi, Tortilla, Carp, Void Mayonnaise"
                };
                return Arrays.toString(infoKent).replace("[", "").replace("]", "").trim();
            }
            case "krobus" -> {
                String[] infoKrobus = {"\n" +
                        "Krobus", "\n" +
                        "Birthday: Winter 1st", "\n" +
                        "Loves <3: All Universal Loves, Diamond, Iridium Bar, Pumpkin, Void Egg, Void Mayonnaise, wild Horseradish", "\n" +
                        "HATES: All Universal Hates"
                };
                return Arrays.toString(infoKrobus).replace("[", "").replace("]", "").trim();
            }
            case "leah" -> {
                String[] infoLeah = {"\n" +
                        "Leah", "\n" +
                        "Birthday: Winter 23rd", "\n" +
                        "Loves <3: Goat Cheese, Poppyseed Muffin, Salad, Stir Fry, Truffle, Vegetable Medley, Wine", "\n" +
                        "HATES:  Artifacts, Bait, Monster Loot, Trash, Hay, Poppy, Sap, Totems, Strange Bun, Ice Cream, Bread, Hashbrowns, Pancakes, \nPizza, Void Egg"
                };
                return Arrays.toString(infoLeah).replace("[", "").replace("]", "").trim();
            }
            case "leo" -> {
                String[] infoLeo = {"\n" +
                        "Leo", "\n" +
                        "Birthday: Summer 26th", "\n" +
                        "Loves <3: All Universal Loves, Duck Feather, Mango, Ostrich Egg, Poi.", "\n" +
                        "HATES: All Universal Hates (except for Dragon Tooth and Sea Urchin), Beer, Holly, Hops, \nMead, Morel, Oil, Pale Ale, Pina Colada, Triple Shot Espresso, Unmilled Rice, Wine."
                };
                return Arrays.toString(infoLeo).replace("[", "").replace("]", "").trim();
            }


        }
        return null;

    }

}
