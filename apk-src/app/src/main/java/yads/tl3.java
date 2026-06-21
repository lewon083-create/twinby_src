package yads;

import android.os.SystemClock;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tl3 implements tf3, vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me3 f43358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mg3 f43359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk3 f43360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final df3 f43361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jk3 f43362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f43363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43364g;

    public tl3(me3 me3Var, mg3 mg3Var, ck3 ck3Var, df3 df3Var, jk3 jk3Var) {
        this.f43358a = me3Var;
        this.f43359b = mg3Var;
        this.f43360c = ck3Var;
        this.f43361d = df3Var;
        this.f43362e = jk3Var;
    }

    @Override // yads.tf3
    public final void a(long j10, long j11) {
        if (this.f43364g) {
            return;
        }
        Unit unit = null;
        if (!this.f43362e.a() || this.f43359b.a() != kg3.f40195e) {
            this.f43363f = null;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.f43363f;
        if (l10 != null) {
            if (jElapsedRealtime - l10.longValue() >= 2000) {
                this.f43364g = true;
                this.f43361d.i(this.f43358a);
                this.f43360c.n();
            }
            unit = Unit.f27471a;
        }
        if (unit == null) {
            this.f43363f = Long.valueOf(jElapsedRealtime);
            this.f43361d.a(this.f43358a);
        }
    }

    @Override // yads.vf3
    public final void b() {
        this.f43363f = null;
    }

    public /* synthetic */ tl3(me3 me3Var, hk3 hk3Var, mg3 mg3Var, ck3 ck3Var, df3 df3Var) {
        this(me3Var, mg3Var, ck3Var, df3Var, new jk3(hk3Var));
    }

    @Override // yads.vf3
    public final void a() {
        this.f43363f = null;
    }
}
