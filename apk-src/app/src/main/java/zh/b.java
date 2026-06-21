package zh;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import ii.l;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import t.t0;
import ti.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements ii.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f46274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager f46275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f46277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xi.d f46278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46279g;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j10) {
        this.f46279g = false;
        t tVar = new t(this);
        this.f46274b = flutterJNI;
        this.f46275c = assetManager;
        this.f46276d = j10;
        h hVar = new h(flutterJNI);
        this.f46277e = hVar;
        hVar.b("flutter/isolate", tVar, null);
        this.f46278f = new xi.d(hVar);
        if (flutterJNI.isAttached()) {
            this.f46279g = true;
        }
    }

    @Override // ii.f
    public final void b(String str, ii.d dVar, t0 t0Var) {
        this.f46278f.b(str, dVar, t0Var);
    }

    public final void c(a aVar, ArrayList arrayList) {
        if (this.f46279g) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        gj.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f46274b.runBundleAndSnapshotFromLibrary(aVar.f46271a, aVar.f46273c, aVar.f46272b, this.f46275c, arrayList, this.f46276d);
            this.f46279g = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // ii.f
    public final void d(String str, ii.d dVar) {
        this.f46278f.d(str, dVar);
    }

    @Override // ii.f
    public final void f(String str, ByteBuffer byteBuffer) {
        this.f46278f.f(str, byteBuffer);
    }

    @Override // ii.f
    public final void g(String str, ByteBuffer byteBuffer, ii.e eVar) {
        this.f46278f.g(str, byteBuffer, eVar);
    }

    @Override // ii.f
    public final t0 h(l lVar) {
        return ((h) this.f46278f.f36218b).h(lVar);
    }
}
