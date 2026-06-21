package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class po extends ro2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f41967v = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f41968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oo f41969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final wo2 f41970u;

    public po(Context context, int i, String str, oo ooVar, wo2 wo2Var) {
        super(i, no.a(str), ooVar);
        this.f41968s = context;
        this.f41969t = ooVar;
        this.f41970u = wo2Var;
        k();
        a(new qe0(1.0f, f41967v, 0));
    }

    @Override // yads.ro2
    public lm3 a(lm3 lm3Var) {
        return lm3Var;
    }

    @Override // yads.ro2
    public final void a(Object obj) {
        this.f41969t.a(obj);
    }

    public /* synthetic */ po(Context context, String str, oo ooVar) {
        this(context, 0, str, ooVar, null);
    }
}
