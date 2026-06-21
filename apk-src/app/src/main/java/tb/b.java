package tb;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements OnCompleteListener, Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kw0 f33667e = new kw0(Looper.getMainLooper(), 6, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseArray f33668f = new SparseArray(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f33669g = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f33671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Task f33672d;

    public final void a() {
        if (this.f33672d == null || this.f33671c == null) {
            return;
        }
        f33668f.delete(this.f33670b);
        f33667e.removeCallbacks(this);
        a aVar = this.f33671c;
        Task task = this.f33672d;
        int i = a.f33663e;
        aVar.a(task);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f33672d = task;
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        f33668f.delete(this.f33670b);
    }
}
