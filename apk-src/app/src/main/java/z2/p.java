package z2;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twinby.R;
import kotlin.jvm.internal.Intrinsics;
import ob.h4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class p extends t implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler V;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f45928e0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Dialog f45930g0;
    public boolean h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f45931i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f45932j0;
    public final h4 W = new h4(15, this);
    public final t9.f X = new t9.f(1, this);
    public final n Y = new n(this);
    public int Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f45924a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f45925b0 = true;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f45926c0 = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f45927d0 = -1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ni.f0 f45929f0 = new ni.f0(1, this);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f45933k0 = false;

    @Override // z2.t
    public final void A() {
        this.E = true;
        if (!this.f45932j0 && !this.f45931i0) {
            this.f45931i0 = true;
        }
        this.Q.j(this.f45929f0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // z2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater B(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.p.B(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // z2.t
    public void F(Bundle bundle) {
        Dialog dialog = this.f45930g0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.Z;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i10 = this.f45924a0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z5 = this.f45925b0;
        if (!z5) {
            bundle.putBoolean("android:cancelable", z5);
        }
        boolean z10 = this.f45926c0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i11 = this.f45927d0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // z2.t
    public void G() {
        this.E = true;
        Dialog dialog = this.f45930g0;
        if (dialog != null) {
            this.h0 = false;
            dialog.show();
            View decorView = this.f45930g0.getWindow().getDecorView();
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            Intrinsics.checkNotNullParameter(decorView, "<this>");
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // z2.t
    public void H() {
        this.E = true;
        Dialog dialog = this.f45930g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // z2.t
    public final void J(Bundle bundle) {
        Bundle bundle2;
        this.E = true;
        if (this.f45930g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f45930g0.onRestoreInstanceState(bundle2);
    }

    @Override // z2.t
    public final void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K(layoutInflater, viewGroup, bundle);
        if (this.G != null || this.f45930g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f45930g0.onRestoreInstanceState(bundle2);
    }

    public final void Q(boolean z5, boolean z10) {
        if (this.f45931i0) {
            return;
        }
        this.f45931i0 = true;
        this.f45932j0 = false;
        Dialog dialog = this.f45930g0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f45930g0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.V.getLooper()) {
                    onDismiss(this.f45930g0);
                } else {
                    this.V.post(this.W);
                }
            }
        }
        this.h0 = true;
        if (this.f45927d0 >= 0) {
            h0 h0VarN = n();
            int i = this.f45927d0;
            if (i < 0) {
                throw new IllegalArgumentException(l7.o.i(i, "Bad id: "));
            }
            h0VarN.y(new f0(h0VarN, i), z5);
            this.f45927d0 = -1;
            return;
        }
        a aVar = new a(n());
        aVar.f45798o = true;
        h0 h0Var = this.f45985t;
        if (h0Var != null && h0Var != aVar.f45799p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new n0(3, this));
        if (z5) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public Dialog R() {
        if (h0.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.p(M(), this.f45924a0);
    }

    @Override // z2.t
    public final com.google.android.gms.internal.auth.m g() {
        return new o(this, new r(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.h0) {
            return;
        }
        if (h0.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        Q(true, true);
    }

    @Override // z2.t
    public void s() {
        this.E = true;
    }

    @Override // z2.t
    public void v(Context context) {
        super.v(context);
        this.Q.f(this.f45929f0);
        if (this.f45932j0) {
            return;
        }
        this.f45931i0 = false;
    }

    @Override // z2.t
    public void w(Bundle bundle) {
        super.w(bundle);
        this.V = new Handler();
        this.f45926c0 = this.f45990y == 0;
        if (bundle != null) {
            this.Z = bundle.getInt("android:style", 0);
            this.f45924a0 = bundle.getInt("android:theme", 0);
            this.f45925b0 = bundle.getBoolean("android:cancelable", true);
            this.f45926c0 = bundle.getBoolean("android:showsDialog", this.f45926c0);
            this.f45927d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // z2.t
    public final void z() {
        this.E = true;
        Dialog dialog = this.f45930g0;
        if (dialog != null) {
            this.h0 = true;
            dialog.setOnDismissListener(null);
            this.f45930g0.dismiss();
            if (!this.f45931i0) {
                onDismiss(this.f45930g0);
            }
            this.f45930g0 = null;
            this.f45933k0 = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
