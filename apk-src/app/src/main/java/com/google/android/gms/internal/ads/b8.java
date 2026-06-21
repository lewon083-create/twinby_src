package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f3663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f3666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f3669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3670h;
    public int i;

    public b8(int i) {
        switch (i) {
            case 1:
                this.f3663a = new int[4];
                this.f3670h = -1;
                this.i = -1;
                break;
            default:
                this.f3663a = new int[4];
                this.f3670h = -1;
                this.i = -1;
                break;
        }
    }

    public static int a(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    public static int c(int i, int i10) {
        return (i & 16777215) | ((i10 * 17) << 24);
    }

    public static int d(int i, int i10) {
        return (i & 16777215) | ((i10 * 17) << 24);
    }

    public void b(y2 y2Var, boolean z5, Rect rect, int[] iArr) {
        int i;
        int i10;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i11 = !z5 ? 1 : 0;
        int i12 = i11 * iWidth;
        while (true) {
            int i13 = 0;
            do {
                int i14 = 0;
                for (int i15 = 1; i14 < i15 && i15 <= 64; i15 <<= 2) {
                    if (y2Var.b() < 4) {
                        i = -1;
                        i10 = 0;
                        break;
                    }
                    i14 = (i14 << 4) | y2Var.i(4);
                }
                i = i14 & 3;
                i10 = i14 < 4 ? iWidth : i14 >> 2;
                int iMin = Math.min(i10, iWidth - i13);
                if (iMin > 0) {
                    int i16 = i12 + iMin;
                    Arrays.fill(iArr, i12, i16, this.f3663a[i]);
                    i13 += iMin;
                    i12 = i16;
                }
            } while (i13 < iWidth);
            i11 += 2;
            if (i11 >= iHeight) {
                return;
            }
            i12 = i11 * iWidth;
            y2Var.c();
        }
    }

    public void e(ik0 ik0Var, boolean z5, Rect rect, int[] iArr) {
        int i;
        int i10;
        int i11 = !z5 ? 1 : 0;
        int iWidth = rect.width();
        int i12 = i11 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i13 = 0;
            do {
                int iH = 0;
                for (int i14 = 1; iH < i14 && i14 <= 64; i14 <<= 2) {
                    if (ik0Var.b() < 4) {
                        i = -1;
                        i10 = 0;
                        break;
                    }
                    iH = (iH << 4) | ik0Var.h(4);
                }
                i = iH & 3;
                i10 = iH < 4 ? iWidth : iH >> 2;
                int iMin = Math.min(i10, iWidth - i13);
                if (iMin > 0) {
                    int i15 = i12 + iMin;
                    Arrays.fill(iArr, i12, i15, this.f3663a[i]);
                    i13 += iMin;
                    i12 = i15;
                }
            } while (i13 < iWidth);
            i11 += 2;
            if (i11 >= iHeight) {
                return;
            }
            i12 = i11 * iWidth;
            ik0Var.k();
        }
    }
}
