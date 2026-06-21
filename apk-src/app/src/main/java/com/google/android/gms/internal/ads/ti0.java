package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 implements fi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10621a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10625e;

    public ti0(Context context, m10 m10Var, u9.a aVar) {
        this.f10622b = context;
        this.f10623c = m10Var;
        this.f10625e = aVar;
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final void a(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) throws kq0 {
        switch (this.f10621a) {
            case 0:
                try {
                    Object obj = ci0Var.f4217b;
                    IInterface iInterface = ci0Var.f4218c;
                    os osVar = (os) obj;
                    String str = xp0Var.Z;
                    JSONObject jSONObject = xp0Var.f12266v;
                    osVar.U2(str);
                    boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.U8)).booleanValue();
                    Context context = this.f10622b;
                    if (zBooleanValue && xp0Var.f12240g0) {
                        String str2 = xp0Var.U;
                        String string = jSONObject.toString();
                        iq0 iq0Var = (iq0) eq0Var.f5032a.f9149c;
                        osVar.Z0(str2, string, iq0Var.f6572d, new xa.b(context), new si0(this, ci0Var), (nr) iInterface, iq0Var.f6574f);
                        return;
                    }
                    String str3 = xp0Var.U;
                    String string2 = jSONObject.toString();
                    iq0 iq0Var2 = (iq0) eq0Var.f5032a.f9149c;
                    osVar.N0(str3, string2, iq0Var2.f6572d, new xa.b(context), new si0(this, ci0Var), (nr) iInterface, iq0Var2.f6574f);
                    return;
                } catch (RemoteException th2) {
                    throw new kq0(th2);
                }
            case 1:
                pq0 pq0Var = (pq0) ci0Var.f4217b;
                iq0 iq0Var3 = (iq0) eq0Var.f5032a.f9149c;
                String string3 = xp0Var.f12266v.toString();
                String strW = com.google.android.gms.internal.measurement.b4.W(xp0Var.f12260s);
                Context context2 = this.f10622b;
                nr nrVar = (nr) ci0Var.f4218c;
                try {
                    pq0Var.f9154a.M1(new xa.b(context2), iq0Var3.f6572d, string3, strW, nrVar);
                    return;
                } finally {
                    kq0 kq0Var = new kq0(th2);
                }
            default:
                try {
                    Object obj2 = ci0Var.f4217b;
                    IInterface iInterface2 = ci0Var.f4218c;
                    os osVar2 = (os) obj2;
                    String str4 = xp0Var.Z;
                    JSONObject jSONObject2 = xp0Var.f12266v;
                    osVar2.U2(str4);
                    int i = ((u9.a) this.f10625e).f34367d;
                    int iIntValue = ((Integer) q9.s.f31967e.f31970c.a(al.f2982e2)).intValue();
                    Context context3 = this.f10622b;
                    if (i < iIntValue) {
                        osVar2.j1(xp0Var.U, jSONObject2.toString(), ((iq0) eq0Var.f5032a.f9149c).f6572d, new xa.b(context3), new ej0(this, ci0Var), (nr) iInterface2);
                        return;
                    }
                    String str5 = xp0Var.U;
                    String string4 = jSONObject2.toString();
                    iq0 iq0Var4 = (iq0) eq0Var.f5032a.f9149c;
                    osVar2.F0(str5, string4, iq0Var4.f6572d, new xa.b(context3), new ej0(this, ci0Var), (nr) iInterface2, iq0Var4.f6577j);
                    return;
                } catch (RemoteException th22) {
                    throw new kq0(th22);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final Object b(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) throws rj0, kq0 {
        View view;
        int i = this.f10621a;
        Object obj = this.f10623c;
        Object obj2 = null;
        int i10 = 1;
        switch (i) {
            case 0:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.U8)).booleanValue() && xp0Var.f12240g0) {
                    try {
                        or orVar = (or) this.f10625e;
                        Parcel parcelP1 = orVar.p1(orVar.D0(), 1);
                        xa.a aVarL1 = xa.b.L1(parcelP1.readStrongBinder());
                        parcelP1.recycle();
                        view = (View) xa.b.X1(aVarL1);
                        or orVar2 = (or) this.f10625e;
                        Parcel parcelP12 = orVar2.p1(orVar2.D0(), 2);
                        ClassLoader classLoader = vg.f11374a;
                        boolean z5 = parcelP12.readInt() != 0;
                        parcelP12.recycle();
                        if (view == null) {
                            throw new kq0(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (z5) {
                            try {
                                view = (View) vv.J(n81.f8237c, new v40(this, view, xp0Var, 6), hx.f6284f).get();
                            } catch (InterruptedException | ExecutionException e3) {
                                throw new kq0(e3);
                            }
                        }
                    } catch (RemoteException e7) {
                        throw new kq0(e7);
                    }
                    break;
                } else {
                    view = (View) this.f10624d;
                }
                s10 s10Var = (s10) obj;
                oq0 oq0Var = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                cw cwVar = new cw(view, (sz) null, new cf(26, ci0Var), (yp0) xp0Var.f12264u.get(0));
                n10 n10Var = s10Var.f10129d;
                s10 s10Var2 = s10Var.f10131e;
                r10 r10Var = new r10(n10Var, s10Var2, oq0Var, cwVar);
                ((t80) r10Var.B.j()).F1(view);
                ((wi0) ci0Var.f4218c).m4(new bk0((g60) r10Var.f9663n.j(), (u80) r10Var.f9669t.j(), (q60) r10Var.f9666q.j(), (w60) r10Var.f9662m.j(), r10Var.h0(), (x70) s10Var2.T.j(), (f70) r10Var.f9672w.j(), (b90) r10Var.f9673x.j(), (v70) r10Var.f9674y.j(), (o60) r10Var.f9675z.j()));
                return r10Var.i0();
            case 1:
                oq0 oq0Var2 = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                ut utVar = new ut(12, new oq0(this, ci0Var, xp0Var, 21), obj2);
                w10 w10Var = (w10) obj;
                n10 n10Var2 = w10Var.f11572b;
                w10 w10Var2 = w10Var.f11573c;
                v10 v10Var = new v10(n10Var2, w10Var2, oq0Var2, utVar);
                ((u60) v10Var.f11187h.j()).x1(new u20(0, (pq0) ci0Var.f4217b), (Executor) this.f10625e);
                ((wi0) ci0Var.f4218c).m4(new ek0((g60) v10Var.f11194p.j(), (u80) v10Var.f11197s.j(), (q60) v10Var.f11190l.j(), (w60) v10Var.f11193o.j(), (y60) v10Var.f11198t.j(), (x70) w10Var2.R.j(), (f70) v10Var.f11200v.j(), (b90) v10Var.f11201w.j(), (v70) v10Var.f11202x.j(), (o60) v10Var.f11204z.j()));
                return v10Var.h0();
            default:
                ArrayList arrayList = ((iq0) eq0Var.f5032a.f9149c).f6576h;
                if (!arrayList.contains(Integer.toString(6))) {
                    throw new rj0(2, "Unified must be used for RTB.");
                }
                ja0 ja0VarL = ja0.l((sr) this.f10624d);
                if (!arrayList.contains(Integer.toString(ja0VarL.q()))) {
                    throw new rj0(1, "No corresponding native ad listener");
                }
                m10 m10Var = (m10) obj;
                oq0 oq0Var3 = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                gk0 gk0Var = new gk0(18, ja0VarL);
                oq0 oq0Var4 = new oq0((qr) null, (pr) null, (sr) this.f10624d);
                n10 n10Var3 = m10Var.f7719b;
                m10 m10Var2 = m10Var.f7720c;
                y40 y40Var = new y40(oq0Var3, 0);
                ls1 ls1Var = m10Var2.f7724g;
                ih ihVar = n10Var3.F0;
                ls1 ls1VarA = ls1.a(new z20(ls1Var, y40Var, i10));
                ls1 ls1VarA2 = ls1.a(new k50(ls1VarA, 7));
                int i11 = rs1.f10057c;
                ArrayList arrayList2 = new ArrayList(1);
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(m10Var2.f7732p);
                arrayList3.add(m10Var2.f7733q);
                arrayList2.add(ls1VarA2);
                ls1 ls1VarA3 = ls1.a(new h60(new rs1(arrayList2, arrayList3), 3));
                ls1 ls1VarA4 = ls1.a(c80.B);
                ls1 ls1Var2 = n10Var3.f8106c;
                ls1 ls1VarA5 = ls1.a(new k30(ls1VarA4, (qs1) ls1Var2, 4));
                y40 y40Var2 = new y40(oq0Var3, 3);
                y40 y40Var3 = new y40(oq0Var3, 2);
                d10 d10Var = n10Var3.f8114g;
                ls1 ls1VarA6 = ls1.a(new l90(n10Var3.K, n10Var3.J, y40Var, y40Var3, ls1.a(new x20(d10Var, n10Var3.C, ls1.a(new i20(d10Var, 20)), ls1.a(pn1.f9125s), n10Var3.D0, n10Var3.f8108d)), m10Var2.f7722e));
                q90 q90Var = new q90(4);
                q90 q90Var2 = new q90(2);
                ls1 ls1VarA7 = ls1.a(new k30(ls1VarA4, (qs1) ls1Var2, 9));
                ls1 ls1VarA8 = ls1.a(nz.f8511q);
                w90 w90Var = new w90(ls1VarA8, 2);
                ArrayList arrayList4 = new ArrayList(2);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(m10Var2.f7738v);
                arrayList4.add(ls1VarA7);
                arrayList4.add(w90Var);
                ls1 ls1VarA9 = ls1.a(new aw(new rs1(arrayList4, arrayList5), y40Var, y40Var2, 6));
                ls1 ls1VarA10 = ls1.a(new p20(8, y40Var2));
                ls1 ls1VarA11 = ls1.a(new f30(n10Var3.f8114g, n10Var3.f8106c, n10Var3.f8108d, y40Var2, y40Var, m10Var2.f7728l, ls1VarA6, q90Var, q90Var2, n10Var3.G, m10Var2.f7729m, m10Var2.f7722e, m10Var2.f7737u, ls1VarA9, ls1VarA10, m10Var2.f7726j));
                f10 f10Var = new f10(ls1VarA11, 24);
                k50 k50Var = new k50(ls1.a(new z20(y40Var, n10Var3.W, 0)), 11);
                ArrayList arrayList6 = new ArrayList(4);
                ArrayList arrayList7 = new ArrayList(2);
                arrayList6.add(m10Var2.f7734r);
                arrayList7.add(m10Var2.f7735s);
                arrayList7.add(m10Var2.f7736t);
                arrayList6.add(ls1VarA5);
                arrayList6.add(f10Var);
                arrayList6.add(k50Var);
                ls1 ls1VarA12 = ls1.a(new h60(new rs1(arrayList6, arrayList7), 4));
                ls1 ls1VarA13 = ls1.a(new n50(n10Var3.f8114g, n10Var3.C0, n10Var3.f8118j, y40Var2, y40Var, n10Var3.I, rs.f10046p));
                ls1 ls1VarA14 = ls1.a(new k50(ls1VarA13, 5));
                ls1 ls1VarA15 = ls1.a(new k30(ls1VarA4, (qs1) ls1Var2, 3));
                ls1 ls1Var3 = n10Var3.f8148y0;
                d60 d60Var = m10Var2.f7721d;
                ls1 ls1VarA16 = ls1.a(new k50(ls1.a(new d40(ls1Var3, d60Var, 1)), 3));
                f10 f10Var2 = new f10(ls1VarA11, 23);
                ArrayList arrayList8 = new ArrayList(5);
                ArrayList arrayList9 = new ArrayList(3);
                arrayList8.add(m10Var2.f7739w);
                arrayList8.add(m10Var2.f7740x);
                arrayList9.add(m10Var2.f7741y);
                arrayList9.add(m10Var2.f7742z);
                arrayList8.add(ls1VarA14);
                arrayList8.add(ls1VarA15);
                arrayList9.add(ls1VarA16);
                arrayList8.add(f10Var2);
                ls1 ls1VarA17 = ls1.a(new h60(new rs1(arrayList8, arrayList9), 0));
                int i12 = 6;
                ls1 ls1VarA18 = ls1.a(new k50(ls1VarA13, i12));
                ls1 ls1VarA19 = ls1.a(new k30(ls1VarA4, (qs1) ls1Var2, i12));
                f10 f10Var3 = new f10(ls1VarA9, 12);
                f10 f10Var4 = new f10(ls1VarA11, 26);
                ArrayList arrayList10 = new ArrayList(6);
                ArrayList arrayList11 = new ArrayList(2);
                arrayList10.add(m10Var2.A);
                arrayList10.add(m10Var2.B);
                arrayList11.add(m10Var2.C);
                arrayList11.add(m10Var2.D);
                arrayList10.add(ls1VarA18);
                arrayList10.add(ls1VarA19);
                arrayList10.add(f10Var3);
                arrayList10.add(f10Var4);
                ls1 ls1VarA20 = ls1.a(new h60(new rs1(arrayList10, arrayList11), 2));
                f10 f10Var5 = new f10(ls1VarA11, 29);
                ArrayList arrayList12 = new ArrayList(1);
                ArrayList arrayList13 = new ArrayList(1);
                arrayList13.add(m10Var2.E);
                arrayList12.add(f10Var5);
                ls1 ls1VarA21 = ls1.a(new h60(new rs1(arrayList12, arrayList13), 19));
                f10 f10Var6 = new f10(ls1.a(new z20(y40Var, n10Var3.K, 2)), 22);
                ArrayList arrayList14 = new ArrayList(1);
                new ArrayList(1).add(m10Var2.F);
                arrayList14.add(f10Var6);
                ls1 ls1VarA22 = ls1.a(new k30(ls1VarA4, (qs1) ls1Var2, 10));
                ArrayList arrayList15 = new ArrayList(1);
                ArrayList arrayList16 = new ArrayList(1);
                arrayList16.add(m10Var2.G);
                arrayList15.add(ls1VarA22);
                ls1 ls1VarA23 = ls1.a(new h60(new rs1(arrayList15, arrayList16), 20));
                ls1 ls1VarA24 = ls1.a(new k50(ls1VarA, 8));
                f10 f10Var7 = new f10(ls1VarA11, 27);
                ArrayList arrayList17 = new ArrayList(7);
                ArrayList arrayList18 = new ArrayList(4);
                arrayList17.add(m10Var2.H);
                arrayList18.add(m10Var2.I);
                arrayList17.add(m10Var2.J);
                arrayList17.add(m10Var2.K);
                arrayList18.add(m10Var2.L);
                arrayList18.add(m10Var2.M);
                arrayList18.add(m10Var2.N);
                arrayList17.add(m10Var2.O);
                arrayList17.add(m10Var2.P);
                arrayList17.add(ls1VarA24);
                arrayList17.add(f10Var7);
                ls1 ls1VarA25 = ls1.a(new h60(new rs1(arrayList17, arrayList18), 5));
                k50 k50Var2 = new k50(ls1.a(new f10(ls1VarA12, 11)), 1);
                ls1 ls1VarA26 = ls1.a(new k30(ls1VarA4, (qs1) ls1Var2, 8));
                ArrayList arrayList19 = new ArrayList(2);
                ArrayList arrayList20 = new ArrayList(1);
                arrayList20.add(m10Var2.R);
                arrayList19.add(k50Var2);
                arrayList19.add(ls1VarA26);
                ls1 ls1VarA27 = ls1.a(new h60(new rs1(arrayList19, arrayList20), 9));
                p20 p20Var = new p20(13, gk0Var);
                jw jwVar = new jw(new z90(p20Var, 1), ls1Var2, 15);
                ArrayList arrayList21 = new ArrayList(1);
                ArrayList arrayList22 = new ArrayList(1);
                arrayList22.add(m10Var2.S);
                arrayList21.add(jwVar);
                ls1 ls1VarA28 = ls1.a(new h60(new rs1(arrayList21, arrayList22), 24));
                ls1 ls1VarA29 = ls1.a(new k50(ls1VarA13, 4));
                hb0 hb0Var = new hb0(oq0Var4, 0);
                hb0 hb0Var2 = new hb0(oq0Var4, 1);
                int i13 = 2;
                hb0 hb0Var3 = new hb0(oq0Var4, i13);
                ls1 ls1VarA30 = ls1.a(new k50(ls1VarA13, i13));
                f10 f10Var8 = new f10(ls1VarA11, 28);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(m10Var2.Z);
                arrayList23.add(ls1VarA30);
                arrayList23.add(f10Var8);
                ls1 ls1VarA31 = ls1.a(new c50(hb0Var, hb0Var2, hb0Var3, ls1VarA20, ls1.a(new h60(new rs1(arrayList23, arrayList24), 10)), ls1VarA17, ls1VarA23, m10Var2.f7724g, y40Var, n10Var3.f8116h, d60Var));
                w90 w90Var2 = new w90(ls1VarA31, 5);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList25.add(ls1VarA29);
                arrayList26.add(w90Var2);
                ls1 ls1VarA32 = ls1.a(new h60(new rs1(arrayList25, arrayList26), 13));
                ls1 ls1VarA33 = ls1.a(new k30(ls1VarA4, (qs1) ls1Var2, 5));
                f10 f10Var9 = new f10(ls1VarA11, 25);
                ArrayList arrayList27 = new ArrayList(2);
                ArrayList arrayList28 = new ArrayList(1);
                arrayList28.add(m10Var2.T);
                arrayList27.add(ls1VarA33);
                arrayList27.add(f10Var9);
                h60 h60Var = new h60(new rs1(arrayList27, arrayList28), 1);
                ls1 ls1VarA34 = ls1.a(new k50(ls1VarA13, 0));
                ArrayList arrayList29 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList29.add(ls1VarA34);
                ls1 ls1VarA35 = ls1.a(new aw(h60Var, new rs1(arrayList29, list), n10Var3.f8108d, 5));
                y40 y40Var4 = new y40(oq0Var3, 1);
                j40 j40Var = new j40(y40Var, y40Var4, m10Var2.f7725h, y40Var3, m10Var2.f7723f);
                ArrayList arrayList30 = new ArrayList(1);
                ArrayList arrayList31 = new ArrayList(1);
                arrayList31.add(m10Var2.V);
                arrayList30.add(m10Var2.W);
                c50 c50Var = new c50(y40Var2, y40Var, ls1VarA3, ls1VarA25, m10Var2.U, j40Var, ls1VarA4, new h60(new rs1(arrayList30, arrayList31), 6), ls1VarA21, ls1VarA10, n10Var3.f8127n0);
                w90 w90Var3 = new w90(ls1VarA31, 4);
                ls1 ls1VarA36 = ls1.a(new r30(y40Var, 1));
                q90 q90Var3 = new q90(5);
                q90 q90Var4 = new q90(6);
                ls1 ls1VarA37 = ls1.a(new p20(12, new z90(p20Var, 0)));
                a10 a10Var = n10Var3.C;
                ls1 ls1Var4 = n10Var3.f8106c;
                ta0 ta0Var = new ta0(a10Var, d60Var, ls1VarA36, p20Var, q90Var3, q90Var4, ls1Var4, ls1VarA37);
                wm0 wm0Var = new wm0();
                ls1 ls1VarA38 = ls1.a(new bc0(y40Var4, wm0Var, p20Var, 1));
                ls1 ls1VarA39 = ls1.a(new bc0(y40Var4, wm0Var, p20Var, 0));
                ls1 ls1VarA40 = ls1.a(new ml((qs1) y40Var4, (qs1) wm0Var, (qs1) p20Var, (qs1) n10Var3.f8118j, 8));
                ls1 ls1VarA41 = ls1.a(new jw(wm0Var, p20Var, 17));
                d10 d10Var2 = n10Var3.f8114g;
                wm0.a(wm0Var, ls1.a(new ga0(c50Var, ls1Var4, p20Var, w90Var3, ta0Var, ls1VarA36, m10Var2.i, ls1VarA38, ls1VarA39, ls1VarA40, ls1VarA41, ls1.a(new ml(d10Var2, p20Var, ta0Var, wm0Var, 7)), new oa0(d10Var2, d60Var), n10Var3.G, n10Var3.f8116h, d10Var2, ls1VarA37, ls1VarA8, n10Var3.M0)));
                ((wi0) ci0Var.f4218c).m4(new bk0((g60) ls1VarA17.j(), (u80) ls1VarA23.j(), (q60) ls1VarA20.j(), (w60) ls1VarA12.j(), (y60) ls1VarA25.j(), (x70) m10Var2.Q.j(), (f70) ls1VarA27.j(), (b90) ls1VarA28.j(), (v70) ls1VarA32.j(), (o60) ls1VarA35.j()));
                return (fa0) wm0Var.j();
        }
    }

    public ti0(Context context, s10 s10Var) {
        this.f10622b = context;
        this.f10623c = s10Var;
    }

    public ti0(Context context, u9.a aVar, w10 w10Var, gx gxVar) {
        this.f10622b = context;
        this.f10624d = aVar;
        this.f10623c = w10Var;
        this.f10625e = gxVar;
    }
}
