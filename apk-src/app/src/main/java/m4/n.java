package m4;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import java.io.IOException;
import java.util.concurrent.Executors;
import m3.x;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.o f28668e = new com.google.android.gms.internal.ads.o(0, -9223372036854775807L, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.o f28669f = new com.google.android.gms.internal.ads.o(2, -9223372036854775807L, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.internal.ads.o f28670g = new com.google.android.gms.internal.ads.o(3, -9223372036854775807L, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4.a f28671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f28672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IOException f28673d;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String str) {
        String strK = om1.k("ExoPlayer:Loader:", str);
        String str2 = z.f28608a;
        this(new n4.a(Executors.newSingleThreadExecutor(new x(strK, 0)), new kf.a(22)));
    }

    @Override // m4.o
    public final void a() {
        IOException iOException = this.f28673d;
        if (iOException != null) {
            throw iOException;
        }
        j jVar = this.f28672c;
        if (jVar != null) {
            int i = jVar.f28659b;
            IOException iOException2 = jVar.f28663f;
            if (iOException2 != null && jVar.f28664g > i) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        j jVar = this.f28672c;
        jVar.getClass();
        jVar.a(false);
    }

    public final boolean c() {
        return this.f28673d != null;
    }

    public final boolean d() {
        return this.f28672c != null;
    }

    public final void e(l lVar) {
        j jVar = this.f28672c;
        if (jVar != null) {
            jVar.a(true);
        }
        n4.a aVar = this.f28671b;
        if (lVar != null) {
            aVar.execute(new ac.g(20, lVar));
        }
        aVar.f29096c.accept(aVar.f29095b);
    }

    public final void f(k kVar, i iVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.f28673d = null;
        j jVar = new j(this, looperMyLooper, kVar, iVar, i, SystemClock.elapsedRealtime());
        h5.r(this.f28672c == null);
        this.f28672c = jVar;
        jVar.b();
    }

    public n(n4.a aVar) {
        this.f28671b = aVar;
    }
}
