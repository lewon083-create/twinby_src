package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hx1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xw1 f39355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39356b;

    public hx1(xw1 xw1Var, long j10) {
        this.f39355a = xw1Var;
        this.f39356b = j10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Unit unit;
        xw1 xw1Var = this.f39355a;
        long j10 = this.f39356b;
        if (j10 <= 0) {
            xw1Var.getClass();
            return;
        }
        if (xw1Var.f44827f) {
            xw1Var.a();
            nm2 nm2Var = xw1Var.f44825d;
            dk.i iVar = xw1.f44821g[0];
            y6.m mVar = (y6.m) nm2Var.f41294a.get();
            if (mVar != null) {
                zw1 zw1Var = new zw1(mVar, xw1Var.f44822a, xw1Var.f44823b);
                xw1Var.f44824c.getClass();
                Handler handler = new Handler(Looper.getMainLooper());
                rh1 rh1Var = new rh1(handler);
                xw1Var.f44826e = rh1Var;
                if (zw1Var.f37883b == ct.f37491b) {
                    handler.postDelayed(new qh1(rh1Var, j10, zw1Var), j10);
                }
                unit = Unit.f27471a;
            } else {
                unit = null;
            }
            if (unit == null) {
                xw1Var.a();
                xw1Var.f44827f = false;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f39355a.a();
    }
}
