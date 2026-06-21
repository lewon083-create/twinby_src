package com.github.dart_lang.jni;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class JniUtils {
    static {
        System.loadLibrary("dartjni");
    }

    public static native Object fromReferenceAddress(long j10);
}
