package c2;

import android.os.OutcomeReceiver;
import com.google.android.gms.internal.measurement.h5;
import hk.l;
import ij.k;
import ij.m;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mj.a f2194b;

    public d(l lVar) {
        super(false);
        this.f2194b = lVar;
    }

    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            mj.a aVar = this.f2194b;
            k kVar = m.f21341c;
            aVar.resumeWith(h5.s(th2));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            mj.a aVar = this.f2194b;
            k kVar = m.f21341c;
            aVar.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
