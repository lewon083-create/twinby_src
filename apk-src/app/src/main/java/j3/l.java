package j3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparator, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new j(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k[] f26269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26272e;

    public l(String str, ArrayList arrayList) {
        this(str, false, (k[]) arrayList.toArray(new k[0]));
    }

    public final l a(String str) {
        return Objects.equals(this.f26271d, str) ? this : new l(str, false, this.f26269b);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        UUID uuid = f.f26231a;
        return uuid.equals(kVar.f26262c) ? uuid.equals(kVar2.f26262c) ? 0 : 1 : kVar.f26262c.compareTo(kVar2.f26262c);
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
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f26271d, lVar.f26271d) && Arrays.equals(this.f26269b, lVar.f26269b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26270c == 0) {
            String str = this.f26271d;
            this.f26270c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f26269b);
        }
        return this.f26270c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26271d);
        parcel.writeTypedArray(this.f26269b, 0);
    }

    public l(k... kVarArr) {
        this(null, true, kVarArr);
    }

    public l(String str, boolean z5, k... kVarArr) {
        this.f26271d = str;
        kVarArr = z5 ? (k[]) kVarArr.clone() : kVarArr;
        this.f26269b = kVarArr;
        this.f26272e = kVarArr.length;
        Arrays.sort(kVarArr, this);
    }

    public l(Parcel parcel) {
        this.f26271d = parcel.readString();
        k[] kVarArr = (k[]) parcel.createTypedArray(k.CREATOR);
        String str = m3.z.f28608a;
        this.f26269b = kVarArr;
        this.f26272e = kVarArr.length;
    }
}
