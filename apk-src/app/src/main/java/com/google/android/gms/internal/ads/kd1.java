package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sl1 f7203a = sl1.a(new byte[0]);

    public static final sl1 a(int i) {
        return sl1.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final sl1 b(int i) {
        return sl1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
