package n3;

import com.google.android.gms.internal.measurement.h5;
import j3.a0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f29036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29038d;

    public a(int i, int i10, String str, byte[] bArr) {
        boolean z5;
        byte b2;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z5 = true;
                }
                h5.h(z5);
                break;
            case "auxiliary.tracks.interleaved":
                if (i10 == 75 && bArr.length == 1 && ((b2 = bArr[0]) == 0 || b2 == 1)) {
                    z5 = true;
                }
                h5.h(z5);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z5 = true;
                }
                h5.h(z5);
                break;
            case "auxiliary.tracks.map":
                h5.h(i10 == 0);
                break;
        }
        this.f29035a = str;
        this.f29036b = bArr;
        this.f29037c = i;
        this.f29038d = i10;
    }

    public final ArrayList d() {
        h5.q("Metadata is not an auxiliary tracks map", this.f29035a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f29036b;
        byte b2 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b2; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f29035a.equals(aVar.f29035a) && Arrays.equals(this.f29036b, aVar.f29036b) && this.f29037c == aVar.f29037c && this.f29038d == aVar.f29038d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f29036b) + gf.a.e(527, 31, this.f29035a)) * 31) + this.f29037c) * 31) + this.f29038d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r10 = this;
            java.lang.String r0 = r10.f29035a
            byte[] r1 = r10.f29036b
            int r2 = r10.f29038d
            if (r2 == 0) goto L7b
            r3 = 1
            if (r2 == r3) goto L76
            r4 = 23
            r5 = 3
            r6 = 2
            java.lang.String r7 = "array too small: %s < %s"
            r8 = 4
            r9 = 0
            if (r2 == r4) goto L57
            r4 = 67
            if (r2 == r4) goto L3c
            r3 = 75
            if (r2 == r3) goto L32
            r3 = 78
            if (r2 == r3) goto L23
            goto La4
        L23:
            m3.p r2 = new m3.p
            r2.<init>(r1)
            long r1 = r2.F()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto La8
        L32:
            r1 = r1[r9]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto La8
        L3c:
            int r2 = r1.length
            if (r2 < r8) goto L41
            r2 = r3
            goto L42
        L41:
            r2 = r9
        L42:
            int r4 = r1.length
            com.google.android.gms.internal.measurement.h5.d(r4, r8, r7, r2)
            r2 = r1[r9]
            r3 = r1[r3]
            r4 = r1[r6]
            r1 = r1[r5]
            int r1 = k3.f.m(r2, r3, r4, r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto La8
        L57:
            int r2 = r1.length
            if (r2 < r8) goto L5c
            r2 = r3
            goto L5d
        L5c:
            r2 = r9
        L5d:
            int r4 = r1.length
            com.google.android.gms.internal.measurement.h5.d(r4, r8, r7, r2)
            r2 = r1[r9]
            r3 = r1[r3]
            r4 = r1[r6]
            r1 = r1[r5]
            int r1 = k3.f.m(r2, r3, r4, r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto La8
        L76:
            java.lang.String r1 = m3.z.p(r1)
            goto La8
        L7b:
            java.lang.String r2 = "auxiliary.tracks.map"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto La4
            java.util.ArrayList r1 = r10.d()
            java.lang.String r2 = "track types = "
            java.lang.StringBuilder r2 = pe.a.j(r2)
            d8.k r3 = new d8.k
            r4 = 44
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
            r3.c(r2, r1)
            java.lang.String r1 = r2.toString()
            goto La8
        La4:
            java.lang.String r1 = m3.z.Y(r1)
        La8:
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = t.z.e(r2, r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.a.toString():java.lang.String");
    }
}
