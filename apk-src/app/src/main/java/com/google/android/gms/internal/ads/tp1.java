package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tp1 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(String str) {
        super(str);
        pa.c0.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(String str, Throwable th2) {
        super(str, th2);
        pa.c0.g(str, "Detail message must not be empty");
    }
}
