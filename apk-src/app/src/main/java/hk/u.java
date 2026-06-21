package hk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20714b;

    public /* synthetic */ u(int i) {
        this.f20714b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.f20714b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case 2:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 5:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element2, "element");
                CoroutineContext coroutineContextMinusKey = acc2.minusKey(element2.getKey());
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f27499b;
                if (coroutineContextMinusKey == gVar) {
                    return element2;
                }
                mj.b bVar = kotlin.coroutines.d.R1;
                kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContextMinusKey.get(bVar);
                if (dVar == null) {
                    cVar = new kotlin.coroutines.c(element2, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(bVar);
                    if (coroutineContextMinusKey2 == gVar) {
                        return new kotlin.coroutines.c(dVar, element2);
                    }
                    cVar = new kotlin.coroutines.c(dVar, new kotlin.coroutines.c(element2, coroutineContextMinusKey2));
                }
                return cVar;
            case 6:
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (!(element3 instanceof t1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element3 : Integer.valueOf(iIntValue + 1);
            case 7:
                t1 t1Var = (t1) obj;
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                if (t1Var != null) {
                    return t1Var;
                }
                if (element4 instanceof t1) {
                    return (t1) element4;
                }
                return null;
            default:
                return (mk.w) obj;
        }
    }
}
