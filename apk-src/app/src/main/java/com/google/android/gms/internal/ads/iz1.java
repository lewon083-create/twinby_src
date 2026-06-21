package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f6659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f6660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f6661c;

    public iz1() {
        this(new Random());
    }

    public final iz1 a(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i10 = 0;
        while (true) {
            iArr = this.f6660b;
            random = this.f6659a;
            if (i10 >= i) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int iNextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[iNextInt];
            iArr3[iNextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i; i14++) {
            if (i12 >= i || i13 != iArr2[i12]) {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i;
                }
                i13 = i15;
            } else {
                iArr4[i14] = iArr3[i12];
                i12++;
            }
        }
        return new iz1(iArr4, new Random(random.nextLong()));
    }

    public iz1(Random random) {
        this(new int[0], random);
    }

    public iz1(int[] iArr, Random random) {
        this.f6660b = iArr;
        this.f6659a = random;
        this.f6661c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f6661c[iArr[i]] = i;
        }
    }
}
