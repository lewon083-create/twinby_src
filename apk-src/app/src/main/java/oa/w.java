package oa;

import android.os.Trace;
import com.google.android.gms.internal.measurement.n4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w f29894c = new w(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w f29895d = new w(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29896b;

    public /* synthetic */ w(int i) {
        this.f29896b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29896b) {
            case 0:
                return;
            case 1:
                n4.i.incrementAndGet();
                return;
            default:
                try {
                    int i = c2.j.f2200a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (u2.h.f34028j != null) {
                        u2.h.a().c();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i10 = c2.j.f2200a;
                    Trace.endSection();
                    throw th2;
                }
        }
    }

    private final /* synthetic */ void a() {
    }
}
