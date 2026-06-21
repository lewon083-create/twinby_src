package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ov1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8820f;

    public /* synthetic */ ov1(ov1 ov1Var) {
        this.f8815a = (jx1) ov1Var.f8815a;
        this.f8816b = (s50) ov1Var.f8816b;
        this.f8817c = (AudioDeviceInfo) ov1Var.f8817c;
        this.f8818d = ov1Var.f8818d;
        this.f8819e = ov1Var.f8819e;
        this.f8820f = ov1Var.f8820f;
    }

    public int a(int i) {
        SparseArray sparseArray = ((u2.n) this.f8816b).f34056a;
        u2.n nVar = sparseArray == null ? null : (u2.n) sparseArray.get(i);
        int i10 = 1;
        int i11 = 2;
        if (this.f8818d == 2) {
            if (nVar != null) {
                this.f8816b = nVar;
                this.f8820f++;
            } else if (i == 65038) {
                b();
            } else if (i != 65039) {
                u2.n nVar2 = (u2.n) this.f8816b;
                if (nVar2.f34057b != null) {
                    i11 = 3;
                    if (this.f8820f != 1) {
                        this.f8817c = nVar2;
                        b();
                    } else if (c()) {
                        this.f8817c = (u2.n) this.f8816b;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i10 = i11;
        } else if (nVar == null) {
            b();
        } else {
            this.f8818d = 2;
            this.f8816b = nVar;
            this.f8820f = 1;
            i10 = i11;
        }
        this.f8819e = i;
        return i10;
    }

    public void b() {
        this.f8818d = 1;
        this.f8816b = (u2.n) this.f8815a;
        this.f8820f = 0;
    }

    public boolean c() {
        v2.a aVarB = ((u2.n) this.f8816b).f34057b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f19839e).get(iA + aVarB.f19836b) == 0) || this.f8819e == 65039;
    }

    public ov1(jx1 jx1Var) {
        this.f8815a = jx1Var;
        this.f8816b = s50.f10178b;
        this.f8818d = 0;
        this.f8819e = -1;
        this.f8820f = -1;
    }

    public ov1(u2.n nVar) {
        this.f8818d = 1;
        this.f8815a = nVar;
        this.f8816b = nVar;
    }
}
