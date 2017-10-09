package com.andre.android.miwok;

/**
 * Created by andre on 07/07/2017.
 */

public class Word {

    private final int NO_IMAGE_PROVIDED = -1;
    private String mDefaultWord;
    private String mMiwokWord;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String defaultWord, String miwokWord, int audioResourceId) {
        this.mDefaultWord = defaultWord;
        this.mMiwokWord = miwokWord;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceId, int audioResourceId) {
        this.mDefaultWord = defaultWord;
        this.mMiwokWord = miwokWord;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
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

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
