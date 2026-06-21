package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0597x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f24994a;

    public RunnableC0597x1(Context context) {
        this.f24994a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pj pj2 = AbstractC0366nj.f24449a;
        Context context = this.f24994a;
        synchronized (pj2) {
            try {
                if (pj2.f22838b == null) {
                    pj2.f22838b = AbstractC0340mi.f24376a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = pj2.f22837a.iterator();
                    while (it.hasNext()) {
                        ((Ra) it.next()).a(pj2.f22838b);
                    }
                    pj2.f22837a.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
