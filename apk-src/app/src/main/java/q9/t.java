package q9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ug implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.v f31973b;

    public t(k9.v vVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f31973b = vVar;
    }

    @Override // q9.a1
    public final void P2(x1 x1Var) {
        k9.v vVar = this.f31973b;
        if (vVar != null) {
            vVar.e(x1Var.c());
        }
    }

    @Override // q9.a1
    public final void c() {
        k9.v vVar = this.f31973b;
        if (vVar != null) {
            vVar.a();
        }
    }

    @Override // q9.a1
    public final void g() {
        k9.v vVar = this.f31973b;
        if (vVar != null) {
            vVar.c();
        }
    }

    @Override // q9.a1
    public final void h() {
        k9.v vVar = this.f31973b;
        if (vVar != null) {
            vVar.j();
        }
    }

    @Override // q9.a1
    public final void i() {
        k9.v vVar = this.f31973b;
        if (vVar != null) {
            vVar.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            x1 x1Var = (x1) vg.b(parcel, x1.CREATOR);
            vg.f(parcel);
            P2(x1Var);
        } else if (i == 2) {
            h();
        } else if (i == 3) {
            g();
        } else if (i == 4) {
            i();
        } else {
            if (i != 5) {
                return false;
            }
            c();
        }
        parcel2.writeNoException();
        return true;
    }
}
