package sb;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import ob.b3;
import ob.h4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements l, d, c, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f32873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f32874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f32875e;

    public k(Executor executor, OnCompleteListener onCompleteListener) {
        this.f32872b = 1;
        this.f32874d = new Object();
        this.f32873c = executor;
        this.f32875e = onCompleteListener;
    }

    @Override // sb.l
    public final void a(Task task) {
        switch (this.f32872b) {
            case 0:
                if (task.h()) {
                    synchronized (this.f32874d) {
                        try {
                            if (((b) this.f32875e) != null) {
                                this.f32873c.execute(new h4(11, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f32874d) {
                    try {
                        if (((OnCompleteListener) this.f32875e) == null) {
                            return;
                        }
                        this.f32873c.execute(new b3(5, this, task));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (task.isSuccessful() || task.h()) {
                    return;
                }
                synchronized (this.f32874d) {
                    try {
                        if (((c) this.f32875e) != null) {
                            this.f32873c.execute(new s9.i(2, this, task, false));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                if (task.isSuccessful()) {
                    synchronized (this.f32874d) {
                        try {
                            if (((d) this.f32875e) != null) {
                                this.f32873c.execute(new b3(6, this, task));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f32873c.execute(new s9.i(3, this, task, false));
                return;
        }
    }

    @Override // sb.b
    public void b() {
        ((m) this.f32875e).n();
    }

    @Override // sb.c
    public void onFailure(Exception exc) {
        ((m) this.f32875e).m(exc);
    }

    @Override // sb.d
    public void onSuccess(Object obj) {
        ((m) this.f32875e).l(obj);
    }

    public k(Executor executor, b bVar) {
        this.f32872b = 0;
        this.f32874d = new Object();
        this.f32873c = executor;
        this.f32875e = bVar;
    }

    public k(Executor executor, c cVar) {
        this.f32872b = 2;
        this.f32874d = new Object();
        this.f32873c = executor;
        this.f32875e = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f32872b = 3;
        this.f32874d = new Object();
        this.f32873c = executor;
        this.f32875e = dVar;
    }

    public k(Executor executor, f fVar, m mVar) {
        this.f32872b = 4;
        this.f32873c = executor;
        this.f32874d = fVar;
        this.f32875e = mVar;
    }
}
