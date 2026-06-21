package com.google.android.gms.ads.internal;

import aa.l;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.c80;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.f20;
import com.google.android.gms.internal.ads.fp0;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.he0;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.ads.i20;
import com.google.android.gms.internal.ads.in;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.j10;
import com.google.android.gms.internal.ads.kt0;
import com.google.android.gms.internal.ads.l90;
import com.google.android.gms.internal.ads.ls1;
import com.google.android.gms.internal.ads.lt;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.n50;
import com.google.android.gms.internal.ads.ns1;
import com.google.android.gms.internal.ads.pf0;
import com.google.android.gms.internal.ads.ph0;
import com.google.android.gms.internal.ads.pn1;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.qa0;
import com.google.android.gms.internal.ads.qk0;
import com.google.android.gms.internal.ads.qo0;
import com.google.android.gms.internal.ads.ra0;
import com.google.android.gms.internal.ads.sd0;
import com.google.android.gms.internal.ads.sk0;
import com.google.android.gms.internal.ads.so0;
import com.google.android.gms.internal.ads.tp0;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.uk0;
import com.google.android.gms.internal.ads.up0;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.wm0;
import com.google.android.gms.internal.ads.x10;
import com.google.android.gms.internal.ads.xk0;
import java.util.HashMap;
import p9.j;
import q9.g3;
import q9.h0;
import q9.h1;
import q9.l0;
import q9.s0;
import q9.u1;
import q9.x0;
import s9.d;
import xa.a;
import xa.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends ug implements x0 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // q9.x0
    public final s0 A0(a aVar, ir irVar, int i) {
        return (kt0) n10.a((Context) b.X1(aVar), irVar, i).E.j();
    }

    @Override // q9.x0
    public final h0 B1(a aVar, String str, ir irVar, int i) {
        Context context = (Context) b.X1(aVar);
        return new qk0(n10.a(context, irVar, i), context, str);
    }

    @Override // q9.x0
    public final l0 D3(a aVar, g3 g3Var, String str, ir irVar, int i) {
        Context context = (Context) b.X1(aVar);
        n10 n10Var = n10.a(context, irVar, i).f8104b;
        context.getClass();
        g3Var.getClass();
        str.getClass();
        ns1 ns1VarA = ns1.a(context);
        ns1 ns1VarA2 = ns1.a(g3Var);
        ls1 ls1Var = n10Var.f8118j;
        ls1 ls1VarA = ls1.a(new i20(ls1Var, 23));
        so0 so0Var = (so0) ls1.a(new n50(ns1VarA, n10Var.f8106c, ns1VarA2, n10Var.F, ls1VarA, ls1.a(c80.H), ls1.a(pn1.f9123q))).j();
        uk0 uk0Var = (uk0) ls1VarA.j();
        u9.a aVar2 = n10Var.f8102a.f12808a;
        gr.G(aVar2);
        return new sk0(context, g3Var, str, so0Var, uk0Var, aVar2, (sd0) ls1Var.j());
    }

    @Override // q9.x0
    public final pw E1(a aVar, ir irVar, int i) {
        return (l) n10.a((Context) b.X1(aVar), irVar, i).O.j();
    }

    @Override // q9.x0
    public final l0 F2(a aVar, g3 g3Var, String str, int i) {
        return new j((Context) b.X1(aVar), g3Var, str, new u9.a(ModuleDescriptor.MODULE_VERSION, i, 0, true, false));
    }

    @Override // q9.x0
    public final lt H(a aVar) {
        Activity activity = (Activity) b.X1(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
        if (adOverlayInfoParcelA == null) {
            return new d(activity, 4);
        }
        int i = adOverlayInfoParcelA.f2553l;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new d(activity, 4) : new d(activity, 0) : new s9.b(activity, adOverlayInfoParcelA) : new d(activity, 2) : new d(activity, 1) : new d(activity, 3);
    }

    @Override // q9.x0
    public final l0 N2(a aVar, g3 g3Var, String str, ir irVar, int i) {
        Context context = (Context) b.X1(aVar);
        n10 n10Var = n10.a(context, irVar, i).f8104b;
        str.getClass();
        context.getClass();
        ns1 ns1VarA = ns1.a(context);
        ns1 ns1VarA2 = ns1.a(str);
        ls1 ls1Var = n10Var.I0;
        fp0 fp0Var = new fp0(ns1VarA, ls1Var, n10Var.J0, 0);
        ls1 ls1VarA = ls1.a(new wm0(ls1Var, 6));
        ls1 ls1Var2 = n10Var.f8106c;
        ns1 ns1Var = n10Var.F;
        j10 j10Var = n10Var.f8116h;
        return (qo0) ls1.a(new n50(ns1Var, ns1VarA, ns1VarA2, ls1.a(new l90(ns1VarA, ls1Var2, ns1Var, fp0Var, ls1VarA, j10Var)), ls1VarA, j10Var, n10Var.f8118j)).j();
    }

    @Override // q9.x0
    public final u1 O0(a aVar, ir irVar, int i) {
        return (pf0) n10.a((Context) b.X1(aVar), irVar, i).f8145x.j();
    }

    @Override // q9.x0
    public final et O1(a aVar, ir irVar, int i) {
        return (ph0) n10.a((Context) b.X1(aVar), irVar, i).L.j();
    }

    @Override // q9.x0
    public final in W0(a aVar, a aVar2) {
        return new ra0((FrameLayout) b.X1(aVar), (FrameLayout) b.X1(aVar2));
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        hp hpVar = null;
        switch (i) {
            case 1:
                a aVarL1 = b.L1(parcel.readStrongBinder());
                g3 g3Var = (g3) vg.b(parcel, g3.CREATOR);
                String string = parcel.readString();
                ir irVarL4 = fr.l4(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                vg.f(parcel);
                l0 l0VarD3 = D3(aVarL1, g3Var, string, irVarL4, i10);
                parcel2.writeNoException();
                vg.e(parcel2, l0VarD3);
                return true;
            case 2:
                a aVarL12 = b.L1(parcel.readStrongBinder());
                g3 g3Var2 = (g3) vg.b(parcel, g3.CREATOR);
                String string2 = parcel.readString();
                ir irVarL42 = fr.l4(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                vg.f(parcel);
                l0 l0VarZ3 = z3(aVarL12, g3Var2, string2, irVarL42, i11);
                parcel2.writeNoException();
                vg.e(parcel2, l0VarZ3);
                return true;
            case 3:
                a aVarL13 = b.L1(parcel.readStrongBinder());
                String string3 = parcel.readString();
                ir irVarL43 = fr.l4(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                vg.f(parcel);
                h0 h0VarB1 = B1(aVarL13, string3, irVarL43, i12);
                parcel2.writeNoException();
                vg.e(parcel2, h0VarB1);
                return true;
            case 4:
                b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                a aVarL14 = b.L1(parcel.readStrongBinder());
                a aVarL15 = b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                in inVarW0 = W0(aVarL14, aVarL15);
                parcel2.writeNoException();
                vg.e(parcel2, inVarW0);
                return true;
            case 6:
                a aVarL16 = b.L1(parcel.readStrongBinder());
                ir irVarL44 = fr.l4(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                vg.f(parcel);
                Context context = (Context) b.X1(aVarL16);
                n10 n10Var = n10.a(context, irVarL44, i13).f8104b;
                context.getClass();
                up0 up0Var = (up0) ((ls1) new ut(n10Var, context, (String) null).f11061c).j();
                parcel2.writeNoException();
                vg.e(parcel2, up0Var);
                return true;
            case 7:
                b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                a aVarL17 = b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                lt ltVarH = H(aVarL17);
                parcel2.writeNoException();
                vg.e(parcel2, ltVarH);
                return true;
            case 9:
                a aVarL18 = b.L1(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                vg.f(parcel);
                h1 h1VarY3 = y3(aVarL18, i14);
                parcel2.writeNoException();
                vg.e(parcel2, h1VarY3);
                return true;
            case 10:
                a aVarL19 = b.L1(parcel.readStrongBinder());
                g3 g3Var3 = (g3) vg.b(parcel, g3.CREATOR);
                String string4 = parcel.readString();
                int i15 = parcel.readInt();
                vg.f(parcel);
                l0 l0VarF2 = F2(aVarL19, g3Var3, string4, i15);
                parcel2.writeNoException();
                vg.e(parcel2, l0VarF2);
                return true;
            case 11:
                a aVarL110 = b.L1(parcel.readStrongBinder());
                a aVarL111 = b.L1(parcel.readStrongBinder());
                a aVarL112 = b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                qa0 qa0Var = new qa0((View) b.X1(aVarL110), (HashMap) b.X1(aVarL111), (HashMap) b.X1(aVarL112));
                parcel2.writeNoException();
                vg.e(parcel2, qa0Var);
                return true;
            case 12:
                a aVarL113 = b.L1(parcel.readStrongBinder());
                String string5 = parcel.readString();
                ir irVarL45 = fr.l4(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                vg.f(parcel);
                ev evVarM2 = m2(aVarL113, string5, irVarL45, i16);
                parcel2.writeNoException();
                vg.e(parcel2, evVarM2);
                return true;
            case 13:
                a aVarL114 = b.L1(parcel.readStrongBinder());
                g3 g3Var4 = (g3) vg.b(parcel, g3.CREATOR);
                String string6 = parcel.readString();
                ir irVarL46 = fr.l4(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                vg.f(parcel);
                l0 l0VarN2 = N2(aVarL114, g3Var4, string6, irVarL46, i17);
                parcel2.writeNoException();
                vg.e(parcel2, l0VarN2);
                return true;
            case 14:
                a aVarL115 = b.L1(parcel.readStrongBinder());
                ir irVarL47 = fr.l4(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                vg.f(parcel);
                pw pwVarE1 = E1(aVarL115, irVarL47, i18);
                parcel2.writeNoException();
                vg.e(parcel2, pwVarE1);
                return true;
            case 15:
                a aVarL116 = b.L1(parcel.readStrongBinder());
                ir irVarL48 = fr.l4(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                vg.f(parcel);
                et etVarO1 = O1(aVarL116, irVarL48, i19);
                parcel2.writeNoException();
                vg.e(parcel2, etVarO1);
                return true;
            case 16:
                a aVarL117 = b.L1(parcel.readStrongBinder());
                ir irVarL49 = fr.l4(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    hpVar = iInterfaceQueryLocalInterface instanceof hp ? (hp) iInterfaceQueryLocalInterface : new hp(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 1);
                }
                vg.f(parcel);
                Context context2 = (Context) b.X1(aVarL117);
                n10 n10Var2 = n10.a(context2, irVarL49, i20).f8104b;
                context2.getClass();
                hpVar.getClass();
                he0 he0Var = (he0) new u10(n10Var2, context2, hpVar).f10787e.j();
                parcel2.writeNoException();
                vg.e(parcel2, he0Var);
                return true;
            case 17:
                a aVarL118 = b.L1(parcel.readStrongBinder());
                ir irVarL410 = fr.l4(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                vg.f(parcel);
                u1 u1VarO0 = O0(aVarL118, irVarL410, i21);
                parcel2.writeNoException();
                vg.e(parcel2, u1VarO0);
                return true;
            case 18:
                a aVarL119 = b.L1(parcel.readStrongBinder());
                ir irVarL411 = fr.l4(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                vg.f(parcel);
                s0 s0VarA0 = A0(aVarL119, irVarL411, i22);
                parcel2.writeNoException();
                vg.e(parcel2, s0VarA0);
                return true;
            default:
                return false;
        }
    }

    @Override // q9.x0
    public final ev m2(a aVar, String str, ir irVar, int i) {
        Context context = (Context) b.X1(aVar);
        n10 n10Var = n10.a(context, irVar, i).f8104b;
        context.getClass();
        return (tp0) ((ls1) new ut(n10Var, context, str).f11062d).j();
    }

    @Override // q9.x0
    public final h1 y3(a aVar, int i) {
        return (f20) n10.a((Context) b.X1(aVar), null, i).D.j();
    }

    @Override // q9.x0
    public final l0 z3(a aVar, g3 g3Var, String str, ir irVar, int i) {
        Context context = (Context) b.X1(aVar);
        n10 n10Var = n10.a(context, irVar, i).f8104b;
        context.getClass();
        g3Var.getClass();
        str.getClass();
        return (xk0) new x10(n10Var, context, str, g3Var).f11972a.j();
    }
}
