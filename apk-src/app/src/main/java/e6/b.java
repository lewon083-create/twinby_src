package e6;

import android.app.Activity;
import android.net.Uri;
import android.view.InputEvent;
import hk.a0;
import jk.q;
import kk.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import oj.i;
import p2.e0;
import t2.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f16273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f16274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f16275p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, mj.a aVar, int i) {
        super(2, aVar);
        this.f16271l = i;
        this.f16273n = obj;
        this.f16274o = obj2;
        this.f16275p = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f16271l) {
            case 0:
                return new b((c) this.f16273n, (Uri) this.f16274o, (InputEvent) this.f16275p, aVar, 0);
            case 1:
                b bVar = new b((f7.b) this.f16274o, (Activity) this.f16275p, aVar, 1);
                bVar.f16273n = obj;
                return bVar;
            case 2:
                b bVar2 = new b((f) this.f16274o, (lk.b) this.f16275p, aVar, 2);
                bVar2.f16273n = obj;
                return bVar2;
            case 3:
                return new b((od.b) this.f16273n, (e) this.f16274o, (Long) this.f16275p, aVar, 3);
            case 4:
                b bVar3 = new b((e0) this.f16275p, aVar);
                bVar3.f16274o = obj;
                return bVar3;
            default:
                b bVar4 = new b((e0) this.f16274o, (i) this.f16275p, aVar);
                bVar4.f16273n = obj;
                return bVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16271l) {
            case 0:
                return ((b) create((a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 1:
                return ((b) create((q) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 2:
                return ((b) create((a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 3:
                return ((b) create((a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 4:
                return ((b) create((f) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            default:
                return ((b) create((a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, mj.a aVar, int i) {
        super(2, aVar);
        this.f16271l = i;
        this.f16274o = obj;
        this.f16275p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e0 e0Var, Function2 function2, mj.a aVar) {
        super(2, aVar);
        this.f16271l = 5;
        this.f16274o = e0Var;
        this.f16275p = (i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e0 e0Var, mj.a aVar) {
        super(2, aVar);
        this.f16271l = 4;
        this.f16275p = e0Var;
    }
}
