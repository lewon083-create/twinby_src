package u3;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.yv1;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public boolean A;
    public long B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7.a f34181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.t f34182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f34183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioTrack f34184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yv1 f34188h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f34189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f34190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f34191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Method f34192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f34193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f34194o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f34195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f34196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f34197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f34198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f34200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f34201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f34202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f34203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f34204y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f34205z;

    public t(m7.a aVar, m3.t tVar, AudioTrack audioTrack, int i, int i10, int i11) {
        this.f34181a = aVar;
        this.f34182b = tVar;
        this.f34184d = audioTrack;
        try {
            this.f34192m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f34183c = new long[10];
        this.f34205z = -9223372036854775807L;
        this.f34204y = -9223372036854775807L;
        this.f34188h = new yv1(audioTrack, aVar);
        int sampleRate = audioTrack.getSampleRate();
        this.f34185e = sampleRate;
        boolean zH = m3.z.H(i);
        this.f34187g = zH;
        this.f34186f = zH ? m3.z.S(sampleRate, i11 / i10) : -9223372036854775807L;
        this.f34196q = 0L;
        this.f34197r = 0L;
        this.A = false;
        this.B = 0L;
        this.f34200u = -9223372036854775807L;
        this.f34201v = -9223372036854775807L;
        this.f34194o = 0L;
        this.f34193n = 0L;
        this.i = 1.0f;
        this.f34189j = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            r12 = this;
            long r0 = r12.f34200u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.c()
            long r2 = r12.f34203x
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            m3.t r0 = r12.f34182b
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.f34195p
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L7c
            android.media.AudioTrack r4 = r12.f34184d
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L33
            goto L7a
        L33:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r4 > r8) goto L5e
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5c
            long r10 = r12.f34196q
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r4 = 3
            if (r5 != r4) goto L5c
            long r4 = r12.f34201v
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L7a
            r12.f34201v = r0
            goto L7a
        L5c:
            r12.f34201v = r2
        L5e:
            long r2 = r12.f34196q
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L78
            boolean r4 = r12.A
            if (r4 == 0) goto L71
            long r4 = r12.B
            long r4 = r4 + r2
            r12.B = r4
            r2 = 0
            r12.A = r2
            goto L78
        L71:
            long r2 = r12.f34197r
            r4 = 1
            long r2 = r2 + r4
            r12.f34197r = r2
        L78:
            r12.f34196q = r6
        L7a:
            r12.f34195p = r0
        L7c:
            long r0 = r12.f34196q
            long r2 = r12.B
            long r0 = r0 + r2
            long r2 = r12.f34197r
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.t.a():long");
    }

    public final long b(long j10) {
        int i = this.f34199t;
        int i10 = this.f34185e;
        long jMax = Math.max(0L, (i == 0 ? this.f34200u != -9223372036854775807L ? m3.z.S(i10, c()) : m3.z.S(i10, a()) : m3.z.z(j10 + this.f34190k, this.i)) - this.f34193n);
        return this.f34200u != -9223372036854775807L ? Math.min(m3.z.S(i10, this.f34203x), jMax) : jMax;
    }

    public final long c() {
        if (this.f34184d.getPlayState() == 2) {
            return this.f34202w;
        }
        this.f34182b.getClass();
        return this.f34202w + m3.z.U(m3.z.z(m3.z.M(SystemClock.elapsedRealtime()) - this.f34200u, this.i), this.f34185e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f34189j;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        long jC = m3.z.C(j10 - j11, this.i);
        this.f34182b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - m3.z.Z(jC);
        this.f34189j = -9223372036854775807L;
        ((r) this.f34181a.f28696c).i.e(-1, new f9.g(jCurrentTimeMillis));
    }
}
