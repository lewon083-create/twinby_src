package yads;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class om1 implements af, je2 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe0 f41628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f41629c;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f41635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41636k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public de2 f41639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public nm1 f41640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public nm1 f41641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public nm1 f41642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public nx0 f41643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public nx0 f41644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public nx0 f41645t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f41646u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f41647v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f41648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f41649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f41650y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f41651z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u63 f41631e = new u63();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s63 f41632f = new s63();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f41634h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f41633g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41630d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41637l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41638m = 0;

    public om1(Context context, PlaybackSession playbackSession) {
        this.f41627a = context.getApplicationContext();
        this.f41629c = playbackSession;
        oe0 oe0Var = new oe0();
        this.f41628b = oe0Var;
        oe0Var.a(this);
    }

    public final boolean a(nm1 nm1Var) {
        String str;
        if (nm1Var == null) {
            return false;
        }
        String str2 = nm1Var.f41293c;
        oe0 oe0Var = this.f41628b;
        synchronized (oe0Var) {
            str = oe0Var.f41530g;
        }
        return str2.equals(str);
    }

    public final void b(ye yeVar, String str) {
        an1 an1Var = yeVar.f45030d;
        if ((an1Var == null || !an1Var.a()) && str.equals(this.i)) {
            a();
        }
        this.f41633g.remove(str);
        this.f41634h.remove(str);
    }

    public final void a() {
        PlaybackMetrics.Builder builder = this.f41635j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f41651z);
            this.f41635j.setVideoFramesDropped(this.f41649x);
            this.f41635j.setVideoFramesPlayed(this.f41650y);
            Long l10 = (Long) this.f41633g.get(this.i);
            this.f41635j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f41634h.get(this.i);
            this.f41635j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f41635j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f41629c.reportPlaybackMetrics(this.f41635j.build());
        }
        this.f41635j = null;
        this.i = null;
        this.f41651z = 0;
        this.f41649x = 0;
        this.f41650y = 0;
        this.f41643r = null;
        this.f41644s = null;
        this.f41645t = null;
        this.A = false;
    }

    public final void a(v63 v63Var, an1 an1Var) {
        int iA;
        PlaybackMetrics.Builder builder = this.f41635j;
        if (an1Var == null || (iA = v63Var.a(an1Var.f43366a)) == -1) {
            return;
        }
        int i = 0;
        v63Var.a(iA, this.f41632f, false);
        v63Var.a(this.f41632f.f42825d, this.f41631e, 0L);
        cm1 cm1Var = this.f41631e.f43581d.f39245c;
        if (cm1Var != null) {
            int iA2 = lb3.a(cm1Var.f37092a, cm1Var.f37093b);
            i = iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        u63 u63Var = this.f41631e;
        if (u63Var.f43591o != -9223372036854775807L && !u63Var.f43589m && !u63Var.f43586j && !u63Var.a()) {
            builder.setMediaDurationMillis(lb3.b(this.f41631e.f43591o));
        }
        builder.setPlaybackType(this.f41631e.a() ? 2 : 1);
        this.A = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.qe2 r22, yads.ze r23) {
        /*
            Method dump skipped, instruction units count: 1746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.om1.a(yads.qe2, yads.ze):void");
    }

    public final void a(ye yeVar, String str) {
        an1 an1Var = yeVar.f45030d;
        if (an1Var == null || !an1Var.a()) {
            a();
            this.i = str;
            this.f41635j = g8.j.e().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            a(yeVar.f45028b, yeVar.f45030d);
        }
    }

    public final void a(int i, long j10, nx0 nx0Var, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = t3.g.q(i).setTimeSinceCreatedMillis(j10 - this.f41630d);
        if (nx0Var != null) {
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
            String str = nx0Var.f41374l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = nx0Var.f41375m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = nx0Var.f41372j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = nx0Var.i;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = nx0Var.f41380r;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = nx0Var.f41381s;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = nx0Var.f41388z;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = nx0Var.A;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = nx0Var.f41367d;
            if (str4 != null) {
                int i17 = lb3.f40466a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = nx0Var.f41382t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f41629c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
