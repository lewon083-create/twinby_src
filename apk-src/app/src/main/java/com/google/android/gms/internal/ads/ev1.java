package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ev1 implements yu1 {
    public boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5080b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dv1 f5082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PlaybackSession f5083e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PlaybackMetrics.Builder f5089l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public bt1 f5092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ut f5093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ut f5094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ut f5095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public jx1 f5096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public jx1 f5097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public jx1 f5098u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5102y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5103z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f5081c = c80.f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nh f5085g = new nh();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bh f5086h = new bh();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f5087j = new HashMap();
    public final HashMap i = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5084f = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5090m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5091n = 0;

    public ev1(Context context, PlaybackSession playbackSession) {
        this.f5080b = context.getApplicationContext();
        this.f5083e = playbackSession;
        dv1 dv1Var = new dv1();
        this.f5082d = dv1Var;
        dv1Var.f4688d = this;
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void a(int i) {
        if (i == 1) {
            this.f5099v = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void c(vs1 vs1Var) {
        this.f5101x += vs1Var.f11459h;
        this.f5102y += vs1Var.f11457f;
    }

    public final void d(int i, long j10, jx1 jx1Var, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = t3.g.q(i).setTimeSinceCreatedMillis(j10 - this.f5084f);
        if (jx1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i10 != 1 ? 1 : 2);
            String str = jx1Var.f6974l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = jx1Var.f6975m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = jx1Var.f6972j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i11 = jx1Var.i;
            if (i11 != -1) {
                timeSinceCreatedMillis.setBitrate(i11);
            }
            int i12 = jx1Var.f6982t;
            if (i12 != -1) {
                timeSinceCreatedMillis.setWidth(i12);
            }
            int i13 = jx1Var.f6983u;
            if (i13 != -1) {
                timeSinceCreatedMillis.setHeight(i13);
            }
            int i14 = jx1Var.E;
            if (i14 != -1) {
                timeSinceCreatedMillis.setChannelCount(i14);
            }
            int i15 = jx1Var.F;
            if (i15 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i15);
            }
            String str4 = jx1Var.f6967d;
            if (str4 != null) {
                String str5 = cq0.f4293a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = jx1Var.f6986x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f5081c.execute(new th0(21, this, timeSinceCreatedMillis.build()));
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void e(bt1 bt1Var) {
        this.f5092o = bt1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.ci r9, com.google.android.gms.internal.ads.hy1 r10) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ev1.g(com.google.android.gms.internal.ads.ci, com.google.android.gms.internal.ads.hy1):void");
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void h(xu1 xu1Var, ey1 ey1Var) {
        hy1 hy1Var = xu1Var.f12334d;
        if (hy1Var == null) {
            return;
        }
        jx1 jx1Var = ey1Var.f5141b;
        jx1Var.getClass();
        ut utVar = new ut(28, jx1Var, this.f5082d.a(xu1Var.f12332b, hy1Var));
        int i = ey1Var.f5140a;
        if (i != 0) {
            if (i == 1) {
                this.f5094q = utVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f5095r = utVar;
                return;
            }
        }
        this.f5093p = utVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0213 A[PHI: r6
      0x0213: PHI (r6v17 int) = (r6v7 int), (r6v41 int) binds: [B:208:0x02f6, B:136:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0216 A[PHI: r6
      0x0216: PHI (r6v16 int) = (r6v7 int), (r6v41 int) binds: [B:208:0x02f6, B:136:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0219 A[PHI: r6
      0x0219: PHI (r6v15 int) = (r6v7 int), (r6v41 int) binds: [B:208:0x02f6, B:136:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021c A[PHI: r6
      0x021c: PHI (r6v14 int) = (r6v7 int), (r6v41 int) binds: [B:208:0x02f6, B:136:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35, types: [com.google.android.gms.internal.ads.ut, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v37 */
    @Override // com.google.android.gms.internal.ads.yu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.google.android.gms.internal.ads.ip1 r24, com.google.android.gms.internal.ads.ut r25) {
        /*
            Method dump skipped, instruction units count: 1426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ev1.i(com.google.android.gms.internal.ads.ip1, com.google.android.gms.internal.ads.ut):void");
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void j(bs bsVar) {
        ut utVar = this.f5093p;
        if (utVar != null) {
            jx1 jx1Var = (jx1) utVar.f11061c;
            if (jx1Var.f6983u == -1) {
                ow1 ow1Var = new ow1(jx1Var);
                ow1Var.f8839s = bsVar.f3860a;
                ow1Var.f8840t = bsVar.f3861b;
                this.f5093p = new ut(28, new jx1(ow1Var), (String) utVar.f11062d);
            }
        }
    }

    public final void m() {
        PlaybackMetrics.Builder builder = this.f5089l;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f5103z);
            this.f5089l.setVideoFramesDropped(this.f5101x);
            this.f5089l.setVideoFramesPlayed(this.f5102y);
            Long l10 = (Long) this.i.get(this.f5088k);
            this.f5089l.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f5087j.get(this.f5088k);
            this.f5089l.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f5089l.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f5081c.execute(new th0(22, this, this.f5089l.build()));
        }
        this.f5089l = null;
        this.f5088k = null;
        this.f5103z = 0;
        this.f5101x = 0;
        this.f5102y = 0;
        this.f5096s = null;
        this.f5097t = null;
        this.f5098u = null;
        this.A = false;
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void n(xu1 xu1Var, int i, long j10) {
        hy1 hy1Var = xu1Var.f12334d;
        if (hy1Var != null) {
            String strA = this.f5082d.a(xu1Var.f12332b, hy1Var);
            HashMap map = this.f5087j;
            Long l10 = (Long) map.get(strA);
            HashMap map2 = this.i;
            Long l11 = (Long) map2.get(strA);
            map.put(strA, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            map2.put(strA, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i)));
        }
    }

    public final void p(xu1 xu1Var, String str) {
        hy1 hy1Var = xu1Var.f12334d;
        if ((hy1Var == null || !hy1Var.b()) && str.equals(this.f5088k)) {
            m();
        }
        this.i.remove(str);
        this.f5087j.remove(str);
    }

    public final boolean q(ut utVar) {
        String str;
        if (utVar == null) {
            return false;
        }
        dv1 dv1Var = this.f5082d;
        String str2 = (String) utVar.f11062d;
        synchronized (dv1Var) {
            str = dv1Var.f4690f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.yu1
    public final void o(IOException iOException) {
    }
}
