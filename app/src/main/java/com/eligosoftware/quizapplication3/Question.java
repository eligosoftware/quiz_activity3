package com.eligosoftware.quizapplication3;

/**
 * Created by mragl on 24.09.2017.
 */

public class Question {
    private int mTextResID;
    private boolean mAnstwerTrue;

    public Question(int textResID,boolean anstwerTrue){
        this.mAnstwerTrue=anstwerTrue;
        mTextResID=textResID;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnstwerTrue() {
        return mAnstwerTrue;
    }

    public void setAnstwerTrue(boolean anstwerTrue) {
        mAnstwerTrue = anstwerTrue;
    }
}
