package d8;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15635c;

    public /* synthetic */ i(int i) {
        this.f15633a = i;
    }

    public static String n(String str) {
        StringBuilder sbG = tl.a.g();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c8 = 0;
        while (i < length) {
            char c9 = charArray[i];
            if (c9 != '\\') {
                sbG.append(c9);
            } else if (c8 != 0 && c8 == '\\') {
                sbG.append(c9);
            }
            i++;
            c8 = c9;
        }
        return sbG.toString();
    }

    public j a() {
        j jVar = new j();
        jVar.f15636a = this.f15634b;
        jVar.f15637b = this.f15635c;
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x006c A[EDGE_INSN: B:44:0x006c->B:36:0x006c BREAK  A[LOOP:0: B:3:0x0007->B:48:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:0: B:3:0x0007->B:48:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(char r11, char r12) {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
        L7:
            boolean r7 = r10.h()
            if (r7 == 0) goto Le
            goto L6c
        Le:
            char r7 = r10.d()
            java.lang.Character r8 = java.lang.Character.valueOf(r7)
            if (r1 == 0) goto L1c
            r9 = 92
            if (r1 == r9) goto L63
        L1c:
            r9 = 39
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L2f
            if (r7 == r11) goto L2f
            if (r2 != 0) goto L2f
            r3 = r3 ^ 1
            goto L41
        L2f:
            r9 = 34
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L41
            if (r7 == r11) goto L41
            if (r3 != 0) goto L41
            r2 = r2 ^ 1
        L41:
            if (r3 != 0) goto L6a
            if (r2 == 0) goto L46
            goto L6a
        L46:
            java.lang.Character r9 = java.lang.Character.valueOf(r11)
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L57
            int r4 = r4 + 1
            if (r5 != r0) goto L63
            int r5 = r10.f15634b
            goto L63
        L57:
            java.lang.Character r9 = java.lang.Character.valueOf(r12)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L63
            int r4 = r4 + (-1)
        L63:
            if (r4 <= 0) goto L69
            if (r1 == 0) goto L69
            int r6 = r10.f15634b
        L69:
            r1 = r7
        L6a:
            if (r4 > 0) goto L7
        L6c:
            if (r6 < 0) goto L75
            java.lang.String r11 = r10.f15635c
            java.lang.String r11 = r11.substring(r5, r6)
            goto L77
        L75:
            java.lang.String r11 = ""
        L77:
            if (r4 > 0) goto L7a
            return r11
        L7a:
            java.lang.String r12 = "Did not find balanced marker at '"
            java.lang.String r0 = "'"
            java.lang.String r11 = pe.a.f(r12, r11, r0)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.i.b(char, char):java.lang.String");
    }

    public String c() {
        String strM;
        String str = this.f15635c;
        int iIndexOf = str.indexOf(")", this.f15634b);
        if (iIndexOf != -1) {
            strM = str.substring(this.f15634b, iIndexOf);
            this.f15634b = strM.length() + this.f15634b;
        } else {
            strM = m();
        }
        i(")");
        return strM;
    }

    public char d() {
        String str = this.f15635c;
        int i = this.f15634b;
        this.f15634b = i + 1;
        return str.charAt(i);
    }

    public void e(String str) {
        if (!j(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f15635c.length();
        int i = this.f15634b;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f15634b = i + length;
    }

    public String f() {
        String str = this.f15635c;
        int i = this.f15634b;
        loop0: while (!h()) {
            if (!l()) {
                char[] cArr = {'-', '_'};
                if (!h()) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        if (str.charAt(this.f15634b) == cArr[i10]) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            this.f15634b++;
        }
        return str.substring(i, this.f15634b);
    }

    public boolean g() {
        boolean z5 = false;
        while (!h() && tl.a.d(this.f15635c.charAt(this.f15634b))) {
            this.f15634b++;
            z5 = true;
        }
        return z5;
    }

    public boolean h() {
        return this.f15635c.length() - this.f15634b == 0;
    }

    public boolean i(String str) {
        if (!j(str)) {
            return false;
        }
        this.f15634b = str.length() + this.f15634b;
        return true;
    }

    public boolean j(String str) {
        return this.f15635c.regionMatches(true, this.f15634b, str, 0, str.length());
    }

    public boolean k(String... strArr) {
        for (String str : strArr) {
            if (j(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        return !h() && Character.isLetterOrDigit(this.f15635c.charAt(this.f15634b));
    }

    public String m() {
        String str = this.f15635c;
        String strSubstring = str.substring(this.f15634b, str.length());
        this.f15634b = str.length();
        return strSubstring;
    }

    public String toString() {
        switch (this.f15633a) {
            case 2:
                return this.f15634b + ": " + this.f15635c;
            case 3:
                return this.f15635c.substring(this.f15634b);
            default:
                return super.toString();
        }
    }

    public i(String str, int i, Object[] objArr) {
        this.f15633a = 2;
        this.f15635c = String.format(str, objArr);
        this.f15634b = i;
    }

    public i(String str, int i) {
        this.f15633a = i;
        switch (i) {
            case 4:
                this.f15635c = str;
                this.f15634b = 0;
                break;
            default:
                this.f15634b = 0;
                k3.f.v(str);
                this.f15635c = str;
                break;
        }
    }

    public i(byte[] bArr) {
        this.f15633a = 4;
        Objects.requireNonNull(bArr);
        this.f15635c = null;
        this.f15634b = 1;
    }
}
