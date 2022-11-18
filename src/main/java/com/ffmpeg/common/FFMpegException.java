package com.ffmpeg.common;

/**
 * @auther alan.chen
 * @time 2019/9/17 2:48 PM
 */
public class FFMpegException extends RuntimeException {

    public FFMpegException() {
        super();
    }

    public FFMpegException(String message, Throwable cause) {
        super(message, cause);
    }

    public FFMpegException(String message) {
        super(message);
    }

    public FFMpegException(Throwable cause) {
        super(cause);
    }

}
