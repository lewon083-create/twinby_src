package h5;

import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.measurement.j4;
import j3.a0;
import k3.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20433b;

    public a(String str, String str2) {
        this.f20432a = j4.y(str);
        this.f20433b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // j3.a0
    public final void b(w6 w6Var) {
        String str = this.f20432a;
        str.getClass();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b2 = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b2 = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b2 = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b2 = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b2 = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b2 = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b2 = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b2 = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b2 = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b2 = 9;
                }
                break;
        }
        String str2 = this.f20433b;
        switch (b2) {
            case 0:
                Integer numH = f.H(str2);
                if (numH != null) {
                    w6Var.i = numH;
                }
                break;
            case 1:
                Integer numH2 = f.H(str2);
                if (numH2 != null) {
                    w6Var.f11675v = numH2;
                }
                break;
            case 2:
                Integer numH3 = f.H(str2);
                if (numH3 != null) {
                    w6Var.f11662h = numH3;
                }
                break;
            case 3:
                w6Var.f11657c = str2;
                break;
            case 4:
                w6Var.f11676w = str2;
                break;
            case 5:
                w6Var.f11655a = str2;
                break;
            case 6:
                w6Var.f11659e = str2;
                break;
            case 7:
                Integer numH4 = f.H(str2);
                if (numH4 != null) {
                    w6Var.f11674u = numH4;
                }
                break;
            case 8:
                w6Var.f11658d = str2;
                break;
            case 9:
                w6Var.f11656b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f20432a.equals(aVar.f20432a) && this.f20433b.equals(aVar.f20433b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20433b.hashCode() + gf.a.e(527, 31, this.f20432a);
    }

    public final String toString() {
        return "VC: " + this.f20432a + "=" + this.f20433b;
    }
}
