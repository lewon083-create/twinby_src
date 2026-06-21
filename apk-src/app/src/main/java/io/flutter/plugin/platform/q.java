package io.flutter.plugin.platform;

import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.gms.internal.ads.rh0;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements j {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Class[] f25727y = {SurfaceView.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xh.a f25729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z2.w f25730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xh.s f25731e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f25733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public io.flutter.plugin.editing.i f25734h;
    public h3.e i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x0.v f25747v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FlutterJNI f25732f = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25742q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25743r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25744s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25748w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f25749x = new n(0, this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f25728b = new n(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f25736k = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f25735j = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f25737l = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f25740o = new SparseArray();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f25745t = new HashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashSet f25746u = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SparseArray f25741p = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseArray f25738m = new SparseArray();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f25739n = new SparseArray();

    public q() {
        if (x0.v.f35679e == null) {
            x0.v.f35679e = new x0.v(6);
        }
        this.f25747v = x0.v.f35679e;
    }

    public static void a(q qVar, hi.c cVar) {
        int i = cVar.f20573g;
        if (i == 0 || i == 1) {
            return;
        }
        throw new IllegalStateException(t.z.d(cVar.f20567a, ")", l7.o.m(i, "Trying to create a view with unknown direction value: ", "(view id: ")));
    }

    public static void e(int i) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < i) {
            throw new IllegalStateException(a0.u.j(i10, i, "Trying to use platform views with API ", ", required API level is: "));
        }
    }

    public static h j(io.flutter.embedding.engine.renderer.j jVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return i >= 29 ? new rh0(jVar.c()) : new x(jVar.e());
        }
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerD = jVar.d(i <= 34 ? 2 : 1);
        n nVar = new n(4);
        nVar.f25711c = textureRegistry$SurfaceProducerD;
        return nVar;
    }

    public final f b(hi.c cVar, boolean z5) {
        String str = cVar.f20568b;
        int i = cVar.f20567a;
        g gVar = (g) ((HashMap) this.f25728b.f25711c).get(str);
        if (gVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = cVar.i;
        f fVarA = gVar.a(z5 ? new MutableContextWrapper(this.f25730d) : this.f25730d, byteBuffer != null ? gVar.f25692a.decodeMessage(byteBuffer) : null);
        View view = fVarA.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(cVar.f20573g);
        this.f25738m.put(i, fVarA);
        return fVarA;
    }

    @Override // io.flutter.plugin.platform.j
    public final void c(io.flutter.view.h hVar) {
        this.f25735j.f25676a = hVar;
    }

    public final void d() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f25740o;
            if (i >= sparseArray.size()) {
                return;
            }
            d dVar = (d) sparseArray.valueAt(i);
            dVar.b();
            dVar.f36146b.close();
            i++;
        }
    }

    @Override // io.flutter.plugin.platform.j
    public final View f(int i) {
        if (o(i)) {
            return ((b0) this.f25736k.get(Integer.valueOf(i))).a();
        }
        f fVar = (f) this.f25738m.get(i);
        if (fVar == null) {
            return null;
        }
        return fVar.getView();
    }

    public final void g(boolean z5) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f25740o;
            if (i >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i);
            d dVar = (d) sparseArray.valueAt(i);
            if (this.f25745t.contains(Integer.valueOf(iKeyAt))) {
                FlutterEngine flutterEngine = this.f25731e.f36176k;
                if (flutterEngine != null) {
                    dVar.a(flutterEngine.f25542b);
                }
                z5 &= dVar.c();
            } else {
                if (!this.f25743r) {
                    dVar.b();
                }
                dVar.setVisibility(8);
                this.f25731e.removeView(dVar);
            }
            i++;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f25739n;
            if (i10 >= sparseArray2.size()) {
                return;
            }
            int iKeyAt2 = sparseArray2.keyAt(i10);
            View view = (View) sparseArray2.get(iKeyAt2);
            if (!this.f25746u.contains(Integer.valueOf(iKeyAt2)) || (!z5 && this.f25744s)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i10++;
        }
    }

    public final float h() {
        return this.f25730d.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void i() {
        if (!this.f25744s || this.f25743r) {
            return;
        }
        xh.s sVar = this.f25731e;
        sVar.f36173g.pause();
        xh.m mVar = sVar.f36172f;
        if (mVar == null) {
            xh.m mVar2 = new xh.m(sVar.getContext(), sVar.getWidth(), sVar.getHeight(), 1);
            sVar.f36172f = mVar2;
            sVar.addView(mVar2);
        } else {
            mVar.e(sVar.getWidth(), sVar.getHeight());
        }
        sVar.f36174h = sVar.f36173g;
        xh.m mVar3 = sVar.f36172f;
        sVar.f36173g = mVar3;
        FlutterEngine flutterEngine = sVar.f36176k;
        if (flutterEngine != null) {
            mVar3.a(flutterEngine.f25542b);
        }
        this.f25743r = true;
    }

    public final void k() {
        for (b0 b0Var : this.f25736k.values()) {
            h hVar = b0Var.f25684f;
            h hVar2 = b0Var.f25684f;
            int width = hVar.getWidth();
            int height = hVar2.getHeight();
            boolean zIsFocused = b0Var.a().isFocused();
            v vVarDetachState = b0Var.f25679a.detachState();
            b0Var.f25686h.setSurface(null);
            b0Var.f25686h.release();
            b0Var.f25686h = ((DisplayManager) b0Var.f25680b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + b0Var.f25683e, width, height, b0Var.f25682d, hVar2.getSurface(), 0, b0.i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(b0Var.f25680b, b0Var.f25686h.getDisplay(), b0Var.f25681c, vVarDetachState, b0Var.f25685g, zIsFocused);
            singleViewPresentation.show();
            b0Var.f25679a.cancel();
            b0Var.f25679a = singleViewPresentation;
        }
    }

    public final MotionEvent l(float f10, hi.d dVar, boolean z5) {
        long j10 = dVar.f20589p;
        int i = dVar.f20579e;
        MotionEvent motionEventX = this.f25747v.x(new xh.c0(j10));
        List<List> list = (List) dVar.f20581g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d10 = f10;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d10);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d10);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d10);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d10);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d10);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d10);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i]);
        List<List> list3 = (List) dVar.f20580f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i]);
        if (z5 || motionEventX == null) {
            return MotionEvent.obtain(dVar.f20576b.longValue(), dVar.f20577c.longValue(), dVar.f20578d, dVar.f20579e, pointerPropertiesArr, pointerCoordsArr, dVar.f20582h, dVar.i, dVar.f20583j, dVar.f20584k, dVar.f20585l, dVar.f20586m, dVar.f20587n, dVar.f20588o);
        }
        if (motionEventX.getPointerCount() != i || motionEventX.getAction() != dVar.f20578d) {
            return MotionEvent.obtain(motionEventX.getDownTime(), motionEventX.getEventTime(), dVar.f20578d, dVar.f20579e, pointerPropertiesArr, pointerCoordsArr, motionEventX.getMetaState(), motionEventX.getButtonState(), motionEventX.getXPrecision(), motionEventX.getYPrecision(), motionEventX.getDeviceId(), motionEventX.getEdgeFlags(), motionEventX.getSource(), motionEventX.getFlags());
        }
        if (pointerCoordsArr.length < 1) {
            return motionEventX;
        }
        motionEventX.offsetLocation(pointerCoordsArr[0].x - motionEventX.getX(), pointerCoordsArr[0].y - motionEventX.getY());
        return motionEventX;
    }

    public final int m(double d10) {
        return (int) Math.round(d10 * ((double) h()));
    }

    @Override // io.flutter.plugin.platform.j
    public final boolean o(int i) {
        return this.f25736k.containsKey(Integer.valueOf(i));
    }

    @Override // io.flutter.plugin.platform.j
    public final void r() {
        this.f25735j.f25676a = null;
    }
}
