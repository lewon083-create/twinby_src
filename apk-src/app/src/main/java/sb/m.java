package sb;

import com.google.android.gms.internal.ads.xx1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32876a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4 f32877b = new i4(14);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f32879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f32880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f32881f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, b bVar) {
        this.f32877b.p(new k(executor, bVar));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f32877b.p(new k(h.f32859a, onCompleteListener));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(Executor executor, OnCompleteListener onCompleteListener) {
        this.f32877b.p(new k(executor, onCompleteListener));
        p();
    }

    @Override // com.google.android.gms.tasks.Task
    public final m c(Executor executor, c cVar) {
        this.f32877b.p(new k(executor, cVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final m d(Executor executor, d dVar) {
        this.f32877b.p(new k(executor, dVar));
        p();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task e(Executor executor, a aVar) {
        m mVar = new m();
        this.f32877b.p(new j(executor, aVar, mVar, 0));
        p();
        return mVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, a aVar) {
        m mVar = new m();
        this.f32877b.p(new j(executor, aVar, mVar, 1));
        p();
        return mVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object g(Class cls) {
        Object obj;
        synchronized (this.f32876a) {
            try {
                c0.k("Task is not yet complete", this.f32878c);
                if (this.f32879d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (cls.isInstance(this.f32881f)) {
                    throw ((Throwable) cls.cast(this.f32881f));
                }
                Exception exc = this.f32881f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f32880e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.f32876a) {
            exc = this.f32881f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.f32876a) {
            try {
                c0.k("Task is not yet complete", this.f32878c);
                if (this.f32879d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f32881f;
                if (exc != null) {
                    throw new e(exc);
                }
                obj = this.f32880e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean h() {
        return this.f32879d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean i() {
        boolean z5;
        synchronized (this.f32876a) {
            z5 = this.f32878c;
        }
        return z5;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z5;
        synchronized (this.f32876a) {
            try {
                z5 = false;
                if (this.f32878c && !this.f32879d && this.f32881f == null) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task j(Executor executor, f fVar) {
        m mVar = new m();
        this.f32877b.p(new k(executor, fVar, mVar));
        p();
        return mVar;
    }

    public final m k(c cVar) {
        c(h.f32859a, cVar);
        return this;
    }

    public final void l(Object obj) {
        synchronized (this.f32876a) {
            o();
            this.f32878c = true;
            this.f32880e = obj;
        }
        this.f32877b.w(this);
    }

    public final void m(Exception exc) {
        c0.j(exc, "Exception must not be null");
        synchronized (this.f32876a) {
            o();
            this.f32878c = true;
            this.f32881f = exc;
        }
        this.f32877b.w(this);
    }

    public final void n() {
        synchronized (this.f32876a) {
            try {
                if (this.f32878c) {
                    return;
                }
                this.f32878c = true;
                this.f32879d = true;
                this.f32877b.w(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        if (this.f32878c) {
            int i = xx1.f12370b;
            if (!i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception exception = getException();
        }
    }

    public final void p() {
        synchronized (this.f32876a) {
            try {
                if (this.f32878c) {
                    this.f32877b.w(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
