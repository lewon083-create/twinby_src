package ka;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f27307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27308b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27309c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27310d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27311e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f27312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile i3.a f27313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile i3.a f27314h;
    public final Semaphore i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f27315j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.f27315j = set;
    }

    public final void a() {
        if (this.f27313g != null) {
            boolean z5 = this.f27308b;
            if (!z5) {
                if (z5) {
                    c();
                } else {
                    this.f27311e = true;
                }
            }
            if (this.f27314h != null) {
                this.f27313g.getClass();
                this.f27313g = null;
                return;
            }
            this.f27313g.getClass();
            i3.a aVar = this.f27313g;
            aVar.f20822d.set(true);
            if (aVar.f20820b.cancel(false)) {
                this.f27314h = this.f27313g;
            }
            this.f27313g = null;
        }
    }

    public final void b() {
        if (this.f27314h != null || this.f27313g == null) {
            return;
        }
        this.f27313g.getClass();
        if (this.f27312f == null) {
            this.f27312f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        i3.a aVar = this.f27313g;
        Executor executor = this.f27312f;
        if (aVar.f20821c == 1) {
            aVar.f20821c = 2;
            executor.execute(aVar.f20820b);
            return;
        }
        int iM = z.m(aVar.f20821c);
        if (iM == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iM == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f27313g = new i3.a(this);
        b();
    }

    public final void d() {
        Iterator it = this.f27315j.iterator();
        if (it.hasNext()) {
            ((na.i) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e3);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
