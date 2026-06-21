package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xj0 implements h90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12165h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f12166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f12167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f12168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f12169m;

    public xj0(Context context, yc0 yc0Var, iq0 iq0Var, u9.a aVar, xp0 xp0Var, jx jxVar, sz szVar, xo xoVar, boolean z5, ph0 ph0Var, qd0 qd0Var, sd0 sd0Var) {
        this.f12160c = context;
        this.f12161d = yc0Var;
        this.f12162e = iq0Var;
        this.f12163f = aVar;
        this.f12164g = xp0Var;
        this.f12165h = jxVar;
        this.i = szVar;
        this.f12166j = xoVar;
        this.f12159b = z5;
        this.f12167k = ph0Var;
        this.f12168l = qd0Var;
        this.f12169m = sd0Var;
    }

    public j3.o0 a(int i, ArrayList arrayList, i4.e1 e1Var) {
        ArrayList arrayList2 = (ArrayList) this.f12161d;
        if (!arrayList.isEmpty()) {
            this.f12168l = e1Var;
            for (int i10 = i; i10 < arrayList.size() + i; i10++) {
                s3.t0 t0Var = (s3.t0) arrayList.get(i10 - i);
                if (i10 > 0) {
                    s3.t0 t0Var2 = (s3.t0) arrayList2.get(i10 - 1);
                    t0Var.f32652d = t0Var2.f32649a.f21074p.f20995b.o() + t0Var2.f32652d;
                    t0Var.f32653e = false;
                    t0Var.f32651c.clear();
                } else {
                    t0Var.f32652d = 0;
                    t0Var.f32653e = false;
                    t0Var.f32651c.clear();
                }
                int iO = t0Var.f32649a.f21074p.f20995b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((s3.t0) arrayList2.get(i11)).f32652d += iO;
                }
                arrayList2.add(i10, t0Var);
                ((HashMap) this.f12163f).put(t0Var.f32650b, t0Var);
                if (this.f12159b) {
                    h(t0Var);
                    if (((IdentityHashMap) this.f12162e).isEmpty()) {
                        ((HashSet) this.i).add(t0Var);
                    } else {
                        s3.s0 s0Var = (s3.s0) ((HashMap) this.f12165h).get(t0Var);
                        if (s0Var != null) {
                            s0Var.f32645a.c(s0Var.f32646b);
                        }
                    }
                }
            }
        }
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(nc.k kVar, float f10, RectF rectF, k6.t0 t0Var, Path path) {
        int i;
        char c8;
        float f11;
        k6.t0 t0Var2;
        char c9;
        k6.t0 t0Var3 = t0Var;
        Matrix[] matrixArr = (Matrix[]) this.f12162e;
        float[] fArr = (float[]) this.f12166j;
        nc.t[] tVarArr = (nc.t[]) this.f12160c;
        Matrix[] matrixArr2 = (Matrix[]) this.f12161d;
        path.rewind();
        Path path2 = (Path) this.f12164g;
        path2.rewind();
        Path path3 = (Path) this.f12165h;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i10 = 0;
        while (true) {
            c8 = 0;
            if (i10 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f12163f;
            nc.c cVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.f29263f : kVar.f29262e : kVar.f29265h : kVar.f29264g;
            ya.e eVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.f29259b : kVar.f29258a : kVar.f29261d : kVar.f29260c;
            nc.t tVar = tVarArr[i10];
            eVar.getClass();
            Matrix[] matrixArr3 = matrixArr;
            eVar.j(tVar, f10, cVar.a(rectF));
            int i11 = i10 + 1;
            float f12 = (i11 % 4) * 90;
            matrixArr2[i10].reset();
            if (i10 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i10 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i10 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f12);
            nc.t tVar2 = tVarArr[i10];
            fArr[0] = tVar2.f29289b;
            fArr[1] = tVar2.f29290c;
            matrixArr2[i10].mapPoints(fArr);
            matrixArr3[i10].reset();
            matrixArr3[i10].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i10].preRotate(f12);
            i10 = i11;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i12 = 0;
        for (i = 4; i12 < i; i = 4) {
            nc.t tVar3 = tVarArr[i12];
            tVar3.getClass();
            fArr[c8] = 0.0f;
            fArr[1] = tVar3.f29288a;
            matrixArr2[i12].mapPoints(fArr);
            if (i12 == 0) {
                path.moveTo(fArr[c8], fArr[1]);
            } else {
                path.lineTo(fArr[c8], fArr[1]);
            }
            tVarArr[i12].b(matrixArr2[i12], path);
            if (t0Var3 != null) {
                nc.t tVar4 = tVarArr[i12];
                Matrix matrix = matrixArr2[i12];
                nc.g gVar = (nc.g) t0Var3.f27180c;
                BitSet bitSet = gVar.f29228e;
                tVar4.getClass();
                f11 = 0.0f;
                bitSet.set(i12, (boolean) c8);
                nc.s[] sVarArr = gVar.f29226c;
                tVar4.a(tVar4.f29292e);
                sVarArr[i12] = new nc.m(new ArrayList(tVar4.f29294g), new Matrix(matrix));
            } else {
                f11 = 0.0f;
            }
            Path path4 = (Path) this.f12168l;
            nc.t tVar5 = (nc.t) this.i;
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            nc.t tVar6 = tVarArr[i12];
            fArr[0] = tVar6.f29289b;
            fArr[1] = tVar6.f29290c;
            matrixArr2[i12].mapPoints(fArr);
            float[] fArr2 = (float[]) this.f12167k;
            nc.t tVar7 = tVarArr[i14];
            tVar7.getClass();
            fArr2[0] = f11;
            fArr2[1] = tVar7.f29288a;
            matrixArr2[i14].mapPoints(fArr2);
            nc.t[] tVarArr2 = tVarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f11);
            nc.t tVar8 = tVarArr2[i12];
            fArr[0] = tVar8.f29289b;
            fArr[1] = tVar8.f29290c;
            matrixArr5[i12].mapPoints(fArr);
            if (i12 == 1 || i12 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            tVar5.d(0.0f, 270.0f, 0.0f);
            (i12 != 1 ? i12 != 2 ? i12 != 3 ? kVar.f29266j : kVar.i : kVar.f29268l : kVar.f29267k).getClass();
            tVar5.c(fMax, 0.0f);
            path4.reset();
            tVar5.b(matrixArr4[i12], path4);
            if (this.f12159b && (g(path4, i12) || g(path4, i14))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = tVar5.f29288a;
                matrixArr4[i12].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                tVar5.b(matrixArr4[i12], path2);
            } else {
                tVar5.b(matrixArr4[i12], path);
            }
            if (t0Var != null) {
                Matrix matrix2 = matrixArr4[i12];
                t0Var2 = t0Var;
                nc.g gVar2 = (nc.g) t0Var2.f27180c;
                c9 = 0;
                gVar2.f29228e.set(i12 + 4, false);
                nc.s[] sVarArr2 = gVar2.f29227d;
                tVar5.a(tVar5.f29292e);
                sVarArr2[i12] = new nc.m(new ArrayList(tVar5.f29294g), new Matrix(matrix2));
            } else {
                t0Var2 = t0Var;
                c9 = 0;
            }
            c8 = c9;
            t0Var3 = t0Var2;
            i12 = i13;
            tVarArr = tVarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public j3.o0 c() {
        ArrayList arrayList = (ArrayList) this.f12161d;
        if (arrayList.isEmpty()) {
            return j3.o0.f26348a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            s3.t0 t0Var = (s3.t0) arrayList.get(i);
            t0Var.f32652d = iO;
            iO += t0Var.f32649a.f21074p.f20995b.o();
        }
        return new s3.z0(arrayList, (i4.e1) this.f12168l);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    @Override // com.google.android.gms.internal.ads.h90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(boolean r23, android.content.Context r24, com.google.android.gms.internal.ads.o60 r25) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xj0.d(boolean, android.content.Context, com.google.android.gms.internal.ads.o60):void");
    }

    public void e() {
        Iterator it = ((HashSet) this.i).iterator();
        while (it.hasNext()) {
            s3.t0 t0Var = (s3.t0) it.next();
            if (t0Var.f32651c.isEmpty()) {
                s3.s0 s0Var = (s3.s0) ((HashMap) this.f12165h).get(t0Var);
                if (s0Var != null) {
                    s0Var.f32645a.c(s0Var.f32646b);
                }
                it.remove();
            }
        }
    }

    public void f(s3.t0 t0Var) {
        if (t0Var.f32653e && t0Var.f32651c.isEmpty()) {
            s3.s0 s0Var = (s3.s0) ((HashMap) this.f12165h).remove(t0Var);
            s0Var.getClass();
            s3.r0 r0Var = s0Var.f32647c;
            i4.a aVar = s0Var.f32645a;
            aVar.s(s0Var.f32646b);
            aVar.v(r0Var);
            aVar.u(r0Var);
            ((HashSet) this.i).remove(t0Var);
        }
    }

    public boolean g(Path path, int i) {
        Path path2 = (Path) this.f12169m;
        path2.reset();
        ((nc.t[]) this.f12160c)[i].b(((Matrix[]) this.f12161d)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i4.d0, s3.m0] */
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
    public void h(s3.t0 t0Var) {
        i4.y yVar = t0Var.f32649a;
        ?? r12 = new i4.d0() { // from class: s3.m0
            @Override // i4.d0
            public final void a(i4.a aVar, j3.o0 o0Var) {
                m3.v vVar = ((e0) this.f32609a.f12164g).i;
                vVar.d(2);
                vVar.e(22);
            }
        };
        s3.r0 r0Var = new s3.r0(this, t0Var);
        ((HashMap) this.f12165h).put(t0Var, new s3.s0(yVar, r12, r0Var));
        String str = m3.z.f28608a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        yVar.getClass();
        i4.i0 i0Var = yVar.f20828d;
        i0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = i0Var.f20928c;
        i4.h0 h0Var = new i4.h0();
        h0Var.f20919a = handler;
        h0Var.f20920b = r0Var;
        copyOnWriteArrayList.add(h0Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        i4.i0 i0Var2 = yVar.f20829e;
        i0Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = i0Var2.f20928c;
        x3.d dVar = new x3.d();
        dVar.f35761a = r0Var;
        copyOnWriteArrayList2.add(dVar);
        yVar.n(r12, (p3.e0) this.f12169m, (t3.j) this.f12160c);
    }

    public void i(i4.a0 a0Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f12162e;
        s3.t0 t0Var = (s3.t0) identityHashMap.remove(a0Var);
        t0Var.getClass();
        t0Var.f32649a.r(a0Var);
        t0Var.f32651c.remove(((i4.v) a0Var).f21019b);
        if (!identityHashMap.isEmpty()) {
            e();
        }
        f(t0Var);
    }

    @Override // com.google.android.gms.internal.ads.h90
    public xp0 j() {
        return (xp0) this.f12164g;
    }

    public void k(int i, int i10) {
        ArrayList arrayList = (ArrayList) this.f12161d;
        for (int i11 = i10 - 1; i11 >= i; i11--) {
            s3.t0 t0Var = (s3.t0) arrayList.remove(i11);
            ((HashMap) this.f12163f).remove(t0Var.f32650b);
            int i12 = -t0Var.f32649a.f21074p.f20995b.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((s3.t0) arrayList.get(i13)).f32652d += i12;
            }
            t0Var.f32653e = true;
            if (this.f12159b) {
                f(t0Var);
            }
        }
    }

    public ci l(List list, int i, int i10) {
        ArrayList arrayList = (ArrayList) this.f12161d;
        ix.o(i >= 0 && i <= i10 && i10 <= arrayList.size());
        ix.o(list.size() == i10 - i);
        for (int i11 = i; i11 < i10; i11++) {
            ((iu1) arrayList.get(i11)).f6617a.a((n5) list.get(i11 - i));
        }
        return p();
    }

    public boolean m() {
        return this.f12159b;
    }

    public void n(em1 em1Var) {
        ix.k0(!this.f12159b);
        this.f12168l = em1Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f12161d;
            if (i >= arrayList.size()) {
                this.f12159b = true;
                return;
            }
            iu1 iu1Var = (iu1) arrayList.get(i);
            w(iu1Var);
            ((HashSet) this.i).add(iu1Var);
            i++;
        }
    }

    public void o(gy1 gy1Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f12162e;
        iu1 iu1Var = (iu1) identityHashMap.remove(gy1Var);
        iu1Var.getClass();
        iu1Var.f6617a.b(gy1Var);
        iu1Var.f6619c.remove(((ay1) gy1Var).f3478b);
        if (!identityHashMap.isEmpty()) {
            u();
        }
        x(iu1Var);
    }

    public ci p() {
        ArrayList arrayList = (ArrayList) this.f12161d;
        if (arrayList.isEmpty()) {
            return ci.f4215a;
        }
        int iA = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            iu1 iu1Var = (iu1) arrayList.get(i);
            iu1Var.f6620d = iA;
            iA += iu1Var.f6617a.f4746o.f11916b.a();
        }
        return new qu1(arrayList, (iz1) this.f12169m);
    }

    public ci q(List list, iz1 iz1Var) {
        ArrayList arrayList = (ArrayList) this.f12161d;
        v(0, arrayList.size());
        return r(arrayList.size(), list, iz1Var);
    }

    public ci r(int i, List list, iz1 iz1Var) {
        ArrayList arrayList = (ArrayList) this.f12161d;
        if (!list.isEmpty()) {
            this.f12169m = iz1Var;
            for (int i10 = i; i10 < list.size() + i; i10++) {
                iu1 iu1Var = (iu1) list.get(i10 - i);
                if (i10 > 0) {
                    iu1 iu1Var2 = (iu1) arrayList.get(i10 - 1);
                    iu1Var.f6620d = iu1Var2.f6617a.f4746o.f11916b.a() + iu1Var2.f6620d;
                    iu1Var.f6621e = false;
                    iu1Var.f6619c.clear();
                } else {
                    iu1Var.f6620d = 0;
                    iu1Var.f6621e = false;
                    iu1Var.f6619c.clear();
                }
                int iA = iu1Var.f6617a.f4746o.f11916b.a();
                for (int i11 = i10; i11 < arrayList.size(); i11++) {
                    ((iu1) arrayList.get(i11)).f6620d += iA;
                }
                arrayList.add(i10, iu1Var);
                ((HashMap) this.f12163f).put(iu1Var.f6618b, iu1Var);
                if (this.f12159b) {
                    w(iu1Var);
                    if (((IdentityHashMap) this.f12162e).isEmpty()) {
                        ((HashSet) this.i).add(iu1Var);
                    } else {
                        hu1 hu1Var = (hu1) ((HashMap) this.f12165h).get(iu1Var);
                        if (hu1Var != null) {
                            hu1Var.f6265a.p(hu1Var.f6266b);
                        }
                    }
                }
            }
        }
        return p();
    }

    public ci s(int i, int i10, iz1 iz1Var) {
        boolean z5 = false;
        if (i >= 0 && i <= i10 && i10 <= ((ArrayList) this.f12161d).size()) {
            z5 = true;
        }
        ix.o(z5);
        this.f12169m = iz1Var;
        v(i, i10);
        return p();
    }

    public ci t(iz1 iz1Var) {
        int size = ((ArrayList) this.f12161d).size();
        if (iz1Var.f6660b.length != size) {
            iz1Var = new iz1(new Random(iz1Var.f6659a.nextLong())).a(size);
        }
        this.f12169m = iz1Var;
        return p();
    }

    public void u() {
        Iterator it = ((HashSet) this.i).iterator();
        while (it.hasNext()) {
            iu1 iu1Var = (iu1) it.next();
            if (iu1Var.f6619c.isEmpty()) {
                hu1 hu1Var = (hu1) ((HashMap) this.f12165h).get(iu1Var);
                if (hu1Var != null) {
                    hu1Var.f6265a.p(hu1Var.f6266b);
                }
                it.remove();
            }
        }
    }

    public void v(int i, int i10) {
        ArrayList arrayList = (ArrayList) this.f12161d;
        while (true) {
            i10--;
            if (i10 < i) {
                return;
            }
            iu1 iu1Var = (iu1) arrayList.remove(i10);
            ((HashMap) this.f12163f).remove(iu1Var.f6618b);
            int i11 = -iu1Var.f6617a.f4746o.f11916b.a();
            for (int i12 = i10; i12 < arrayList.size(); i12++) {
                ((iu1) arrayList.get(i12)).f6620d += i11;
            }
            iu1Var.f6621e = true;
            if (this.f12159b) {
                x(iu1Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.iy1, com.google.android.gms.internal.ads.ku1] */
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
    public void w(iu1 iu1Var) {
        dy1 dy1Var = iu1Var.f6617a;
        ?? r12 = new iy1() { // from class: com.google.android.gms.internal.ads.ku1
            @Override // com.google.android.gms.internal.ads.iy1
            public final void a(nx1 nx1Var, ci ciVar) {
                lo0 lo0Var = ((ut1) this.f7314a.f12164g).i;
                lo0Var.d(2);
                lo0Var.c(22);
            }
        };
        gu1 gu1Var = new gu1(this, iu1Var);
        ((HashMap) this.f12165h).put(iu1Var, new hu1(dy1Var, r12, gu1Var));
        String str = cq0.f4293a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        n90 n90Var = dy1Var.f8490c;
        n90Var.getClass();
        ((CopyOnWriteArrayList) n90Var.f8249d).add(new jy1(handler, gu1Var));
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        ly1 ly1Var = dy1Var.f8491d;
        ly1Var.getClass();
        ((CopyOnWriteArrayList) ly1Var.f7676c).add(new uw1(gu1Var));
        dy1Var.n(r12, (em1) this.f12168l, (fv1) this.f12160c);
    }

    public void x(iu1 iu1Var) {
        if (iu1Var.f6621e && iu1Var.f6619c.isEmpty()) {
            hu1 hu1Var = (hu1) ((HashMap) this.f12165h).remove(iu1Var);
            hu1Var.getClass();
            nx1 nx1Var = hu1Var.f6265a;
            nx1Var.q(hu1Var.f6266b);
            gu1 gu1Var = hu1Var.f6267c;
            nx1Var.l(gu1Var);
            nx1Var.m(gu1Var);
            ((HashSet) this.i).remove(iu1Var);
        }
    }

    public xj0(ut1 ut1Var, bv1 bv1Var, lo0 lo0Var, fv1 fv1Var) {
        this.f12160c = fv1Var;
        this.f12164g = ut1Var;
        this.f12169m = new iz1();
        this.f12162e = new IdentityHashMap();
        this.f12163f = new HashMap();
        this.f12161d = new ArrayList();
        this.f12166j = bv1Var;
        this.f12167k = lo0Var;
        this.f12165h = new HashMap();
        this.i = new HashSet();
    }

    public xj0() {
        this.f12160c = new nc.t[4];
        this.f12161d = new Matrix[4];
        this.f12162e = new Matrix[4];
        this.f12163f = new PointF();
        this.f12164g = new Path();
        this.f12165h = new Path();
        this.i = new nc.t();
        this.f12166j = new float[2];
        this.f12167k = new float[2];
        this.f12168l = new Path();
        this.f12169m = new Path();
        this.f12159b = true;
        for (int i = 0; i < 4; i++) {
            ((nc.t[]) this.f12160c)[i] = new nc.t();
            ((Matrix[]) this.f12161d)[i] = new Matrix();
            ((Matrix[]) this.f12162e)[i] = new Matrix();
        }
    }

    public xj0(s3.e0 e0Var, t3.d dVar, m3.v vVar, t3.j jVar) {
        this.f12160c = jVar;
        this.f12164g = e0Var;
        this.f12168l = new i4.e1();
        this.f12162e = new IdentityHashMap();
        this.f12163f = new HashMap();
        this.f12161d = new ArrayList();
        this.f12166j = dVar;
        this.f12167k = vVar;
        this.f12165h = new HashMap();
        this.i = new HashSet();
    }
}
