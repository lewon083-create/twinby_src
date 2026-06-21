package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hw1 implements bx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6278c;

    public hw1(MediaCodec mediaCodec, n90 n90Var) {
        this.f6277b = mediaCodec;
        this.f6278c = n90Var;
        if (Build.VERSION.SDK_INT < 35 || n90Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) n90Var.f8249d;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            ix.k0(((HashSet) n90Var.f8248c).add(mediaCodec));
        }
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void C(int i, int i10, long j10, int i11) {
        ((MediaCodec) this.f6277b).queueInputBuffer(i, 0, i10, j10, i11);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void E(int i) {
        ((MediaCodec) this.f6277b).releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void G(int i, long j10) {
        ((MediaCodec) this.f6277b).releaseOutputBuffer(i, j10);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public ByteBuffer b(int i) {
        return ((MediaCodec) this.f6277b).getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public ByteBuffer c(int i) {
        return ((MediaCodec) this.f6277b).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void e() {
        n90 n90Var = (n90) this.f6278c;
        MediaCodec mediaCodec = (MediaCodec) this.f6277b;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && n90Var != null) {
                n90Var.o(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && n90Var != null) {
                n90Var.o(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void h(ArrayList arrayList) {
        ((MediaCodec) this.f6277b).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public int i() {
        return ((MediaCodec) this.f6277b).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void j(Bundle bundle) {
        ((MediaCodec) this.f6277b).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public MediaFormat k() {
        return ((MediaCodec) this.f6277b).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void m(Surface surface) {
        ((MediaCodec) this.f6277b).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void n() {
        ((MediaCodec) this.f6277b).flush();
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void r() {
        ((MediaCodec) this.f6277b).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public int u(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f6277b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void x(int i) {
        ((MediaCodec) this.f6277b).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.bx1
    public void y(int i, cp1 cp1Var, long j10, int i10) {
        ((MediaCodec) this.f6277b).queueSecureInputBuffer(i, 0, cp1Var.i, j10, i10);
    }

    public hw1(Context context) {
        this.f6277b = context == null ? null : context.getApplicationContext();
    }
}
