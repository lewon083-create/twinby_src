package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dc0 extends ug implements qn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja0 f4550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sa0 f4551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fa0 f4552e;

    public dc0(Context context, ja0 ja0Var, sa0 sa0Var, fa0 fa0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f4549b = context;
        this.f4550c = ja0Var;
        this.f4551d = sa0Var;
        this.f4552e = fa0Var;
    }

    @Override // com.google.android.gms.internal.ads.qn
    public final xa.a J2() {
        return new xa.b(this.f4549b);
    }

    @Override // com.google.android.gms.internal.ads.qn
    public final boolean L(xa.a aVar) {
        sa0 sa0Var;
        Object objX1 = xa.b.X1(aVar);
        if (!(objX1 instanceof ViewGroup) || (sa0Var = this.f4551d) == null || !sa0Var.c((ViewGroup) objX1, true)) {
            return false;
        }
        this.f4550c.h().v0(new cf(22, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        List<String> arrayList;
        h1.i iVar;
        h1.i iVar2;
        String str;
        cn cnVar;
        h1.i iVar3;
        h1.i iVar4;
        fa0 fa0Var;
        sa0 sa0Var;
        cn cnVar2 = null;
        int i10 = 0;
        switch (i) {
            case 1:
                String string = parcel.readString();
                vg.f(parcel);
                ja0 ja0Var = this.f4550c;
                synchronized (ja0Var) {
                    iVar3 = ja0Var.f6787w;
                }
                String str2 = (String) iVar3.get(string);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String string2 = parcel.readString();
                vg.f(parcel);
                ja0 ja0Var2 = this.f4550c;
                synchronized (ja0Var2) {
                    iVar4 = ja0Var2.f6786v;
                }
                en enVar = (en) iVar4.get(string2);
                parcel2.writeNoException();
                vg.e(parcel2, enVar);
                return true;
            case 3:
                try {
                    ja0 ja0Var3 = this.f4550c;
                    synchronized (ja0Var3) {
                        iVar = ja0Var3.f6786v;
                    }
                    synchronized (ja0Var3) {
                        iVar2 = ja0Var3.f6787w;
                    }
                    String[] strArr = new String[iVar.f20340d + iVar2.f20340d];
                    int i11 = 0;
                    for (int i12 = 0; i12 < iVar.f20340d; i12++) {
                        strArr[i11] = (String) iVar.f(i12);
                        i11++;
                    }
                    while (i10 < iVar2.f20340d) {
                        strArr[i11] = (String) iVar2.f(i10);
                        i11++;
                        i10++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e3) {
                    p9.k.C.f31302h.d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e3);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String strG = this.f4550c.g();
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 5:
                String string3 = parcel.readString();
                vg.f(parcel);
                fa0 fa0Var2 = this.f4552e;
                if (fa0Var2 != null) {
                    synchronized (fa0Var2) {
                        fa0Var2.f5281n.F(string3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                fa0 fa0Var3 = this.f4552e;
                if (fa0Var3 != null) {
                    synchronized (fa0Var3) {
                        if (!fa0Var3.f5292y) {
                            fa0Var3.f5281n.e0();
                        }
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                q9.b2 b2VarR = this.f4550c.r();
                parcel2.writeNoException();
                vg.e(parcel2, b2VarR);
                return true;
            case 8:
                fa0 fa0Var4 = this.f4552e;
                if (fa0Var4 != null) {
                    fa0Var4.n();
                }
                this.f4552e = null;
                this.f4551d = null;
                parcel2.writeNoException();
                return true;
            case 9:
                xa.a aVarJ2 = J2();
                parcel2.writeNoException();
                vg.e(parcel2, aVarJ2);
                return true;
            case 10:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                boolean zL = L(aVarL1);
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                fa0 fa0Var5 = this.f4552e;
                if (fa0Var5 == null || fa0Var5.f5283p.c()) {
                    ja0 ja0Var4 = this.f4550c;
                    if (ja0Var4.j() != null && ja0Var4.h() == null) {
                        i10 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = vg.f11374a;
                parcel2.writeInt(i10);
                return true;
            case 13:
                ja0 ja0Var5 = this.f4550c;
                wh0 wh0VarK = ja0Var5.k();
                if (wh0VarK != null) {
                    l80 l80Var = p9.k.C.f31317x;
                    ut0 ut0Var = wh0VarK.f11811a;
                    l80Var.getClass();
                    l80.l(ut0Var);
                    if (ja0Var5.j() != null) {
                        ja0Var5.j().c("onSdkLoaded", new h1.e(0));
                    }
                    i10 = 1;
                } else {
                    u9.i.h("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = vg.f11374a;
                parcel2.writeInt(i10);
                return true;
            case 14:
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                Object objX1 = xa.b.X1(aVarL12);
                if ((objX1 instanceof View) && this.f4550c.k() != null && (fa0Var = this.f4552e) != null) {
                    fa0Var.f((View) objX1);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    ja0 ja0Var6 = this.f4550c;
                    synchronized (ja0Var6) {
                        str = ja0Var6.f6789y;
                    }
                    if (Objects.equals(str, "Google")) {
                        u9.i.h("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        u9.i.h("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        fa0 fa0Var6 = this.f4552e;
                        if (fa0Var6 != null) {
                            fa0Var6.e(str, false);
                        }
                    }
                } catch (NullPointerException e7) {
                    p9.k.C.f31302h.d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e7);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    ha0 ha0Var = this.f4552e.F;
                    synchronized (ha0Var) {
                        cnVar = ha0Var.f6082a;
                    }
                    cnVar2 = cnVar;
                } catch (NullPointerException e10) {
                    p9.k.C.f31302h.d("InternalNativeCustomTemplateAdShim.getMediaContent", e10);
                }
                parcel2.writeNoException();
                vg.e(parcel2, cnVar2);
                return true;
            case 17:
                xa.a aVarL13 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                Object objX12 = xa.b.X1(aVarL13);
                if ((objX12 instanceof ViewGroup) && (sa0Var = this.f4551d) != null && sa0Var.c((ViewGroup) objX12, false)) {
                    this.f4550c.i().v0(new cf(22, this));
                    i10 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i10);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn
    public final String m() {
        return this.f4550c.g();
    }
}
