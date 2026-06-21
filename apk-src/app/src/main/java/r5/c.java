package r5;

import android.graphics.Color;
import com.google.android.gms.internal.measurement.h5;
import k3.f;
import l7.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f32242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f32243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f32244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32247h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f32248j;

    public c(String str, int i, Integer num, Integer num2, float f10, boolean z5, boolean z10, boolean z11, boolean z12, int i10) {
        this.f32240a = str;
        this.f32241b = i;
        this.f32242c = num;
        this.f32243d = num2;
        this.f32244e = f10;
        this.f32245f = z5;
        this.f32246g = z10;
        this.f32247h = z11;
        this.i = z12;
        this.f32248j = i10;
    }

    public static int a(String str) {
        boolean z5;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z5 = true;
                    break;
                default:
                    z5 = false;
                    break;
            }
            if (z5) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        o.s("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e3) {
            m3.b.t("SsaStyle", "Failed to parse boolean value: '" + str + "'", e3);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            h5.h(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(f.d(((j10 >> 24) & 255) ^ 255), f.d(j10 & 255), f.d((j10 >> 8) & 255), f.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e3) {
            m3.b.t("SsaStyle", "Failed to parse color expression: '" + str + "'", e3);
            return null;
        }
    }
}
