package com.example.android.miwok;

/**
 * Created by Lenovo on 2017/1/20.
 */

public class Word {
    private String mDeafultTranslation;
    private String mMiwokTranslation;
    private int midImage=NO_IMAGE_PROVIDE;
    private static final int NO_IMAGE_PROVIDE = -1;

    /*
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param ifImage is the ID of the image resource
     */
    public Word(String deafultTranslation, String miwokTranslation, int idImage) {
        mDeafultTranslation = deafultTranslation;
        mMiwokTranslation = miwokTranslation;
        midImage = idImage;
    }

    /*
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String deafultTranslation, String miwokTranslation) {
        mDeafultTranslation = deafultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    /*
    Get the English translation of the word
     */

    public String getDeafultTranslation() {
        return mDeafultTranslation;
    }
    /*
    get the Miwok translation of the word
     */

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    /*
    * Get the ID of the image
    * */
    public int getMidImage() {
        return midImage;
    }
    /*
    Return whether is a image in list or not
     */
    public boolean hasImage(){
        return midImage != NO_IMAGE_PROVIDE;
    }
}
