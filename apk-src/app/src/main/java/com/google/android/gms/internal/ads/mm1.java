package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringReader f7917b;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f7925k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f7927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f7928n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char[] f7918c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7919d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7920e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7921f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7922g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7923h = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7926l = 1;

    public mm1(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f7925k = iArr;
        iArr[0] = 6;
        this.f7927m = new String[32];
        this.f7928n = new int[32];
        this.f7917b = stringReader;
    }

    public final void I() throws androidx.datastore.preferences.protobuf.m {
        J("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void J(String str) throws androidx.datastore.preferences.protobuf.m {
        String strD = d();
        throw new androidx.datastore.preferences.protobuf.m(t.z.g(new StringBuilder(str.length() + strD.length() + 79), str, strD, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException K(String str) throws IOException {
        int iH = h();
        String strE = ix.e(h());
        String strD = d();
        int iB = pe.a.b(str.length() + 18, strD.length(), strE);
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iH == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb2 = new StringBuilder(strConcat.length() + iB + 5);
        l7.o.t(sb2, "Expected ", str, " but was ", strE);
        return new IllegalStateException(t.z.g(sb2, strD, "\nSee ", strConcat));
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0164, code lost:
    
        r24 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b8, code lost:
    
        if (i(r13) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01bc, code lost:
    
        if (r9 != 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01be, code lost:
    
        if (r10 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c4, code lost:
    
        if (r24 != Long.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c6, code lost:
    
        if (r19 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c8, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ca, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01cc, code lost:
    
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d0, code lost:
    
        if (r24 != 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d2, code lost:
    
        if (r6 != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d7, code lost:
    
        if (r6 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d9, code lost:
    
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01dc, code lost:
    
        r7 = -r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01dd, code lost:
    
        r26.i = r7;
        r26.f7919d += r4;
        r7 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e6, code lost:
    
        r26.f7923h = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01e9, code lost:
    
        if (r9 == 2) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ec, code lost:
    
        if (r9 == 4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01ef, code lost:
    
        if (r9 != 7) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01f1, code lost:
    
        r26.f7924j = r4;
        r7 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0234 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mm1.a():int");
    }

    public final String b() throws IOException {
        String str;
        int iA = this.f7923h;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 10) {
            str = k();
        } else if (iA == 8) {
            str = j('\'');
        } else if (iA == 9) {
            str = j('\"');
        } else if (iA == 11) {
            str = null;
        } else if (iA == 15) {
            str = Long.toString(this.i);
        } else {
            if (iA != 16) {
                throw K("a string");
            }
            str = new String(this.f7918c, this.f7919d, this.f7924j);
            this.f7919d += this.f7924j;
        }
        this.f7923h = 0;
        int[] iArr = this.f7928n;
        int i = this.f7926l - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7923h = 0;
        this.f7925k[0] = 8;
        this.f7926l = 1;
        this.f7917b.close();
    }

    public final String d() {
        int i = this.f7921f + 1;
        int i10 = this.f7919d - this.f7922g;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < this.f7926l; i11++) {
            int i12 = this.f7925k[i11];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f7928n[i11];
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f7927m[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(l7.o.j(i12, "Unknown scope value: ", new StringBuilder(String.valueOf(i12).length() + 21)));
            }
        }
        int i14 = i10 + 1;
        String string = sb2.toString();
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i14).length();
        StringBuilder sb3 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        om1.u(sb3, " at line ", i, " column ", i14);
        return a0.u.o(sb3, " path ", string);
    }

    public final int h() throws IOException {
        int iA = this.f7923h;
        if (iA == 0) {
            iA = a();
        }
        switch (iA) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final boolean i(char c8) throws androidx.datastore.preferences.protobuf.m {
        if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
            return false;
        }
        if (c8 != '#') {
            if (c8 == ',') {
                return false;
            }
            if (c8 != '/' && c8 != '=') {
                if (c8 == '{' || c8 == '}' || c8 == ':') {
                    return false;
                }
                if (c8 != ';') {
                    switch (c8) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        I();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0112, code lost:
    
        r4 = r2 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0114, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0116, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r4 + r4, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0122, code lost:
    
        r1.append(r7, r3, r4);
        r11.f7919d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String j(char r12) throws androidx.datastore.preferences.protobuf.m {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mm1.j(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        r0 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() throws androidx.datastore.preferences.protobuf.m {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            int r4 = r7.f7919d
            int r4 = r4 + r2
            int r5 = r7.f7920e
            char[] r6 = r7.f7918c
            if (r4 >= r5) goto L4d
            char r4 = r6[r4]
            r5 = 9
            if (r4 == r5) goto L5a
            r5 = 10
            if (r4 == r5) goto L5a
            r5 = 12
            if (r4 == r5) goto L5a
            r5 = 13
            if (r4 == r5) goto L5a
            r5 = 32
            if (r4 == r5) goto L5a
            r5 = 35
            if (r4 == r5) goto L49
            r5 = 44
            if (r4 == r5) goto L5a
            r5 = 47
            if (r4 == r5) goto L49
            r5 = 61
            if (r4 == r5) goto L49
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L5a
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 == r5) goto L5a
            r5 = 58
            if (r4 == r5) goto L5a
            r5 = 59
            if (r4 == r5) goto L49
            switch(r4) {
                case 91: goto L5a;
                case 92: goto L49;
                case 93: goto L5a;
                default: goto L46;
            }
        L46:
            int r2 = r2 + 1
            goto L4
        L49:
            r7.I()
            throw r1
        L4d:
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 >= r4) goto L5c
            int r4 = r2 + 1
            boolean r4 = r7.m(r4)
            if (r4 == 0) goto L5a
            goto L4
        L5a:
            r0 = r2
            goto L7a
        L5c:
            if (r3 != 0) goto L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 16
            int r4 = java.lang.Math.max(r2, r4)
            r3.<init>(r4)
        L69:
            int r4 = r7.f7919d
            r3.append(r6, r4, r2)
            int r4 = r7.f7919d
            int r4 = r4 + r2
            r7.f7919d = r4
            r2 = 1
            boolean r2 = r7.m(r2)
            if (r2 != 0) goto L93
        L7a:
            if (r3 != 0) goto L84
            java.lang.String r1 = new java.lang.String
            int r2 = r7.f7919d
            r1.<init>(r6, r2, r0)
            goto L8d
        L84:
            int r1 = r7.f7919d
            r3.append(r6, r1, r0)
            java.lang.String r1 = r3.toString()
        L8d:
            int r2 = r7.f7919d
            int r2 = r2 + r0
            r7.f7919d = r2
            return r1
        L93:
            r2 = r0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mm1.k():java.lang.String");
    }

    public final void l(int i) throws androidx.datastore.preferences.protobuf.m {
        int i10 = this.f7926l;
        if (i10 - 1 >= 1280) {
            String strD = d();
            throw new androidx.datastore.preferences.protobuf.m(a0.u.o(new StringBuilder(strD.length() + 26), "Nesting limit 1280 reached", strD));
        }
        int[] iArr = this.f7925k;
        if (i10 == iArr.length) {
            int i11 = i10 + i10;
            this.f7925k = Arrays.copyOf(iArr, i11);
            this.f7928n = Arrays.copyOf(this.f7928n, i11);
            this.f7927m = (String[]) Arrays.copyOf(this.f7927m, i11);
        }
        int[] iArr2 = this.f7925k;
        int i12 = this.f7926l;
        this.f7926l = i12 + 1;
        iArr2[i12] = i;
    }

    public final boolean m(int i) throws IOException {
        int i10;
        int i11 = this.f7922g;
        int i12 = this.f7919d;
        this.f7922g = i11 - i12;
        int i13 = this.f7920e;
        char[] cArr = this.f7918c;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.f7920e = i14;
            System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.f7920e = 0;
        }
        this.f7919d = 0;
        do {
            int i15 = this.f7920e;
            int i16 = this.f7917b.read(cArr, i15, 1024 - i15);
            if (i16 == -1) {
                return false;
            }
            i10 = this.f7920e + i16;
            this.f7920e = i10;
            if (this.f7921f == 0 && this.f7922g == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f7919d++;
                this.f7922g = 1;
                i++;
            }
        } while (i10 < i);
        return true;
    }

    public final int s(boolean z5) throws IOException {
        int i = this.f7919d;
        int i10 = this.f7920e;
        while (true) {
            if (i == i10) {
                this.f7919d = i;
                if (!m(1)) {
                    if (z5) {
                        throw new EOFException("End of input".concat(d()));
                    }
                    return -1;
                }
                i = this.f7919d;
                i10 = this.f7920e;
            }
            int i11 = i + 1;
            char c8 = this.f7918c[i];
            if (c8 == '\n') {
                this.f7921f++;
                this.f7922g = i11;
            } else if (c8 != ' ' && c8 != '\r' && c8 != '\t') {
                if (c8 != '/') {
                    if (c8 != '#') {
                        this.f7919d = i11;
                        return c8;
                    }
                    this.f7919d = i11;
                    I();
                    throw null;
                }
                this.f7919d = i11;
                if (i11 == i10) {
                    this.f7919d = i;
                    boolean zM = m(2);
                    this.f7919d++;
                    if (!zM) {
                        return 47;
                    }
                }
                I();
                throw null;
            }
            i = i11;
        }
    }

    public final String toString() {
        return mm1.class.getSimpleName().concat(d());
    }
}
