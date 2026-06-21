package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;
import io.flutter.view.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f25607a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f25609c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f25614h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f25608b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25610d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f25611e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f25612f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f25613g = new ArrayList();

    public j(FlutterJNI flutterJNI) {
        a aVar = new a(0, this);
        this.f25614h = aVar;
        this.f25607a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public final void a(k kVar) {
        this.f25607a.addIsDisplayingFlutterUiListener(kVar);
        if (this.f25610d) {
            kVar.b();
        }
    }

    public final void b(o oVar) {
        HashSet hashSet = this.f25612f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((o) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(oVar));
    }

    public final TextureRegistry$ImageTextureEntry c() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f25608b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f25607a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer d(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            h hVarE = e();
            return new n(hVarE.f25581a, this.f25611e, this.f25607a, hVarE);
        }
        long andIncrement = this.f25608b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z5 = i == 2;
        this.f25607a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z5);
        if (z5) {
            b(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f25613g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final h e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f25608b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        h hVar = new h(this, andIncrement, surfaceTexture);
        this.f25607a.registerTexture(hVar.f25581a, hVar.f25582b);
        b(hVar);
        return hVar;
    }

    public final void f(int i) {
        Iterator it = this.f25612f.iterator();
        while (it.hasNext()) {
            o oVar = (o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    public final void g(k kVar) {
        this.f25607a.removeIsDisplayingFlutterUiListener(kVar);
    }

    public final void h(o oVar) {
        HashSet<WeakReference> hashSet = this.f25612f;
        for (WeakReference weakReference : hashSet) {
            if (weakReference.get() == oVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void i() {
        for (FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer : this.f25613g) {
            p pVar = flutterRenderer$ImageReaderSurfaceProducer.callback;
            if (pVar != null && flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy) {
                flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                pVar.d();
            }
        }
    }

    public final void j() {
        if (this.f25609c != null) {
            this.f25607a.onSurfaceDestroyed();
            if (this.f25610d) {
                this.f25614h.a();
            }
            this.f25610d = false;
            this.f25609c = null;
        }
    }
}
