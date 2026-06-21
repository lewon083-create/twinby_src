package f1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import e1.e0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache f16560a = new LruCache(10);

    public static MediaCodecInfo a(String str) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = f16560a;
        synchronized (lruCache) {
            mediaCodecInfo = (MediaCodecInfo) lruCache.get(str);
        }
        try {
            if (mediaCodecInfo != null) {
                return mediaCodecInfo;
            }
            try {
                mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                try {
                    MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                    synchronized (lruCache) {
                        lruCache.put(str, codecInfo);
                    }
                    mediaCodecCreateEncoderByType.release();
                    return codecInfo;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException | IllegalArgumentException e3) {
                throw new e0(e3);
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodecCreateEncoderByType = null;
        }
        if (mediaCodecCreateEncoderByType != null) {
            mediaCodecCreateEncoderByType.release();
        }
        throw th;
    }
}
