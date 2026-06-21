package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu0 f5465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6 f5466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f5467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioTrack f5468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yv1 f5472h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Method f5476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f5479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f5481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f5486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f5487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f5488y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f5489z;

    public fw1(nu0 nu0Var, c6 c6Var, AudioTrack audioTrack, int i, int i10, int i11) {
        this.f5465a = nu0Var;
        this.f5466b = c6Var;
        this.f5468d = audioTrack;
        try {
            this.f5476m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f5467c = new long[10];
        this.f5489z = -9223372036854775807L;
        this.f5488y = -9223372036854775807L;
        this.f5472h = new yv1(audioTrack, nu0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f5469e = sampleRate;
        boolean zA = cq0.a(i);
        this.f5471g = zA;
        this.f5470f = zA ? cq0.t(sampleRate, i11 / i10) : -9223372036854775807L;
        this.f5480q = 0L;
        this.f5481r = 0L;
        this.f5484u = -9223372036854775807L;
        this.f5485v = -9223372036854775807L;
        this.f5478o = 0L;
        this.f5477n = 0L;
        this.i = 1.0f;
        this.f5473j = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fw1.a():long");
    }

    public final void b(long j10) {
        long j11 = this.f5473j;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        long jRound = j10 - j11;
        String str = cq0.f4293a;
        float f10 = this.i;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        long jR = cq0.r(jRound);
        this.f5466b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - jR;
        this.f5473j = -9223372036854775807L;
        e2 e2Var = new e2();
        e2Var.f4793b = jCurrentTimeMillis;
        yf0 yf0Var = ((ew1) this.f5465a.f8456c).f5116h;
        yf0Var.i(-1, e2Var);
        yf0Var.j();
    }

    public final long c(long j10) {
        int i = this.f5483t;
        int i10 = this.f5469e;
        long jMax = Math.max(0L, (i == 0 ? this.f5484u != -9223372036854775807L ? cq0.t(i10, e()) : cq0.t(i10, d()) : cq0.w(j10 + this.f5474k, this.i)) - this.f5477n);
        return this.f5484u != -9223372036854775807L ? Math.min(cq0.t(i10, this.f5487x), jMax) : jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d() {
        /*
            r12 = this;
            long r0 = r12.f5484u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.e()
            long r2 = r12.f5487x
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            com.google.android.gms.internal.ads.c6 r0 = r12.f5466b
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.f5479p
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L72
            android.media.AudioTrack r4 = r12.f5468d
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L36
            goto L70
        L36:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 29
            if (r4 > r8) goto L61
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5f
            long r10 = r12.f5480q
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5f
            r4 = 3
            if (r5 != r4) goto L5f
            long r4 = r12.f5485v
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L70
            r12.f5485v = r0
            goto L70
        L5f:
            r12.f5485v = r2
        L61:
            long r2 = r12.f5480q
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L6e
            long r2 = r12.f5481r
            r4 = 1
            long r2 = r2 + r4
            r12.f5481r = r2
        L6e:
            r12.f5480q = r6
        L70:
            r12.f5479p = r0
        L72:
            long r0 = r12.f5480q
            long r2 = r12.f5481r
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fw1.d():long");
    }

    public final long e() {
        if (this.f5468d.getPlayState() == 2) {
            return this.f5486w;
        }
        this.f5466b.getClass();
        return this.f5486w + cq0.u(cq0.w(cq0.s(SystemClock.elapsedRealtime()) - this.f5484u, this.i), this.f5469e, 1000000L, RoundingMode.UP);
    }
}
