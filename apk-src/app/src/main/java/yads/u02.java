package yads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy1 f43508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oi2 f43509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m72 f43510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e41 f43511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d51 f43512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oy1 f43513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f43514g;

    public /* synthetic */ u02(Context context, hy1 hy1Var, oi2 oi2Var, m72 m72Var) {
        this(hy1Var, oi2Var, m72Var, new e41(context), new d51(), new oy1(oi2Var), new CopyOnWriteArraySet());
    }

    public u02(hy1 hy1Var, oi2 oi2Var, m72 m72Var, e41 e41Var, d51 d51Var, oy1 oy1Var, Set set) {
        this.f43508a = hy1Var;
        this.f43509b = oi2Var;
        this.f43510c = m72Var;
        this.f43511d = e41Var;
        this.f43512e = d51Var;
        this.f43513f = oy1Var;
        this.f43514g = set;
    }
}
