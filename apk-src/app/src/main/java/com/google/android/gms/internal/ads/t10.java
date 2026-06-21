package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface t10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f10463a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a(ByteBuffer byteBuffer);

    ByteBuffer c();

    void d();

    l00 e(l00 l00Var);

    void f();

    void i();

    boolean k();

    boolean l();

    default long b(long j10) {
        return j10;
    }
}
