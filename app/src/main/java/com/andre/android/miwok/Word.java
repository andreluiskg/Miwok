package com.andre.android.miwok;

/**
 * Created by andre on 07/07/2017.
 */

public class Word {

    private String mMiwokWord;
    private String mDefaultWord;

    public Word(String miwokWord, String defaultWord) {
        this.mMiwokWord = miwokWord;
        this.mDefaultWord = defaultWord;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public String getmDefaultWord() {
        return mDefaultWord;
    }


}
