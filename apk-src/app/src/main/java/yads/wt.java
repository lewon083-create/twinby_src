package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wt extends w21 {
    public static final Parcelable.Creator<wt> CREATOR = new vt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f44464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w21[] f44465g;

    public wt(Parcel parcel) {
        super("CTOC");
        this.f44461c = (String) lb3.a((Object) parcel.readString());
        this.f44462d = parcel.readByte() != 0;
        this.f44463e = parcel.readByte() != 0;
        this.f44464f = (String[]) lb3.a(parcel.createStringArray());
        int i = parcel.readInt();
        this.f44465g = new w21[i];
        for (int i10 = 0; i10 < i; i10++) {
            this.f44465g[i10] = (w21) parcel.readParcelable(w21.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wt.class == obj.getClass()) {
            wt wtVar = (wt) obj;
            if (this.f44462d == wtVar.f44462d && this.f44463e == wtVar.f44463e && lb3.a(this.f44461c, wtVar.f44461c) && Arrays.equals(this.f44464f, wtVar.f44464f) && Arrays.equals(this.f44465g, wtVar.f44465g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f44462d ? 1 : 0) + 527) * 31) + (this.f44463e ? 1 : 0)) * 31;
        String str = this.f44461c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44461c);
        parcel.writeByte(this.f44462d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44463e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f44464f);
        parcel.writeInt(this.f44465g.length);
        for (w21 w21Var : this.f44465g) {
            parcel.writeParcelable(w21Var, 0);
        }
    }

    public wt(String str, boolean z5, boolean z10, String[] strArr, w21[] w21VarArr) {
        super("CTOC");
        this.f44461c = str;
        this.f44462d = z5;
        this.f44463e = z10;
        this.f44464f = strArr;
        this.f44465g = w21VarArr;
    }
}
