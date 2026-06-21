package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f1694f = new ThreadLocal();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ic.l f1695g = new ic.l(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f1699e;

    public static p c(RecyclerView recyclerView, int i, long j10) {
        int iH = recyclerView.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            p childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i10));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        k kVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            p pVarK = kVar.k(i, j10);
            if (pVarK != null) {
                if (!pVarK.isBound() || pVarK.isInvalid()) {
                    kVar.a(pVarK, false);
                } else {
                    kVar.h(pVarK.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return pVarK;
        } catch (Throwable th2) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i10) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f1696b.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f1697c == 0) {
                this.f1697c = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        c cVar = recyclerView.mPrefetchRegistry;
        cVar.f1690a = i;
        cVar.f1691b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1696b;
        try {
            int i = c2.j.f2200a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1698d);
                }
            }
            this.f1697c = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f1697c = 0L;
            int i11 = c2.j.f2200a;
            Trace.endSection();
            throw th2;
        }
    }
}
