package t9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.vg;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends cb.a implements w {
    @Override // t9.w
    public final boolean zze(xa.a aVar, String str, String str2) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        Parcel parcelP1 = p1(parcelD0, 1);
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }

    @Override // t9.w
    public final void zzf(xa.a aVar) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        L1(parcelD0, 2);
    }

    @Override // t9.w
    public final boolean zzg(xa.a aVar, r9.a aVar2) {
        Parcel parcelD0 = D0();
        vg.e(parcelD0, aVar);
        vg.c(parcelD0, aVar2);
        Parcel parcelP1 = p1(parcelD0, 3);
        boolean z5 = parcelP1.readInt() != 0;
        parcelP1.recycle();
        return z5;
    }
}
