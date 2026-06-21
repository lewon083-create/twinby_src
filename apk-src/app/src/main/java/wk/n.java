package wk;

import ad.m0;
import cj.x;
import d8.e0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t.t0;
import uk.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends j0.g implements tk.b, tk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk.c f35300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f35301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1.b f35302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f35303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hi.h f35305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f35306h;

    public n(vk.c json, r mode, d1.b lexer, sk.f descriptor, x xVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f35300b = json;
        this.f35301c = mode;
        this.f35302d = lexer;
        this.f35303e = json.f34874b;
        this.f35304f = -1;
        hi.h hVar = json.f34873a;
        this.f35305g = hVar;
        this.f35306h = hVar.f20598c ? null : new i(descriptor);
    }

    @Override // j0.g, tk.b
    public final float A() {
        d1.b bVar = this.f35302d;
        String strM = bVar.m();
        try {
            float f10 = Float.parseFloat(strM);
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            j.l(bVar, Float.valueOf(f10));
            throw null;
        } catch (IllegalArgumentException unused) {
            d1.b.q(bVar, pe.a.c('\'', "Failed to parse type 'float' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // j0.g, tk.b
    public final double C() {
        d1.b bVar = this.f35302d;
        String strM = bVar.m();
        try {
            double d10 = Double.parseDouble(strM);
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            j.l(bVar, Double.valueOf(d10));
            throw null;
        } catch (IllegalArgumentException unused) {
            d1.b.q(bVar, pe.a.c('\'', "Failed to parse type 'double' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // j0.g, tk.b
    public final tk.a a(sk.f sd2) {
        Intrinsics.checkNotNullParameter(sd2, "descriptor");
        vk.c cVar = this.f35300b;
        r rVarK = j.k(sd2, cVar);
        d1.b bVar = this.f35302d;
        m0 m0Var = (m0) bVar.f15509e;
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i = m0Var.f839c + 1;
        m0Var.f839c = i;
        Object[] objArr = (Object[]) m0Var.f840d;
        if (i == objArr.length) {
            int i10 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            m0Var.f840d = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) m0Var.f841e, i10);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            m0Var.f841e = iArrCopyOf;
        }
        ((Object[]) m0Var.f840d)[i] = sd2;
        bVar.j(rVarK.f35323b);
        if (bVar.w() != 4) {
            int iOrdinal = rVarK.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new n(cVar, rVarK, bVar, sd2, null) : (this.f35301c == rVarK && cVar.f34873a.f20598c) ? this : new n(cVar, rVarK, bVar, sd2, null);
        }
        d1.b.q(bVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // tk.a
    public final t0 b() {
        return this.f35303e;
    }

    @Override // j0.g, tk.b
    public final boolean c() {
        boolean z5;
        boolean z10;
        d1.b bVar = this.f35302d;
        int iA = bVar.A();
        if (iA == bVar.u().length()) {
            d1.b.q(bVar, "EOF", 0, null, 6);
            throw null;
        }
        if (bVar.u().charAt(iA) == '\"') {
            iA++;
            z5 = true;
        } else {
            z5 = false;
        }
        int iY = bVar.y(iA);
        if (iY >= bVar.u().length() || iY == -1) {
            d1.b.q(bVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iY + 1;
        int iCharAt = bVar.u().charAt(iY) | ' ';
        if (iCharAt == 102) {
            bVar.f(i, "alse");
            z10 = false;
        } else {
            if (iCharAt != 116) {
                d1.b.q(bVar, "Expected valid boolean literal prefix, but had '" + bVar.m() + '\'', 0, null, 6);
                throw null;
            }
            bVar.f(i, "rue");
            z10 = true;
        }
        if (!z5) {
            return z10;
        }
        if (bVar.f15507c == bVar.u().length()) {
            d1.b.q(bVar, "EOF", 0, null, 6);
            throw null;
        }
        if (bVar.u().charAt(bVar.f15507c) == '\"') {
            bVar.f15507c++;
            return z10;
        }
        d1.b.q(bVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // j0.g, tk.b
    public final char e() {
        d1.b bVar = this.f35302d;
        String strM = bVar.m();
        if (strM.length() == 1) {
            return strM.charAt(0);
        }
        d1.b.q(bVar, pe.a.c('\'', "Expected single char, but got '", strM), 0, null, 6);
        throw null;
    }

    @Override // j0.g, tk.b
    public final int h() {
        d1.b bVar = this.f35302d;
        long jK = bVar.k();
        int i = (int) jK;
        if (jK == i) {
            return i;
        }
        d1.b.q(bVar, "Failed to parse int for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // j0.g, tk.a
    public final Object i(sk.f descriptor, int i, qk.a deserializer, Object obj) {
        m0 m0Var = (m0) this.f35302d.f15509e;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z5 = this.f35301c == r.f35320f && (i & 1) == 0;
        if (z5) {
            int[] iArr = (int[]) m0Var.f841e;
            int i10 = m0Var.f839c;
            if (iArr[i10] == -2) {
                ((Object[]) m0Var.f840d)[i10] = k.f35289a;
            }
        }
        Object objI = super.i(descriptor, i, deserializer, obj);
        if (z5) {
            int[] iArr2 = (int[]) m0Var.f841e;
            int i11 = m0Var.f839c;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                m0Var.f839c = i12;
                Object[] objArr = (Object[]) m0Var.f840d;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    m0Var.f840d = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) m0Var.f841e, i13);
                    Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                    m0Var.f841e = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) m0Var.f840d;
            int i14 = m0Var.f839c;
            objArr2[i14] = objI;
            ((int[]) m0Var.f841e)[i14] = -2;
        }
        return objI;
    }

    @Override // j0.g, tk.b
    public final String j() {
        return this.f35302d.l();
    }

    @Override // j0.g, tk.a
    public final void m(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f35300b.f34873a.f20597b && descriptor.f() == 0) {
            while (v(descriptor) != -1) {
            }
        }
        d1.b bVar = this.f35302d;
        if (bVar.C()) {
            j.h(bVar, "");
            throw null;
        }
        bVar.j(this.f35301c.f35324c);
        m0 m0Var = (m0) bVar.f15509e;
        int i = m0Var.f839c;
        int[] iArr = (int[]) m0Var.f841e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            m0Var.f839c = i - 1;
        }
        int i10 = m0Var.f839c;
        if (i10 != -1) {
            m0Var.f839c = i10 - 1;
        }
    }

    @Override // j0.g, tk.b
    public final int n(sk.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        d1.b bVar = this.f35302d;
        String name = bVar.l();
        String suffix = " at path " + ((m0) bVar.f15509e).l();
        Intrinsics.checkNotNullParameter(enumDescriptor, "<this>");
        vk.c json = this.f35300b;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iG = j.g(enumDescriptor, json, name);
        if (iG != -3) {
            return iG;
        }
        throw new qk.d(enumDescriptor.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    @Override // j0.g, tk.b
    public final long o() {
        return this.f35302d.k();
    }

    @Override // j0.g, tk.b
    public final boolean p() {
        i iVar = this.f35306h;
        if (!(iVar != null ? iVar.f35287b : false)) {
            d1.b bVar = this.f35302d;
            int iY = bVar.y(bVar.A());
            int length = bVar.u().length() - iY;
            boolean z5 = false;
            if (length >= 4 && iY != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != bVar.u().charAt(iY + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || j.d(bVar.u().charAt(iY + 4)) != 0) {
                        z5 = true;
                        bVar.f15507c = iY + 4;
                    }
                }
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }

    public final vk.l p0() {
        return new e0(this.f35300b.f34873a, this.f35302d).f();
    }

    @Override // j0.g, tk.b
    public final tk.b r(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (p.a(descriptor)) {
            return new f(this.f35302d, this.f35300b);
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tk.a
    public final int v(sk.f descriptor) {
        d1.b bVar = this.f35302d;
        m0 m0Var = (m0) bVar.f15509e;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        r rVar = this.f35301c;
        int iOrdinal = rVar.ordinal();
        char c8 = ':';
        int i = 0;
        zC = false;
        boolean zC = false;
        int i10 = -1;
        if (iOrdinal == 0) {
            boolean zC2 = bVar.C();
            while (true) {
                boolean zE = bVar.e();
                i iVar = this.f35306h;
                if (zE) {
                    String key = bVar.g();
                    bVar.j(c8);
                    int iG = j.g(descriptor, this.f35300b, key);
                    if (iG != -3) {
                        if (iVar != null) {
                            s sVar = iVar.f35286a;
                            if (iG < 64) {
                                sVar.f34583c |= 1 << iG;
                            } else {
                                int i11 = (iG >>> 6) - 1;
                                long[] jArr = sVar.f34584d;
                                jArr[i11] = jArr[i11] | (1 << (iG & 63));
                            }
                        }
                        i10 = iG;
                    } else {
                        if (!this.f35305g.f20597b) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            bVar.p(StringsKt.E(6, bVar.B(0, bVar.f15507c), key), pe.a.c('\'', "Encountered an unknown key '", key), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bW = bVar.w();
                        if (bW == 8 || bW == 6) {
                            while (true) {
                                byte bW2 = bVar.w();
                                if (bW2 == 1) {
                                    bVar.g();
                                } else {
                                    if (bW2 == 8 || bW2 == 6) {
                                        arrayList.add(Byte.valueOf(bW2));
                                    } else if (bW2 == 9) {
                                        if (((Number) CollectionsKt.J(arrayList)).byteValue() != 8) {
                                            throw j.b(bVar.f15507c, "found ] instead of } at path: " + m0Var, bVar.u());
                                        }
                                        kotlin.collections.x.q(arrayList);
                                    } else if (bW2 == 7) {
                                        if (((Number) CollectionsKt.J(arrayList)).byteValue() != 6) {
                                            throw j.b(bVar.f15507c, "found } instead of ] at path: " + m0Var, bVar.u());
                                        }
                                        kotlin.collections.x.q(arrayList);
                                    } else if (bW2 == 10) {
                                        d1.b.q(bVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    bVar.h();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            bVar.m();
                        }
                        zC2 = bVar.C();
                        c8 = ':';
                    }
                } else {
                    if (zC2) {
                        j.h(bVar, "object");
                        throw null;
                    }
                    if (iVar != null) {
                        s sVar2 = iVar.f35286a;
                        h hVar = sVar2.f34582b;
                        sk.f fVar = sVar2.f34581a;
                        int iF = fVar.f();
                        while (true) {
                            long j10 = sVar2.f34583c;
                            long j11 = -1;
                            if (j10 != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                                sVar2.f34583c |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) hVar.invoke(fVar, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i10 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iF > 64) {
                                long[] jArr2 = sVar2.f34584d;
                                int length = jArr2.length;
                                loop3: while (i < length) {
                                    int i12 = i + 1;
                                    int i13 = i12 * 64;
                                    long j12 = jArr2[i];
                                    while (j12 != j11) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j12);
                                        j12 |= 1 << iNumberOfTrailingZeros2;
                                        int i14 = iNumberOfTrailingZeros2 + i13;
                                        if (((Boolean) hVar.invoke(fVar, Integer.valueOf(i14))).booleanValue()) {
                                            jArr2[i] = j12;
                                            i10 = i14;
                                            break loop3;
                                        }
                                        j11 = -1;
                                    }
                                    jArr2[i] = j12;
                                    i = i12;
                                    j11 = -1;
                                }
                            }
                        }
                    } else {
                        i10 = -1;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zC3 = bVar.C();
            if (bVar.e()) {
                int i15 = this.f35304f;
                if (i15 != -1 && !zC3) {
                    d1.b.q(bVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i10 = i15 + 1;
                this.f35304f = i10;
            } else if (zC3) {
                j.h(bVar, "array");
                throw null;
            }
        } else {
            int i16 = this.f35304f;
            byte b2 = i16 % 2 != 0;
            if (b2 != true) {
                bVar.j(':');
            } else if (i16 != -1) {
                zC = bVar.C();
            }
            if (bVar.e()) {
                if (b2 != false) {
                    if (this.f35304f == -1) {
                        int i17 = bVar.f15507c;
                        if (zC) {
                            d1.b.q(bVar, "Unexpected leading comma", i17, null, 4);
                            throw null;
                        }
                    } else {
                        int i18 = bVar.f15507c;
                        if (!zC) {
                            d1.b.q(bVar, "Expected comma after the key-value pair", i18, null, 4);
                            throw null;
                        }
                    }
                }
                i10 = this.f35304f + 1;
                this.f35304f = i10;
            } else if (zC) {
                j.h(bVar, "object");
                throw null;
            }
        }
        if (rVar != r.f35320f) {
            ((int[]) m0Var.f841e)[m0Var.f839c] = i10;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    @Override // j0.g, tk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(qk.a r10) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wk.n.w(qk.a):java.lang.Object");
    }

    @Override // j0.g, tk.b
    public final byte x() {
        d1.b bVar = this.f35302d;
        long jK = bVar.k();
        byte b2 = (byte) jK;
        if (jK == b2) {
            return b2;
        }
        d1.b.q(bVar, "Failed to parse byte for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // j0.g, tk.b
    public final short z() {
        d1.b bVar = this.f35302d;
        long jK = bVar.k();
        short s10 = (short) jK;
        if (jK == s10) {
            return s10;
        }
        d1.b.q(bVar, "Failed to parse short for input '" + jK + '\'', 0, null, 6);
        throw null;
    }
}
