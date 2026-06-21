package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri[] f2661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n5[] f2662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f2664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f2665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gf[] f2666g;

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public a(int i, int[] iArr, n5[] n5VarArr, long[] jArr, String[] strArr, gf[] gfVarArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = n5VarArr.length;
        int i10 = 0;
        ix.o(length == length2);
        ix.o(length == gfVarArr.length);
        this.f2660a = i;
        this.f2663d = iArr;
        this.f2662c = n5VarArr;
        this.f2664e = jArr;
        this.f2661b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f2661b;
            if (i10 >= uriArr.length) {
                this.f2665f = strArr;
                this.f2666g = gfVarArr;
                return;
            }
            n5 n5Var = n5VarArr[i10];
            if (n5Var == null) {
                uri = null;
            } else {
                q2 q2Var = n5Var.f8193b;
                q2Var.getClass();
                uri = q2Var.f9291a;
            }
            uriArr[i10] = uri;
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f2660a == aVar.f2660a && Arrays.equals(this.f2662c, aVar.f2662c) && Arrays.equals(this.f2663d, aVar.f2663d) && Arrays.equals(this.f2664e, aVar.f2664e) && Arrays.equals(this.f2665f, aVar.f2665f) && Arrays.equals(this.f2666g, aVar.f2666g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f2666g) + ((((Arrays.hashCode(this.f2664e) + ((Arrays.hashCode(this.f2663d) + ((Arrays.hashCode(this.f2662c) + (((this.f2660a * 31) - 1) * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f2665f)) * 31)) * 31;
    }
}
