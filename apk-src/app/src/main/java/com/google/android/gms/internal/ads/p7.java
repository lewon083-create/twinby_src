package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f8941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f8942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8946h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8947j;

    public p7(String str, int i, Integer num, Integer num2, float f10, boolean z5, boolean z10, boolean z11, boolean z12, int i10) {
        this.f8939a = str;
        this.f8940b = i;
        this.f8941c = num;
        this.f8942d = num2;
        this.f8943e = f10;
        this.f8944f = z5;
        this.f8945g = z10;
        this.f8946h = z11;
        this.i = z12;
        this.f8947j = i10;
    }

    public static Integer a(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            ix.o(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(gr.e(((j10 >> 24) & 255) ^ 255), gr.e(j10 & 255), gr.e((j10 >> 8) & 255), gr.e((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e3) {
            rs.w("SsaStyle", t.z.g(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e3);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e3) {
            rs.w("SsaStyle", t.z.g(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e3);
            return false;
        }
    }
}
