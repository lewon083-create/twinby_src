package d5;

import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.measurement.h5;
import j3.a0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15566f;

    public b(int i, String str, String str2, String str3, boolean z5, int i10) {
        h5.h(i10 == -1 || i10 > 0);
        this.f15561a = i;
        this.f15562b = str;
        this.f15563c = str2;
        this.f15564d = str3;
        this.f15565e = z5;
        this.f15566f = i10;
    }

    public static b d(Map map) {
        boolean z5;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i10;
        List list = (List) map.get("icy-br");
        boolean z10 = true;
        int i11 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i10 = Integer.parseInt(str4) * 1000;
                if (i10 > 0) {
                    z5 = true;
                } else {
                    try {
                        m3.b.s("IcyHeaders", "Invalid bitrate: " + str4);
                        z5 = false;
                        i10 = -1;
                    } catch (NumberFormatException unused) {
                        o.s("Invalid bitrate header: ", str4, "IcyHeaders");
                        z5 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
            i = i10;
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
                int i12 = Integer.parseInt(str5);
                if (i12 > 0) {
                    i11 = i12;
                } else {
                    try {
                        m3.b.s("IcyHeaders", "Invalid metadata interval: " + str5);
                        z10 = z5;
                    } catch (NumberFormatException unused3) {
                        i11 = i12;
                        o.s("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z5 = z10;
            } catch (NumberFormatException unused4) {
            }
        }
        int i13 = i11;
        if (z5) {
            return new b(i, str, str2, str3, zEquals, i13);
        }
        return null;
    }

    @Override // j3.a0
    public final void b(w6 w6Var) {
        String str = this.f15563c;
        if (str != null) {
            w6Var.f11677x = str;
        }
        String str2 = this.f15562b;
        if (str2 != null) {
            w6Var.f11676w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f15561a == bVar.f15561a && Objects.equals(this.f15562b, bVar.f15562b) && Objects.equals(this.f15563c, bVar.f15563c) && Objects.equals(this.f15564d, bVar.f15564d) && this.f15565e == bVar.f15565e && this.f15566f == bVar.f15566f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f15561a) * 31;
        String str = this.f15562b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15563c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15564d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f15565e ? 1 : 0)) * 31) + this.f15566f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f15563c + "\", genre=\"" + this.f15562b + "\", bitrate=" + this.f15561a + ", metadataInterval=" + this.f15566f;
    }
}
