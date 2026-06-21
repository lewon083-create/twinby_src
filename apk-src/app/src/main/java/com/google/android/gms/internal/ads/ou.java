package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ou {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ou f8799b = new ou(new a[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8800c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f8801a;

    static {
        a aVar = new a(-1, new int[0], new n5[0], new long[0], new String[0], new gf[0]);
        int[] iArr = aVar.f2663d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f2664e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        n5[] n5VarArr = (n5[]) Arrays.copyOf(aVar.f2662c, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f2665f, 0);
        gf[] gfVarArr = aVar.f2666g;
        f8800c = new a(0, iArrCopyOf, n5VarArr, jArrCopyOf, strArr, (gf[]) Arrays.copyOf(gfVarArr, Math.max(0, gfVarArr.length)));
        String str = cq0.f4293a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public ou(a[] aVarArr) {
        this.f8801a = aVarArr;
    }

    public final a a(int i) {
        return i < 0 ? f8800c : this.f8801a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ou.class == obj.getClass() && Arrays.equals(this.f8801a, ((ou) obj).f8801a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8801a) + (((int) (-9223372036854775807L)) * VKApiCodes.CODE_CALL_LINK_OUTDATED);
    }

    public final String toString() {
        return om1.k("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
