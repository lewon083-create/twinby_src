package yads;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kt {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f40320w = a(2, 2, 2, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f40321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f40322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f40323z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40324a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f40325b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40331h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f40334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f40336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f40337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f40338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f40339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f40340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f40341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f40342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f40343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f40344v;

    static {
        int iA = a(0, 0, 0, 0);
        f40321x = iA;
        int iA2 = a(0, 0, 0, 3);
        f40322y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f40323z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
    }

    public kt() {
        b();
    }

    public final void a(char c8) {
        if (c8 != '\n') {
            this.f40325b.append(c8);
            return;
        }
        this.f40324a.add(a());
        this.f40325b.clear();
        if (this.f40338p != -1) {
            this.f40338p = 0;
        }
        if (this.f40339q != -1) {
            this.f40339q = 0;
        }
        if (this.f40340r != -1) {
            this.f40340r = 0;
        }
        if (this.f40342t != -1) {
            this.f40342t = 0;
        }
        while (true) {
            if ((!this.f40333k || this.f40324a.size() < this.f40332j) && this.f40324a.size() < 15) {
                return;
            } else {
                this.f40324a.remove(0);
            }
        }
    }

    public final void b() {
        this.f40324a.clear();
        this.f40325b.clear();
        this.f40338p = -1;
        this.f40339q = -1;
        this.f40340r = -1;
        this.f40342t = -1;
        this.f40344v = 0;
        this.f40326c = false;
        this.f40327d = false;
        this.f40328e = 4;
        this.f40329f = false;
        this.f40330g = 0;
        this.f40331h = 0;
        this.i = 0;
        this.f40332j = 15;
        this.f40333k = true;
        this.f40334l = 0;
        this.f40335m = 0;
        this.f40336n = 0;
        int i = f40321x;
        this.f40337o = i;
        this.f40341s = f40320w;
        this.f40343u = i;
    }

    public static int a(int i, int i10, int i11, int i12) {
        ni.a(i, 4);
        ni.a(i10, 4);
        ni.a(i11, 4);
        ni.a(i12, 4);
        return Color.argb(i12 != 2 ? i12 != 3 ? 255 : 0 : 127, i > 1 ? 255 : 0, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0);
    }

    public final void a(boolean z5, boolean z10) {
        if (this.f40338p != -1) {
            if (!z5) {
                this.f40325b.setSpan(new StyleSpan(2), this.f40338p, this.f40325b.length(), 33);
                this.f40338p = -1;
            }
        } else if (z5) {
            this.f40338p = this.f40325b.length();
        }
        if (this.f40339q == -1) {
            if (z10) {
                this.f40339q = this.f40325b.length();
            }
        } else {
            if (z10) {
                return;
            }
            this.f40325b.setSpan(new UnderlineSpan(), this.f40339q, this.f40325b.length(), 33);
            this.f40339q = -1;
        }
    }

    public final void a(int i, int i10) {
        if (this.f40340r != -1 && this.f40341s != i) {
            this.f40325b.setSpan(new ForegroundColorSpan(this.f40341s), this.f40340r, this.f40325b.length(), 33);
        }
        if (i != f40320w) {
            this.f40340r = this.f40325b.length();
            this.f40341s = i;
        }
        if (this.f40342t != -1 && this.f40343u != i10) {
            this.f40325b.setSpan(new BackgroundColorSpan(this.f40343u), this.f40342t, this.f40325b.length(), 33);
        }
        if (i10 != f40321x) {
            this.f40342t = this.f40325b.length();
            this.f40343u = i10;
        }
    }

    public final SpannableString a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f40325b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f40338p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f40338p, length, 33);
            }
            if (this.f40339q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f40339q, length, 33);
            }
            if (this.f40340r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f40341s), this.f40340r, length, 33);
            }
            if (this.f40342t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f40343u), this.f40342t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }
}
