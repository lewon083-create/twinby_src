package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 implements Closeable, Flushable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f8371k = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f8372l = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm1 f8373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f8374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ul1 f8376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8379h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8380j;

    static {
        for (int i = 0; i <= 31; i++) {
            f8372l[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f8372l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public nm1(jm1 jm1Var) {
        int[] iArr = new int[32];
        this.f8374c = iArr;
        boolean z5 = false;
        this.f8375d = 0;
        if (iArr.length == 0) {
            this.f8374c = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f8374c;
        int i = this.f8375d;
        this.f8375d = i + 1;
        iArr2[i] = 6;
        this.i = 2;
        this.f8373b = jm1Var;
        ul1 ul1Var = ul1.f10978d;
        Objects.requireNonNull(ul1Var);
        String str = ul1Var.f10979a;
        this.f8376e = ul1Var;
        this.f8378g = StringUtils.COMMA;
        if (ul1Var.f10981c) {
            this.f8377f = ": ";
            if (str.isEmpty()) {
                this.f8378g = ", ";
            }
        } else {
            this.f8377f = StringUtils.PROCESS_POSTFIX_DELIMITER;
        }
        if (str.isEmpty() && ul1Var.f10980b.isEmpty()) {
            z5 = true;
        }
        this.f8379h = z5;
    }

    public final void a(int i, int i10, char c8) throws IOException {
        int iB = b();
        if (iB != i10 && iB != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f8380j;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f8375d--;
        if (iB == i10) {
            i();
        }
        this.f8373b.write(c8);
    }

    public final int b() {
        int i = this.f8375d;
        if (i != 0) {
            return this.f8374c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8373b.getClass();
        int i = this.f8375d;
        if (i > 1 || (i == 1 && this.f8374c[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8375d = 0;
    }

    public final void d() throws IOException {
        if (this.f8380j != null) {
            int iB = b();
            if (iB == 5) {
                this.f8373b.write(this.f8378g);
            } else if (iB != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            i();
            this.f8374c[this.f8375d - 1] = 4;
            h(this.f8380j);
            this.f8380j = null;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f8375d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f8373b.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.jm1 r0 = r8.f8373b
            r1 = 34
            r0.write(r1)
            int r2 = r9.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L39
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L20
            java.lang.String[] r7 = com.google.android.gms.internal.ads.nm1.f8372l
            r6 = r7[r6]
            if (r6 == 0) goto L37
            goto L2d
        L20:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L27
            java.lang.String r6 = "\\u2028"
            goto L2d
        L27:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L37
            java.lang.String r6 = "\\u2029"
        L2d:
            if (r4 >= r3) goto L33
            int r3 = r3 - r4
            r0.write(r9, r4, r3)
        L33:
            r0.write(r6)
            r4 = r5
        L37:
            r3 = r5
            goto Ld
        L39:
            if (r4 >= r2) goto L3f
            int r2 = r2 - r4
            r0.write(r9, r4, r2)
        L3f:
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nm1.h(java.lang.String):void");
    }

    public final void i() throws IOException {
        if (this.f8379h) {
            return;
        }
        ul1 ul1Var = this.f8376e;
        String str = ul1Var.f10979a;
        jm1 jm1Var = this.f8373b;
        jm1Var.write(str);
        int i = this.f8375d;
        for (int i10 = 1; i10 < i; i10++) {
            jm1Var.write(ul1Var.f10980b);
        }
    }

    public final void j() throws IOException {
        int iB = b();
        if (iB == 1) {
            this.f8374c[this.f8375d - 1] = 2;
            i();
            return;
        }
        jm1 jm1Var = this.f8373b;
        if (iB == 2) {
            jm1Var.append((CharSequence) this.f8378g);
            i();
        } else {
            if (iB == 4) {
                jm1Var.append((CharSequence) this.f8377f);
                this.f8374c[this.f8375d - 1] = 5;
                return;
            }
            if (iB != 6) {
                if (iB != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.i != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f8374c[this.f8375d - 1] = 7;
        }
    }
}
