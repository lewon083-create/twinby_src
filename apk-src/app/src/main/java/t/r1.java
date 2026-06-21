package t;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final MeteringRectangle[] f33251x = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f33252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.i f33253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0.d f33254c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ni.i f33257f;
    public ScheduledFuture i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture f33260j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f33267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f33268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MeteringRectangle[] f33269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j1.h f33270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j1.h f33271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f33272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m1 f33273w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f33255d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Rational f33256e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33258g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f33259h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f33261k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f33262l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f33263m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f33264n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p1 f33265o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o1 f33266p = null;

    public r1(o oVar, j0.d dVar, j0.i iVar, g0.a2 a2Var) {
        MeteringRectangle[] meteringRectangleArr = f33251x;
        this.f33267q = meteringRectangleArr;
        this.f33268r = meteringRectangleArr;
        this.f33269s = meteringRectangleArr;
        this.f33270t = null;
        this.f33271u = null;
        this.f33272v = false;
        this.f33273w = null;
        this.f33252a = oVar;
        this.f33253b = iVar;
        this.f33254c = dVar;
        this.f33257f = new ni.i(21, a2Var);
    }

    public final void a(boolean z5, boolean z10) {
        if (this.f33255d) {
            g0.r0 r0Var = new g0.r0();
            r0Var.f19727b = true;
            r0Var.f19728c = this.f33264n;
            g0.q1 q1VarV = g0.q1.v();
            if (z5) {
                q1VarV.y(s.b.u(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z10) {
                q1VarV.y(s.b.u(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            r0Var.c(new s.b(g0.u1.u(q1VarV)));
            this.f33252a.E(Collections.singletonList(r0Var.e()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [t.n, t.o1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(j1.h hVar) {
        o1 o1Var = this.f33266p;
        o oVar = this.f33252a;
        oVar.B(o1Var);
        j1.h hVar2 = this.f33271u;
        if (hVar2 != null) {
            hVar2.d(new a0.o("Cancelled by another cancelFocusAndMetering()"));
            this.f33271u = null;
        }
        oVar.B(this.f33265o);
        j1.h hVar3 = this.f33270t;
        if (hVar3 != null) {
            hVar3.d(new a0.o("Cancelled by cancelFocusAndMetering()"));
            this.f33270t = null;
        }
        this.f33271u = hVar;
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        ScheduledFuture scheduledFuture2 = this.f33260j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f33260j = null;
        }
        if (this.f33267q.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f33251x;
        this.f33267q = meteringRectangleArr;
        this.f33268r = meteringRectangleArr;
        this.f33269s = meteringRectangleArr;
        this.f33258g = false;
        final long jF = oVar.F();
        if (this.f33271u != null) {
            final int iW = oVar.w(this.f33264n != 3 ? 4 : 3);
            ?? r02 = new n() { // from class: t.o1
                @Override // t.n
                public final boolean b(TotalCaptureResult totalCaptureResult) {
                    r1 r1Var = this;
                    r1Var.getClass();
                    if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != iW || !o.A(totalCaptureResult, jF)) {
                        return false;
                    }
                    j1.h hVar4 = r1Var.f33271u;
                    if (hVar4 == null) {
                        return true;
                    }
                    hVar4.b(null);
                    r1Var.f33271u = null;
                    return true;
                }
            };
            this.f33266p = r02;
            oVar.a(r02);
        }
    }

    public final ed.d c(boolean z5) {
        int i = Build.VERSION.SDK_INT;
        k0.l lVar = k0.l.f26777d;
        if (i < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i);
            return lVar;
        }
        if (o.v(this.f33252a.f33175e, 5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return lVar;
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return i0.o.w(new com.google.firebase.messaging.v(this, z5));
    }

    public final List d(List list, int i, Rational rational, Rect rect, int i10) {
        if (list.isEmpty() || i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0.x1 x1Var = (a0.x1) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f10 = x1Var.f269a;
            float f11 = x1Var.f271c;
            if (f10 >= 0.0f && f10 <= 1.0f) {
                float f12 = x1Var.f270b;
                if (f12 >= 0.0f && f12 <= 1.0f) {
                    PointF pointF = (i10 == 1 && ((g0.a2) this.f33257f.f29407c).h(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f10, f12) : new PointF(f10, f12);
                    if (!rational.equals(rational2)) {
                        if (rational.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational.doubleValue() / rational2.doubleValue());
                            pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational.doubleValue());
                            pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                        }
                    }
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth2 = ((int) (rect.width() * f11)) / 2;
                    int iHeight2 = ((int) (f11 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                    rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                    rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                    rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                    rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(j1.h hVar) {
        com.google.android.gms.internal.auth.g.e("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f33255d) {
            hVar.d(new a0.o("Camera is not active."));
            return;
        }
        g0.r0 r0Var = new g0.r0();
        r0Var.f19728c = this.f33264n;
        r0Var.f19727b = true;
        g0.q1 q1VarV = g0.q1.v();
        q1VarV.y(s.b.u(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        r0Var.c(new s.b(g0.u1.u(q1VarV)));
        r0Var.b(new l0(1, hVar));
        this.f33252a.E(Collections.singletonList(r0Var.e()));
    }

    public final void f(boolean z5) {
        if (this.f33255d) {
            g0.r0 r0Var = new g0.r0();
            r0Var.f19728c = this.f33264n;
            r0Var.f19727b = true;
            g0.q1 q1VarV = g0.q1.v();
            q1VarV.y(s.b.u(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z5) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                Integer numValueOf = Integer.valueOf(o.v(this.f33252a.f33175e, 1));
                q1VarV.x(s.b.u(key), g0.u0.f19773c, numValueOf);
            }
            r0Var.c(new s.b(g0.u1.u(q1VarV)));
            r0Var.b(new f0.k(1));
            this.f33252a.E(Collections.singletonList(r0Var.e()));
        }
    }
}
