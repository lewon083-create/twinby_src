package e4;

import com.google.android.gms.internal.measurement.h5;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16035d;

    public a(String str, int i, int i10, int i11) {
        this.f16032a = i;
        this.f16033b = str;
        this.f16034c = i10;
        this.f16035d = i11;
    }

    public static a a(String str) {
        String str2 = m3.z.f28608a;
        String[] strArrSplit = str.split(" ", 2);
        h5.h(strArrSplit.length == 2);
        String str3 = strArrSplit[0];
        Pattern pattern = a0.f16036a;
        try {
            int i = Integer.parseInt(str3);
            int i10 = -1;
            String[] strArrSplit2 = strArrSplit[1].trim().split("/", -1);
            h5.h(strArrSplit2.length >= 2);
            String str4 = strArrSplit2[1];
            try {
                int i11 = Integer.parseInt(str4);
                if (strArrSplit2.length == 3) {
                    String str5 = strArrSplit2[2];
                    try {
                        i10 = Integer.parseInt(str5);
                    } catch (NumberFormatException e3) {
                        throw j3.d0.b(str5, e3);
                    }
                }
                return new a(strArrSplit2[0], i, i11, i10);
            } catch (NumberFormatException e7) {
                throw j3.d0.b(str4, e7);
            }
        } catch (NumberFormatException e10) {
            throw j3.d0.b(str3, e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16032a == aVar.f16032a && this.f16033b.equals(aVar.f16033b) && this.f16034c == aVar.f16034c && this.f16035d == aVar.f16035d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((gf.a.e((217 + this.f16032a) * 31, 31, this.f16033b) + this.f16034c) * 31) + this.f16035d;
    }
}
