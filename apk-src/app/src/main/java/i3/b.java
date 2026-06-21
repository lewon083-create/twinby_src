package i3;

import aa.w;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends FutureTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f20825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, w wVar) {
        super(wVar);
        this.f20825b = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f20825b;
        AtomicBoolean atomicBoolean = aVar.f20823e;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e3) {
            Log.w("AsyncTask", e3);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e7) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e7.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
