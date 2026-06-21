package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ew1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f5106o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f5107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f5108q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f5109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sv1 f5110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public na1 f5111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fw1 f5112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l91 f5115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf0 f5116h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xo0 f5121n;

    public ew1(AudioTrack audioTrack, sv1 sv1Var, xo0 xo0Var, c6 c6Var) {
        this.f5109a = audioTrack;
        this.f5110b = sv1Var;
        this.f5121n = xo0Var;
        yf0 yf0Var = new yf0(Thread.currentThread(), 0);
        this.f5116h = yf0Var;
        yf0Var.f12609b = false;
        boolean zA = cq0.a(sv1Var.f10409a);
        this.f5113e = zA;
        if (zA) {
            this.f5114f = cq0.d(sv1Var.f10409a) * Integer.bitCount(sv1Var.f10411c);
        } else {
            this.f5114f = -1;
        }
        this.f5112d = new fw1(new nu0(10, this), c6Var, audioTrack, sv1Var.f10409a, this.f5114f, sv1Var.f10412d);
        if (xo0Var != null) {
            this.f5111c = new na1(audioTrack, xo0Var);
        }
        this.f5115g = b() ? new l91(this) : null;
    }

    public final boolean a(int i, ByteBuffer byteBuffer) throws mv1 {
        xo0 xo0Var;
        boolean z5 = this.f5113e;
        if (!z5 && this.f5119l == 0) {
            this.f5119l = nw1.c(this.f5110b.f10409a, byteBuffer);
        }
        c();
        AudioTrack audioTrack = this.f5109a;
        int underrunCount = audioTrack.getUnderrunCount();
        int i10 = this.f5120m;
        this.f5120m = underrunCount;
        if (underrunCount > i10) {
            zu1 zu1Var = zu1.f13125d;
            yf0 yf0Var = this.f5116h;
            yf0Var.i(-1, zu1Var);
            yf0Var.j();
        }
        int iRemaining = byteBuffer.remaining();
        int iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z5) {
                this.f5117j += (long) iWrite;
                return z;
            }
            if (z) {
                this.f5118k = (((long) this.f5119l) * ((long) i)) + this.f5118k;
            }
            return z;
        }
        if (iWrite != -6 && iWrite != -32) {
            z = false;
        }
        if (z && (xo0Var = this.f5121n) != null) {
            com.google.android.gms.internal.consent_sdk.c cVar = (com.google.android.gms.internal.consent_sdk.c) xo0Var.f12221c;
            yi0 yi0Var = (yi0) cVar.f13342f;
            if (yi0Var != null) {
                hv1 hv1Var = hv1.f6270c;
                cVar.f13341e = hv1Var;
                yi0Var.h(hv1Var);
            }
        }
        throw new mv1(iWrite, z);
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT >= 29 && this.f5109a.isOffloadedPlayback();
    }

    public final long c() {
        if (!this.f5113e) {
            return this.f5118k;
        }
        long j10 = this.f5117j;
        String str = cq0.f4293a;
        return ((j10 + r2) - 1) / this.f5114f;
    }
}
