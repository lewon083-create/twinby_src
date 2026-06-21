package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.g f38008b = ij.h.b(new d41(this));

    public e41(Context context) {
        this.f38007a = context;
    }

    public final void a(Set set, f51 f51Var) {
        if (set.isEmpty()) {
            f51Var.a(kotlin.collections.j0.d());
        } else {
            new z31(((y82) this.f38008b.getValue()).f44952a, set, f51Var, new Handler(Looper.getMainLooper()), new AtomicInteger(set.size()), new ls1()).a();
        }
    }
}
