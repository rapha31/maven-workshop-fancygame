/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.abbts.nds.swe.fancygame;

import com.google.gson.Gson;
import java.util.logging.Logger;

/**
 *
 * @author Andreas Wassmer (aw@andreas-wassmer.ch)
 */
public class GameMaster {
    private static final Logger LOG = Logger.getLogger(GameMaster.class.getName());

    public static void main (String[] args)
    {
        Gson gson = new Gson();
        Player player1 = new Player("Avatar");
        LOG.info("\n\n" + gson.toJson(player1) + "\n");
    }    
}
