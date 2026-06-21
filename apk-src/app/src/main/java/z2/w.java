package z2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends d.n implements t1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46003f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ni.i f46000c = new ni.i(29, new v(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.w f46001d = new androidx.lifecycle.w(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46004g = true;

    public w() {
        getSavedStateRegistry().c("android:support:lifecycle", new d.f(2, this));
        final int i = 0;
        addOnConfigurationChangedListener(new f2.a(this) { // from class: z2.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f45994b;

            {
                this.f45994b = this;
            }

            @Override // f2.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f45994b.f46000c.x();
                        break;
                    default:
                        this.f45994b.f46000c.x();
                        break;
                }
            }
        });
        final int i10 = 1;
        addOnNewIntentListener(new f2.a(this) { // from class: z2.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f45994b;

            {
                this.f45994b = this;
            }

            @Override // f2.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f45994b.f46000c.x();
                        break;
                    default:
                        this.f45994b.f46000c.x();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new d.g(this, i10));
    }

    public static boolean j(h0 h0Var) {
        androidx.lifecycle.o oVar = androidx.lifecycle.o.f1573b;
        boolean zJ = false;
        for (t tVar : h0Var.f45844c.A()) {
            if (tVar != null) {
                v vVar = tVar.f45986u;
                if ((vVar == null ? null : vVar.f45999g) != null) {
                    zJ |= j(tVar.k());
                }
                o0 o0Var = tVar.P;
                if (o0Var != null) {
                    o0Var.b();
                    if (o0Var.f45922e.f1606c.a(androidx.lifecycle.o.f1576e)) {
                        tVar.P.f45922e.g();
                        zJ = true;
                    }
                }
                if (tVar.O.f1606c.a(androidx.lifecycle.o.f1576e)) {
                    tVar.O.g();
                    zJ = true;
                }
            }
        }
        return zJ;
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f46002e);
            printWriter.print(" mResumed=");
            printWriter.print(this.f46003f);
            printWriter.print(" mStopped=");
            printWriter.print(this.f46004g);
            if (getApplication() != null) {
                new h3.e(this, getViewModelStore()).z(str2, printWriter);
            }
            ((v) this.f46000c.f29407c).f45998f.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final h0 i() {
        return ((v) this.f46000c.f29407c).f45998f;
    }

    @Override // d.n, android.app.Activity
    public void onActivityResult(int i, int i10, Intent intent) {
        this.f46000c.x();
        super.onActivityResult(i, i10, intent);
    }

    @Override // d.n, t1.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46001d.e(androidx.lifecycle.n.ON_CREATE);
        h0 h0Var = ((v) this.f46000c.f29407c).f45998f;
        h0Var.G = false;
        h0Var.H = false;
        h0Var.N.f45883g = false;
        h0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((v) this.f46000c.f29407c).f45998f.f45847f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((v) this.f46000c.f29407c).f45998f.l();
        this.f46001d.e(androidx.lifecycle.n.ON_DESTROY);
    }

    @Override // d.n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((v) this.f46000c.f29407c).f45998f.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f46003f = false;
        ((v) this.f46000c.f29407c).f45998f.u(5);
        this.f46001d.e(androidx.lifecycle.n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f46001d.e(androidx.lifecycle.n.ON_RESUME);
        h0 h0Var = ((v) this.f46000c.f29407c).f45998f;
        h0Var.G = false;
        h0Var.H = false;
        h0Var.N.f45883g = false;
        h0Var.u(7);
    }

    @Override // d.n, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f46000c.x();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        ni.i iVar = this.f46000c;
        iVar.x();
        super.onResume();
        this.f46003f = true;
        ((v) iVar.f29407c).f45998f.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        ni.i iVar = this.f46000c;
        iVar.x();
        v vVar = (v) iVar.f29407c;
        super.onStart();
        this.f46004g = false;
        if (!this.f46002e) {
            this.f46002e = true;
            h0 h0Var = vVar.f45998f;
            h0Var.G = false;
            h0Var.H = false;
            h0Var.N.f45883g = false;
            h0Var.u(4);
        }
        vVar.f45998f.A(true);
        this.f46001d.e(androidx.lifecycle.n.ON_START);
        h0 h0Var2 = vVar.f45998f;
        h0Var2.G = false;
        h0Var2.H = false;
        h0Var2.N.f45883g = false;
        h0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f46000c.x();
    }

    @Override // android.app.Activity
    public final void onStop() {
        h0 h0VarI;
        super.onStop();
        this.f46004g = true;
        do {
            h0VarI = i();
            androidx.lifecycle.o oVar = androidx.lifecycle.o.f1573b;
        } while (j(h0VarI));
        h0 h0Var = ((v) this.f46000c.f29407c).f45998f;
        h0Var.H = true;
        h0Var.N.f45883g = true;
        h0Var.u(4);
        this.f46001d.e(androidx.lifecycle.n.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((v) this.f46000c.f29407c).f45998f.f45847f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
