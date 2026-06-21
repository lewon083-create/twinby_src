package yads;

import android.os.Handler;
import android.os.Message;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class we2 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qe f44358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue2 f44359c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c30 f44363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44364h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f44365j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap f44362f = new TreeMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f44361e = lb3.a((Handler.Callback) this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ym0 f44360d = new ym0();

    public we2(c30 c30Var, com.monetization.ads.exo.source.dash.c cVar, qe qeVar) {
        this.f44363g = c30Var;
        this.f44359c = cVar;
        this.f44358b = qeVar;
    }

    public final boolean a(long j10) {
        boolean z5;
        c30 c30Var = this.f44363g;
        if (!c30Var.f37256d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Map.Entry entryCeilingEntry = this.f44362f.ceilingEntry(Long.valueOf(c30Var.f37260h));
        if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= j10) {
            z5 = false;
        } else {
            long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
            com.monetization.ads.exo.source.dash.i iVar = ((com.monetization.ads.exo.source.dash.c) this.f44359c).f15032a;
            long j11 = iVar.N;
            if (j11 == -9223372036854775807L || j11 < jLongValue) {
                iVar.N = jLongValue;
            }
            z5 = true;
        }
        if (z5 && this.f44364h) {
            this.i = true;
            this.f44364h = false;
            com.monetization.ads.exo.source.dash.i iVar2 = ((com.monetization.ads.exo.source.dash.c) this.f44359c).f15032a;
            iVar2.D.removeCallbacks(iVar2.f15051w);
            iVar2.h();
        }
        return z5;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f44365j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        te2 te2Var = (te2) message.obj;
        long j10 = te2Var.f43311a;
        long j11 = te2Var.f43312b;
        Long l10 = (Long) this.f44362f.get(Long.valueOf(j11));
        if (l10 == null || l10.longValue() > j10) {
            this.f44362f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
        return true;
    }
}
