package com.andre.android.miwok;

/**
 * Created by andre on 07/07/2017.
 */

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;
    private int mImageResourceId = 0;

    public Word(String defaultWord, String miwokWord) {
        this.mDefaultWord = defaultWord;
        this.mMiwokWord = miwokWord;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceId) {
        this.mDefaultWord = defaultWord;
        this.mMiwokWord = miwokWord;
        this.mImageResourceId = imageResourceId;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}
