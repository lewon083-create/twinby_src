package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d31 f44688a;

    public static final d31 a(Context context) {
        if (f44688a == null) {
            synchronized (d31.f37605h) {
                try {
                    if (f44688a == null) {
                        Context applicationContext = context.getApplicationContext();
                        f44688a = new d31(applicationContext, pg.a(applicationContext), new yg(), new wg(new ug(), pg.a(applicationContext)), new dj1(wg1.a(applicationContext, "YadPreferenceFile")));
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d31 d31Var = f44688a;
        Intrinsics.b(d31Var);
        return d31Var;
    }
}
