package lk;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object f28131b;

    public a(kk.f fVar) {
        super("Flow was aborted, no more elements needed");
        this.f28131b = fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
