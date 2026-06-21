package qb;

import android.os.Parcel;
import k0.i;
import oa.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends cb.c {
    @Override // cb.c
    public final boolean D0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                db.a.b(parcel);
                break;
            case 4:
                db.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                db.a.b(parcel);
                break;
            case 7:
                db.a.b(parcel);
                break;
            case 8:
                f fVar = (f) db.a.a(parcel, f.CREATOR);
                db.a.b(parcel);
                x xVar = (x) this;
                xVar.f29899d.post(new i(18, xVar, fVar, false));
                break;
            case 9:
                db.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
