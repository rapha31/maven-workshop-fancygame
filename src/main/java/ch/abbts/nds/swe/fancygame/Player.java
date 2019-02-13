/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.abbts.nds.swe.fancygame;

/**
 *
 * @author Andreas Wassmer (aw@andreas-wassmer.ch)
 */
public class Player {

    private String mAliasname;
    private int mScore;
    private int mLevel;

    public Player (String pAliasname)
    {
        this.mAliasname = pAliasname;
        this.mScore = 0;
        this.mLevel = 0;
    }

    
    /**
     * Get the value of level
     *
     * @return the value of level
     */
    public int getLevel ()
    {
        return mLevel;
    }

    /**
     * Set the value of level
     *
     * @param pLevel new value of level
     */
    public void setLevel (int pLevel)
    {
        this.mLevel = pLevel;
    }


    /**
     * Get the value of score
     *
     * @return the value of score
     */
    public int getScore ()
    {
        return mScore;
    }

    /**
     * Set the value of score
     *
     * @param pScore new value of score
     */
    public void setScore (int pScore)
    {
        this.mScore = pScore;
    }


    /**
     * Get the value of aliasname
     *
     * @return the value of aliasname
     */
    public String getAliasname ()
    {
        return mAliasname;
    }

    /**
     * Set the value of aliasname
     *
     * @param pAliasname new value of aliasname
     */
    public void setAliasname (String pAliasname)
    {
        this.mAliasname = pAliasname;
    }

}
