package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q21 implements us1 {
    public static final Parcelable.Creator<q21> CREATOR = new p21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42146g;

    public q21(int i, String str, String str2, String str3, boolean z5, int i10) {
        ni.a(i10 == -1 || i10 > 0);
        this.f42141b = i;
        this.f42142c = str;
        this.f42143d = str2;
        this.f42144e = str3;
        this.f42145f = z5;
        this.f42146g = i10;
    }

    public static q21 a(Map map) {
        boolean z5;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i10;
        int i11;
        int i12;
        List list = (List) map.get("icy-br");
        boolean z10 = true;
        int i13 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i12 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i12 = -1;
            }
            if (i12 > 0) {
                z5 = true;
                i = i12;
            } else {
                try {
                    kh1.d("IcyHeaders", "Invalid bitrate: " + str4);
                    z5 = false;
                    i = -1;
                } catch (NumberFormatException unused2) {
                    rk1.a("Invalid bitrate header: ", str4, "IcyHeaders");
                    z5 = false;
                    i = i12;
                }
            }
        } else {
            z5 = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z5 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z5 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z5 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z5 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                i11 = Integer.parseInt(str5);
            } catch (NumberFormatException unused3) {
            }
            if (i11 > 0) {
                i10 = i11;
            } else {
                try {
                    kh1.d("IcyHeaders", "Invalid metadata interval: " + str5);
                } catch (NumberFormatException unused4) {
                    i13 = i11;
                    rk1.a("Invalid metadata interval: ", str5, "IcyHeaders");
                }
                z10 = z5;
                i10 = i13;
            }
        } else {
            z10 = z5;
            i10 = i13;
        }
        if (z10) {
            return new q21(i, str, str2, str3, zEquals, i10);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q21.class == obj.getClass()) {
            q21 q21Var = (q21) obj;
            if (this.f42141b == q21Var.f42141b && lb3.a(this.f42142c, q21Var.f42142c) && lb3.a(this.f42143d, q21Var.f42143d) && lb3.a(this.f42144e, q21Var.f42144e) && this.f42145f == q21Var.f42145f && this.f42146g == q21Var.f42146g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f42141b + 527) * 31;
        String str = this.f42142c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f42143d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f42144e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f42145f ? 1 : 0)) * 31) + this.f42146g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f42143d + "\", genre=\"" + this.f42142c + "\", bitrate=" + this.f42141b + ", metadataInterval=" + this.f42146g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f42141b);
        parcel.writeString(this.f42142c);
        parcel.writeString(this.f42143d);
        parcel.writeString(this.f42144e);
        boolean z5 = this.f42145f;
        int i10 = lb3.f40466a;
        parcel.writeInt(z5 ? 1 : 0);
        parcel.writeInt(this.f42146g);
    }

    public q21(Parcel parcel) {
        this.f42141b = parcel.readInt();
        this.f42142c = parcel.readString();
        this.f42143d = parcel.readString();
        this.f42144e = parcel.readString();
        this.f42145f = lb3.a(parcel);
        this.f42146g = parcel.readInt();
    }

    @Override // yads.us1
    public final void a(km1 km1Var) {
        String str = this.f42143d;
        if (str != null) {
            km1Var.D = str;
        }
        String str2 = this.f42142c;
        if (str2 != null) {
            km1Var.B = str2;
        }
    }
}
