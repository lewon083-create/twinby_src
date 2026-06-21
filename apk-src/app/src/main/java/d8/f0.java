package d8;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.t5;
import com.google.android.gms.internal.play_billing.u5;
import com.google.android.gms.internal.play_billing.v5;
import com.google.android.gms.internal.play_billing.w5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends cb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u5 f15622c;

    public f0(u5 u5Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 2);
        this.f15622c = u5Var;
    }

    @Override // cb.c
    public final boolean w1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int i10 = parcel.readInt();
        com.google.android.gms.internal.play_billing.e.b(parcel);
        Integer numValueOf = Integer.valueOf(i10);
        u5 u5Var = this.f15622c;
        u5Var.f14334d = true;
        w5 w5Var = u5Var.f14332b;
        if (w5Var != null) {
            v5 v5Var = w5Var.f14355c;
            v5Var.getClass();
            if (t5.f14318g.w(v5Var, null, numValueOf)) {
                t5.d(v5Var);
                u5Var.f14331a = null;
                u5Var.f14332b = null;
                u5Var.f14333c = null;
            }
        }
        return true;
    }
}
