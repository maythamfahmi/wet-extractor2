package com.itbackyard.Download;

import com.itbackyard.Const;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Wet-extractor
 * Developer Maytham on 08-08-2017
 * 2017 © Copyright | ITBackyard ApS
 */
public class DownloaderTest {
    final Downloader d = new Downloader();
    String url = "https://commoncrawl.s3.amazonaws.com/crawl-data/CC-MAIN-2017-30/segments/1500549423183.57/wet/CC-MAIN-20170720121902-20170720141902-00000.warc.wet.gz";
    String fileName = "CC-MAIN-20170720121902-20170720141902-00000.warc.wet.gz";

    @Test
    public void getFilenameFromUrl() {
        assertEquals(fileName, d.getFilenameFromUrl(url));
    }

    @Test
    public void isFileExsit() throws Exception {
        assertEquals(true, d.isFileExsit(Const.resTest + fileName));
    }

    @Test
    public void isFileDownloaded() throws Exception {
        assertEquals(true, d.isFileDownloaded(fileName, Const.resTest + "downloaded.txt"));
    }


}