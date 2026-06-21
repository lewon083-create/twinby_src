package oa;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends cb.c implements g {
    public f() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 3);
    }

    @Override // cb.c
    public final boolean D0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) db.a.a(parcel, Status.CREATOR);
        db.a.b(parcel);
        y1(status);
        return true;
    }
}
