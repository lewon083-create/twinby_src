package m3;

import android.content.Context;
import io.appmetrica.analytics.impl.cp;
import io.appmetrica.analytics.impl.lp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static o f28579f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f28580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f28581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28584e;

    public o(Context context) {
        Executor executorG = b.g();
        this.f28580a = executorG;
        this.f28581b = new CopyOnWriteArrayList();
        this.f28582c = new Object();
        this.f28583d = 0;
        executorG.execute(new cp(27, this, context));
    }

    public static synchronized o a(Context context) {
        try {
            if (f28579f == null) {
                f28579f = new o(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28579f;
    }

    public final int b() {
        int i;
        synchronized (this.f28582c) {
            i = this.f28583d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f28581b;
        for (n nVar : copyOnWriteArrayList) {
            if (nVar.f28576a.get() == null) {
                copyOnWriteArrayList.remove(nVar);
            }
        }
        synchronized (this.f28582c) {
            try {
                if (this.f28584e && this.f28583d == i) {
                    return;
                }
                this.f28584e = true;
                this.f28583d = i;
                for (n nVar2 : this.f28581b) {
                    nVar2.f28577b.execute(new lp(12, nVar2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
