package com.google.android.gms.internal.ads;

import android.content.res.TypedArray;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cloneable f9334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9335d;

    public q5(int i, ArrayList arrayList, int i10, db dbVar) {
        this.f9332a = i;
        this.f9334c = arrayList;
        this.f9333b = i10;
        this.f9335d = dbVar;
    }

    public synchronized void a() {
        try {
            dw0 dw0Var = (dw0) this.f9335d;
            if (dw0Var.f4697b) {
                fw0 fw0Var = dw0Var.f4696a;
                fw0Var.r2((byte[]) this.f9334c);
                fw0Var.b(this.f9332a);
                fw0Var.k0(this.f9333b);
                fw0Var.M3();
                fw0Var.i();
            }
        } catch (RemoteException e3) {
            Log.d("GASS", "Clearcut log failed", e3);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Cloneable, k5.r[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.h6[], java.lang.Cloneable] */
    public q5(int i, int i10) {
        switch (i10) {
            case 3:
                this.f9334c = new k5.r[i];
                this.f9333b = 0;
                break;
            default:
                this.f9334c = new h6[i];
                this.f9333b = 0;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q5(dw0 dw0Var, byte[] bArr) {
        this.f9335d = dw0Var;
        this.f9334c = bArr;
    }

    public q5(qc.m mVar, ka.k kVar) {
        this.f9334c = new SparseArray();
        this.f9335d = mVar;
        TypedArray typedArray = (TypedArray) kVar.f27325d;
        this.f9332a = typedArray.getResourceId(26, 0);
        this.f9333b = typedArray.getResourceId(50, 0);
    }
}
