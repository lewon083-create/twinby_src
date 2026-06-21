package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xg0 extends ug implements eu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r81 f12148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ox0 f12149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n10 f12150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f12151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bs0 f12152g;

    public xg0(Context context, r81 r81Var, fp fpVar, n10 n10Var, ox0 ox0Var, ArrayDeque arrayDeque, bs0 bs0Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        al.a(context);
        this.f12147b = context;
        this.f12148c = r81Var;
        this.f12149d = ox0Var;
        this.f12150e = n10Var;
        this.f12151f = arrayDeque;
        this.f12152g = bs0Var;
    }

    public static or0 p4(or0 or0Var, rr0 rr0Var, wq wqVar, as0 as0Var, xr0 xr0Var) {
        yq yqVarA = wqVar.a("AFMA_getAdDictionary", nz.f8507m, l80.f7436t);
        fs1.B(or0Var, xr0Var);
        or0 or0VarR = rr0Var.a(or0Var, pr0.BUILD_URL).h(yqVarA).r();
        if (!((Boolean) vl.f11414c.r()).booleanValue()) {
            return or0VarR;
        }
        i81 i81VarS = i81.s(or0VarR);
        ut utVar = new ut(19, as0Var, xr0Var);
        i81VarS.a(new l81(0, i81VarS, utVar), hx.f6285g);
        return or0VarR;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void D1(ku kuVar, hu huVar) {
        q4(m4(kuVar, Binder.getCallingUid()), huVar, kuVar);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void L0(ku kuVar, hu huVar) {
        Bundle bundle;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue() && (bundle = kuVar.f7308n) != null) {
            a0.u.u(p9.k.C.f31304k, bundle, "service-connected");
        }
        or0 or0VarL4 = l4(kuVar, Binder.getCallingUid());
        q4(or0VarL4, huVar, kuVar);
        if (((Boolean) bm.i.r()).booleanValue()) {
            ox0 ox0Var = this.f12149d;
            Objects.requireNonNull(ox0Var);
            or0VarL4.a(new wg0(ox0Var, 1), this.f12148c);
        }
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void W3(String str, hu huVar) {
        q4(n4(str), huVar, null);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void Z1(ku kuVar, hu huVar) {
        Bundle bundle;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue() && (bundle = kuVar.f7308n) != null) {
            a0.u.u(p9.k.C.f31304k, bundle, "service-connected");
        }
        q4(o4(kuVar, Binder.getCallingUid()), huVar, kuVar);
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        hu fuVar = null;
        iu iuVar = null;
        hu fuVar2 = null;
        hu fuVar3 = null;
        hu fuVar4 = null;
        switch (i) {
            case 1:
                vg.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                vg.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                ku kuVar = (ku) vg.b(parcel, ku.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    fuVar = iInterfaceQueryLocalInterface instanceof hu ? (hu) iInterfaceQueryLocalInterface : new fu(strongBinder2);
                }
                vg.f(parcel);
                L0(kuVar, fuVar);
                parcel2.writeNoException();
                return true;
            case 5:
                ku kuVar2 = (ku) vg.b(parcel, ku.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    fuVar4 = iInterfaceQueryLocalInterface2 instanceof hu ? (hu) iInterfaceQueryLocalInterface2 : new fu(strongBinder3);
                }
                vg.f(parcel);
                Z1(kuVar2, fuVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                ku kuVar3 = (ku) vg.b(parcel, ku.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    fuVar3 = iInterfaceQueryLocalInterface3 instanceof hu ? (hu) iInterfaceQueryLocalInterface3 : new fu(strongBinder4);
                }
                vg.f(parcel);
                D1(kuVar3, fuVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    fuVar2 = iInterfaceQueryLocalInterface4 instanceof hu ? (hu) iInterfaceQueryLocalInterface4 : new fu(strongBinder5);
                }
                vg.f(parcel);
                W3(string, fuVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                cu cuVar = (cu) vg.b(parcel, cu.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    iuVar = iInterfaceQueryLocalInterface5 instanceof iu ? (iu) iInterfaceQueryLocalInterface5 : new iu(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 1);
                }
                vg.f(parcel);
                if (!((Boolean) om.f8737a.r()).booleanValue()) {
                    try {
                        Parcel parcelD0 = iuVar.D0();
                        parcelD0.writeString("");
                        vg.c(parcelD0, cuVar);
                        iuVar.L1(parcelD0, 1);
                    } catch (RemoteException e3) {
                        t9.c0.n("Service can't call client", e3);
                    }
                    break;
                } else {
                    this.f12150e.getClass();
                    String str = cuVar.f4312b;
                    n81 n81Var = n81.f8237c;
                    n81Var.a(new l81(0, n81Var, new n90(this, iuVar, cuVar)), hx.f6285g);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                vg.f(parcel);
                v0(string2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final or0 l4(ku kuVar, int i) {
        ug0 ug0VarR4;
        boolean z5;
        or0 or0VarR;
        tk tkVar = tk.f10635g;
        cw cwVar = p9.k.C.f31311r;
        u9.a aVarC = u9.a.c();
        bs0 bs0Var = this.f12152g;
        Context context = this.f12147b;
        wq wqVarE = cwVar.e(context, aVarC, bs0Var);
        n10 n10Var = this.f12150e;
        n10Var.getClass();
        cw cwVar2 = new cw(n10Var.f8104b, new d8.e0(kuVar, i, 7));
        yq yqVarA = wqVarE.a("google.afma.response.normalize", vg0.f11375d, fp.f5408d);
        Object obj = null;
        if (((Boolean) im.f6541a.r()).booleanValue()) {
            ug0VarR4 = r4(kuVar.i);
            if (ug0VarR4 == null) {
                t9.c0.m("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = kuVar.f7305k;
            if (str != null && !str.isEmpty()) {
                t9.c0.m("Request contained a PoolKey but split request is disabled.");
            }
            ug0VarR4 = null;
        }
        xr0 xr0VarK = ug0VarR4 == null ? xr0.k(context, 9) : ug0VarR4.f10943d;
        as0 as0Var = (as0) ((ls1) cwVar2.f4348d).j();
        as0Var.b(kuVar.f7297b.getStringArrayList("ad_types"));
        bh0 bh0Var = new bh0(kuVar.f7303h, as0Var, xr0VarK);
        oq0 oq0Var = new oq0(17, context, kuVar.f7298c.f34365b, obj, false);
        rr0 rr0Var = (rr0) ((ls1) cwVar2.f4349e).j();
        xr0 xr0VarK2 = xr0.k(context, 11);
        int i10 = 8;
        pr0 pr0Var = pr0.PRE_PROCESS;
        pr0 pr0Var2 = pr0.HTTP;
        if (ug0VarR4 == null) {
            zq zqVar = new zq(i10, cwVar2, kuVar);
            l80 l80Var = l80.f7435s;
            hi hiVarA = rr0Var.a(vv.d(kuVar.f7297b), pr0.GMS_SIGNALS);
            r81 r81Var = rr0Var.f10030a;
            or0 or0VarR2 = hiVarA.h(zqVar).e(l80Var).r();
            or0 or0VarP4 = p4(or0VarR2, rr0Var, wqVarE, as0Var, xr0VarK);
            xr0 xr0VarK3 = xr0.k(context, 10);
            List listAsList = Arrays.asList(or0VarP4, or0VarR2);
            x50 x50Var = new x50(or0VarP4, kuVar, or0VarR2);
            v41 v41Var = x41.f12018c;
            listAsList.getClass();
            x41 x41VarV = x41.v(listAsList);
            gx gxVar = hx.f6285g;
            e81 e81Var = new e81(x41VarV, true, false);
            e81Var.f4874q = new d81(e81Var, tkVar, gxVar);
            e81Var.w();
            e81 e81Var2 = new e81(x41VarV, true, false);
            e81Var2.f4874q = new d81(e81Var2, x50Var, r81Var);
            e81Var2.w();
            or0 or0VarR3 = new hi(rr0Var, pr0Var2, null, e81Var, listAsList, e81Var2).e(bh0Var).e(new xo0(2, xr0VarK3)).e(oq0Var).r();
            fs1.R(or0VarR3, as0Var, xr0VarK3, false);
            fs1.B(or0VarR3, xr0VarK2);
            List listAsList2 = Arrays.asList(or0VarR2, or0VarP4, or0VarR3);
            lb0 lb0Var = new lb0(kuVar, or0VarR3, or0VarR2, or0VarP4, 1);
            v41 v41Var2 = x41.f12018c;
            listAsList2.getClass();
            x41 x41VarV2 = x41.v(listAsList2);
            gx gxVar2 = hx.f6285g;
            e81 e81Var3 = new e81(x41VarV2, true, false);
            e81Var3.f4874q = new d81(e81Var3, tkVar, gxVar2);
            e81Var3.w();
            e81 e81Var4 = new e81(x41VarV2, true, false);
            e81Var4.f4874q = new d81(e81Var4, lb0Var, r81Var);
            e81Var4.w();
            or0VarR = new hi(rr0Var, pr0Var, null, e81Var3, listAsList2, e81Var4).h(yqVarA).r();
            z5 = false;
        } else {
            ah0 ah0Var = new ah0(ug0VarR4.f10941b, ug0VarR4.f10940a);
            xr0 xr0VarK4 = xr0.k(context, 10);
            or0 or0VarR4 = rr0Var.a(vv.d(ah0Var), pr0Var2).e(bh0Var).e(new xo0(2, xr0VarK4)).e(oq0Var).r();
            z5 = false;
            fs1.R(or0VarR4, as0Var, xr0VarK4, false);
            n81 n81VarD = vv.d(ug0VarR4);
            fs1.B(or0VarR4, xr0VarK2);
            List listAsList3 = Arrays.asList(or0VarR4, n81VarD);
            je jeVar = new je(i10, or0VarR4, n81VarD);
            v41 v41Var3 = x41.f12018c;
            listAsList3.getClass();
            x41 x41VarV3 = x41.v(listAsList3);
            gx gxVar3 = hx.f6285g;
            e81 e81Var5 = new e81(x41VarV3, true, false);
            e81Var5.f4874q = new d81(e81Var5, tkVar, gxVar3);
            e81Var5.w();
            r81 r81Var2 = rr0Var.f10030a;
            e81 e81Var6 = new e81(x41VarV3, true, false);
            e81Var6.f4874q = new d81(e81Var6, jeVar, r81Var2);
            e81Var6.w();
            or0VarR = new hi(rr0Var, pr0Var, null, e81Var5, listAsList3, e81Var6).h(yqVarA).r();
        }
        fs1.R(or0VarR, as0Var, xr0VarK2, z5);
        return or0VarR;
    }

    public final ed.d m4(final ku kuVar, int i) {
        if (!((Boolean) im.f6541a.r()).booleanValue()) {
            return vv.y(new Exception("Split request is disabled."));
        }
        xq0 xq0Var = kuVar.f7304j;
        if (xq0Var == null) {
            return vv.y(new Exception("Pool configuration missing from request."));
        }
        if (xq0Var.f12282e == 0 || xq0Var.f12283f == 0) {
            return vv.y(new Exception("Caching is disabled."));
        }
        cw cwVar = p9.k.C.f31311r;
        u9.a aVarC = u9.a.c();
        Context context = this.f12147b;
        wq wqVarE = cwVar.e(context, aVarC, this.f12152g);
        n10 n10Var = this.f12150e;
        n10Var.getClass();
        cw cwVar2 = new cw(n10Var.f8104b, new d8.e0(kuVar, i, 7));
        rr0 rr0Var = (rr0) ((ls1) cwVar2.f4349e).j();
        final or0 or0VarR = rr0Var.a(vv.d(kuVar.f7297b), pr0.GMS_SIGNALS).h(new zq(8, cwVar2, kuVar)).e(l80.f7435s).r();
        as0 as0Var = (as0) ((ls1) cwVar2.f4348d).j();
        final xr0 xr0VarK = xr0.k(context, 9);
        final or0 or0VarP4 = p4(or0VarR, rr0Var, wqVarE, as0Var, xr0VarK);
        List listAsList = Arrays.asList(or0VarR, or0VarP4);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.tg0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xg0 xg0Var = this.f10597b;
                or0 or0Var = or0VarP4;
                or0 or0Var2 = or0VarR;
                ku kuVar2 = kuVar;
                xr0 xr0Var = xr0VarK;
                String str = ((lu) or0Var.f8767d.get()).i;
                ug0 ug0Var = new ug0((lu) or0Var.f8767d.get(), (JSONObject) or0Var2.f8767d.get(), kuVar2.i, xr0Var);
                synchronized (xg0Var) {
                    synchronized (xg0Var) {
                        int iIntValue = ((Long) im.f6542b.r()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = xg0Var.f12151f;
                            if (arrayDeque.size() >= iIntValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                xg0Var.f12151f.addLast(ug0Var);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        v41 v41Var = x41.f12018c;
        listAsList.getClass();
        x41 x41VarV = x41.v(listAsList);
        tk tkVar = tk.f10635g;
        gx gxVar = hx.f6285g;
        e81 e81Var = new e81(x41VarV, true, false);
        e81Var.f4874q = new d81(e81Var, tkVar, gxVar);
        e81Var.w();
        r81 r81Var = rr0Var.f10030a;
        e81 e81Var2 = new e81(x41VarV, true, false);
        e81Var2.f4874q = new d81(e81Var2, callable, r81Var);
        e81Var2.w();
        return new hi(rr0Var, pr0.GET_URL_AND_CACHE_KEY, null, e81Var, listAsList, e81Var2).r();
    }

    public final ed.d n4(String str) {
        if (((Boolean) im.f6541a.r()).booleanValue()) {
            return r4(str) == null ? vv.y(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : vv.d(new sg0());
        }
        return vv.y(new Exception("Split request is disabled."));
    }

    public final ed.d o4(ku kuVar, int i) {
        cw cwVar = p9.k.C.f31311r;
        u9.a aVarC = u9.a.c();
        bs0 bs0Var = this.f12152g;
        Context context = this.f12147b;
        wq wqVarE = cwVar.e(context, aVarC, bs0Var);
        if (!((Boolean) mm.f7913a.r()).booleanValue()) {
            return vv.y(new Exception("Signal collection disabled."));
        }
        n10 n10Var = this.f12150e;
        n10Var.getClass();
        d8.e0 e0Var = new d8.e0(kuVar, i, 7);
        n10 n10Var2 = n10Var.f8104b;
        ls1 ls1VarA = ls1.a(new wm0(n10Var2.f8137t, 9));
        ho0 ho0Var = new ho0(e0Var, 1);
        ho0 ho0Var2 = new ho0(e0Var, 2);
        ho0 ho0Var3 = new ho0(e0Var, 3);
        d10 d10Var = n10Var2.f8114g;
        ls1 ls1Var = n10Var2.f8108d;
        j40 j40Var = new j40((qs1) d10Var, (qs1) ls1Var, (ms1) ho0Var, (qs1) ho0Var2, (qs1) ho0Var3, 16);
        wm0 wm0Var = new wm0(d10Var, 5);
        ho0 ho0Var4 = new ho0(e0Var, 0);
        p20 p20Var = new p20(21, ho0Var4);
        d40 d40Var = new d40(ls1Var, d10Var, 10);
        jo0 jo0Var = new jo0(0);
        ho0 ho0Var5 = new ho0(e0Var, 5);
        ho0 ho0Var6 = new ho0(e0Var, 6);
        ls1 ls1Var2 = n10Var2.B;
        l90 l90Var = new l90((qs1) ls1Var2, (ms1) ho0Var3, (ms1) ho0Var4, (qs1) ls1Var, (qs1) ho0Var5, (qs1) ho0Var6, 7);
        aw awVar = new aw(ho0Var4, ls1Var2, ls1Var, 29);
        ho0 ho0Var7 = new ho0(e0Var, 4);
        ls1 ls1VarA2 = ls1.a(rs.f10048r);
        ls1 ls1VarA3 = ls1.a(pn1.f9126t);
        ls1 ls1VarA4 = ls1.a(nz.f8513s);
        ls1 ls1VarA5 = ls1.a(c80.F);
        int i10 = os1.f8768b;
        LinkedHashMap linkedHashMapK = ix.K(4);
        linkedHashMapK.put(pr0.GMS_SIGNALS, ls1VarA2);
        linkedHashMapK.put(pr0.BUILD_URL, ls1VarA3);
        linkedHashMapK.put(pr0.HTTP, ls1VarA4);
        linkedHashMapK.put(pr0.PRE_PROCESS, ls1VarA5);
        ls1 ls1VarA6 = ls1.a(new aw(ho0Var7, n10Var2.f8114g, new os1(linkedHashMapK), 11));
        int i11 = rs1.f10057c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ls1VarA6);
        ls1 ls1VarA7 = ls1.a(new mm0(n10Var2.f8108d, new h60(new rs1(list, arrayList), 25)));
        ls1 ls1Var3 = n10Var2.O0;
        Context context2 = n10Var2.f8102a.f12809b;
        gr.G(context2);
        Object objJ = ls1Var3.j();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        String string = ((ku) e0Var.f15621d).f7297b.getString("ms");
        if (string == null) {
            string = "";
        }
        tl0 tl0Var = new tl0(6, gxVar, string);
        gx gxVar2 = hx.f6279a;
        gr.G(gxVar2);
        List list2 = kuVar.f7301f;
        gr.G(list2);
        tl0 tl0Var2 = new tl0(7, gxVar2, list2);
        js1 js1VarB = ls1.b(j40Var);
        js1 js1VarB2 = ls1.b(wm0Var);
        ls1.b(p20Var);
        js1 js1VarB3 = ls1.b(d40Var);
        js1 js1VarB4 = ls1.b(jo0Var);
        ls1.b(l90Var);
        js1 js1VarB5 = ls1.b(awVar);
        gr.G(gxVar2);
        as0 as0Var = (as0) ls1VarA.j();
        sd0 sd0Var = (sd0) n10Var2.f8118j.j();
        HashSet hashSet = new HashSet();
        hashSet.add((co0) objJ);
        hashSet.add(tl0Var);
        hashSet.add(tl0Var2);
        wk wkVar = al.C6;
        yk ykVar = q9.s.f31967e.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            hashSet.add((pn0) js1VarB.j());
        }
        if (((Boolean) ykVar.a(al.D6)).booleanValue()) {
            hashSet.add((pn0) js1VarB2.j());
        }
        if (((Boolean) ykVar.a(al.F6)).booleanValue()) {
            hashSet.add((pn0) js1VarB3.j());
        }
        if (((Boolean) ykVar.a(al.G6)).booleanValue()) {
            hashSet.add((pn0) js1VarB4.j());
        }
        if (((Boolean) ykVar.a(al.H3)).booleanValue()) {
            hashSet.add((pn0) js1VarB5.j());
        }
        sn0 sn0Var = new sn0(context2, gxVar2, hashSet, as0Var, sd0Var);
        yq yqVarA = wqVarE.a("google.afma.request.getSignals", nz.f8507m, fp.f5408d);
        xr0 xr0VarK = xr0.k(context, 22);
        rr0 rr0Var = (rr0) ls1VarA7.j();
        Bundle bundle = kuVar.f7297b;
        hi hiVarH = rr0Var.a(vv.d(bundle), pr0.GET_SIGNALS).e(new xo0(2, xr0VarK)).h(new zq(9, sn0Var, kuVar));
        or0 or0VarR = ((rr0) hiVarH.f6146g).a(hiVarH.r(), pr0.JS_SIGNALS).h(yqVarA).r();
        as0 as0Var2 = (as0) ls1VarA.j();
        as0Var2.b(bundle.getStringArrayList("ad_types"));
        as0Var2.d(bundle.getBundle("extras"));
        fs1.R(or0VarR, as0Var2, xr0VarK, true);
        if (((Boolean) bm.f3825j.r()).booleanValue()) {
            ox0 ox0Var = this.f12149d;
            Objects.requireNonNull(ox0Var);
            or0VarR.a(new wg0(ox0Var, 0), this.f12148c);
        }
        return or0VarR;
    }

    public final void q4(ed.d dVar, hu huVar, ku kuVar) {
        r71 r71VarJ = vv.J(dVar, new n20(7), hx.f6279a);
        zd1 zd1Var = new zd1(this, kuVar, huVar, 15);
        r71VarJ.a(new l81(0, r71VarJ, zd1Var), hx.f6285g);
    }

    public final synchronized ug0 r4(String str) {
        Iterator it = this.f12151f.iterator();
        while (it.hasNext()) {
            ug0 ug0Var = (ug0) it.next();
            if (ug0Var.f10942c.equals(str)) {
                it.remove();
                return ug0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void v0(String str) {
        zg0 zg0VarP;
        Binder.getCallingUid();
        wk wkVar = al.of;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            String str2 = (String) sVar.f31970c.a(al.f3159pf);
            if (str2.isEmpty()) {
                return;
            }
            xo0 xo0VarC = xo0.c(new b31(','));
            t9.c0.m("AdRequestServiceImpl: Preconnecting");
            Iterator itE = ((n31) xo0VarC.f12221c).e(xo0VarC, str2);
            do {
                m31 m31Var = (m31) itE;
                if (!m31Var.hasNext()) {
                    return;
                }
                String str3 = (String) m31Var.next();
                Context context = this.f12147b;
                oq0 oq0Var = new oq0(17, context, str, "HEAD", false);
                HashMap map = new HashMap();
                map.put("User-Agent", p9.k.C.f31297c.F(context, str));
                try {
                    zg0VarP = oq0Var.p(new yg0(str3, "", new byte[0], map, 30000));
                } catch (Exception e3) {
                    throw new RemoteException(e3.getMessage());
                }
            } while (zg0VarP.f12992a == 200);
            int i = zg0VarP.f12992a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 32);
            sb2.append("Unexpected preconnect response: ");
            sb2.append(i);
            throw new RemoteException(sb2.toString());
        }
    }
}
