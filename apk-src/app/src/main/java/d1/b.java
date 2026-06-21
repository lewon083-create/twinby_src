package d1;

import a1.n;
import ad.m0;
import android.app.Activity;
import android.os.Build;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Window;
import bf.i;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.r9;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.z2;
import com.google.android.gms.internal.auth.g;
import com.google.android.gms.internal.measurement.d4;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g0.h;
import g0.s2;
import g2.a2;
import g2.b2;
import g2.y1;
import g2.z1;
import java.util.ArrayList;
import k6.t0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.h3;
import q4.m;
import t.z;
import t9.q;
import wk.j;
import x5.r;
import x5.t;
import xh.k;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class b implements f2.f, r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15511g;

    public b(q qVar) {
        this.f15506b = 3;
        ArrayList arrayList = qVar.f33643b;
        int size = arrayList.size();
        this.f15508d = (String[]) qVar.f33642a.toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f15509e = dArr;
        ArrayList arrayList2 = qVar.f33644c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i10 = 0; i10 < size3; i10++) {
            dArr2[i10] = ((Double) arrayList2.get(i10)).doubleValue();
        }
        this.f15510f = dArr2;
        this.f15511g = new int[size];
        this.f15507c = 0;
    }

    public static /* synthetic */ void q(b bVar, String str, int i, String str2, int i10) {
        if ((i10 & 2) != 0) {
            i = bVar.f15507c;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        bVar.p(i, str, str2);
        throw null;
    }

    public static /* synthetic */ void s(b bVar, byte b2) {
        bVar.r(b2, true);
        throw null;
    }

    public int A() {
        char cCharAt;
        int i = this.f15507c;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f15511g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f15507c = i;
        return i;
    }

    public String B(int i, int i10) {
        return u().subSequence(i, i10).toString();
    }

    public boolean C() {
        int iA = A();
        CharSequence charSequenceU = u();
        if (iA >= charSequenceU.length() || iA == -1 || charSequenceU.charAt(iA) != ',') {
            return false;
        }
        this.f15507c++;
        return true;
    }

    public void D(char c8) {
        int i = this.f15507c;
        if (i > 0 && c8 == '\"') {
            try {
                this.f15507c = i - 1;
                String strM = m();
                this.f15507c = i;
                if (Intrinsics.a(strM, "null")) {
                    p(this.f15507c - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f15507c = i;
                throw th2;
            }
        }
        s(this, j.d(c8));
        throw null;
    }

    public void E() {
        ((Activity) this.f15508d).getWindow().getDecorView().setSystemUiVisibility(this.f15507c);
        i iVar = (i) this.f15511g;
        if (iVar != null) {
            z(iVar);
        }
    }

    public int a(CharSequence charSequence, int i) {
        int i10 = i + 4;
        if (i10 < charSequence.length()) {
            ((StringBuilder) this.f15510f).append((char) (t(charSequence, i + 3) + (t(charSequence, i) << 12) + (t(charSequence, i + 1) << 8) + (t(charSequence, i + 2) << 4)));
            return i10;
        }
        this.f15507c = i;
        if (this.f15507c + 4 < charSequence.length()) {
            return a(charSequence, this.f15507c);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0145  */
    @Override // x5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(m3.p r38) {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.c(m3.p):void");
    }

    public void d(int i, int i10) {
        ((StringBuilder) this.f15510f).append(u(), i, i10);
    }

    public boolean e() {
        int i = this.f15507c;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f15511g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f15507c = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f15507c = i;
        return false;
    }

    public void f(int i, String str) {
        if (u().length() - i < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (u().charAt(i + i10) | ' ')) {
                q(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f15507c = str.length() + i;
    }

    public String g() {
        String source = (String) this.f15511g;
        j('\"');
        int i = this.f15507c;
        int iB = StringsKt.B(source, '\"', i, 4);
        if (iB == -1) {
            m();
            r((byte) 1, false);
            throw null;
        }
        int i10 = i;
        while (i10 < iB) {
            if (source.charAt(i10) == '\\') {
                int iY = this.f15507c;
                Intrinsics.checkNotNullParameter(source, "source");
                char cCharAt = source.charAt(i10);
                boolean z5 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        d(iY, i10);
                        int iY2 = y(i10 + 1);
                        if (iY2 == -1) {
                            q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iY2 + 1;
                        char cCharAt2 = u().charAt(iY2);
                        if (cCharAt2 == 'u') {
                            iA = a(u(), iA);
                        } else {
                            char c8 = cCharAt2 < 'u' ? wk.c.f35280a[cCharAt2] : (char) 0;
                            if (c8 == 0) {
                                q(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f15510f).append(c8);
                        }
                        iY = y(iA);
                        if (iY == -1) {
                            q(this, "Unexpected EOF", iY, null, 4);
                            throw null;
                        }
                    } else {
                        i10++;
                        if (i10 >= source.length()) {
                            d(iY, i10);
                            iY = y(i10);
                            if (iY == -1) {
                                q(this, "Unexpected EOF", iY, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = source.charAt(i10);
                        }
                    }
                    i10 = iY;
                    z5 = true;
                    cCharAt = source.charAt(i10);
                }
                String strB = !z5 ? B(iY, i10) : n(iY, i10);
                this.f15507c = i10 + 1;
                return strB;
            }
            i10++;
        }
        this.f15507c = iB + 1;
        String strSubstring = source.substring(i, iB);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // f2.f
    public Object get() {
        g.e("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        Range range = ((x0.a) this.f15509e).f35501a;
        h hVar = (h) this.f15511g;
        int i = hVar.f19573c;
        n nVar = (n) this.f15510f;
        int iB = hl.d.B(i, nVar.f371d, hVar.f19575e, nVar.f370c, hVar.f19574d, range);
        h3 h3Var = new h3();
        h3Var.f28251c = -1;
        h3Var.f28250b = (String) this.f15508d;
        h3Var.f28251c = Integer.valueOf(this.f15507c);
        h3Var.f28252d = s2.f19753b;
        h3Var.f28256h = Integer.valueOf(nVar.f371d);
        h3Var.f28254f = Integer.valueOf(nVar.f369b);
        h3Var.f28255g = Integer.valueOf(nVar.f370c);
        h3Var.f28253e = Integer.valueOf(iB);
        return h3Var.c();
    }

    public byte h() {
        String str = (String) this.f15511g;
        int i = this.f15507c;
        while (i != -1 && i < str.length()) {
            int i10 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f15507c = i10;
                return j.d(cCharAt);
            }
            i = i10;
        }
        this.f15507c = str.length();
        return (byte) 10;
    }

    public byte i(byte b2) {
        byte bH = h();
        if (bH == b2) {
            return bH;
        }
        s(this, b2);
        throw null;
    }

    public void j(char c8) {
        int i = this.f15507c;
        if (i == -1) {
            D(c8);
            throw null;
        }
        String str = (String) this.f15511g;
        while (i < str.length()) {
            int i10 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f15507c = i10;
                if (cCharAt == c8) {
                    return;
                }
                D(c8);
                throw null;
            }
            i = i10;
        }
        this.f15507c = -1;
        D(c8);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ab, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b7, code lost:
    
        throw new ij.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ca, code lost:
    
        q(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        q(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        if (u().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        q(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015b, code lost:
    
        q(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        r21.f15507c = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        q(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long k() {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.b.k():long");
    }

    public String l() {
        String str = (String) this.f15508d;
        if (str == null) {
            return g();
        }
        Intrinsics.b(str);
        this.f15508d = null;
        return str;
    }

    public String m() {
        String str = (String) this.f15508d;
        if (str != null) {
            Intrinsics.b(str);
            this.f15508d = null;
            return str;
        }
        int iA = A();
        if (iA >= u().length() || iA == -1) {
            q(this, "EOF", iA, null, 4);
            throw null;
        }
        byte bD = j.d(u().charAt(iA));
        if (bD == 1) {
            return l();
        }
        if (bD != 0) {
            q(this, "Expected beginning of the string, but got " + u().charAt(iA), 0, null, 6);
            throw null;
        }
        boolean z5 = false;
        while (j.d(u().charAt(iA)) == 0) {
            iA++;
            if (iA >= u().length()) {
                d(this.f15507c, iA);
                int iY = y(iA);
                if (iY == -1) {
                    this.f15507c = iA;
                    return n(0, 0);
                }
                iA = iY;
                z5 = true;
            }
        }
        String strB = !z5 ? B(this.f15507c, iA) : n(this.f15507c, iA);
        this.f15507c = iA;
        return strB;
    }

    public String n(int i, int i10) {
        d(i, i10);
        StringBuilder sb2 = (StringBuilder) this.f15510f;
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void p(int i, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbK = pe.a.k(message, " at path: ");
        sbK.append(((m0) this.f15509e).l());
        sbK.append(strConcat);
        throw j.b(i, sbK.toString(), u());
    }

    public void r(byte b2, boolean z5) {
        String strM = j.m(b2);
        int i = z5 ? this.f15507c - 1 : this.f15507c;
        q(this, z.f("Expected ", strM, ", but had '", (this.f15507c == u().length() || i < 0) ? "EOF" : String.valueOf(u().charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public int t(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        q(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public String toString() {
        switch (this.f15506b) {
            case 4:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append((Object) u());
                sb2.append("', currentPosition=");
                return om1.l(sb2, this.f15507c, ')');
            default:
                return super.toString();
        }
    }

    public CharSequence u() {
        return (String) this.f15511g;
    }

    public String v(String keyToMatch) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i = this.f15507c;
        try {
            if (h() == 6 && Intrinsics.a(x(), keyToMatch)) {
                this.f15508d = null;
                if (h() == 5) {
                    return x();
                }
            }
            return null;
        } finally {
            this.f15507c = i;
            this.f15508d = null;
        }
    }

    public byte w() {
        CharSequence charSequenceU = u();
        int i = this.f15507c;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.f15507c = iY;
                return (byte) 10;
            }
            char cCharAt = charSequenceU.charAt(iY);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f15507c = iY;
                return j.d(cCharAt);
            }
            i = iY + 1;
        }
    }

    public String x() {
        if (w() != 1) {
            return null;
        }
        String strL = l();
        this.f15508d = strL;
        return strL;
    }

    public int y(int i) {
        if (i < ((String) this.f15511g).length()) {
            return i;
        }
        return -1;
    }

    public void z(i iVar) {
        Window window = ((Activity) this.f15508d).getWindow();
        window.getDecorView();
        int i = Build.VERSION.SDK_INT;
        d4 b2Var = i >= 35 ? new b2(window) : i >= 30 ? new a2(window) : i >= 26 ? new z1(window) : new y1(window);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
            window.clearFlags(201326592);
        }
        int i11 = iVar.f2117c;
        if (i11 != 0) {
            int iM = z.m(i11);
            if (iM == 0) {
                b2Var.w(false);
            } else if (iM == 1) {
                b2Var.w(true);
            }
        }
        Integer num = (Integer) iVar.f2116b;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) iVar.f2119e;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i10 >= 26) {
            int i12 = iVar.f2118d;
            if (i12 != 0) {
                int iM2 = z.m(i12);
                if (iM2 == 0) {
                    b2Var.v(false);
                } else if (iM2 == 1) {
                    b2Var.v(true);
                }
            }
            Integer num2 = (Integer) iVar.f2120f;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) iVar.f2121g;
        if (num3 != null && i10 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) iVar.f2122h;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f15511g = iVar;
    }

    public b(String source) {
        this.f15506b = 4;
        Intrinsics.checkNotNullParameter(source, "source");
        this.f15506b = 4;
        m0 m0Var = new m0(14, (byte) 0);
        m0Var.f840d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        m0Var.f841e = iArr;
        m0Var.f839c = -1;
        this.f15509e = m0Var;
        this.f15510f = new StringBuilder();
        this.f15511g = source;
    }

    public void o() {
    }

    public b(String str, int i, x0.a aVar, n nVar, h hVar) {
        this.f15506b = 0;
        this.f15508d = str;
        this.f15507c = i;
        this.f15509e = aVar;
        this.f15510f = nVar;
        this.f15511g = hVar;
    }

    public b(w wVar, h3.e eVar, k kVar) {
        this.f15506b = 1;
        io.flutter.plugin.platform.n nVar = new io.flutter.plugin.platform.n(1, this);
        this.f15508d = wVar;
        this.f15509e = eVar;
        eVar.f20376d = nVar;
        this.f15510f = kVar;
        this.f15507c = 1280;
    }

    public b(z2 z2Var, t0 t0Var, byte[] bArr, fd.b[] bVarArr, int i) {
        this.f15506b = 2;
        this.f15508d = z2Var;
        this.f15509e = t0Var;
        this.f15510f = bArr;
        this.f15511g = bVarArr;
        this.f15507c = i;
    }

    public b(t tVar, int i) {
        this.f15506b = 5;
        this.f15511g = tVar;
        this.f15508d = new y2(5, new byte[5]);
        this.f15509e = new SparseArray();
        this.f15510f = new SparseIntArray();
        this.f15507c = i;
    }

    @Override // x5.r
    public void b(m3.w wVar, m mVar, r9 r9Var) {
    }
}
