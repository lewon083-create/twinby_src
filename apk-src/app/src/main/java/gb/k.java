package gb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends qa.a {
    public static final Parcelable.Creator<k> CREATOR = new com.google.android.material.datepicker.a(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationRequest f20086b;

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 com.google.android.gms.location.LocationRequest, still in use, count: 3, list:
          (r0v4 com.google.android.gms.location.LocationRequest) from 0x0154: MOVE (r33v1 com.google.android.gms.location.LocationRequest) = (r0v4 com.google.android.gms.location.LocationRequest) (LINE:341)
          (r0v4 com.google.android.gms.location.LocationRequest) from 0x014e: MOVE (r33v2 com.google.android.gms.location.LocationRequest) = (r0v4 com.google.android.gms.location.LocationRequest) (LINE:335)
          (r0v4 com.google.android.gms.location.LocationRequest) from 0x0145: MOVE (r33v4 com.google.android.gms.location.LocationRequest) = (r0v4 com.google.android.gms.location.LocationRequest) (LINE:326)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public k(com.google.android.gms.location.LocationRequest r32, java.util.ArrayList r33, boolean r34, boolean r35, boolean r36, boolean r37, long r38) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.k.<init>(com.google.android.gms.location.LocationRequest, java.util.ArrayList, boolean, boolean, boolean, boolean, long):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return c0.m(this.f20086b, ((k) obj).f20086b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20086b.hashCode();
    }

    public final String toString() {
        return this.f20086b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.a0(parcel, 1, this.f20086b, i);
        j0.g.m0(parcel, iI0);
    }
}
