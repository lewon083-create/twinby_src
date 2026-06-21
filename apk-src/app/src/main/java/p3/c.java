package p3;

import ad.b1;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements h {
    private l dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<e0> listeners = new ArrayList<>(1);

    public c(boolean z5) {
        this.isNetwork = z5;
    }

    @Override // p3.h
    public final void addTransferListener(e0 e0Var) {
        e0Var.getClass();
        if (this.listeners.contains(e0Var)) {
            return;
        }
        this.listeners.add(e0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i) {
        l lVar = this.dataSpec;
        String str = m3.z.f28608a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            e0 e0Var = this.listeners.get(i10);
            boolean z5 = this.isNetwork;
            m4.h hVar = (m4.h) e0Var;
            synchronized (hVar) {
                b1 b1Var = m4.h.f28638p;
                if (z5 && (lVar.i & 8) != 8) {
                    hVar.i += (long) i;
                }
            }
        }
    }

    public final void transferEnded() {
        l lVar = this.dataSpec;
        String str = m3.z.f28608a;
        for (int i = 0; i < this.listenerCount; i++) {
            e0 e0Var = this.listeners.get(i);
            boolean z5 = this.isNetwork;
            m4.h hVar = (m4.h) e0Var;
            synchronized (hVar) {
                try {
                    b1 b1Var = m4.h.f28638p;
                    if (z5 && (lVar.i & 8) != 8) {
                        h5.r(hVar.f28651g > 0);
                        hVar.f28648d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i10 = (int) (jElapsedRealtime - hVar.f28652h);
                        hVar.f28653j += (long) i10;
                        long j10 = hVar.f28654k;
                        long j11 = hVar.i;
                        hVar.f28654k = j10 + j11;
                        if (i10 > 0) {
                            hVar.f28650f.a((j11 * 8000.0f) / i10, (int) Math.sqrt(j11));
                            if (hVar.f28653j >= 2000 || hVar.f28654k >= 524288) {
                                hVar.f28655l = (long) hVar.f28650f.b();
                            }
                            hVar.b(i10, hVar.i, hVar.f28655l);
                            hVar.f28652h = jElapsedRealtime;
                            hVar.i = 0L;
                        }
                        hVar.f28651g--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(l lVar) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).getClass();
        }
    }

    public final void transferStarted(l lVar) {
        this.dataSpec = lVar;
        for (int i = 0; i < this.listenerCount; i++) {
            e0 e0Var = this.listeners.get(i);
            boolean z5 = this.isNetwork;
            m4.h hVar = (m4.h) e0Var;
            synchronized (hVar) {
                try {
                    b1 b1Var = m4.h.f28638p;
                    if (z5 && (lVar.i & 8) != 8) {
                        if (hVar.f28651g == 0) {
                            hVar.f28648d.getClass();
                            hVar.f28652h = SystemClock.elapsedRealtime();
                        }
                        hVar.f28651g++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
