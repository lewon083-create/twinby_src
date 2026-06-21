package j3;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f26218c = new c(new a[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26219d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f26221b;

    static {
        a aVar = new a(-1, -1, new int[0], new x[0], new long[0], new String[0], new b[0]);
        int[] iArr = aVar.f26212e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f26213f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        x[] xVarArr = (x[]) Arrays.copyOf(aVar.f26211d, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f26214g, 0);
        b[] bVarArr = aVar.f26215h;
        f26219d = new a(0, aVar.f26209b, iArrCopyOf, xVarArr, jArrCopyOf, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)));
        m3.z.G(1);
        m3.z.G(2);
        m3.z.G(3);
        m3.z.G(4);
    }

    public c(a[] aVarArr) {
        this.f26220a = aVarArr.length;
        this.f26221b = aVarArr;
    }

    public final a a(int i) {
        return i < 0 ? f26219d : this.f26221b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f26220a == cVar.f26220a && Arrays.equals(this.f26221b, cVar.f26221b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26221b) + (((((this.f26220a * VKApiCodes.CODE_CALL_LINK_OUTDATED) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * VKApiCodes.CODE_CALL_LINK_OUTDATED);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            a[] aVarArr = this.f26221b;
            if (i >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            aVarArr[i].getClass();
            for (int i10 = 0; i10 < aVarArr[i].f26212e.length; i10++) {
                sb2.append("ad(state=");
                int i11 = aVarArr[i].f26212e[i10];
                if (i11 == 0) {
                    sb2.append('_');
                } else if (i11 == 1) {
                    sb2.append('R');
                } else if (i11 == 2) {
                    sb2.append('S');
                } else if (i11 == 3) {
                    sb2.append('P');
                } else if (i11 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i].f26213f[i10]);
                sb2.append(')');
                if (i10 < aVarArr[i].f26212e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i++;
        }
    }
}
