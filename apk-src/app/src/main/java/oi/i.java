package oi;

import a0.i0;
import a0.l0;
import a0.l2;
import a0.n2;
import a0.o2;
import ad.m0;
import android.graphics.drawable.Drawable;
import com.appsflyer.internal.m;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d8.p;
import d8.v;
import fj.z;
import g0.a1;
import g0.s0;
import g0.z0;
import i0.o;
import i4.c0;
import j3.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.k;
import m3.l;
import org.json.JSONObject;
import s3.q;
import t.h1;
import t.h2;
import t.q0;
import t.r1;
import t.t0;
import t9.h0;
import yads.e51;
import yads.ek0;
import yads.lm3;
import yads.u31;
import yads.vp2;
import yads.w41;
import yi.a0;
import yi.d0;
import yi.e0;
import yi.g0;
import yi.n;
import yi.r;
import yi.s;
import yi.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements OnCompleteListener, n2, j1.i, k0.a, l, k, ii.c, p, u31, vp2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30689d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f30687b = i;
        this.f30688c = obj;
        this.f30689d = obj2;
    }

    @Override // yads.u31
    public void a(Drawable drawable) {
        e51.a((e51) this.f30688c, (w41) this.f30689d, drawable);
    }

    @Override // k0.a
    public ed.d apply(Object obj) {
        switch (this.f30687b) {
            case 13:
                h1 h1Var = (h1) this.f30688c;
                l2 l2Var = (l2) this.f30689d;
                h1Var.b();
                l2Var.a();
                return h1Var.n();
            case 14:
            case 16:
            default:
                g0.b bVar = (g0.b) this.f30688c;
                ArrayList arrayList = (ArrayList) this.f30689d;
                q qVar = (q) bVar.f19522d;
                Integer num = (Integer) ((s0) arrayList.get(0)).f19746b.g(s0.f19743j, 100);
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Integer num2 = (Integer) ((s0) arrayList.get(0)).f19746b.g(s0.i, 0);
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                bb.e eVar = ((u0.d) qVar.f32631c).f34001u;
                return eVar != null ? k0.j.f(o.w(new q0.d((q0.f) eVar.f2019c, iIntValue, iIntValue2))) : new k0.l(1, new Exception("Failed to take picture: pipeline is not ready."));
            case 15:
                return o.w(new e9.g((j1.k) this.f30689d, ((q0) this.f30688c).f33236c, TimeUnit.SECONDS.toMillis(3L), 4));
            case 17:
                h2 h2Var = (h2) this.f30688c;
                ArrayList arrayList2 = (ArrayList) this.f30689d;
                List list = (List) obj;
                com.google.android.gms.internal.auth.g.e("SyncCaptureSessionBase", "[" + h2Var + "] getSurface done with results: " + list);
                return list.isEmpty() ? new k0.l(1, new IllegalArgumentException("Unable to open capture session without surfaces")) : list.contains(null) ? new k0.l(1, new z0("Surface closed", (a1) arrayList2.get(list.indexOf(null)))) : k0.j.e(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:392:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0717 A[ORIG_RETURN, RETURN] */
    @Override // m3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.Object r26, j3.m r27) {
        /*
            Method dump skipped, instruction units count: 1866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.i.b(java.lang.Object, j3.m):void");
    }

    public void c(a1.e eVar) {
        List list;
        t0 t0Var = (t0) this.f30688c;
        m4.d dVar = (m4.d) this.f30689d;
        t0Var.getClass();
        JSONObject jSONObject = (JSONObject) eVar.f323c;
        String strOptString = jSONObject.optString("externalTransactionToken");
        String strOptString2 = jSONObject.optString("originalExternalTransactionId");
        Object obj = null;
        if (strOptString2.isEmpty()) {
            strOptString2 = null;
        }
        ArrayList<v> arrayList = (ArrayList) eVar.f324d;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (v vVar : arrayList) {
                String str = vVar.f15703a;
                String str2 = vVar.f15705c;
                t tVarC = ya.e.C(vVar.f15704b);
                e0 e0Var = new e0();
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                e0Var.f45651a = str;
                e0Var.f45652b = str2;
                e0Var.f45653c = tVarC;
                arrayList2.add(e0Var);
            }
            list = arrayList2;
        }
        d0 d0Var = new d0();
        d0Var.f45646a = strOptString2;
        if (strOptString == null) {
            throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
        }
        d0Var.f45647b = strOptString;
        if (list == null) {
            throw new IllegalStateException("Nonnull field \"products\" is null.");
        }
        d0Var.f45648c = list;
        ti.t tVar = new ti.t(9);
        dVar.getClass();
        String str3 = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling";
        new s7.g((ii.f) dVar.f28630b, str3, yi.d.f45645a, obj).K(new ArrayList(Collections.singletonList(d0Var)), new i(25, tVar, str3));
    }

    @Override // ii.c
    public void i(Object obj) {
        switch (this.f30687b) {
            case 23:
                h0 h0Var = (h0) this.f30688c;
                String str = (String) this.f30689d;
                if (!(obj instanceof List)) {
                    h0Var.c(wa.a.k(str));
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        h0Var.c(new yi.b((String) list.get(0), (String) list.get(1), list.get(2)));
                    }
                }
                break;
            case 24:
                ti.t tVar = (ti.t) this.f30688c;
                String str2 = (String) this.f30689d;
                if (!(obj instanceof List)) {
                    tVar.e(wa.a.k(str2));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        tVar.e(new yi.b((String) list2.get(0), (String) list2.get(1), list2.get(2)));
                    }
                }
                break;
            default:
                ti.t tVar2 = (ti.t) this.f30688c;
                String str3 = (String) this.f30689d;
                if (!(obj instanceof List)) {
                    tVar2.e(wa.a.k(str3));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        tVar2.e(new yi.b((String) list3.get(0), (String) list3.get(1), list3.get(2)));
                    }
                }
                break;
        }
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        t3.a aVar = (t3.a) this.f30688c;
        f4.g gVar = (f4.g) this.f30689d;
        t3.i iVar = (t3.i) obj;
        iVar.getClass();
        c0 c0Var = aVar.f33409d;
        if (c0Var == null) {
            return;
        }
        j3.o oVar = (j3.o) gVar.f16634g;
        oVar.getClass();
        int i = gVar.f16631d;
        t3.f fVar = iVar.f33442c;
        o0 o0Var = aVar.f33407b;
        c0Var.getClass();
        m0 m0Var = new m0(oVar, i, fVar.c(o0Var, c0Var));
        int i10 = gVar.f16630c;
        if (i10 != 0) {
            if (i10 == 1) {
                iVar.f33455q = m0Var;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                iVar.f33456r = m0Var;
                return;
            }
        }
        iVar.f33454p = m0Var;
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        switch (this.f30687b) {
            case 3:
                q0.f fVar = (q0.f) this.f30688c;
                i0 i0Var = (i0) this.f30689d;
                Map map = Collections.EMPTY_MAP;
                fVar.b(new a1.c(fVar, i0Var, hVar), new m(6));
                return "Init GlRenderer";
            case 11:
                r0.d dVar = (r0.d) this.f30688c;
                i0 i0Var2 = (i0) this.f30689d;
                Map map2 = Collections.EMPTY_MAP;
                dVar.b(new q0.o(dVar, i0Var2, hVar), new m(6));
                return "Init GlRenderer";
            case 14:
                hl.d.s().execute(new q0.o((q0) this.f30688c, (AtomicReference) this.f30689d, hVar, 5));
                return "OnScreenFlashStart";
            case 16:
                r1 r1Var = (r1) this.f30688c;
                r1Var.f33253b.execute(new q0.o(r1Var, hVar, (l0) this.f30689d, 6));
                return "startFocusAndMetering";
            default:
                com.google.android.gms.internal.ads.i0 i0Var3 = (com.google.android.gms.internal.ads.i0) this.f30688c;
                ((j0.i) i0Var3.f6314d).execute(new q0.o(i0Var3, hVar, (l0.a) this.f30689d, 7));
                return "setZoomRatio";
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.f30687b;
        Object obj = this.f30689d;
        Object obj2 = this.f30688c;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(task, "task");
                ((j) obj2).getClass();
                j.c(task, (z) obj);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(task, "task");
                ((j) obj2).getClass();
                j.c(task, (z) obj);
                break;
            case 2:
            case 3:
            default:
                z zVar = (z) obj2;
                qi.f fVar = (qi.f) obj;
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    Exception exception = task.getException();
                    fVar.getClass();
                    qi.f.c(zVar, exception);
                } else {
                    ij.k kVar = ij.m.f21341c;
                    zVar.invoke(new ij.m(task.getResult()));
                }
                break;
            case 4:
                qi.a aVar = (qi.a) obj2;
                qi.f fVar2 = (qi.f) obj;
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    Exception exception2 = task.getException();
                    fVar2.getClass();
                    qi.f.c(aVar, exception2);
                } else {
                    ij.k kVar2 = ij.m.f21341c;
                    aVar.invoke(new ij.m(Unit.f27471a));
                }
                break;
            case 5:
                z zVar2 = (z) obj2;
                qi.f fVar3 = (qi.f) obj;
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    Exception exception3 = task.getException();
                    fVar3.getClass();
                    qi.f.c(zVar2, exception3);
                } else {
                    ij.k kVar3 = ij.m.f21341c;
                    zVar2.invoke(new ij.m(Unit.f27471a));
                }
                break;
            case 6:
                qi.a aVar2 = (qi.a) obj2;
                qi.f fVar4 = (qi.f) obj;
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    Exception exception4 = task.getException();
                    fVar4.getClass();
                    qi.f.c(aVar2, exception4);
                } else {
                    ij.k kVar4 = ij.m.f21341c;
                    aVar2.invoke(new ij.m(Unit.f27471a));
                }
                break;
            case 7:
                z zVar3 = (z) obj2;
                qi.f fVar5 = (qi.f) obj;
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    Exception exception5 = task.getException();
                    fVar5.getClass();
                    qi.f.c(zVar3, exception5);
                } else {
                    ij.k kVar5 = ij.m.f21341c;
                    zVar3.invoke(new ij.m(task.getResult()));
                }
                break;
            case 8:
                z zVar4 = (z) obj2;
                qi.f fVar6 = (qi.f) obj;
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    Exception exception6 = task.getException();
                    fVar6.getClass();
                    qi.f.c(zVar4, exception6);
                } else {
                    ij.k kVar6 = ij.m.f21341c;
                    zVar4.invoke(new ij.m(Unit.f27471a));
                }
                break;
            case 9:
                z zVar5 = (z) obj2;
                qi.f fVar7 = (qi.f) obj;
                Intrinsics.checkNotNullParameter(task, "task");
                if (!task.isSuccessful()) {
                    Exception exception7 = task.getException();
                    fVar7.getClass();
                    qi.f.c(zVar5, exception7);
                } else {
                    ij.k kVar7 = ij.m.f21341c;
                    zVar5.invoke(new ij.m(Unit.f27471a));
                }
                break;
        }
    }

    @Override // d8.p
    public void onProductDetailsResponse(d8.j jVar, List list) {
        n nVar;
        ArrayList arrayList;
        yi.m mVar;
        g0 g0Var = (g0) this.f30688c;
        jh.b bVar = (jh.b) this.f30689d;
        g0Var.getClass();
        for (d8.o oVar : (ArrayList) list) {
            g0Var.f45665g.put(oVar.f15687c, oVar);
        }
        yi.l lVarH = ya.e.h(jVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            d8.o oVar2 = (d8.o) it.next();
            String str = oVar2.f15689e;
            String str2 = oVar2.f15691g;
            String str3 = oVar2.f15687c;
            t tVarC = ya.e.C(oVar2.f15688d);
            String str4 = oVar2.f15690f;
            d8.l lVarA = oVar2.a();
            if (lVarA == null) {
                nVar = null;
            } else {
                Long lValueOf = Long.valueOf(lVarA.f15642b);
                String str5 = lVarA.f15643c;
                String str6 = lVarA.f15641a;
                nVar = new n();
                nVar.f45694a = lValueOf;
                if (str6 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                nVar.f45695b = str6;
                if (str5 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                nVar.f45696c = str5;
            }
            ArrayList arrayList3 = oVar2.f15693j;
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    d8.n nVar2 = (d8.n) it2.next();
                    String str7 = nVar2.f15655b;
                    Iterator it3 = it;
                    String str8 = nVar2.f15654a;
                    Iterator it4 = it2;
                    ArrayList arrayList5 = nVar2.f15658e;
                    jh.b bVar2 = bVar;
                    String str9 = nVar2.f15656c;
                    yi.l lVar = lVarH;
                    v7.f fVar = nVar2.f15657d;
                    ArrayList arrayList6 = arrayList2;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it5 = ((ArrayList) fVar.f34767c).iterator();
                    while (it5.hasNext()) {
                        Iterator it6 = it5;
                        d8.m mVar2 = (d8.m) it5.next();
                        n nVar3 = nVar;
                        String str10 = mVar2.f15648a;
                        String str11 = str;
                        String str12 = mVar2.f15650c;
                        String str13 = str3;
                        t tVar = tVarC;
                        Long lValueOf2 = Long.valueOf(mVar2.f15649b);
                        String str14 = str4;
                        Long lValueOf3 = Long.valueOf(mVar2.f15652e);
                        String str15 = mVar2.f15651d;
                        int i = mVar2.f15653f;
                        String str16 = str2;
                        a0 a0Var = i != 1 ? i != 2 ? a0.NON_RECURRING : a0.FINITE_RECURRING : a0.INFINITE_RECURRING;
                        yi.q qVar = new yi.q();
                        qVar.f45700a = lValueOf3;
                        qVar.f45701b = a0Var;
                        qVar.f45702c = lValueOf2;
                        if (str15 == null) {
                            throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
                        }
                        qVar.f45703d = str15;
                        if (str10 == null) {
                            throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                        }
                        qVar.f45704e = str10;
                        if (str12 == null) {
                            throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                        }
                        qVar.f45705f = str12;
                        arrayList7.add(qVar);
                        nVar = nVar3;
                        it5 = it6;
                        str = str11;
                        str3 = str13;
                        tVarC = tVar;
                        str4 = str14;
                        str2 = str16;
                    }
                    n nVar4 = nVar;
                    String str17 = str;
                    String str18 = str2;
                    String str19 = str3;
                    t tVar2 = tVarC;
                    String str20 = str4;
                    if (nVar2.f15659f == null) {
                        mVar = null;
                    } else {
                        Long lValueOf4 = Long.valueOf(r0.f4005a);
                        Long lValueOf5 = Long.valueOf(r0.f4006b);
                        mVar = new yi.m();
                        mVar.f45692a = lValueOf4;
                        mVar.f45693b = lValueOf5;
                    }
                    yi.c0 c0Var = new yi.c0();
                    if (str8 == null) {
                        throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
                    }
                    c0Var.f45639a = str8;
                    c0Var.f45640b = str7;
                    if (str9 == null) {
                        throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
                    }
                    c0Var.f45641c = str9;
                    if (arrayList5 == null) {
                        throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
                    }
                    c0Var.f45642d = arrayList5;
                    c0Var.f45643e = arrayList7;
                    c0Var.f45644f = mVar;
                    arrayList4.add(c0Var);
                    it = it3;
                    it2 = it4;
                    bVar = bVar2;
                    lVarH = lVar;
                    arrayList2 = arrayList6;
                    nVar = nVar4;
                    str = str17;
                    str3 = str19;
                    tVarC = tVar2;
                    str4 = str20;
                    str2 = str18;
                }
                arrayList = arrayList4;
            }
            n nVar5 = nVar;
            yi.l lVar2 = lVarH;
            jh.b bVar3 = bVar;
            ArrayList arrayList8 = arrayList2;
            Iterator it7 = it;
            String str21 = str;
            String str22 = str2;
            String str23 = str3;
            t tVar3 = tVarC;
            String str24 = str4;
            r rVar = new r();
            if (str22 == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            rVar.f45706a = str22;
            if (str24 == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            rVar.f45707b = str24;
            if (str23 == null) {
                throw new IllegalStateException("Nonnull field \"productId\" is null.");
            }
            rVar.f45708c = str23;
            rVar.f45709d = tVar3;
            if (str21 == null) {
                throw new IllegalStateException("Nonnull field \"title\" is null.");
            }
            rVar.f45710e = str21;
            rVar.f45711f = nVar5;
            rVar.f45712g = arrayList;
            arrayList8.add(rVar);
            it = it7;
            arrayList2 = arrayList8;
            bVar = bVar3;
            lVarH = lVar2;
        }
        s sVar = new s();
        sVar.f45713a = lVarH;
        sVar.f45714b = arrayList2;
        bVar.e(sVar);
    }

    public /* synthetic */ i(q0.f fVar, i0 i0Var) {
        this.f30687b = 3;
        Map map = Collections.EMPTY_MAP;
        this.f30688c = fVar;
        this.f30689d = i0Var;
    }

    @Override // yads.vp2
    public void a(lm3 lm3Var) {
        ek0.a((ek0) this.f30688c, (String) this.f30689d, lm3Var);
    }

    public /* synthetic */ i(r0.d dVar, i0 i0Var) {
        this.f30687b = 11;
        Map map = Collections.EMPTY_MAP;
        this.f30688c = dVar;
        this.f30689d = i0Var;
    }

    @Override // a0.n2
    public void a(a0.m mVar) {
        s0.f fVar;
        q0.f fVar2 = (q0.f) this.f30688c;
        o2 o2Var = (o2) this.f30689d;
        fVar2.getClass();
        if (o2Var.f180c.a() && mVar.f165d) {
            fVar = s0.f.f32397d;
        } else {
            fVar = s0.f.f32396c;
        }
        y50 y50Var = fVar2.f31566b;
        s0.i.d(true, (AtomicBoolean) y50Var.f12502c);
        s0.i.c((Thread) y50Var.f12504e);
        if (((s0.f) y50Var.f12512n) != fVar) {
            y50Var.f12512n = fVar;
            y50Var.m(y50Var.f12501b);
        }
    }
}
