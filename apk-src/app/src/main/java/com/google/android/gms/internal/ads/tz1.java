package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 extends rm {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f10763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f10764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f10765y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f10766z;

    public tz1() {
        super(0);
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.f10763w = true;
        this.f10764x = true;
        this.f10765y = true;
        this.f10766z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }

    public tz1(uz1 uz1Var) {
        b(uz1Var);
        this.f10763w = uz1Var.f11139w;
        this.f10764x = uz1Var.f11140x;
        this.f10765y = uz1Var.f11141y;
        this.f10766z = uz1Var.f11142z;
        this.A = uz1Var.A;
        this.B = uz1Var.B;
        this.C = uz1Var.C;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = uz1Var.D;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.D = sparseArray;
                this.E = uz1Var.E.clone();
                return;
            }
        }
    }
}
