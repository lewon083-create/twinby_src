package he;

import a0.y;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f20489d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.yandex.div.core.dagger.b f20490e = new com.yandex.div.core.dagger.b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f20492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sb.m f20493c = null;

    public c(Executor executor, n nVar) {
        this.f20491a = executor;
        this.f20492b = nVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b bVar = new b(0);
        Executor executor = f20490e;
        task.d(executor, bVar);
        task.c(executor, bVar);
        task.a(executor, bVar);
        if (!bVar.f20488c.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            sb.m mVar = this.f20493c;
            if (mVar == null || (mVar.i() && !this.f20493c.isSuccessful())) {
                this.f20493c = b4.d(new a7.h(3, this.f20492b), this.f20491a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20493c;
    }

    public final d c() {
        synchronized (this) {
            try {
                sb.m mVar = this.f20493c;
                if (mVar != null && mVar.isSuccessful()) {
                    return (d) this.f20493c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (d) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e3);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task d(d dVar) {
        com.google.firebase.messaging.g gVar = new com.google.firebase.messaging.g(3, this, dVar);
        Executor executor = this.f20491a;
        return b4.d(gVar, executor).j(executor, new y(12, this, dVar));
    }
}
