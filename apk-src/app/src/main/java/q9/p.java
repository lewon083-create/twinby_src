package q9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ug;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ug implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f31955b;

    public p(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f31955b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        z();
        parcel2.writeNoException();
        return true;
    }

    @Override // q9.v
    public final void z() {
        this.f31955b.onAdClicked();
    }
}
