package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7847b;

    public mc() {
        this.f7846a = new ArrayList();
        this.f7847b = 0;
    }

    public boolean a() {
        return this.f7847b < this.f7846a.size();
    }

    public int b(long j10) throws kc {
        long j11;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        int i17 = i16 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j12 = jArr[0];
        long j13 = jArr[1];
        long j14 = jArr[2];
        long j15 = jArr[3];
        long j16 = jArr[4];
        long j17 = jArr[5];
        long j18 = jArr[6];
        long j19 = jArr[7];
        long j20 = (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17) + j18;
        long j21 = j19 % 438792350;
        if (j10 >= 0) {
            j11 = ((long) (this.f7847b + (iH ^ i17))) - j10;
        } else {
            j11 = (j20 ^ j21) + (-j10);
        }
        if (j11 < 0 || j11 >= this.f7847b) {
            throw new kc();
        }
        return (int) j11;
    }

    public void c(vc vcVar) throws lc {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        int i17 = this.f7847b;
        if (i17 >= ((i16 % 937558955) ^ iH)) {
            throw new lc();
        }
        ArrayList arrayList = this.f7846a;
        if (i17 == arrayList.size()) {
            arrayList.add(vcVar);
        } else {
            arrayList.set(this.f7847b, vcVar);
        }
        this.f7847b++;
    }

    public vc d() throws kc {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iH = a0.u.h((i10 & (~i)) | i11, (i & i12) | i13, i14, i15);
        int i17 = i16 % 459541652;
        int i18 = this.f7847b;
        if (i18 <= 0) {
            throw new kc();
        }
        int i19 = i17 ^ iH;
        ArrayList arrayList = this.f7846a;
        vc vcVar = (vc) arrayList.get(i18 + i19);
        arrayList.set(this.f7847b + i19, null);
        this.f7847b += i19;
        return vcVar;
    }

    public vc e(long j10) {
        return (vc) this.f7846a.get(b(j10));
    }

    public mc(ArrayList routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f7846a = routes;
    }
}
