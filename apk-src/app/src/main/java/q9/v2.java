package q9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends ug implements q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.v f31974b;

    /* JADX WARN: Multi-variable type inference failed */
    public v2(ea.a aVar) {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        this.f31974b = (k9.v) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ea.a, k9.v] */
    @Override // q9.q1
    public final void i() {
        ?? r02 = this.f31974b;
        if (r02 != 0) {
            r02.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        i();
        parcel2.writeNoException();
        return true;
    }
}
