package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ni1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f41250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l73[] f41251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f41252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[][][] f41253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l73 f41254f;

    public ni1(int[] iArr, l73[] l73VarArr, int[] iArr2, int[][][] iArr3, l73 l73Var) {
        this.f41250b = iArr;
        this.f41251c = l73VarArr;
        this.f41253e = iArr3;
        this.f41252d = iArr2;
        this.f41254f = l73Var;
        this.f41249a = iArr.length;
    }

    public final int a(int i, int i10) {
        int i11 = this.f41251c[i].a(i10).f40095b;
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if ((this.f41253e[i][i10][i14] & 7) == 4) {
                iArr[i13] = i14;
                i13++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
        int iMin = 16;
        int i15 = 0;
        String str = null;
        boolean z5 = false;
        while (i12 < iArrCopyOf.length) {
            String str2 = this.f41251c[i].a(i10).f40098e[iArrCopyOf[i12]].f41375m;
            int i16 = i15 + 1;
            if (i15 == 0) {
                str = str2;
            } else {
                z5 |= !lb3.a(str, str2);
            }
            iMin = Math.min(iMin, this.f41253e[i][i10][i12] & 24);
            i12++;
            i15 = i16;
        }
        return z5 ? Math.min(iMin, this.f41252d[i]) : iMin;
    }
}
