package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface bx1 {
    void C(int i, int i10, long j10, int i11);

    void E(int i);

    void G(int i, long j10);

    default void I(th0 th0Var) {
        th0Var.run();
    }

    ByteBuffer b(int i);

    ByteBuffer c(int i);

    void e();

    void h(ArrayList arrayList);

    int i();

    void j(Bundle bundle);

    MediaFormat k();

    void m(Surface surface);

    void n();

    default boolean q(xo0 xo0Var) {
        return false;
    }

    void r();

    int u(MediaCodec.BufferInfo bufferInfo);

    void x(int i);

    void y(int i, cp1 cp1Var, long j10, int i10);
}
