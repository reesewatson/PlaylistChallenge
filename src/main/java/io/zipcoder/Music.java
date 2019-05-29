package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        for (Integer i = startIndex; i <= playList.length - 1; i++) {
            if (playList[i].equals(selection)) {
                return i - 1;
            }
        }
        return -1;
    }
}
