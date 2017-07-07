package com.andre.android.miwok;

/**
 * Created by andre on 07/07/2017.
 */

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;

    public Word(String defaultWord, String miwokWord) {
        this.mDefaultWord = defaultWord;
        this.mMiwokWord = miwokWord;
    }

    public String getmDefaultWord() {
        return mDefaultWord;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }


}
