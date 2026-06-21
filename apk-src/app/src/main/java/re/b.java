package re;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reader f32297b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f32306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f32307m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f32309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f32310p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32298c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f32299d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32300e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32301f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32302g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32303h = 0;
    public int i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32308n = 1;

    static {
        a.f32296a = new a();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.f32307m = iArr;
        iArr[0] = 6;
        this.f32309o = new String[32];
        this.f32310p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f32297b = reader;
    }

    public final void I(int i) {
        int i10 = this.f32308n;
        int[] iArr = this.f32307m;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.f32307m = Arrays.copyOf(iArr, i11);
            this.f32310p = Arrays.copyOf(this.f32310p, i11);
            this.f32309o = (String[]) Arrays.copyOf(this.f32309o, i11);
        }
        int[] iArr2 = this.f32307m;
        int i12 = this.f32308n;
        this.f32308n = i12 + 1;
        iArr2[i12] = i;
    }

    public final char J() throws d {
        int i;
        if (this.f32300e == this.f32301f && !d(1)) {
            M("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f32300e;
        int i11 = i10 + 1;
        this.f32300e = i11;
        char[] cArr = this.f32299d;
        char c8 = cArr[i10];
        if (c8 == '\n') {
            this.f32302g++;
            this.f32303h = i11;
            return c8;
        }
        if (c8 == '\"' || c8 == '\'' || c8 == '/' || c8 == '\\') {
            return c8;
        }
        if (c8 == 'b') {
            return '\b';
        }
        if (c8 == 'f') {
            return '\f';
        }
        if (c8 == 'n') {
            return '\n';
        }
        if (c8 == 'r') {
            return '\r';
        }
        if (c8 == 't') {
            return '\t';
        }
        if (c8 != 'u') {
            M("Invalid escape sequence");
            throw null;
        }
        if (i10 + 5 > this.f32301f && !d(4)) {
            M("Unterminated escape sequence");
            throw null;
        }
        int i12 = this.f32300e;
        int i13 = i12 + 4;
        char c9 = 0;
        while (i12 < i13) {
            char c10 = cArr[i12];
            char c11 = (char) (c9 << 4);
            if (c10 >= '0' && c10 <= '9') {
                i = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i = c10 - 'W';
            } else {
                if (c10 < 'A' || c10 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f32300e, 4)));
                }
                i = c10 - '7';
            }
            c9 = (char) (i + c11);
            i12++;
        }
        this.f32300e += 4;
        return c9;
    }

    public final void K(char c8) throws d {
        do {
            int i = this.f32300e;
            int i10 = this.f32301f;
            while (i < i10) {
                int i11 = i + 1;
                char c9 = this.f32299d[i];
                if (c9 == c8) {
                    this.f32300e = i11;
                    return;
                }
                if (c9 == '\\') {
                    this.f32300e = i11;
                    J();
                    i = this.f32300e;
                    i10 = this.f32301f;
                } else {
                    if (c9 == '\n') {
                        this.f32302g++;
                        this.f32303h = i11;
                    }
                    i = i11;
                }
            }
            this.f32300e = i;
        } while (d(1));
        M("Unterminated string");
        throw null;
    }

    public final void L() {
        char c8;
        do {
            if (this.f32300e >= this.f32301f && !d(1)) {
                return;
            }
            int i = this.f32300e;
            int i10 = i + 1;
            this.f32300e = i10;
            c8 = this.f32299d[i];
            if (c8 == '\n') {
                this.f32302g++;
                this.f32303h = i10;
                return;
            }
        } while (c8 != '\r');
    }

    public final void M(String str) throws d {
        StringBuilder sbJ = pe.a.j(str);
        sbJ.append(j());
        throw new d(sbJ.toString());
    }

    public final void a() throws d {
        if (this.f32298c) {
            return;
        }
        M("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0215, code lost:
    
        if (i(r1) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b() {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.b():int");
    }

    public void beginArray() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 3) {
            I(1);
            this.f32310p[this.f32308n - 1] = 0;
            this.i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + pe.a.w(s()) + j());
        }
    }

    public void beginObject() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 1) {
            I(3);
            this.i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + pe.a.w(s()) + j());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i = 0;
        this.f32307m[0] = 8;
        this.f32308n = 1;
        this.f32297b.close();
    }

    public final boolean d(int i) throws IOException {
        int i10;
        int i11;
        int i12 = this.f32303h;
        int i13 = this.f32300e;
        this.f32303h = i12 - i13;
        int i14 = this.f32301f;
        char[] cArr = this.f32299d;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f32301f = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f32301f = 0;
        }
        this.f32300e = 0;
        do {
            int i16 = this.f32301f;
            int i17 = this.f32297b.read(cArr, i16, cArr.length - i16);
            if (i17 == -1) {
                return false;
            }
            i10 = this.f32301f + i17;
            this.f32301f = i10;
            if (this.f32302g == 0 && (i11 = this.f32303h) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f32300e++;
                this.f32303h = i11 + 1;
                i++;
            }
        } while (i10 < i);
        return true;
    }

    public void endArray() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + pe.a.w(s()) + j());
        }
        int i = this.f32308n;
        this.f32308n = i - 1;
        int[] iArr = this.f32310p;
        int i10 = i - 2;
        iArr[i10] = iArr[i10] + 1;
        this.i = 0;
    }

    public void endObject() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + pe.a.w(s()) + j());
        }
        int i = this.f32308n;
        int i10 = i - 1;
        this.f32308n = i10;
        this.f32309o[i10] = null;
        int[] iArr = this.f32310p;
        int i11 = i - 2;
        iArr[i11] = iArr[i11] + 1;
        this.i = 0;
    }

    public String h() {
        StringBuilder sb2 = new StringBuilder("$");
        int i = this.f32308n;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = this.f32307m[i10];
            if (i11 == 1 || i11 == 2) {
                sb2.append('[');
                sb2.append(this.f32310p[i10]);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = this.f32309o[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public boolean hasNext() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        return (iB == 2 || iB == 4) ? false : true;
    }

    public final boolean i(char c8) throws d {
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
        a();
        return false;
    }

    final String j() {
        StringBuilder sbI = z.i(" at line ", this.f32302g + 1, " column ", (this.f32300e - this.f32303h) + 1, " path ");
        sbI.append(h());
        return sbI.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.k(boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f32300e = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.f32300e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l(char r11) throws re.d {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f32300e
            int r3 = r10.f32301f
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r10.f32299d
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r7[r2]
            if (r2 != r11) goto L29
            r10.f32300e = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L21:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f32300e = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L3f:
            r1.append(r7, r3, r2)
            char r2 = r10.J()
            r1.append(r2)
            int r2 = r10.f32300e
            int r3 = r10.f32301f
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f32302g
            int r2 = r2 + r6
            r10.f32302g = r2
            r10.f32303h = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r10.f32300e = r2
            boolean r2 = r10.d(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.M(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.l(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m() throws re.d {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f32300e
            int r4 = r3 + r2
            int r5 = r7.f32301f
            char[] r6 = r7.f32299d
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.a()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.d(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f32300e
            r0.append(r6, r3, r2)
            int r3 = r7.f32300e
            int r3 = r3 + r2
            r7.f32300e = r3
            r2 = 1
            boolean r2 = r7.d(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f32300e
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f32300e
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f32300e
            int r2 = r2 + r1
            r7.f32300e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.m():java.lang.String");
    }

    public boolean nextBoolean() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 5) {
            this.i = 0;
            int[] iArr = this.f32310p;
            int i = this.f32308n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iB != 6) {
            throw new IllegalStateException("Expected a boolean but was " + pe.a.w(s()) + j());
        }
        this.i = 0;
        int[] iArr2 = this.f32310p;
        int i10 = this.f32308n - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public double nextDouble() throws d {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 15) {
            this.i = 0;
            int[] iArr = this.f32310p;
            int i = this.f32308n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f32304j;
        }
        if (iB == 16) {
            this.f32306l = new String(this.f32299d, this.f32300e, this.f32305k);
            this.f32300e += this.f32305k;
        } else if (iB == 8 || iB == 9) {
            this.f32306l = l(iB == 8 ? '\'' : '\"');
        } else if (iB == 10) {
            this.f32306l = m();
        } else if (iB != 11) {
            throw new IllegalStateException("Expected a double but was " + pe.a.w(s()) + j());
        }
        this.i = 11;
        double d10 = Double.parseDouble(this.f32306l);
        if (!this.f32298c && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + j());
        }
        this.f32306l = null;
        this.i = 0;
        int[] iArr2 = this.f32310p;
        int i10 = this.f32308n - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return d10;
    }

    public int nextInt() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 15) {
            long j10 = this.f32304j;
            int i = (int) j10;
            if (j10 != i) {
                throw new NumberFormatException("Expected an int but was " + this.f32304j + j());
            }
            this.i = 0;
            int[] iArr = this.f32310p;
            int i10 = this.f32308n - 1;
            iArr[i10] = iArr[i10] + 1;
            return i;
        }
        if (iB == 16) {
            this.f32306l = new String(this.f32299d, this.f32300e, this.f32305k);
            this.f32300e += this.f32305k;
        } else {
            if (iB != 8 && iB != 9 && iB != 10) {
                throw new IllegalStateException("Expected an int but was " + pe.a.w(s()) + j());
            }
            if (iB == 10) {
                this.f32306l = m();
            } else {
                this.f32306l = l(iB == 8 ? '\'' : '\"');
            }
            try {
                int i11 = Integer.parseInt(this.f32306l);
                this.i = 0;
                int[] iArr2 = this.f32310p;
                int i12 = this.f32308n - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double d10 = Double.parseDouble(this.f32306l);
        int i13 = (int) d10;
        if (i13 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f32306l + j());
        }
        this.f32306l = null;
        this.i = 0;
        int[] iArr3 = this.f32310p;
        int i14 = this.f32308n - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public long nextLong() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 15) {
            this.i = 0;
            int[] iArr = this.f32310p;
            int i = this.f32308n - 1;
            iArr[i] = iArr[i] + 1;
            return this.f32304j;
        }
        if (iB == 16) {
            this.f32306l = new String(this.f32299d, this.f32300e, this.f32305k);
            this.f32300e += this.f32305k;
        } else {
            if (iB != 8 && iB != 9 && iB != 10) {
                throw new IllegalStateException("Expected a long but was " + pe.a.w(s()) + j());
            }
            if (iB == 10) {
                this.f32306l = m();
            } else {
                this.f32306l = l(iB == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f32306l);
                this.i = 0;
                int[] iArr2 = this.f32310p;
                int i10 = this.f32308n - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double d10 = Double.parseDouble(this.f32306l);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f32306l + j());
        }
        this.f32306l = null;
        this.i = 0;
        int[] iArr3 = this.f32310p;
        int i11 = this.f32308n - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j11;
    }

    public String nextName() {
        String strL;
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 14) {
            strL = m();
        } else if (iB == 12) {
            strL = l('\'');
        } else {
            if (iB != 13) {
                throw new IllegalStateException("Expected a name but was " + pe.a.w(s()) + j());
            }
            strL = l('\"');
        }
        this.i = 0;
        this.f32309o[this.f32308n - 1] = strL;
        return strL;
    }

    public void nextNull() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB != 7) {
            throw new IllegalStateException("Expected null but was " + pe.a.w(s()) + j());
        }
        this.i = 0;
        int[] iArr = this.f32310p;
        int i = this.f32308n - 1;
        iArr[i] = iArr[i] + 1;
    }

    public String nextString() {
        String str;
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        if (iB == 10) {
            str = m();
        } else if (iB == 8) {
            str = l('\'');
        } else if (iB == 9) {
            str = l('\"');
        } else if (iB == 11) {
            str = this.f32306l;
            this.f32306l = null;
        } else if (iB == 15) {
            str = Long.toString(this.f32304j);
        } else {
            if (iB != 16) {
                throw new IllegalStateException("Expected a string but was " + pe.a.w(s()) + j());
            }
            str = new String(this.f32299d, this.f32300e, this.f32305k);
            this.f32300e += this.f32305k;
        }
        this.i = 0;
        int[] iArr = this.f32310p;
        int i = this.f32308n - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public int s() {
        int iB = this.i;
        if (iB == 0) {
            iB = b();
        }
        switch (iB) {
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
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a1, code lost:
    
        a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void skipValue() throws re.d {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.skipValue():void");
    }

    public String toString() {
        return getClass().getSimpleName() + j();
    }
}
