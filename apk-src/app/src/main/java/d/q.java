package d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f15465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15468d;

    public q(Executor executor, c reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f15465a = executor;
        this.f15466b = new Object();
        this.f15468d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f15466b) {
            try {
                this.f15467c = true;
                Iterator it = this.f15468d.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f15468d.clear();
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
