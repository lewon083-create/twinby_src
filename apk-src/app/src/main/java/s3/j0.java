package s3;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.xj0;
import com.google.android.gms.internal.measurement.h5;
import com.yandex.varioqub.config.model.ConfigValue;
import fh.of;
import i4.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i4.b1[] f32584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k0 f32588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32589h;
    public final boolean[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a[] f32590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l4.u f32591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xj0 f32592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j0 f32593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j1 f32594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l4.v f32595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f32596p;

    public j0(a[] aVarArr, long j10, l4.u uVar, bb.e eVar, xj0 xj0Var, k0 k0Var, l4.v vVar) {
        this.f32590j = aVarArr;
        this.f32596p = j10;
        this.f32591k = uVar;
        this.f32592l = xj0Var;
        i4.c0 c0Var = k0Var.f32598a;
        this.f32583b = c0Var.f20861a;
        this.f32588g = k0Var;
        this.f32594n = j1.f20934d;
        this.f32595o = vVar;
        this.f32584c = new i4.b1[aVarArr.length];
        this.i = new boolean[aVarArr.length];
        long j11 = k0Var.f32599b;
        long j12 = k0Var.f32601d;
        boolean z5 = k0Var.f32603f;
        xj0Var.getClass();
        Object obj = c0Var.f20861a;
        int i = z0.f32724k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        i4.c0 c0VarA = c0Var.a(pair.second);
        t0 t0Var = (t0) ((HashMap) xj0Var.f12163f).get(obj2);
        t0Var.getClass();
        ((HashSet) xj0Var.i).add(t0Var);
        s0 s0Var = (s0) ((HashMap) xj0Var.f12165h).get(t0Var);
        if (s0Var != null) {
            s0Var.f32645a.f(s0Var.f32646b);
        }
        t0Var.f32651c.add(c0VarA);
        i4.a0 a0VarB = t0Var.f32649a.b(c0VarA, eVar, j11);
        ((IdentityHashMap) xj0Var.f12162e).put(a0VarB, t0Var);
        xj0Var.e();
        this.f32582a = j12 != -9223372036854775807L ? new i4.d(a0VarB, !z5, 0L, j12) : a0VarB;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [i4.a0, java.lang.Object] */
    public final long a(l4.v vVar, long j10, boolean z5, boolean[] zArr) {
        a[] aVarArr;
        i4.b1[] b1VarArr;
        int i = 0;
        while (true) {
            boolean z10 = true;
            if (i >= vVar.f27919a) {
                break;
            }
            if (z5 || !vVar.a(this.f32595o, i)) {
                z10 = false;
            }
            this.i[i] = z10;
            i++;
        }
        int i10 = 0;
        while (true) {
            aVarArr = this.f32590j;
            int length = aVarArr.length;
            b1VarArr = this.f32584c;
            if (i10 >= length) {
                break;
            }
            if (aVarArr[i10].f32431c == -2) {
                b1VarArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f32595o = vVar;
        c();
        long jF = this.f32582a.f(vVar.f27921c, this.i, this.f32584c, zArr, j10);
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            if (aVarArr[i11].f32431c == -2 && this.f32595o.b(i11)) {
                b1VarArr[i11] = new i4.r();
            }
        }
        this.f32587f = false;
        for (int i12 = 0; i12 < b1VarArr.length; i12++) {
            if (b1VarArr[i12] != null) {
                h5.r(vVar.b(i12));
                if (aVarArr[i12].f32431c != -2) {
                    this.f32587f = true;
                }
            } else {
                h5.r(vVar.f27921c[i12] == null);
            }
        }
        return jF;
    }

    public final void b() {
        if (this.f32593m != null) {
            return;
        }
        int i = 0;
        while (true) {
            l4.v vVar = this.f32595o;
            if (i >= vVar.f27919a) {
                return;
            }
            boolean zB = vVar.b(i);
            l4.r rVar = this.f32595o.f27921c[i];
            if (zB && rVar != null) {
                rVar.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.f32593m != null) {
            return;
        }
        int i = 0;
        while (true) {
            l4.v vVar = this.f32595o;
            if (i >= vVar.f27919a) {
                return;
            }
            boolean zB = vVar.b(i);
            l4.r rVar = this.f32595o.f27921c[i];
            if (zB && rVar != null) {
                rVar.g();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [i4.d1, java.lang.Object] */
    public final long d() {
        if (!this.f32586e) {
            return this.f32588g.f32599b;
        }
        long bufferedPositionUs = this.f32587f ? this.f32582a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f32588g.f32602e : bufferedPositionUs;
    }

    public final long e() {
        return this.f32588g.f32599b + this.f32596p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [i4.a0, java.lang.Object] */
    public final void f(float f10, j3.o0 o0Var, boolean z5) {
        this.f32586e = true;
        this.f32594n = this.f32582a.getTrackGroups();
        l4.v vVarJ = j(f10, o0Var, z5);
        k0 k0Var = this.f32588g;
        long jMax = k0Var.f32599b;
        long j10 = k0Var.f32602e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(vVarJ, jMax, false, new boolean[this.f32590j.length]);
        long j11 = this.f32596p;
        k0 k0Var2 = this.f32588g;
        this.f32596p = (k0Var2.f32599b - jA) + j11;
        this.f32588g = k0Var2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [i4.d1, java.lang.Object] */
    public final boolean g() {
        if (this.f32586e) {
            return !this.f32587f || this.f32582a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f32586e) {
            return g() || d() - this.f32588g.f32599b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [i4.a0, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        b();
        ?? r02 = this.f32582a;
        try {
            boolean z5 = r02 instanceof i4.d;
            xj0 xj0Var = this.f32592l;
            if (z5) {
                xj0Var.i(((i4.d) r02).f20866b);
            } else {
                xj0Var.i(r02);
            }
        } catch (RuntimeException e3) {
            m3.b.f("MediaPeriodHolder", "Period release failed.", e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v31, types: [l4.q] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57, types: [l4.h] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l4.q[]] */
    /* JADX WARN: Type inference failed for: r6v45, types: [l4.q] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r7v43, types: [l4.q] */
    public final l4.v j(float f10, j3.o0 o0Var, boolean z5) {
        l4.j jVar;
        ?? r62;
        String str;
        j3.p0 p0Var;
        Pair pairG;
        Object languageTag;
        long j10;
        boolean z10;
        ad.b1 b1VarW;
        l4.r bVar;
        m4.e eVar;
        int i;
        int[] iArr;
        j3.p0 p0Var2;
        int i10;
        int[] iArr2;
        int[][] iArr3;
        int[] iArr4;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        int[] iArr5;
        l4.u uVar = this.f32591k;
        a[] aVarArr = this.f32590j;
        j1 j1Var = this.f32594n;
        uVar.getClass();
        int i11 = 1;
        int[] iArr6 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        j3.p0[][] p0VarArr = new j3.p0[length][];
        int[][][] iArr7 = new int[aVarArr.length + 1][][];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = j1Var.f20935a;
            p0VarArr[i12] = new j3.p0[i13];
            iArr7[i12] = new int[i13][];
        }
        int length2 = aVarArr.length;
        int[] iArr8 = new int[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            iArr8[i14] = aVarArr[i14].C();
        }
        int i15 = 0;
        while (i15 < j1Var.f20935a) {
            j3.p0 p0VarA = j1Var.a(i15);
            int i16 = p0VarA.f26353c == 5 ? i11 : 0;
            int length3 = aVarArr.length;
            int i17 = i11;
            int i18 = 0;
            int i19 = 0;
            while (i19 < aVarArr.length) {
                a aVar = aVarArr[i19];
                l4.u uVar2 = uVar;
                j1 j1Var2 = j1Var;
                int i20 = i11;
                int iMax = 0;
                for (int i21 = 0; i21 < p0VarA.f26351a; i21++) {
                    iMax = Math.max(iMax, aVar.B(p0VarA.f26354d[i21]) & 7);
                }
                int i22 = iArr6[i19] == 0 ? i20 : 0;
                if (iMax > i18 || (iMax == i18 && i16 != 0 && i17 == 0 && i22 != 0)) {
                    i18 = iMax;
                    i17 = i22;
                    length3 = i19;
                }
                i19++;
                i11 = i20;
                uVar = uVar2;
                j1Var = j1Var2;
            }
            l4.u uVar3 = uVar;
            j1 j1Var3 = j1Var;
            int i23 = i11;
            if (length3 == aVarArr.length) {
                iArr5 = new int[p0VarA.f26351a];
            } else {
                a aVar2 = aVarArr[length3];
                int[] iArr9 = new int[p0VarA.f26351a];
                for (int i24 = 0; i24 < p0VarA.f26351a; i24++) {
                    iArr9[i24] = aVar2.B(p0VarA.f26354d[i24]);
                }
                iArr5 = iArr9;
            }
            int i25 = iArr6[length3];
            p0VarArr[length3][i25] = p0VarA;
            iArr7[length3][i25] = iArr5;
            iArr6[length3] = i25 + 1;
            i15++;
            i11 = i23;
            uVar = uVar3;
            j1Var = j1Var3;
        }
        l4.u uVar4 = uVar;
        int i26 = i11;
        int i27 = 0;
        j1[] j1VarArr = new j1[aVarArr.length];
        String[] strArr = new String[aVarArr.length];
        int[] iArr10 = new int[aVarArr.length];
        for (int i28 = 0; i28 < aVarArr.length; i28++) {
            int i29 = iArr6[i28];
            j1VarArr[i28] = new j1((j3.p0[]) m3.z.O(i29, p0VarArr[i28]));
            iArr7[i28] = (int[][]) m3.z.O(i29, iArr7[i28]);
            strArr[i28] = aVarArr[i28].i();
            iArr10[i28] = aVarArr[i28].f32431c;
        }
        l4.t tVar = new l4.t(iArr10, j1VarArr, iArr8, iArr7, new j1((j3.p0[]) m3.z.O(iArr6[aVarArr.length], p0VarArr[aVarArr.length])));
        l4.p pVar = (l4.p) uVar4;
        synchronized (pVar.f27902c) {
            pVar.f27906g = Thread.currentThread();
            jVar = pVar.f27905f;
        }
        if (pVar.f27908j == null && (context = pVar.f27903d) != null) {
            pVar.f27908j = Boolean.valueOf(m3.z.K(context));
        }
        if (jVar.A && Build.VERSION.SDK_INT >= 32 && pVar.f27907h == null) {
            pVar.f27907h = new b7(pVar.f27903d, pVar, pVar.f27908j);
        }
        int i30 = tVar.f27911a;
        Context context2 = pVar.f27903d;
        ?? r52 = new l4.q[i30];
        int i31 = 0;
        while (true) {
            if (i31 >= tVar.f27911a) {
                r62 = 0;
                break;
            }
            if (2 == iArr10[i31] && j1VarArr[i31].f20935a > 0) {
                r62 = i26;
                break;
            }
            i31++;
        }
        Pair pairG2 = l4.p.g(i26, tVar, iArr7, new io.sentry.android.core.s(pVar, jVar, (boolean) r62, iArr8), new d2.a(8));
        if (pairG2 != null) {
            r52[((Integer) pairG2.second).intValue()] = (l4.q) pairG2.first;
        }
        if (pairG2 == null) {
            str = null;
        } else {
            l4.q qVar = (l4.q) pairG2.first;
            str = qVar.f27909a.f26354d[qVar.f27910b[0]].f26326d;
        }
        jVar.f26380q.getClass();
        Pair pairG3 = l4.p.g(2, tVar, iArr7, new l4.d(jVar, str, iArr8, (!jVar.f26371g || context2 == null) ? null : m3.z.w(context2)), new d2.a(7));
        int i32 = 4;
        if (pairG3 == null) {
            p0Var = null;
            pairG = l4.p.g(4, tVar, iArr7, new he.e(18, jVar), new d2.a(6));
        } else {
            p0Var = null;
            pairG = null;
        }
        if (pairG != null) {
            r52[((Integer) pairG.second).intValue()] = (l4.q) pairG.first;
        } else if (pairG3 != null) {
            r52[((Integer) pairG3.second).intValue()] = (l4.q) pairG3.first;
        }
        if (!jVar.f26383t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = p0Var;
        } else {
            String str2 = m3.z.f28608a;
            languageTag = locale.toLanguageTag();
        }
        int i33 = 3;
        Pair pairG4 = l4.p.g(3, tVar, iArr7, new com.google.firebase.messaging.o(jVar, str, languageTag, 11), new d2.a(9));
        if (pairG4 != null) {
            r52[((Integer) pairG4.second).intValue()] = (l4.q) pairG4.first;
        }
        int i34 = 0;
        while (i34 < i30) {
            int i35 = iArr10[i34];
            if (i35 == 2 || i35 == 1 || i35 == i33 || i35 == i32) {
                i10 = i34;
                iArr2 = iArr10;
            } else {
                j1 j1Var4 = j1VarArr[i34];
                int[][] iArr11 = iArr7[i34];
                int i36 = i27;
                int i37 = i36;
                j3.p0 p0Var3 = p0Var;
                ?? r21 = p0Var3;
                while (i36 < j1Var4.f20935a) {
                    j3.p0 p0VarA2 = j1Var4.a(i36);
                    int[] iArr12 = iArr11[i36];
                    int i38 = i34;
                    j1 j1Var5 = j1Var4;
                    ?? r42 = r21;
                    int i39 = i37;
                    j3.p0 p0Var4 = p0Var3;
                    int i40 = i27;
                    while (i40 < p0VarA2.f26351a) {
                        int i41 = i40;
                        if (a.l(iArr12[i40], jVar.B)) {
                            iArr3 = iArr11;
                            l4.h hVar = new l4.h(p0VarA2.f26354d[i41], iArr12[i41]);
                            if (r42 != 0) {
                                iArr4 = iArr10;
                                if (ad.z.f896a.c(hVar.f27860c, r42.f27860c).c(hVar.f27859b, r42.f27859b).e() > 0) {
                                }
                            } else {
                                iArr4 = iArr10;
                            }
                            r42 = hVar;
                            p0Var4 = p0VarA2;
                            i39 = i41;
                        } else {
                            iArr3 = iArr11;
                            iArr4 = iArr10;
                        }
                        i40 = i41 + 1;
                        iArr11 = iArr3;
                        iArr10 = iArr4;
                        r42 = r42;
                    }
                    i36++;
                    p0Var3 = p0Var4;
                    i37 = i39;
                    j1Var4 = j1Var5;
                    r21 = r42;
                    i34 = i38;
                }
                i10 = i34;
                iArr2 = iArr10;
                r52[i10] = p0Var3 == null ? p0Var : new l4.q(i27, p0Var3, new int[]{i37});
            }
            i34 = i10 + 1;
            iArr10 = iArr2;
            i27 = 0;
            i33 = 3;
            i32 = 4;
        }
        int i42 = tVar.f27911a;
        j1[] j1VarArr2 = tVar.f27913c;
        HashMap map = new HashMap();
        for (int i43 = 0; i43 < i42; i43++) {
            l4.p.c(j1VarArr2[i43], jVar, map);
        }
        l4.p.c(tVar.f27916f, jVar, map);
        for (int i44 = 0; i44 < i42; i44++) {
            j3.q0 q0Var = (j3.q0) map.get(Integer.valueOf(tVar.f27912b[i44]));
            if (q0Var != null) {
                j3.p0 p0Var5 = q0Var.f26357a;
                ad.j0 j0Var = q0Var.f26358b;
                r52[i44] = (j0Var.isEmpty() || j1VarArr2[i44].b(p0Var5) == -1) ? p0Var : new l4.q(0, p0Var5, k3.f.E(j0Var));
            }
        }
        int i45 = tVar.f27911a;
        for (int i46 = 0; i46 < i45; i46++) {
            j1 j1Var6 = tVar.f27913c[i46];
            Map map2 = (Map) jVar.D.get(i46);
            if (map2 != null && map2.containsKey(j1Var6)) {
                Map map3 = (Map) jVar.D.get(i46);
                if (map3 != null && map3.get(j1Var6) != null) {
                    throw new ClassCastException();
                }
                r52[i46] = p0Var;
            }
        }
        for (int i47 = 0; i47 < i30; i47++) {
            int i48 = tVar.f27912b[i47];
            if (jVar.E.get(i47) || jVar.f26385v.contains(Integer.valueOf(i48))) {
                r52[i47] = p0Var;
            }
        }
        of ofVar = pVar.f27904e;
        m4.e eVar2 = pVar.f27918b;
        eVar2.getClass();
        ofVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i49 = 0;
        while (i49 < r52.length) {
            ?? r72 = r52[i49];
            if (r72 == 0 || r72.f27910b.length <= 1) {
                p0Var2 = p0Var;
                arrayList.add(p0Var2);
            } else {
                ad.g0 g0VarQ = ad.j0.q();
                g0VarQ.b(new l4.a(0L, 0L));
                arrayList.add(g0VarQ);
                p0Var2 = p0Var;
            }
            i49++;
            p0Var = p0Var2;
        }
        int length4 = r52.length;
        long[][] jArr = new long[length4][];
        int i50 = 0;
        while (true) {
            j10 = -1;
            if (i50 >= r52.length) {
                break;
            }
            ?? r14 = r52[i50];
            if (r14 == 0) {
                jArr[i50] = new long[0];
            } else {
                int[] iArr13 = r14.f27910b;
                jArr[i50] = new long[iArr13.length];
                int i51 = 0;
                while (i51 < iArr13.length) {
                    int i52 = i51;
                    long j11 = r14.f27909a.f26354d[iArr13[i51]].f26331j;
                    long[] jArr2 = jArr[i50];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i52] = j11;
                    i51 = i52 + 1;
                }
                Arrays.sort(jArr[i50]);
            }
            i50++;
        }
        int[] iArr14 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i53 = 0; i53 < length4; i53++) {
            long[] jArr4 = jArr[i53];
            jArr3[i53] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        l4.b.u(arrayList, jArr3);
        ad.q.d(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(ad.z0.f899c);
        ad.w0 w0Var = new ad.w0();
        ad.x0 x0Var = new ad.x0(treeMap);
        x0Var.f894g = w0Var;
        int i54 = 0;
        while (i54 < length4) {
            long[] jArr5 = jArr[i54];
            long j12 = j10;
            if (jArr5.length <= 1) {
                eVar = eVar2;
                i = length4;
                iArr = iArr14;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                eVar = eVar2;
                int i55 = 0;
                while (true) {
                    long[] jArr6 = jArr[i54];
                    i = length4;
                    int length6 = jArr6.length;
                    double dLog = ConfigValue.DOUBLE_DEFAULT_VALUE;
                    if (i55 >= length6) {
                        break;
                    }
                    int[] iArr15 = iArr14;
                    long j13 = jArr6[i55];
                    if (j13 != j12) {
                        dLog = Math.log(j13);
                    }
                    dArr[i55] = dLog;
                    i55++;
                    length4 = i;
                    iArr14 = iArr15;
                }
                iArr = iArr14;
                int i56 = length5 - 1;
                double d10 = dArr[i56] - dArr[0];
                int i57 = 0;
                while (i57 < i56) {
                    double d11 = dArr[i57];
                    int i58 = i57 + 1;
                    Double dValueOf = Double.valueOf(d10 == ConfigValue.DOUBLE_DEFAULT_VALUE ? 1.0d : (((d11 + dArr[i58]) * 0.5d) - dArr[0]) / d10);
                    Integer numValueOf = Integer.valueOf(i54);
                    double d12 = d10;
                    Map map4 = x0Var.f892e;
                    Collection collection = (Collection) map4.get(dValueOf);
                    if (collection == null) {
                        Collection collectionG = x0Var.g();
                        if (!collectionG.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        x0Var.f893f++;
                        map4.put(dValueOf, collectionG);
                    } else if (collection.add(numValueOf)) {
                        x0Var.f893f++;
                    }
                    i57 = i58;
                    d10 = d12;
                }
            }
            i54++;
            length4 = i;
            iArr14 = iArr;
            j10 = j12;
            eVar2 = eVar;
        }
        m4.e eVar3 = eVar2;
        int[] iArr16 = iArr14;
        Collection mVar = x0Var.f843c;
        if (mVar == null) {
            mVar = new ad.m(0, x0Var);
            x0Var.f843c = mVar;
        }
        ad.j0 j0VarR = ad.j0.r(mVar);
        for (int i59 = 0; i59 < j0VarR.size(); i59++) {
            int iIntValue = ((Integer) j0VarR.get(i59)).intValue();
            int i60 = iArr16[iIntValue] + 1;
            iArr16[iIntValue] = i60;
            jArr3[iIntValue] = jArr[iIntValue][i60];
            l4.b.u(arrayList, jArr3);
        }
        for (int i61 = 0; i61 < r52.length; i61++) {
            if (arrayList.get(i61) != null) {
                jArr3[i61] = jArr3[i61] * 2;
            }
        }
        l4.b.u(arrayList, jArr3);
        ad.g0 g0VarQ2 = ad.j0.q();
        for (int i62 = 0; i62 < arrayList.size(); i62++) {
            ad.g0 g0Var = (ad.g0) arrayList.get(i62);
            g0VarQ2.b(g0Var == null ? ad.b1.f768f : g0Var.g());
        }
        ad.b1 b1VarG = g0VarQ2.g();
        l4.r[] rVarArr = new l4.r[r52.length];
        for (int i63 = 0; i63 < r52.length; i63++) {
            ?? r63 = r52[i63];
            if (r63 != 0) {
                int[] iArr17 = r63.f27910b;
                if (iArr17.length != 0) {
                    if (iArr17.length == 1) {
                        bVar = new l4.s(r63.f27909a, new int[]{iArr17[0]});
                    } else {
                        long j14 = 25000;
                        bVar = new l4.b(r63.f27909a, iArr17, eVar3, 10000, j14, j14, (ad.j0) b1VarG.get(i63));
                    }
                    rVarArr[i63] = bVar;
                }
            }
        }
        a1[] a1VarArr = new a1[i30];
        for (int i64 = 0; i64 < i30; i64++) {
            a1VarArr[i64] = (jVar.E.get(i64) || jVar.f26385v.contains(Integer.valueOf(tVar.f27912b[i64])) || (tVar.f27912b[i64] != -2 && rVarArr[i64] == null)) ? null : a1.f32448c;
        }
        jVar.f26380q.getClass();
        Pair pairCreate = Pair.create(a1VarArr, rVarArr);
        l4.r[] rVarArr2 = (l4.r[]) pairCreate.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i65 = 0; i65 < rVarArr2.length; i65++) {
            l4.r rVar = rVarArr2[i65];
            if (rVar != null) {
                b1VarW = ad.j0.w(rVar);
            } else {
                ad.h0 h0Var = ad.j0.f818c;
                b1VarW = ad.b1.f768f;
            }
            listArr[i65] = b1VarW;
        }
        ad.g0 g0Var2 = new ad.g0(4);
        int i66 = 0;
        while (true) {
            int i67 = tVar.f27911a;
            j1[] j1VarArr3 = tVar.f27913c;
            if (i66 >= i67) {
                break;
            }
            j1 j1Var7 = j1VarArr3[i66];
            List list = listArr[i66];
            int i68 = 0;
            while (i68 < j1Var7.f20935a) {
                j3.p0 p0VarA3 = j1Var7.a(i68);
                int i69 = j1VarArr3[i66].a(i68).f26351a;
                int[] iArr18 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i70 < i69) {
                    List[] listArr2 = listArr;
                    if ((tVar.f27915e[i66][i68][i70] & 7) == 4) {
                        iArr18[i71] = i70;
                        i71++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr18, i71);
                j1 j1Var8 = j1Var7;
                int iMin = 16;
                String str3 = null;
                int i72 = 0;
                boolean z11 = false;
                int i73 = 0;
                while (i72 < iArrCopyOf.length) {
                    String str4 = j1VarArr3[i66].a(i68).f26354d[iArrCopyOf[i72]].f26335n;
                    int i74 = i73 + 1;
                    if (i73 == 0) {
                        str3 = str4;
                    } else {
                        z11 = (!Objects.equals(str3, str4)) | z11;
                    }
                    iMin = Math.min(iMin, tVar.f27915e[i66][i68][i72] & 24);
                    i72++;
                    i73 = i74;
                }
                if (z11) {
                    iMin = Math.min(iMin, tVar.f27914d[i66]);
                }
                boolean z12 = iMin != 0;
                int i75 = p0VarA3.f26351a;
                int[] iArr19 = new int[i75];
                boolean[] zArr = new boolean[i75];
                for (int i76 = 0; i76 < p0VarA3.f26351a; i76++) {
                    iArr19[i76] = tVar.f27915e[i66][i68][i76] & 7;
                    int i77 = 0;
                    while (true) {
                        if (i77 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        l4.r rVar2 = (l4.r) list.get(i77);
                        if (rVar2.b().equals(p0VarA3) && rVar2.t(i76) != -1) {
                            z10 = true;
                            break;
                        }
                        i77++;
                    }
                    zArr[i76] = z10;
                }
                g0Var2.b(new j3.t0(p0VarA3, z12, iArr19, zArr));
                i68++;
                listArr = listArr3;
                j1Var7 = j1Var8;
            }
            i66++;
        }
        j1 j1Var9 = tVar.f27916f;
        for (int i78 = 0; i78 < j1Var9.f20935a; i78++) {
            j3.p0 p0VarA4 = j1Var9.a(i78);
            int[] iArr20 = new int[p0VarA4.f26351a];
            Arrays.fill(iArr20, 0);
            g0Var2.b(new j3.t0(p0VarA4, false, iArr20, new boolean[p0VarA4.f26351a]));
        }
        l4.v vVar = new l4.v((a1[]) pairCreate.first, (l4.r[]) pairCreate.second, new j3.u0(g0Var2.g()), tVar);
        for (int i79 = 0; i79 < vVar.f27919a; i79++) {
            if (vVar.b(i79)) {
                h5.r(vVar.f27921c[i79] != null || this.f32590j[i79].f32431c == -2);
            } else {
                h5.r(vVar.f27921c[i79] == null);
            }
        }
        for (l4.r rVar3 : vVar.f27921c) {
            if (rVar3 != null) {
                rVar3.o(f10);
                rVar3.e(z5);
            }
        }
        return vVar;
    }

    public final void k() {
        Object obj = this.f32582a;
        if (obj instanceof i4.d) {
            long j10 = this.f32588g.f32601d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            i4.d dVar = (i4.d) obj;
            dVar.f20871g = 0L;
            dVar.f20872h = j10;
        }
    }
}
