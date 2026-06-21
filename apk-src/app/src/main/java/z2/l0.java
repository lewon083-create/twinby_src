package z2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new ub.i(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45891h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f45892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f45893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f45894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f45895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f45896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f45897o;

    public l0(t tVar) {
        this.f45885b = tVar.getClass().getName();
        this.f45886c = tVar.f45972f;
        this.f45887d = tVar.f45980o;
        this.f45888e = tVar.f45989x;
        this.f45889f = tVar.f45990y;
        this.f45890g = tVar.f45991z;
        this.f45891h = tVar.C;
        this.i = tVar.f45978m;
        this.f45892j = tVar.B;
        this.f45893k = tVar.A;
        this.f45894l = tVar.N.ordinal();
        this.f45895m = tVar.i;
        this.f45896n = tVar.f45975j;
        this.f45897o = tVar.I;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f45885b);
        sb2.append(" (");
        sb2.append(this.f45886c);
        sb2.append(")}:");
        if (this.f45887d) {
            sb2.append(" fromLayout");
        }
        int i = this.f45889f;
        if (i != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i));
        }
        String str = this.f45890g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f45891h) {
            sb2.append(" retainInstance");
        }
        if (this.i) {
            sb2.append(" removing");
        }
        if (this.f45892j) {
            sb2.append(" detached");
        }
        if (this.f45893k) {
            sb2.append(" hidden");
        }
        String str2 = this.f45895m;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f45896n);
        }
        if (this.f45897o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45885b);
        parcel.writeString(this.f45886c);
        parcel.writeInt(this.f45887d ? 1 : 0);
        parcel.writeInt(this.f45888e);
        parcel.writeInt(this.f45889f);
        parcel.writeString(this.f45890g);
        parcel.writeInt(this.f45891h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f45892j ? 1 : 0);
        parcel.writeInt(this.f45893k ? 1 : 0);
        parcel.writeInt(this.f45894l);
        parcel.writeString(this.f45895m);
        parcel.writeInt(this.f45896n);
        parcel.writeInt(this.f45897o ? 1 : 0);
    }

    public l0(Parcel parcel) {
        this.f45885b = parcel.readString();
        this.f45886c = parcel.readString();
        this.f45887d = parcel.readInt() != 0;
        this.f45888e = parcel.readInt();
        this.f45889f = parcel.readInt();
        this.f45890g = parcel.readString();
        this.f45891h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f45892j = parcel.readInt() != 0;
        this.f45893k = parcel.readInt() != 0;
        this.f45894l = parcel.readInt();
        this.f45895m = parcel.readString();
        this.f45896n = parcel.readInt();
        this.f45897o = parcel.readInt() != 0;
    }
}
