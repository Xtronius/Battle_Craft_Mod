package mod.xtronius.bc_mod.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatMessageComponent;

public class BCPlayer {
	
	public static void messagePlayer(EntityPlayer player, String message, Object[] args) {
	    if ((player instanceof EntityPlayerMP))
	    {
	      ChatMessageComponent msg;
	      if (args.length > 0)
	        msg = ChatMessageComponent.createFromTranslationWithSubstitutions(message, (Object[])getMessageComponents(args));
	      else {
	        msg = ChatMessageComponent.createFromTranslationKey(message);
	      }

	      ((EntityPlayerMP)player).sendChatToPlayer(msg);
	    }
	  }

	  protected static ChatMessageComponent[] getMessageComponents(Object[] args) {
	    ChatMessageComponent[] encodedArgs = new ChatMessageComponent[args.length];

	    for (int i = 0; i < args.length; i++) {
	      if (((args[i] instanceof String)) && (((String)args[i]).startsWith("bc_mod.")))
	        encodedArgs[i] = ChatMessageComponent.createFromTranslationKey((String)args[i]);
	      else {
	        encodedArgs[i] = ChatMessageComponent.createFromText(args[i].toString());
	      }
	    }

	    return encodedArgs;
	  }

}
