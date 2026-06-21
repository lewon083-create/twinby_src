package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0092d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23648a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0117e f23649b;

    public C0092d(C0117e c0117e) {
        this.f23649b = c0117e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f23648a.get()) {
            this.f23649b.f23716e.set(false);
            C0117e c0117e = this.f23649b;
            c0117e.f23714c.postAtFrontOfQueue(c0117e.f23717f);
            int i = this.f23649b.f23713b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C0117e.f23710g);
                    if (this.f23649b.f23716e.get()) {
                        break;
                    } else {
                        i--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f23649b.f23712a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0066c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f23649b.f23716e.get()) {
                Thread.sleep(C0117e.f23710g);
            }
        }
    }
}
