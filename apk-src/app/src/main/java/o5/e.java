package o5;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f29736v = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f29737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f29738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f29739y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f29740z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29741a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f29742b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29748h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29760u;

    static {
        int iC = c(0, 0, 0, 0);
        f29737w = iC;
        int iC2 = c(0, 0, 0, 3);
        f29738x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f29739y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f29740z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            com.google.android.gms.internal.measurement.h5.l(r4, r0)
            com.google.android.gms.internal.measurement.h5.l(r5, r0)
            com.google.android.gms.internal.measurement.h5.l(r6, r0)
            com.google.android.gms.internal.measurement.h5.l(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.e.c(int, int, int, int):int");
    }

    public final void a(char c8) {
        SpannableStringBuilder spannableStringBuilder = this.f29742b;
        if (c8 != '\n') {
            spannableStringBuilder.append(c8);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f29741a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f29754o != -1) {
            this.f29754o = 0;
        }
        if (this.f29755p != -1) {
            this.f29755p = 0;
        }
        if (this.f29756q != -1) {
            this.f29756q = 0;
        }
        if (this.f29758s != -1) {
            this.f29758s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f29749j && arrayList.size() < 15) {
                this.f29760u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29742b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f29754o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f29754o, length, 33);
            }
            if (this.f29755p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f29755p, length, 33);
            }
            if (this.f29756q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f29757r), this.f29756q, length, 33);
            }
            if (this.f29758s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f29759t), this.f29758s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f29741a.clear();
        this.f29742b.clear();
        this.f29754o = -1;
        this.f29755p = -1;
        this.f29756q = -1;
        this.f29758s = -1;
        this.f29760u = 0;
        this.f29743c = false;
        this.f29744d = false;
        this.f29745e = 4;
        this.f29746f = false;
        this.f29747g = 0;
        this.f29748h = 0;
        this.i = 0;
        this.f29749j = 15;
        this.f29750k = 0;
        this.f29751l = 0;
        this.f29752m = 0;
        int i = f29737w;
        this.f29753n = i;
        this.f29757r = f29736v;
        this.f29759t = i;
    }

    public final void e(boolean z5, boolean z10) {
        int i = this.f29754o;
        SpannableStringBuilder spannableStringBuilder = this.f29742b;
        if (i != -1) {
            if (!z5) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f29754o, spannableStringBuilder.length(), 33);
                this.f29754o = -1;
            }
        } else if (z5) {
            this.f29754o = spannableStringBuilder.length();
        }
        if (this.f29755p == -1) {
            if (z10) {
                this.f29755p = spannableStringBuilder.length();
            }
        } else {
            if (z10) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f29755p, spannableStringBuilder.length(), 33);
            this.f29755p = -1;
        }
    }

    public final void f(int i, int i10) {
        int i11 = this.f29756q;
        SpannableStringBuilder spannableStringBuilder = this.f29742b;
        if (i11 != -1 && this.f29757r != i) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f29757r), this.f29756q, spannableStringBuilder.length(), 33);
        }
        if (i != f29736v) {
            this.f29756q = spannableStringBuilder.length();
            this.f29757r = i;
        }
        if (this.f29758s != -1 && this.f29759t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f29759t), this.f29758s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f29737w) {
            this.f29758s = spannableStringBuilder.length();
            this.f29759t = i10;
        }
    }
}
