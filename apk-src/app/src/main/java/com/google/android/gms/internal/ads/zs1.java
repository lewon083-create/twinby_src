package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zs1 implements wt1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r51 f13102p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh f13103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh f13104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.l f13105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13110h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f13111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f13112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f13113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w51 f13114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f13115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13116o;

    static {
        v41 v41Var = x41.f12018c;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        vv.j(6, objArr);
        f13102p = x41.x(6, objArr);
    }

    public zs1() {
        androidx.datastore.preferences.protobuf.l lVar = new androidx.datastore.preferences.protobuf.l(1);
        l(1000, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        l(1000, 0, "bufferForPlaybackForLocalPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        l(2000, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        l(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        l(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        l(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        l(50000, 50000, "maxBufferMs", "minBufferMs");
        l(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        l(0, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.f13103a = new nh();
        this.f13104b = new bh();
        this.f13105c = lVar;
        long jS = cq0.s(50000L);
        this.f13106d = jS;
        long jS2 = cq0.s(1000L);
        this.f13107e = jS2;
        this.f13108f = jS;
        this.f13109g = jS;
        this.f13110h = jS2;
        this.i = jS2;
        this.f13111j = cq0.s(2000L);
        this.f13112k = jS2;
        this.f13113l = cq0.s(0L);
        this.f13115n = new ConcurrentHashMap();
        this.f13114m = w51.a(w51.f11648h);
        this.f13116o = -1L;
    }

    public static void l(int i, int i10, String str, String str2) {
        if (!(i >= i10)) {
            throw new IllegalArgumentException(gr.P("%s cannot be less than %s", str, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void a(fv1 fv1Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f13116o;
        ix.l0("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        this.f13116o = id2;
        ConcurrentHashMap concurrentHashMap = this.f13115n;
        ys1 ys1Var = (ys1) concurrentHashMap.get(fv1Var);
        if (ys1Var == null) {
            ys1 ys1Var2 = new ys1();
            ys1Var2.f12733a = 1;
            concurrentHashMap.put(fv1Var, ys1Var2);
        } else {
            ys1Var.f12733a++;
        }
        ys1 ys1Var3 = (ys1) concurrentHashMap.get(fv1Var);
        ys1Var3.getClass();
        Integer num = (Integer) this.f13114m.get(fv1Var.f5455a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        ys1Var3.f12735c = iIntValue;
        ys1Var3.f12734b = false;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void b(fv1 fv1Var) {
        ConcurrentHashMap concurrentHashMap = this.f13115n;
        ys1 ys1Var = (ys1) concurrentHashMap.get(fv1Var);
        if (ys1Var != null) {
            int i = ys1Var.f12733a - 1;
            ys1Var.f12733a = i;
            if (i == 0) {
                concurrentHashMap.remove(fv1Var);
                j();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f13116o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final long c() {
        return this.f13113l;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final boolean d() {
        Iterator it = this.f13115n.values().iterator();
        while (it.hasNext()) {
            if (((ys1) it.next()).f12734b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final boolean e(vt1 vt1Var) {
        long jMin;
        boolean z5;
        int i;
        boolean z10 = vt1Var.f11477f;
        long jRound = vt1Var.f11475d;
        float f10 = vt1Var.f11476e;
        boolean zK = k(vt1Var);
        String str = cq0.f4293a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        if (z10) {
            if (zK) {
                jMin = this.f13112k;
                z5 = true;
            } else {
                jMin = this.f13111j;
                z5 = false;
            }
        } else if (zK) {
            jMin = this.i;
            z5 = true;
        } else {
            jMin = this.f13110h;
            z5 = false;
        }
        long j10 = vt1Var.f11478g;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin > 0 && jRound < jMin) {
            if (!z5) {
                fv1 fv1Var = vt1Var.f11472a;
                ys1 ys1Var = (ys1) this.f13115n.get(fv1Var);
                ys1Var.getClass();
                synchronized (ys1Var) {
                    i = ys1Var.f12736d;
                }
                int i10 = i * 65536;
                ys1 ys1Var2 = (ys1) this.f13115n.get(fv1Var);
                ys1Var2.getClass();
                if (i10 >= ys1Var2.f12735c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void f(fv1 fv1Var) {
        ConcurrentHashMap concurrentHashMap = this.f13115n;
        ys1 ys1Var = (ys1) concurrentHashMap.get(fv1Var);
        if (ys1Var != null) {
            int i = ys1Var.f12733a - 1;
            ys1Var.f12733a = i;
            if (i == 0) {
                concurrentHashMap.remove(fv1Var);
                j();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final boolean g(vt1 vt1Var) {
        int i;
        ConcurrentHashMap concurrentHashMap = this.f13115n;
        fv1 fv1Var = vt1Var.f11472a;
        ys1 ys1Var = (ys1) concurrentHashMap.get(fv1Var);
        ys1Var.getClass();
        ys1 ys1Var2 = (ys1) this.f13115n.get(fv1Var);
        ys1Var2.getClass();
        synchronized (ys1Var2) {
            i = ys1Var2.f12736d;
        }
        int i10 = i * 65536;
        ys1 ys1Var3 = (ys1) this.f13115n.get(fv1Var);
        ys1Var3.getClass();
        int i11 = ys1Var3.f12735c;
        if (fv1Var.equals(fv1.f5454c)) {
            return i10 < i11;
        }
        boolean zK = k(vt1Var);
        long jMin = zK ? this.f13107e : this.f13106d;
        long j10 = zK ? this.f13109g : this.f13108f;
        float f10 = vt1Var.f11476e;
        if (f10 > 1.0f) {
            jMin = Math.min(cq0.w(jMin, f10), j10);
        }
        long j11 = vt1Var.f11475d;
        if (j11 < Math.max(jMin, 500000L)) {
            boolean z5 = zK || i10 < i11;
            ys1Var.f12734b = z5;
            if (!z5 && j11 < 500000) {
                rs.r("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || i10 >= i11) {
            ys1Var.f12734b = false;
        }
        return ys1Var.f12734b;
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final void h(vt1 vt1Var, d[] dVarArr) {
        fv1 fv1Var = vt1Var.f11472a;
        Integer num = (Integer) this.f13114m.get(fv1Var.f5455a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        ys1 ys1Var = (ys1) this.f13115n.get(fv1Var);
        ys1Var.getClass();
        if (iIntValue == -1) {
            boolean zK = k(vt1Var);
            int length = dVarArr.length;
            int i = 0;
            int i10 = 0;
            while (true) {
                int i11 = 13107200;
                if (i >= length) {
                    break;
                }
                d dVar = dVarArr[i];
                if (dVar != null) {
                    int i12 = dVar.h().f9072c;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            i11 = 144310272;
                        } else if (i12 != 1) {
                            i11 = i12 != 2 ? i12 != 4 ? 131072 : 26214400 : zK ? 19660800 : 131072000;
                        }
                    }
                    i10 += i11;
                }
                i++;
            }
            iIntValue = Math.max(13107200, i10);
        }
        ys1Var.f12735c = iIntValue;
        j();
    }

    @Override // com.google.android.gms.internal.ads.wt1
    public final i i(fv1 fv1Var) {
        return new l91(this, fv1Var);
    }

    public final void j() {
        androidx.datastore.preferences.protobuf.l lVar = this.f13105c;
        ConcurrentHashMap concurrentHashMap = this.f13115n;
        int i = 0;
        if (concurrentHashMap.isEmpty()) {
            synchronized (lVar) {
                lVar.e0(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((ys1) it.next()).f12735c;
            }
            lVar.e0(i);
        }
    }

    public final boolean k(vt1 vt1Var) {
        ci ciVar = vt1Var.f11473b;
        q2 q2Var = ciVar.b(ciVar.o(vt1Var.f11474c.f6299a, this.f13104b).f3786c, this.f13103a, 0L).f8299b.f8193b;
        if (q2Var == null) {
            return false;
        }
        String scheme = q2Var.f9291a.getScheme();
        return TextUtils.isEmpty(scheme) || f13102p.contains(scheme);
    }
}
