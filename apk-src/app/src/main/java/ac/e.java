package ac;

import android.os.Parcel;
import android.os.Parcelable;
import k6.d1;
import m.c3;
import m.k2;
import qc.x;
import y6.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f742a;

    public /* synthetic */ e(int i) {
        this.f742a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f742a) {
            case 0:
                return new f(parcel, null);
            case 1:
                return new bc.b(parcel, null);
            case 2:
                return new ic.a(parcel, null);
            case 3:
                return new d1(parcel, null);
            case 4:
                return new k2(parcel, null);
            case 5:
                return new c3(parcel, null);
            case 6:
                if (parcel.readParcelable(null) == null) {
                    return m2.b.f28535c;
                }
                throw new IllegalStateException("superState must be null");
            case 7:
                return new oc.b(parcel, null);
            case 8:
                return new x(parcel, null);
            case 9:
                return new r1.f(parcel, null);
            default:
                l lVar = new l(parcel, null);
                lVar.f36504b = parcel.readInt();
                lVar.f36505c = parcel.readInt();
                lVar.f36506d = parcel.readParcelable(null);
                return lVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f742a) {
            case 0:
                return new f[i];
            case 1:
                return new bc.b[i];
            case 2:
                return new ic.a[i];
            case 3:
                return new d1[i];
            case 4:
                return new k2[i];
            case 5:
                return new c3[i];
            case 6:
                return new m2.b[i];
            case 7:
                return new oc.b[i];
            case 8:
                return new x[i];
            case 9:
                return new r1.f[i];
            default:
                return new l[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f742a) {
            case 0:
                return new f(parcel, classLoader);
            case 1:
                return new bc.b(parcel, classLoader);
            case 2:
                return new ic.a(parcel, classLoader);
            case 3:
                return new d1(parcel, classLoader);
            case 4:
                return new k2(parcel, classLoader);
            case 5:
                return new c3(parcel, classLoader);
            case 6:
                if (parcel.readParcelable(classLoader) == null) {
                    return m2.b.f28535c;
                }
                throw new IllegalStateException("superState must be null");
            case 7:
                return new oc.b(parcel, classLoader);
            case 8:
                return new x(parcel, classLoader);
            case 9:
                return new r1.f(parcel, classLoader);
            default:
                l lVar = new l(parcel, classLoader);
                lVar.f36504b = parcel.readInt();
                lVar.f36505c = parcel.readInt();
                lVar.f36506d = parcel.readParcelable(classLoader);
                return lVar;
        }
    }
}
