package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cs extends ug implements sr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.ads.mediation.a f4305b;

    public cs(com.google.ads.mediation.a aVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f4305b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final boolean B() {
        return this.f4305b.f2505m;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final Bundle C3() {
        return this.f4305b.f2504l;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final float J() {
        this.f4305b.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void M() {
        this.f4305b.getClass();
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final float P() {
        this.f4305b.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final float T() {
        this.f4305b.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final boolean Z() {
        return this.f4305b.f2506n;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void a4(xa.a aVar) {
        this.f4305b.getClass();
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final List c() {
        List<fn> list = this.f4305b.f2495b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (fn fnVar : list) {
                arrayList.add(new um(fnVar.f5395b, fnVar.f5396c, fnVar.f5397d, fnVar.f5398e, fnVar.f5399f, null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String d() {
        return this.f4305b.f2499f;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String e() {
        return this.f4305b.f2501h;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String f() {
        return this.f4305b.f2498e;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String i() {
        return this.f4305b.f2494a;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String k() {
        return this.f4305b.f2496c;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String str = this.f4305b.f2494a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List listC = c();
                parcel2.writeNoException();
                parcel2.writeList(listC);
                return true;
            case 4:
                String str2 = this.f4305b.f2496c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                en enVarM = m();
                parcel2.writeNoException();
                vg.e(parcel2, enVarM);
                return true;
            case 6:
                String str3 = this.f4305b.f2498e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.f4305b.f2499f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double dN = n();
                parcel2.writeNoException();
                parcel2.writeDouble(dN);
                return true;
            case 9:
                String str5 = this.f4305b.f2501h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.f4305b.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                q9.b2 b2VarQ = q();
                parcel2.writeNoException();
                vg.e(parcel2, b2VarQ);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = vg.f11374a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                s();
                parcel2.writeNoException();
                ClassLoader classLoader2 = vg.f11374a;
                parcel2.writeStrongBinder(null);
                return true;
            case 14:
                o();
                parcel2.writeNoException();
                ClassLoader classLoader3 = vg.f11374a;
                parcel2.writeStrongBinder(null);
                return true;
            case 15:
                xa.a aVarX = x();
                parcel2.writeNoException();
                vg.e(parcel2, aVarX);
                return true;
            case 16:
                Bundle bundleC3 = C3();
                parcel2.writeNoException();
                vg.d(parcel2, bundleC3);
                return true;
            case 17:
                boolean z5 = this.f4305b.f2505m;
                parcel2.writeNoException();
                ClassLoader classLoader4 = vg.f11374a;
                parcel2.writeInt(z5 ? 1 : 0);
                return true;
            case 18:
                boolean z10 = this.f4305b.f2506n;
                parcel2.writeNoException();
                ClassLoader classLoader5 = vg.f11374a;
                parcel2.writeInt(z10 ? 1 : 0);
                return true;
            case 19:
                u();
                parcel2.writeNoException();
                return true;
            case 20:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                m0(aVarL1);
                parcel2.writeNoException();
                return true;
            case 21:
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                xa.a aVarL13 = xa.b.L1(parcel.readStrongBinder());
                xa.a aVarL14 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                t3(aVarL12, aVarL13, aVarL14);
                parcel2.writeNoException();
                return true;
            case 22:
                xa.a aVarL15 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                a4(aVarL15);
                parcel2.writeNoException();
                return true;
            case 23:
                T();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                P();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                J();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 26:
                M();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final en m() {
        fn fnVar = this.f4305b.f2497d;
        if (fnVar != null) {
            return new um(fnVar.f5395b, fnVar.f5396c, fnVar.f5397d, fnVar.f5398e, fnVar.f5399f, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void m0(xa.a aVar) {
        this.f4305b.getClass();
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final double n() {
        Double d10 = this.f4305b.f2500g;
        if (d10 != null) {
            return d10.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final xa.a o() {
        this.f4305b.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final String p() {
        return this.f4305b.i;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final q9.b2 q() {
        q9.b2 b2Var;
        k9.t tVar = this.f4305b.f2502j;
        if (tVar == null) {
            return null;
        }
        synchronized (tVar.f27287a) {
            b2Var = tVar.f27288b;
        }
        return b2Var;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final zm r() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final xa.a s() {
        this.f4305b.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void t3(xa.a aVar, xa.a aVar2, xa.a aVar3) {
        View view = (View) xa.b.X1(aVar);
        this.f4305b.getClass();
        if (n9.f.f29185a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final void u() {
        this.f4305b.getClass();
    }

    @Override // com.google.android.gms.internal.ads.sr
    public final xa.a x() {
        Object obj = this.f4305b.f2503k;
        if (obj == null) {
            return null;
        }
        return new xa.b(obj);
    }
}
