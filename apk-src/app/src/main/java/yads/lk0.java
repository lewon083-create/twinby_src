package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lk0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<lk0> CREATOR = new ik0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kk0[] f40564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40567e;

    public lk0(Parcel parcel) {
        this.f40566d = parcel.readString();
        kk0[] kk0VarArr = (kk0[]) lb3.a((kk0[]) parcel.createTypedArray(kk0.CREATOR));
        this.f40564b = kk0VarArr;
        this.f40567e = kk0VarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        kk0 kk0Var = (kk0) obj;
        kk0 kk0Var2 = (kk0) obj2;
        UUID uuid = jr.f39932a;
        return uuid.equals(kk0Var.f40223c) ? uuid.equals(kk0Var2.f40223c) ? 0 : 1 : kk0Var.f40223c.compareTo(kk0Var2.f40223c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lk0.class == obj.getClass()) {
            lk0 lk0Var = (lk0) obj;
            if (lb3.a(this.f40566d, lk0Var.f40566d) && Arrays.equals(this.f40564b, lk0Var.f40564b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f40565c == 0) {
            String str = this.f40566d;
            this.f40565c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f40564b);
        }
        return this.f40565c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40566d);
        parcel.writeTypedArray(this.f40564b, 0);
    }

    public lk0(String str, boolean z5, kk0... kk0VarArr) {
        this.f40566d = str;
        kk0VarArr = z5 ? (kk0[]) kk0VarArr.clone() : kk0VarArr;
        this.f40564b = kk0VarArr;
        this.f40567e = kk0VarArr.length;
        Arrays.sort(kk0VarArr, this);
    }
}
