package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qn extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn f42342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ua3 f42343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(zn znVar, ua3 ua3Var, mj.a aVar) {
        super(2, aVar);
        this.f42342b = znVar;
        this.f42343c = ua3Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new qn(this.f42342b, this.f42343c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qn(this.f42342b, this.f42343c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z5;
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        zn znVar = this.f42342b;
        synchronized (znVar) {
            z5 = znVar.f45483s;
        }
        if (!z5) {
            String strA = this.f42343c.a(this.f42342b.f45468c);
            if (strA == null || strA.length() == 0) {
                this.f42342b.b(h9.f39088j);
            } else {
                this.f42342b.f45467b.a(v5.f43886r, null);
                this.f42342b.f45468c.f37619g = this.f42343c.a();
                zn znVar2 = this.f42342b;
                d4 d4Var = znVar2.f45468c;
                up2 up2Var = znVar2.f45479o;
                Context context = znVar2.f45466a;
                up2Var.getClass();
                d4Var.f37625n = context.getResources().getConfiguration().orientation;
                ua3 ua3Var = this.f42343c;
                zn znVar3 = this.f42342b;
                this.f42342b.f45481q.a(this.f42342b.a(strA, ua3Var.a(znVar3.f45466a, znVar3.f45468c, znVar3.i)));
            }
        }
        return Unit.f27471a;
    }
}
