package yads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yw3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f45178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f45179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f45180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rv3 f45181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mx3 f45182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f45183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f45184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f45185h;

    public yw3(Handler handler, Context context, rv3 rv3Var, mx3 mx3Var) {
        super(handler);
        this.f45183f = new AtomicReference(Float.valueOf(-1.0f));
        this.f45184g = new AtomicBoolean(false);
        this.f45185h = Executors.newSingleThreadExecutor();
        this.f45178a = handler;
        this.f45179b = context;
        this.f45180c = (AudioManager) context.getSystemService("audio");
        this.f45181d = rv3Var;
        this.f45182e = mx3Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        if (this.f45184g.getAndSet(true)) {
            return;
        }
        this.f45185h.submit(new tw3(this));
    }
}
