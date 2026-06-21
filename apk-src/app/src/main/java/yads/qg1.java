package yads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qg1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f42294d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile qg1 f42295e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gy1 f42296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42297b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42298c;

    public qg1(gy1 gy1Var) {
        this.f42296a = gy1Var;
    }

    public final Executor a() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f42294d) {
            try {
                if (this.f42297b.size() < 4) {
                    executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f42296a);
                    this.f42297b.add(executorNewSingleThreadExecutor);
                } else {
                    ArrayList arrayList = this.f42297b;
                    int i = this.f42298c;
                    this.f42298c = i + 1;
                    executorNewSingleThreadExecutor = (Executor) arrayList.get(i);
                    if (this.f42298c == 4) {
                        this.f42298c = 0;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorNewSingleThreadExecutor;
    }
}
