package org.hfeng.book.jcip.ch6;

import java.util.ArrayList;
import java.util.List;

public abstract class SingleThreadRenderer {
    void renderPage(CharSequence source) {
        renderText(source);
        List<ImageData> imageData = new ArrayList<ImageData>();
        for (ImageInfo imageinfo: scanForImageInfo(source)) {
            imageData.add(imageinfo.downloadImage());
        }
        for (ImageData data : imageData) {
            renderImage(data);
        }
    }

    interface ImageData {
    }

    interface ImageInfo {
        ImageData downloadImage();
    }

    abstract void renderText(CharSequence s);
    abstract List<ImageInfo> scanForImageInfo(CharSequence s);
    abstract void renderImage(ImageData i);
}
