package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i13 implements us1 {
    public static final Parcelable.Creator<i13> CREATOR = new f13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39406b;

    public i13(ArrayList arrayList) {
        this.f39406b = arrayList;
        ni.a(!a(arrayList));
    }

    public static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((h13) arrayList.get(0)).f38980c;
        for (int i = 1; i < arrayList.size(); i++) {
            if (((h13) arrayList.get(i)).f38979b < j10) {
                return true;
            }
            j10 = ((h13) arrayList.get(i)).f38980c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i13.class != obj.getClass()) {
            return false;
        }
        return this.f39406b.equals(((i13) obj).f39406b);
    }

    public final int hashCode() {
        return this.f39406b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f39406b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f39406b);
    }
}
