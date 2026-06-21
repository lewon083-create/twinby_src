package yads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ol {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nl f41591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f41592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f41593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ml f41596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41598h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f41599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f41601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f41602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f41603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f41604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f41607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f41608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f41609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f41610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f41611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f41612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f41613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f41614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f41615z;

    public ol(wb0 wb0Var) {
        this.f41591a = (nl) ni.a(wb0Var);
        if (lb3.f40466a >= 18) {
            try {
                this.f41603n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f41592b = new long[10];
    }

    public final long a(long j10) {
        return (j10 * 1000000) / ((long) this.f41597g);
    }

    public final boolean b(long j10) {
        if (j10 > a()) {
            return true;
        }
        if (!this.f41598h) {
            return false;
        }
        AudioTrack audioTrack = this.f41593c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r29) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ol.a(boolean):long");
    }

    public final long a() {
        AudioTrack audioTrack = this.f41593c;
        audioTrack.getClass();
        if (this.f41613x != -9223372036854775807L) {
            return Math.min(this.A, this.f41615z + ((((SystemClock.elapsedRealtime() * 1000) - this.f41613x) * ((long) this.f41597g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f41598h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f41610u = this.f41608s;
            }
            playbackHeadPosition += this.f41610u;
        }
        if (lb3.f40466a <= 29) {
            if (playbackHeadPosition == 0 && this.f41608s > 0 && playState == 3) {
                if (this.f41614y == -9223372036854775807L) {
                    this.f41614y = SystemClock.elapsedRealtime();
                }
                return this.f41608s;
            }
            this.f41614y = -9223372036854775807L;
        }
        if (this.f41608s > playbackHeadPosition) {
            this.f41609t++;
        }
        this.f41608s = playbackHeadPosition;
        return playbackHeadPosition + (this.f41609t << 32);
    }

    public final void a(AudioTrack audioTrack, boolean z5, int i, int i10, int i11) {
        this.f41593c = audioTrack;
        this.f41594d = i10;
        this.f41595e = i11;
        this.f41596f = new ml(audioTrack);
        this.f41597g = audioTrack.getSampleRate();
        this.f41598h = z5 && lb3.f40466a < 23 && (i == 5 || i == 6);
        boolean zE = lb3.e(i);
        this.f41606q = zE;
        this.i = zE ? a(i11 / i10) : -9223372036854775807L;
        this.f41608s = 0L;
        this.f41609t = 0L;
        this.f41610u = 0L;
        this.f41605p = false;
        this.f41613x = -9223372036854775807L;
        this.f41614y = -9223372036854775807L;
        this.f41607r = 0L;
        this.f41604o = 0L;
        this.f41599j = 1.0f;
    }
}
