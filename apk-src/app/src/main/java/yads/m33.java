package yads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m33 implements bk1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv f40765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ge2 f40769f = ge2.f38744e;

    public m33(i53 i53Var) {
        this.f40765b = i53Var;
    }

    @Override // yads.bk1
    public final long a() {
        long j10 = this.f40767d;
        if (!this.f40766c) {
            return j10;
        }
        ((i53) this.f40765b).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f40768e;
        ge2 ge2Var = this.f40769f;
        return (ge2Var.f38745b == 1.0f ? lb3.a(jElapsedRealtime) : jElapsedRealtime * ((long) ge2Var.f38747d)) + j10;
    }

    @Override // yads.bk1
    public final ge2 getPlaybackParameters() {
        return this.f40769f;
    }

    public final void a(long j10) {
        this.f40767d = j10;
        if (this.f40766c) {
            ((i53) this.f40765b).getClass();
            this.f40768e = SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.bk1
    public final void a(ge2 ge2Var) {
        if (this.f40766c) {
            a(a());
        }
        this.f40769f = ge2Var;
    }
}
