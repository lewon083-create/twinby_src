package g0;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements Runnable {
    public static final Object i = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f19624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f19625c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f19627e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f19626d = new AtomicBoolean(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f19628f = i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19629g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19630h = false;

    public j2(AtomicReference atomicReference, Executor executor, s1 s1Var) {
        this.f19627e = atomicReference;
        this.f19624b = executor;
        this.f19625c = s1Var;
    }

    public final void a(int i10) {
        synchronized (this) {
            try {
                if (this.f19626d.get()) {
                    if (i10 <= this.f19629g) {
                        return;
                    }
                    this.f19629g = i10;
                    if (this.f19630h) {
                        return;
                    }
                    this.f19630h = true;
                    try {
                        this.f19624b.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f19630h = false;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f19626d.get()) {
                    this.f19630h = false;
                    return;
                }
                Object obj = this.f19627e.get();
                int i10 = this.f19629g;
                while (true) {
                    if (!Objects.equals(this.f19628f, obj)) {
                        this.f19628f = obj;
                        if (obj instanceof m) {
                            this.f19625c.onError(((m) obj).f19653a);
                        } else {
                            this.f19625c.a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i10 == this.f19629g || !this.f19626d.get()) {
                                break;
                            }
                            obj = this.f19627e.get();
                            i10 = this.f19629g;
                        } finally {
                        }
                    }
                }
                this.f19630h = false;
            } finally {
            }
        }
    }
}
