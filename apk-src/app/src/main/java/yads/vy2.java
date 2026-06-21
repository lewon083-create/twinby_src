package yads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vy2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f44224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f44225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f44226c;

    public vy2() {
        this(new Random());
    }

    public final vy2 a(int i) {
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int i10 = 0;
        int i11 = 0;
        while (i11 < i) {
            iArr[i11] = this.f44224a.nextInt(this.f44225b.length + 1);
            int i12 = i11 + 1;
            int iNextInt = this.f44224a.nextInt(i12);
            iArr2[i11] = iArr2[iNextInt];
            iArr2[iNextInt] = i11;
            i11 = i12;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f44225b.length + i];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr4 = this.f44225b;
            if (i10 >= iArr4.length + i) {
                return new vy2(iArr3, new Random(this.f44224a.nextLong()));
            }
            if (i13 >= i || i14 != iArr[i13]) {
                int i15 = i14 + 1;
                int i16 = iArr4[i14];
                iArr3[i10] = i16;
                if (i16 >= 0) {
                    iArr3[i10] = i16 + i;
                }
                i14 = i15;
            } else {
                iArr3[i10] = iArr2[i13];
                i13++;
            }
            i10++;
        }
    }

    public vy2(Random random) {
        this(a(random), random);
    }

    public vy2(int[] iArr, Random random) {
        this.f44225b = iArr;
        this.f44224a = random;
        this.f44226c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f44226c[iArr[i]] = i;
        }
    }

    public static int[] a(Random random) {
        return new int[0];
    }

    public final int a() {
        return this.f44225b.length;
    }
}
