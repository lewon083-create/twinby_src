package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a92 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b92 f36653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f36654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f36655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep f36656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a92(b92 b92Var, CountDownLatch countDownLatch, ArrayList arrayList, ep epVar, mj.a aVar) {
        super(2, aVar);
        this.f36653b = b92Var;
        this.f36654c = countDownLatch;
        this.f36655d = arrayList;
        this.f36656e = epVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new a92(this.f36653b, this.f36654c, this.f36655d, this.f36656e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a92) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        JSONArray jSONArray;
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        b92 b92Var = this.f36653b;
        CountDownLatch countDownLatch = this.f36654c;
        ArrayList arrayList = this.f36655d;
        ep epVar = this.f36656e;
        b92Var.getClass();
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            epVar.f38219a.set(true);
            synchronized (b92Var.f36968b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
