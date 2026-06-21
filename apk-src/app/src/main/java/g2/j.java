package g2;

import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f19868a;

    static {
        new j("", 0, 0);
    }

    public j(String str, int i, int i10) {
        this.f19868a = new i(str, i, i10);
    }

    public static j a(int i, int i10, boolean z5, int i11, int i12, int i13, int i14) {
        String string;
        if (z5) {
            int i15 = i / 2;
            int i16 = i10 / 2;
            StringBuilder sbI = t.z.i("M0,", i16, " A", i15, StringUtils.COMMA);
            om1.t(sbI, i16, " 0 1,1 ", i, StringUtils.COMMA);
            om1.t(sbI, i16, " A", i15, StringUtils.COMMA);
            sbI.append(i16);
            sbI.append(" 0 1,1 0,");
            sbI.append(i16);
            sbI.append(" Z");
            string = sbI.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i10 / 2);
            int iMin2 = Math.min(iMin, i11);
            int iMin3 = Math.min(iMin, i12);
            int iMin4 = Math.min(iMin, i13);
            int iMin5 = Math.min(iMin, i14);
            sb2.append(iMin2);
            sb2.append(",0 L ");
            sb2.append(i - iMin3);
            sb2.append(",0");
            if (iMin3 > 0) {
                om1.u(sb2, " A ", iMin3, StringUtils.COMMA, iMin3);
                om1.u(sb2, " 0 0,1 ", i, StringUtils.COMMA, iMin3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(StringUtils.COMMA);
            sb2.append(i10 - iMin4);
            if (iMin4 > 0) {
                om1.u(sb2, " A ", iMin4, StringUtils.COMMA, iMin4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - iMin4);
                sb2.append(StringUtils.COMMA);
                sb2.append(i10);
            }
            om1.u(sb2, " L ", iMin5, StringUtils.COMMA, i10);
            if (iMin5 > 0) {
                om1.u(sb2, " A ", iMin5, StringUtils.COMMA, iMin5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i10 - iMin5);
            }
            if (iMin2 > 0) {
                om1.u(sb2, " L 0,", iMin2, " A ", iMin2);
                om1.u(sb2, StringUtils.COMMA, iMin2, " 0 0,1 ", iMin2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            string = sb2.toString();
        }
        return new j(string, i, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return Objects.equals(this.f19868a, ((j) obj).f19868a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19868a);
    }

    public final String toString() {
        return this.f19868a.toString();
    }
}
