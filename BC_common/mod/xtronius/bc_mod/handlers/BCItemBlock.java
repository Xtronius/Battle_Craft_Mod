package mod.xtronius.bc_mod.handlers;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BCItemBlock extends ItemBlock
{
       public BCItemBlock(int par1)
       {
             super(par1);
             setHasSubtypes(true);
       }
      
       public String getUnlocalizedName(ItemStack itemstack)
       {
             String name = "";
             switch(itemstack.getItemDamage())
             {
                    case 0:
                    {
                           name = "FenceMetalWhite";
                           break;
                    }
                    case 1:
                    {
                           name = "FenceMetalOrange";
                           break;
                    }
                    case 2:
                    {
                           name = "FenceMetalMagenta";
                           break;
                    }
                    case 3:
                    {
                           name = "FenceMetalLightBlue";
                           break;
                    }
                    case 4:
                    {
                           name = "FenceMetalYellow";
                           break;
                    }
                    case 5:
                    {
                           name = "FenceMetalLime";
                           break;
                    }
                    case 6:
                    {
                           name = "FenceMetalPink";
                           break;
                    }
                    case 7:
                    {
                           name = "FenceMetalGray";
                           break;
                    }
                    case 8:
                    {
                           name = "FenceMetalLightGray";
                           break;
                    }
                    case 9:
                    {
                           name = "FenceMetalCyan";
                           break;
                    }
                    case 10:
                    {
                           name = "FenceMetalPurple";
                           break;
                    }
                    case 11:
                    {
                           name = "FenceMetalBlue";
                           break;
                    }
                    case 12:
                    {
                           name = "FenceMetalBrown";
                           break;
                    }
                    case 13:
                    {
                           name = "FenceMetalGreen";
                           break;
                    }
                    case 14:
                    {
                           name = "FenceMetalRed";
                           break;
                    }
                    case 15:
                    {
                           name = "FenceMetalBlack";
                           break;
                    }
                    case 16:
                    {
                           name = "FenceMetal";
                           break;
                    }
                    default: name = "broken";
             }
             return getUnlocalizedName() + "." + name;
       }
      
       public int getMetadata(int par1)
       {
             return par1;
       }
}
/*
0	0x0	Regular (White)
1	0x1	Orange
2	0x2	Magenta
3	0x3	Light Blue
4	0x4	Yellow
5	0x5	Lime
6	0x6	Pink
7	0x7	Gray
8	0x8	Light Gray
9	0x9	Cyan
10	0xA	Purple
11	0xB	Blue
12	0xC	Brown
13	0xD	Green
14	0xE	Red
15	0xF	Black*/