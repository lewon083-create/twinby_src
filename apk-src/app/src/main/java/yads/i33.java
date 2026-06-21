package yads;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f39419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f39420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f39422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39424h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f39425j;

    public i33(String str, int i, Integer num, Integer num2, float f10, boolean z5, boolean z10, boolean z11, boolean z12, int i10) {
        this.f39417a = str;
        this.f39418b = i;
        this.f39419c = num;
        this.f39420d = num2;
        this.f39421e = f10;
        this.f39422f = z5;
        this.f39423g = z10;
        this.f39424h = z11;
        this.i = z12;
        this.f39425j = i10;
    }

    public static boolean a(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e3) {
            kh1.d("SsaStyle", kh1.a("Failed to parse boolean value: '" + str + "'", e3));
            return false;
        }
    }

    public static Integer b(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(vd1.a(((j10 >> 24) & 255) ^ 255), vd1.a(j10 & 255), vd1.a((j10 >> 8) & 255), vd1.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e3) {
            kh1.d("SsaStyle", kh1.a("Failed to parse color expression: '" + str + "'", e3));
            return null;
        }
    }
}
