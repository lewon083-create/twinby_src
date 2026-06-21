package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ec0 extends ug implements fo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa0 f4916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ja0 f4917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd0 f4918e;

    public ec0(String str, fa0 fa0Var, ja0 ja0Var, sd0 sd0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f4915b = str;
        this.f4916c = fa0Var;
        this.f4917d = ja0Var;
        this.f4918e = sd0Var;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final xa.a A() {
        return new xa.b(this.f4916c);
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final cn C() {
        cn cnVar;
        ha0 ha0Var = this.f4916c.F;
        synchronized (ha0Var) {
            cnVar = ha0Var.f6082a;
        }
        return cnVar;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final void I2(Bundle bundle) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3084ke)).booleanValue()) {
            fa0 fa0Var = this.f4916c;
            sz szVarH = fa0Var.f5280m.h();
            if (szVarH == null) {
                u9.i.e("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                fa0Var.f5279l.execute(new l30(szVarH, jSONObject));
            } catch (JSONException e3) {
                u9.i.f("Error reading event signals", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final void K() {
        this.f4916c.n();
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final q9.y1 N() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3271x7)).booleanValue()) {
            return this.f4916c.f9701f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final List T() {
        List list;
        q9.m2 m2Var;
        List list2;
        ja0 ja0Var = this.f4917d;
        synchronized (ja0Var) {
            list = ja0Var.f6771f;
        }
        if (!list.isEmpty()) {
            synchronized (ja0Var) {
                m2Var = ja0Var.f6772g;
            }
            if (m2Var != null) {
                ja0 ja0Var2 = this.f4917d;
                synchronized (ja0Var2) {
                    list2 = ja0Var2.f6771f;
                }
                return list2;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final List c() {
        List list;
        ja0 ja0Var = this.f4917d;
        synchronized (ja0Var) {
            list = ja0Var.f6770e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String d() {
        return this.f4917d.f();
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final void d4(q9.s1 s1Var) {
        try {
            if (!s1Var.c()) {
                this.f4918e.b();
            }
        } catch (RemoteException e3) {
            u9.i.d("Error in making CSI ping for reporting paid event callback", e3);
        }
        fa0 fa0Var = this.f4916c;
        synchronized (fa0Var) {
            fa0Var.G.f11403b.set(s1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String e() {
        String strP;
        ja0 ja0Var = this.f4917d;
        synchronized (ja0Var) {
            strP = ja0Var.p("store");
        }
        return strP;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String f() {
        return this.f4917d.e();
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String i() {
        return this.f4917d.a();
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String k() {
        return this.f4917d.c();
    }

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
    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        en enVar;
        double d10;
        String strP;
        String strP2;
        xa.a aVar;
        List list2;
        q9.m2 m2Var;
        boolean zM;
        r50 r50Var;
        r50 r50Var2;
        int i10 = 0;
        co coVar = null;
        q9.j1 j1Var = null;
        switch (i) {
            case 2:
                String strA = this.f4917d.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 3:
                ja0 ja0Var = this.f4917d;
                synchronized (ja0Var) {
                    list = ja0Var.f6770e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String strC = this.f4917d.c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 5:
                ja0 ja0Var2 = this.f4917d;
                synchronized (ja0Var2) {
                    enVar = ja0Var2.f6783s;
                }
                parcel2.writeNoException();
                vg.e(parcel2, enVar);
                return true;
            case 6:
                String strE = this.f4917d.e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 7:
                String strF = this.f4917d.f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case 8:
                ja0 ja0Var3 = this.f4917d;
                synchronized (ja0Var3) {
                    d10 = ja0Var3.f6782r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d10);
                return true;
            case 9:
                ja0 ja0Var4 = this.f4917d;
                synchronized (ja0Var4) {
                    strP = ja0Var4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP);
                return true;
            case 10:
                ja0 ja0Var5 = this.f4917d;
                synchronized (ja0Var5) {
                    strP2 = ja0Var5.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strP2);
                return true;
            case 11:
                q9.b2 b2VarR = this.f4917d.r();
                parcel2.writeNoException();
                vg.e(parcel2, b2VarR);
                return true;
            case 12:
                String str = this.f4915b;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                K();
                parcel2.writeNoException();
                return true;
            case 14:
                zm zmVarS = this.f4917d.s();
                parcel2.writeNoException();
                vg.e(parcel2, zmVarS);
                return true;
            case 15:
                Bundle bundle = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                fa0 fa0Var = this.f4916c;
                synchronized (fa0Var) {
                    fa0Var.f5281n.d(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                boolean zO = this.f4916c.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                fa0 fa0Var2 = this.f4916c;
                synchronized (fa0Var2) {
                    fa0Var2.f5281n.n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 18:
                xa.a aVarA = A();
                parcel2.writeNoException();
                vg.e(parcel2, aVarA);
                return true;
            case 19:
                ja0 ja0Var6 = this.f4917d;
                synchronized (ja0Var6) {
                    aVar = ja0Var6.f6781q;
                }
                parcel2.writeNoException();
                vg.e(parcel2, aVar);
                return true;
            case 20:
                Bundle bundleD = this.f4917d.d();
                parcel2.writeNoException();
                vg.d(parcel2, bundleD);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    coVar = iInterfaceQueryLocalInterface instanceof co ? (co) iInterfaceQueryLocalInterface : new co(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 1);
                }
                vg.f(parcel);
                m4(coVar);
                parcel2.writeNoException();
                return true;
            case 22:
                fa0 fa0Var3 = this.f4916c;
                synchronized (fa0Var3) {
                    fa0Var3.f5281n.y();
                }
                parcel2.writeNoException();
                return true;
            case 23:
                List listT = T();
                parcel2.writeNoException();
                parcel2.writeList(listT);
                return true;
            case 24:
                ja0 ja0Var7 = this.f4917d;
                synchronized (ja0Var7) {
                    list2 = ja0Var7.f6771f;
                }
                if (!list2.isEmpty()) {
                    synchronized (ja0Var7) {
                        m2Var = ja0Var7.f6772g;
                    }
                    if (m2Var != null) {
                        i10 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeInt(i10);
                return true;
            case 25:
                q9.l1 l1VarL4 = q9.m2.l4(parcel.readStrongBinder());
                vg.f(parcel);
                l4(l1VarL4);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    j1Var = iInterfaceQueryLocalInterface2 instanceof q9.j1 ? (q9.j1) iInterfaceQueryLocalInterface2 : new q9.j1(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 1);
                }
                vg.f(parcel);
                fa0 fa0Var4 = this.f4916c;
                synchronized (fa0Var4) {
                    fa0Var4.f5281n.o(j1Var);
                }
                parcel2.writeNoException();
                return true;
            case 27:
                fa0 fa0Var5 = this.f4916c;
                synchronized (fa0Var5) {
                    fa0Var5.f5281n.k();
                }
                parcel2.writeNoException();
                return true;
            case 28:
                fa0 fa0Var6 = this.f4916c;
                synchronized (fa0Var6) {
                    ug ugVar = fa0Var6.f5290w;
                    if (ugVar == null) {
                        u9.i.c("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        fa0Var6.f5279l.execute(new aa.h0(2, fa0Var6, ugVar instanceof qa0));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 29:
                cn cnVarC = C();
                parcel2.writeNoException();
                vg.e(parcel2, cnVarC);
                return true;
            case 30:
                fa0 fa0Var7 = this.f4916c;
                synchronized (fa0Var7) {
                    zM = fa0Var7.f5281n.m();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = vg.f11374a;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 31:
                q9.y1 y1VarN = N();
                parcel2.writeNoException();
                vg.e(parcel2, y1VarN);
                return true;
            case 32:
                q9.s1 s1VarL4 = q9.w2.l4(parcel.readStrongBinder());
                vg.f(parcel);
                d4(s1VarL4);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) vg.b(parcel, Bundle.CREATOR);
                vg.f(parcel);
                I2(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                fa0 fa0Var8 = this.f4916c;
                long j10 = (fa0Var8 == null || (r50Var = fa0Var8.f9704j) == null) ? 0L : r50Var.f9712a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j10);
                return true;
            case 35:
                long j11 = parcel.readLong();
                vg.f(parcel);
                fa0 fa0Var9 = this.f4916c;
                if (fa0Var9 != null && (r50Var2 = fa0Var9.f9704j) != null) {
                    r50Var2.a(j11);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void l4(q9.l1 l1Var) {
        fa0 fa0Var = this.f4916c;
        synchronized (fa0Var) {
            fa0Var.f5281n.e(l1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final en m() {
        en enVar;
        ja0 ja0Var = this.f4917d;
        synchronized (ja0Var) {
            enVar = ja0Var.f6783s;
        }
        return enVar;
    }

    public final void m4(co coVar) {
        fa0 fa0Var = this.f4916c;
        synchronized (fa0Var) {
            fa0Var.f5281n.i(coVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final double n() {
        double d10;
        ja0 ja0Var = this.f4917d;
        synchronized (ja0Var) {
            d10 = ja0Var.f6782r;
        }
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final zm o() {
        return this.f4917d.s();
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final String p() {
        String strP;
        ja0 ja0Var = this.f4917d;
        synchronized (ja0Var) {
            strP = ja0Var.p("price");
        }
        return strP;
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final q9.b2 q() {
        return this.f4917d.r();
    }

    @Override // com.google.android.gms.internal.ads.fo
    public final xa.a u() {
        xa.a aVar;
        ja0 ja0Var = this.f4917d;
        synchronized (ja0Var) {
            aVar = ja0Var.f6781q;
        }
        return aVar;
    }
}
