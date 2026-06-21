package aj;

import com.google.android.gms.internal.ads.nw0;
import com.google.android.gms.internal.ads.op1;
import com.google.android.gms.internal.ads.ow0;
import com.google.android.gms.internal.ads.qw0;
import com.google.android.gms.internal.ads.sn1;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p2.w0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f970n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, mj.a aVar, int i) {
        super(2, aVar);
        this.f968l = i;
        this.f970n = obj;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f968l) {
            case 0:
                i iVar = new i((List) this.f970n, aVar, 0);
                iVar.f969m = obj;
                return iVar;
            case 1:
                i iVar2 = new i((String) this.f970n, aVar, 1);
                iVar2.f969m = obj;
                return iVar2;
            case 2:
                i iVar3 = new i((nw0) this.f970n, aVar, 2);
                iVar3.f969m = obj;
                return iVar3;
            case 3:
                i iVar4 = new i((g6.d) this.f970n, aVar, 3);
                iVar4.f969m = obj;
                return iVar4;
            case 4:
                i iVar5 = new i((Function1) this.f970n, aVar, 4);
                iVar5.f969m = obj;
                return iVar5;
            case 5:
                i iVar6 = new i((w0) this.f970n, aVar, 5);
                iVar6.f969m = obj;
                return iVar6;
            default:
                i iVar7 = new i((Set) this.f970n, aVar, 6);
                iVar7.f969m = obj;
                return iVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f968l) {
            case 0:
                return ((i) create((t2.b) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 1:
                return ((i) create((qw0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 2:
                return ((i) create((qw0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 3:
                ((i) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
                throw null;
            case 4:
                return ((i) create((t2.b) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 5:
                return ((i) create((w0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            default:
                return ((i) create((t2.b) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
        }
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f968l;
        Object obj2 = this.f970n;
        switch (i) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                h5.E(obj);
                t2.b bVar = (t2.b) this.f969m;
                List list = (List) obj2;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        bVar.d(ya.e.b((String) it.next()));
                    }
                } else {
                    bVar.b();
                    bVar.f33396a.clear();
                }
                return Unit.f27471a;
            case 1:
                nj.a aVar2 = nj.a.f29512b;
                h5.E(obj);
                ow0 builder = (ow0) ((qw0) this.f969m).r();
                Intrinsics.checkNotNullParameter(builder, "builder");
                Map mapUnmodifiableMap = Collections.unmodifiableMap(((qw0) builder.f9560c).A());
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "getQueryIdToAdQualityDataMapMap(...)");
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(new op1(mapUnmodifiableMap), "<this>");
                Intrinsics.checkNotNullParameter(key, "key");
                key.getClass();
                builder.b();
                ((qw0) builder.f9560c).D().remove(key);
                sn1 sn1VarD = builder.d();
                Intrinsics.checkNotNullExpressionValue(sn1VarD, "build(...)");
                return (qw0) sn1VarD;
            case 2:
                nj.a aVar3 = nj.a.f29512b;
                h5.E(obj);
                ow0 builder2 = (ow0) ((qw0) this.f969m).r();
                Intrinsics.checkNotNullParameter(builder2, "builder");
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(((qw0) builder2.f9560c).A());
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap2, "getQueryIdToAdQualityDataMapMap(...)");
                op1 op1Var = new op1(mapUnmodifiableMap2);
                nw0 value = (nw0) obj2;
                String key2 = value.C();
                Intrinsics.checkNotNullExpressionValue(key2, "getGwsQueryId(...)");
                Intrinsics.checkNotNullParameter(op1Var, "<this>");
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                key2.getClass();
                builder2.b();
                ((qw0) builder2.f9560c).D().put(key2, value);
                sn1 sn1VarD2 = builder2.d();
                Intrinsics.checkNotNullExpressionValue(sn1VarD2, "build(...)");
                return (qw0) sn1VarD2;
            case 3:
                nj.a aVar4 = nj.a.f29512b;
                h5.E(obj);
                throw null;
            case 4:
                nj.a aVar5 = nj.a.f29512b;
                h5.E(obj);
                ((Function1) obj2).invoke((t2.b) this.f969m);
                return Unit.f27471a;
            case 5:
                nj.a aVar6 = nj.a.f29512b;
                h5.E(obj);
                w0 w0Var = (w0) this.f969m;
                return Boolean.valueOf((w0Var instanceof p2.d) && w0Var.f31098a <= ((w0) obj2).f31098a);
            default:
                nj.a aVar7 = nj.a.f29512b;
                h5.E(obj);
                Set setKeySet = ((t2.b) this.f969m).a().keySet();
                ArrayList arrayList = new ArrayList(kotlin.collections.t.j(setKeySet, 10));
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((t2.e) it2.next()).f33403a);
                }
                Set set = (Set) obj2;
                if (set != s2.k.f32429a) {
                    Set set2 = set;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it3 = set2.iterator();
                        while (it3.hasNext()) {
                            if (!arrayList.contains((String) it3.next())) {
                            }
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
