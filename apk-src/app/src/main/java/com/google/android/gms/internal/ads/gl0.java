package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gl0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5849e;

    public gl0(Context context, r81 r81Var, iq0 iq0Var, u9.a aVar) {
        this.f5845a = 6;
        this.f5847c = context;
        this.f5848d = r81Var;
        this.f5846b = iq0Var;
        this.f5849e = aVar;
    }

    public static final int a(float f10, int i) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f10);
    }

    public static final x1.b b(x1.b bVar, float f10) {
        return f10 == 0.0f ? x1.b.f35688e : x1.b.b((int) Math.ceil(bVar.f35689a / f10), (int) Math.ceil(bVar.f35690b / f10), (int) Math.ceil(bVar.f35691c / f10), (int) Math.ceil(bVar.f35692d / f10));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        pl0 pl0Var;
        switch (this.f5845a) {
            case 0:
                al.a((Context) this.f5847c);
                return ((gx) ((r81) this.f5848d)).b(new ze(7, this));
            case 1:
                return vv.K(((im0) this.f5848d).h(), new ju(3, this), hx.f6285g);
            case 2:
                ql0 ql0Var = (ql0) this.f5849e;
                wk wkVar = al.Qc;
                q9.s sVar = q9.s.f31967e;
                yk ykVar = sVar.f31970c;
                yk ykVar2 = sVar.f31970c;
                if (((Boolean) ykVar.a(wkVar)).booleanValue() && (pl0Var = ql0Var.f9548b) != null) {
                    return vv.d(pl0Var);
                }
                if (fs1.n((String) ykVar2.a(al.O1)) || (!((Boolean) ykVar2.a(wkVar)).booleanValue() && (ql0Var.f9547a.get() || !((se0) this.f5846b).f10268b))) {
                    return vv.d(new pl0(0, new Bundle()));
                }
                ql0Var.f9547a.set(true);
                return ((gx) ((r81) this.f5848d)).b(new ze(9, this));
            case 3:
                return ((gx) ((r81) this.f5848d)).b(new ze(15, this));
            case 4:
                return ((gx) ((r81) this.f5848d)).b(new ze(19, this));
            case 5:
                return ((gx) ((r81) this.f5848d)).b(new ze(21, this));
            case 6:
                return ((gx) ((r81) this.f5848d)).b(new ze(23, this));
            default:
                return ((gx) ((r81) this.f5848d)).b(new ze(25, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        switch (this.f5845a) {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 1;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            default:
                return 35;
        }
    }

    public gl0(r81 r81Var, ViewGroup viewGroup, Context context, Set set) {
        this.f5845a = 4;
        this.f5848d = r81Var;
        this.f5846b = set;
        this.f5849e = viewGroup;
        this.f5847c = context;
    }

    public /* synthetic */ gl0(r81 r81Var, Object obj, Object obj2, Object obj3, int i) {
        this.f5845a = i;
        this.f5848d = r81Var;
        this.f5847c = obj;
        this.f5846b = obj2;
        this.f5849e = obj3;
    }

    public /* synthetic */ gl0(Object obj, iq0 iq0Var, Object obj2, Object obj3, int i) {
        this.f5845a = i;
        this.f5848d = obj;
        this.f5846b = iq0Var;
        this.f5847c = obj2;
        this.f5849e = obj3;
    }
}
