package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H9 {
    public static final B9 a(int i, String str) {
        byte[] bytes;
        B9 b92 = new B9();
        b92.f22136a = i;
        if (str == null || (bytes = str.getBytes(Charsets.UTF_8)) == null) {
            bytes = b92.f22137b;
        }
        b92.f22137b = bytes;
        return b92;
    }
}
