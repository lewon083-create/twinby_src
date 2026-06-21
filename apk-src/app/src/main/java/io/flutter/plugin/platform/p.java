package io.flutter.plugin.platform;

import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f25712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xh.a f25713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z2.w f25714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xh.s f25715e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.i f25717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h3.e f25718h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.v f25721l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FlutterJNI f25716f = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Surface f25724o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SurfaceControl f25725p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f25726q = new n(3, this);
    public final a i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f25719j = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseArray f25720k = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f25722m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f25723n = new ArrayList();

    public p() {
        if (x0.v.f35679e == null) {
            x0.v.f35679e = new x0.v(6);
        }
        this.f25721l = x0.v.f35679e;
    }

    public final boolean a(int i) {
        f fVar = (f) this.f25719j.get(i);
        if (fVar == null) {
            return false;
        }
        SparseArray sparseArray = this.f25720k;
        if (sparseArray.get(i) != null) {
            return true;
        }
        View view = fVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        z2.w wVar = this.f25714d;
        di.b bVar = new di.b(wVar, wVar.getResources().getDisplayMetrics().density, this.f25713c);
        bVar.setOnDescendantFocusChangeListener(new k(this, i, 1));
        sparseArray.put(i, bVar);
        view.setImportantForAccessibility(4);
        bVar.addView(view);
        this.f25715e.addView(bVar);
        return true;
    }

    @Override // io.flutter.plugin.platform.j
    public final void c(io.flutter.view.h hVar) {
        this.i.f25676a = hVar;
    }

    @Override // io.flutter.plugin.platform.j
    public final View f(int i) {
        f fVar = (f) this.f25719j.get(i);
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    @Override // io.flutter.plugin.platform.j
    public final boolean o(int i) {
        return false;
    }

    @Override // io.flutter.plugin.platform.j
    public final void r() {
        this.i.f25676a = null;
    }
}
