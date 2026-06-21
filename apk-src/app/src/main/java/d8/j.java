package d8;

import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.w0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15637b;

    public static i a() {
        i iVar = new i(1);
        iVar.f15635c = "";
        return iVar;
    }

    public final String toString() {
        int i = this.f15636a;
        int i10 = o1.f14257a;
        w0 w0Var = com.google.android.gms.internal.play_billing.l0.f14229d;
        Integer numValueOf = Integer.valueOf(i);
        return t.z.e("Response Code: ", (!w0Var.containsKey(numValueOf) ? com.google.android.gms.internal.play_billing.l0.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.l0) w0Var.get(numValueOf)).toString(), ", Debug Message: ", this.f15637b);
    }
}
