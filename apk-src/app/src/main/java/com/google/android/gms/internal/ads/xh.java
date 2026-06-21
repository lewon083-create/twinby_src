package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xh extends ug implements fi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ti.f0 f12153b;

    @Override // com.google.android.gms.internal.ads.fi
    public final void c() {
        ti.f0 f0Var = this.f12153b;
        if (f0Var != null) {
            f0Var.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.fi
    public final void g() {
        ti.f0 f0Var = this.f12153b;
        if (f0Var != null) {
            f0Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.fi
    public final void h() {
        ti.f0 f0Var = this.f12153b;
        if (f0Var != null) {
            f0Var.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.fi
    public final void j0(q9.x1 x1Var) {
        ti.f0 f0Var = this.f12153b;
        if (f0Var != null) {
            f0Var.e(x1Var.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.fi
    public final void k() {
        ti.f0 f0Var = this.f12153b;
        if (f0Var != null) {
            f0Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            h();
        } else if (i == 2) {
            g();
        } else if (i == 3) {
            q9.x1 x1Var = (q9.x1) vg.b(parcel, q9.x1.CREATOR);
            vg.f(parcel);
            j0(x1Var);
        } else if (i == 4) {
            c();
        } else {
            if (i != 5) {
                return false;
            }
            k();
        }
        parcel2.writeNoException();
        return true;
    }
}
