package ob;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends cb.a implements g0 {
    public e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 3);
    }

    @Override // ob.g0
    public final List A1(String str, String str2, String str3) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(null);
        parcelD0.writeString(str2);
        parcelD0.writeString(str3);
        Parcel parcelN0 = n0(parcelD0, 17);
        ArrayList arrayListCreateTypedArrayList = parcelN0.createTypedArrayList(e.CREATOR);
        parcelN0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ob.g0
    public final List H0(String str, String str2, String str3, boolean z5) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(null);
        parcelD0.writeString(str2);
        parcelD0.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f14090a;
        parcelD0.writeInt(z5 ? 1 : 0);
        Parcel parcelN0 = n0(parcelD0, 15);
        ArrayList arrayListCreateTypedArrayList = parcelN0.createTypedArrayList(b4.CREATOR);
        parcelN0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ob.g0
    public final void J0(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 27);
    }

    @Override // ob.g0
    public final void J3(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 6);
    }

    @Override // ob.g0
    public final void K1(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 20);
    }

    @Override // ob.g0
    public final void L2(e eVar, g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, eVar);
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 12);
    }

    @Override // ob.g0
    public final void L3(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 26);
    }

    @Override // ob.g0
    public final void Q0(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 18);
    }

    @Override // ob.g0
    public final void Q2(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 4);
    }

    @Override // ob.g0
    public final List T1(String str, String str2, g4 g4Var) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        Parcel parcelN0 = n0(parcelD0, 16);
        ArrayList arrayListCreateTypedArrayList = parcelN0.createTypedArrayList(e.CREATOR);
        parcelN0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ob.g0
    public final void V0(g4 g4Var, s3 s3Var, k0 k0Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        com.google.android.gms.internal.measurement.y.b(parcelD0, s3Var);
        com.google.android.gms.internal.measurement.y.c(parcelD0, k0Var);
        T0(parcelD0, 29);
    }

    @Override // ob.g0
    public final String b1(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        Parcel parcelN0 = n0(parcelD0, 11);
        String string = parcelN0.readString();
        parcelN0.recycle();
        return string;
    }

    @Override // ob.g0
    public final byte[] c3(String str, v vVar) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, vVar);
        parcelD0.writeString(str);
        Parcel parcelN0 = n0(parcelD0, 9);
        byte[] bArrCreateByteArray = parcelN0.createByteArray();
        parcelN0.recycle();
        return bArrCreateByteArray;
    }

    @Override // ob.g0
    public final void g3(Bundle bundle, g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, bundle);
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 19);
    }

    @Override // ob.g0
    public final void h1(long j10, String str, String str2, String str3) {
        Parcel parcelD0 = D0();
        parcelD0.writeLong(j10);
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        parcelD0.writeString(str3);
        T0(parcelD0, 10);
    }

    @Override // ob.g0
    public final void n3(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 25);
    }

    @Override // ob.g0
    public final void o1(b4 b4Var, g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, b4Var);
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 2);
    }

    @Override // ob.g0
    public final i p2(g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        Parcel parcelN0 = n0(parcelD0, 21);
        i iVar = (i) com.google.android.gms.internal.measurement.y.a(parcelN0, i.CREATOR);
        parcelN0.recycle();
        return iVar;
    }

    @Override // ob.g0
    public final void q1(g4 g4Var, Bundle bundle, i0 i0Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        com.google.android.gms.internal.measurement.y.b(parcelD0, bundle);
        com.google.android.gms.internal.measurement.y.c(parcelD0, i0Var);
        T0(parcelD0, 31);
    }

    @Override // ob.g0
    public final List t2(String str, String str2, boolean z5, g4 g4Var) {
        Parcel parcelD0 = D0();
        parcelD0.writeString(str);
        parcelD0.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f14090a;
        parcelD0.writeInt(z5 ? 1 : 0);
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        Parcel parcelN0 = n0(parcelD0, 14);
        ArrayList arrayListCreateTypedArrayList = parcelN0.createTypedArrayList(b4.CREATOR);
        parcelN0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // ob.g0
    public final void u2(v vVar, g4 g4Var) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, vVar);
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        T0(parcelD0, 1);
    }

    @Override // ob.g0
    public final void z2(g4 g4Var, d dVar) {
        Parcel parcelD0 = D0();
        com.google.android.gms.internal.measurement.y.b(parcelD0, g4Var);
        com.google.android.gms.internal.measurement.y.b(parcelD0, dVar);
        T0(parcelD0, 30);
    }
}
