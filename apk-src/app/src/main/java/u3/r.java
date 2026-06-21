package u3;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.internal.ads.yf0;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f34153r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static ScheduledExecutorService f34154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f34155t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f34156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f34157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ni.i f34158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s7.g f34159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f34160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ka.k f34163h;
    public final yf0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f34165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f34166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f34167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f34168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f34171q;

    public r(AudioTrack audioTrack, j jVar, ni.i iVar, m3.t tVar) {
        this.f34156a = audioTrack;
        this.f34157b = jVar;
        this.f34158c = iVar;
        yf0 yf0Var = new yf0(Thread.currentThread(), 2);
        this.i = yf0Var;
        yf0Var.f12609b = false;
        boolean zH = m3.z.H(jVar.f34128a);
        this.f34161f = zH;
        if (zH) {
            this.f34162g = m3.z.s(jVar.f34128a) * Integer.bitCount(jVar.f34130c);
        } else {
            this.f34162g = -1;
        }
        this.f34160e = new t(new m7.a(22, this), tVar, audioTrack, jVar.f34128a, this.f34162g, jVar.f34133f);
        if (iVar != null) {
            final s7.g gVar = new s7.g();
            gVar.f32795b = audioTrack;
            gVar.f32796c = iVar;
            Handler handlerO = m3.z.o(null);
            gVar.f32797d = handlerO;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: u3.p
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    s7.g gVar2 = gVar;
                    if (((p) gVar2.f32798e) == null) {
                        return;
                    }
                    m3.b.g().execute(new v0(10, gVar2, audioRouting));
                }
            };
            gVar.f32798e = onRoutingChangedListener;
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerO);
            this.f34159d = gVar;
        }
        this.f34163h = c() ? new ka.k(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.r.a():long");
    }

    public final long b() {
        if (!this.f34161f) {
            return this.f34166l;
        }
        long j10 = this.f34165k;
        long j11 = this.f34162g;
        String str = m3.z.f28608a;
        return ((j10 + j11) - 1) / j11;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.f34156a.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(long r12, java.nio.ByteBuffer r14, int r15) throws u3.d {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.r.d(long, java.nio.ByteBuffer, int):boolean");
    }
}
