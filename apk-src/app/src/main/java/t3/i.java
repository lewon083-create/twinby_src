package t3;

import ad.m0;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import i4.c0;
import j3.e0;
import j3.n0;
import j3.o;
import j3.o0;
import j3.u;
import java.util.HashMap;
import java.util.concurrent.Executor;
import m3.z;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public int A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33440a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f33442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PlaybackSession f33443d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f33449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33450l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e0 f33453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m0 f33454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m0 f33455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m0 f33456r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o f33457s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o f33458t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o f33459u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f33460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f33461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f33462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f33463y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f33464z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f33441b = m3.b.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f33445f = new n0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3.m0 f33446g = new j3.m0();
    public final HashMap i = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f33447h = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f33444e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33451m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f33452n = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f33440a = context.getApplicationContext();
        this.f33443d = playbackSession;
        f fVar = new f();
        this.f33442c = fVar;
        fVar.f33436d = this;
    }

    public final boolean a(m0 m0Var) {
        String str;
        if (m0Var == null) {
            return false;
        }
        String str2 = (String) m0Var.f841e;
        f fVar = this.f33442c;
        synchronized (fVar) {
            str = fVar.f33438f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f33449k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f33449k.setVideoFramesDropped(this.f33463y);
            this.f33449k.setVideoFramesPlayed(this.f33464z);
            Long l10 = (Long) this.f33447h.get(this.f33448j);
            this.f33449k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.i.get(this.f33448j);
            this.f33449k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f33449k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f33441b.execute(new v0(5, this, this.f33449k.build()));
        }
        this.f33449k = null;
        this.f33448j = null;
        this.A = 0;
        this.f33463y = 0;
        this.f33464z = 0;
        this.f33457s = null;
        this.f33458t = null;
        this.f33459u = null;
        this.B = false;
    }

    public final void c(o0 o0Var, c0 c0Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.f33449k;
        if (c0Var == null || (iB = o0Var.b(c0Var.f20861a)) == -1) {
            return;
        }
        j3.m0 m0Var = this.f33446g;
        int i = 0;
        o0Var.f(iB, m0Var, false);
        int i10 = m0Var.f26276c;
        n0 n0Var = this.f33445f;
        o0Var.n(i10, n0Var);
        u uVar = n0Var.f26310c.f26407b;
        if (uVar != null) {
            int iF = z.F(uVar.f26396a, uVar.f26397b);
            i = iF != 0 ? iF != 1 ? iF != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (n0Var.f26319m != -9223372036854775807L && !n0Var.f26317k && !n0Var.i && !n0Var.a()) {
            builder.setMediaDurationMillis(z.Z(n0Var.f26319m));
        }
        builder.setPlaybackType(n0Var.a() ? 2 : 1);
        this.B = true;
    }

    public final void d(a aVar, String str) {
        c0 c0Var = aVar.f33409d;
        if ((c0Var == null || !c0Var.b()) && str.equals(this.f33448j)) {
            b();
        }
        this.f33447h.remove(str);
        this.i.remove(str);
    }

    public final void e(int i, long j10, o oVar, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = g.q(i).setTimeSinceCreatedMillis(j10 - this.f33444e);
        int i12 = 2;
        if (oVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? 1 : 4;
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str = oVar.f26334m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = oVar.f26335n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = oVar.f26332k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = oVar.f26331j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = oVar.f26342u;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = oVar.f26343v;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = oVar.F;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = oVar.G;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = oVar.f26326d;
            if (str4 != null) {
                String str5 = z.f28608a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = oVar.f26346y;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.f33441b.execute(new v0(i12, this, timeSinceCreatedMillis.build()));
    }
}
